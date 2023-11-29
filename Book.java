public class Book {

     String title;
     boolean borrowed;

    //No args Constructor added
   public Book (){}

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        this.title = bookTitle;
        this.borrowed = false;
    }

    // Marks the book as rented
    public boolean borrow() {
        // Implement this method
        this.borrowed = true;
        return false;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        this.borrowed = false;

    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
   if (borrowed == true)
       return true;
   else if (borrowed == false)
       return false;

   return borrowed;



    }



    // Returns the title of the book
    public String getTitle() {
        // Implement this method
        return this.title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");


        example.returned();
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrow();
        System.out.println("Borrowed? (should be true): "   +  example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}