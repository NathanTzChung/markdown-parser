import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseRedo{

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            //Check if the url is actually an image
            if(openBracket > 0 && markdown.charAt(openBracket - 1) == '1'){
                currentIndex++;
                continue;
            }
            int closeBracket = markdown.indexOf("](", openBracket);
            // Check if there is a new line between the brackets
            if(openBracket == -1 || closeBracket == -1){break;}
            String maybeLink = markdown.substring(openBracket, closeBracket);
            if(maybeLink.contains("\n")){
                currentIndex = closeBracket;
                continue;
            }
            int openParen = closeBracket + 1;
            int closeParen = markdown.indexOf(")", openParen);
            if(openBracket == -1 || closeBracket == -1 || closeParen == -1){
                break;
            }
            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}