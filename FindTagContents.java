import java.util.Scanner;
public class FindTagContents {
    public static void main(String[] args) {
        
        System.out.println("Enter HTML text");
        Scanner scanner = new Scanner(System.in);
        String html = scanner.nextLine();
        
        System.out.println("Enter tag type");
        String tag = scanner.nextLine();

        int textPos = html.indexOf("<" + tag + ">");

        // int closingTagStart = html.indexOf(tag, ">");
        // html.indexOf
    }
}