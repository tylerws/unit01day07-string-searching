import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        
        System.out.println("Enter HTML text");
        Scanner scanner = new Scanner(System.in);
        String html = scanner.nextLine();
        
        System.out.println("Enter tag type");
        String tag = scanner.nextLine();

        int startTextPos = html.indexOf("<" + tag + ">");
        int endTextPos = html.indexOf("</" + tag + ">");
        if (startTextPos >= 0 && endTextPos >= 0) {
        String text = html.substring(startTextPos+tag.length()+2, endTextPos);
        System.out.println(text);
        scanner.close();
        } else {
            System.out.println("There are no " + tag + " tags in entered HTML");
        }
        
    }
}