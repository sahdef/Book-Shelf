import java.util.ArrayList;
import java.util.Scanner;

public class Booklist{
  private ArrayList<Book> books=new ArrayList<Book>();
  public Booklist(Scanner scanner){
    String input="";
    System.out.println("Hello, which books are available in the library right now? If there is no more books, type 'done'.");
    while(true){
      input=scanner.nextLine();
      if (input.equals("done")){
        break;
      }
      System.out.println("What is the title of the book?");
      String title=input;
      System.out.println("What is the author of the book?");
      input=scanner.nextLine();
      String writer=input;
      System.out.println("What is the price of the book?");
      input=scanner.nextLine();
      double price=Double.parseDouble(input);
      System.out.println("What is the version number of the book?");
      input=scanner.nextLine();
      int verNum=Integer.parseInt(input);
      books.add(new Book(title, writer, price,verNum));
    }
    
  }
  public ArrayList<Book> getList(){
    return books;
  }
}