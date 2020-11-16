// Fields(public vs private)
class Book{


  //once a book object has been created, the title and author will never change!

  protected String title;
  private String author;

//if we wanted to keep track of whether a Book is being borrowed or not, you can add a public boolean field to do so
 // public boolean isBorrowed;


 // A better design would be to declare that field as private and then create public methods that return the value of such hidden field (known as getters) as well as public methods that provide a way to set or change its value (known as setters)

 private boolean isBorrowed;

 protected int numberOfPages;

  public Book(String title, String author){
    this.title=title;
    this.author = author;
    this.isBorrowed = false;
  }

  public void borrowBook(){
    /*
      Setter method that sets true when someone wants to borrow a book
    */

    isBorrowed=true;
  }

  public void returnBook(){

    /*
      Setter method that sets false if someone returns a book
    */
    isBorrowed = false;
  }

  public boolean isBookBorrowed(){
    // a getter method returns boolean value.
    return isBorrowed;
  }

  public String nameAuthor(){

    return "Title is "+this.title + " Author is " + this.author;
  }
}