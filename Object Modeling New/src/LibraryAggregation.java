import java.util.ArrayList;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayInfo();
        }
        System.out.println();
    }
}
public class LibraryAggregation {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library centralLibrary = new Library("Central Library");
        Library communityLibrary = new Library("Community Library");

        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        communityLibrary.addBook(book2); // shared book
        communityLibrary.addBook(book3);

        centralLibrary.displayBooks();
        communityLibrary.displayBooks();
    }
}
