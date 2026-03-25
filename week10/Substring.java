package week10;

public class Substring {
    public static void main(String[] args) {
        String book = "Building Java Programs";
        // "Building"
        System.out.println(book.substring(0, 8));
        // Substring "Building" when length of this word is unknown
        System.out.println(book.substring(0, book.indexOf(" ")));
    }
}
