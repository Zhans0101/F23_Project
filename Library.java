import java.util.ArrayList;

public class Library extends Book {
    // Add the missing implementation to this class

    // name
    private String name;


    // books
    private ArrayList<Book> books;



    // requested times
     Arraylist requestedTimes;


    // new library
    public Library(String name, String s) {
        this.name = name;
        this.books = new Arraylist();
        this.requestedTimes = new Arraylist();
    }

    // puts in books
//not 100% sure
    public void addBook(Book newBook) {

        books.add(newBook);
        requestedTimes.add(0);

    }
    //looks for the book
    public <found> int findBook(String title){

        int foundIndex = -1;
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                int index = i;
                break;
            }
        }

        if (foundIndex == -1){
            System.out.println("Book is not found");
        }
        return foundIndex;
    }

    // borrow book
    public void borrowBook(String title) {
        int bookIndex = findBook(title);
        if (bookIndex != -1 && !books.get(bookIndex).isBorrowed()) {
            books.get(bookIndex).borrowed();
            requestedTimes.set(bookIndex, requestedTimes.get(bookIndex));
        } else {
            System.out.println("Book is not available.");
        }
    }

    // get available book titles
    public void printAvailableBooks(){
        if (!books.isEmpty()) {
            for (int i = 0; i < books.size(); i++) {
                if (!books.get(i).isBorrowed())
                    System.out.println(books.get(i).getTitle());
            }
        } else {
            System.out.println("No book in catalog");
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.", "catalog.txt");
        Library secondLibrary = new Library("228 Liberty St.", "catalog.txt");
        Library thirdLibrary = new Library("12 Broadway St.", "catalog.txt");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("The Da Vinci Code")); // second copy
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        firstLibrary.addBook(new Book("The Lord of the Rings")); // second copy
        secondLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        //This will be the open hours and address section.

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        thirdLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        thirdLibrary.borrowBook("The Lord of the Rings");
       // secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println("Books available in the third library:");
        thirdLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        /*System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();*/
    }

    private void returnBook(String theLordOfTheRings) {
    }

    private void printAddress() {
    }

    private static void printOpeningHours() {
    }

}
