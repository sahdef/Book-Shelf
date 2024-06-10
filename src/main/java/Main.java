// import static org.junit.jupiter.api.Assertions.assertEquals
// import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Let's build up our library.");
    Booklist library= new Booklist(scanner);
    ArrayList<Book> books= library.getList();
    while (true){
      System.out.println("Welcome to our library. What do you want to do? Here are the options: \n1. Search for a book\n2. Search for a book by author\n3. Search for a book for your budget \n4. Find different versions of a book /n5. Check out a book from the library /n6. Exit");
      int input=Integer.parseInt(scanner.nextLine());
      if (input==1){
        BookSearch search= new BookSearch(books, scanner);
      }
      if (input==2){
        AuthorBased author= new AuthorBased(books, scanner);
      }
      if (input==3){
        BudgetFriendly budget= new BudgetFriendly(books, scanner);
      }
      if (input==4){
        DifferentVersions versions= new DifferentVersions(books, scanner);
      }
      if (input==5){
        GettingBook get= new GettingBook(books, scanner);
      }
      if (input==6){
        break;
      }
          
    }
    scanner.close();
    System.out.println("Thanks for choosing our library.");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}