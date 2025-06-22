import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}
public class LibraryManagement {
    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(targetTitle)) {
                return b;
            }
        }
        return null;
    }
    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0, right = books.length - 1;
        String target = targetTitle.toLowerCase();
        while (left <= right) {
            int mid = (left + right) / 2;
            String midTitle = books[mid].title.toLowerCase();
            if (midTitle.equals(target)) {
                return books[mid];
            } else if (midTitle.compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void displayBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "ABC1", "KLM"),
            new Book(102, "ABC2", "NOP"),
            new Book(103, "DEF1", "QRS"),
            new Book(104, "DEF2", "TUV"),
            new Book(105, "GHI1", "WXY")
        };
        displayBooks(books);
        Book foundLinear = linearSearch(books, "ABC2");
        System.out.println("\nLinear Search Result: " + (foundLinear != null ? foundLinear : "Not found"));
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
        Book foundBinary = binarySearch(books, "GHI1");
        System.out.println("\nBinary Search Result: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}