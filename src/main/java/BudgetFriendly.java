import java.util.ArrayList;
import java.util.Scanner;

public class BudgetFriendly{
  public BudgetFriendly(ArrayList<Book> books, Scanner scanner){
    System.out.println("Hello, what is your budget?");
    String input=scanner.nextLine();
    double budget=Double.parseDouble(input);
    int count=0;
    for (int i=0; i<books.size(); i++){
      if (books.get(i).getPrice()<budget){
        System.out.println("We have a book for your budget! It's position number in the list is "+(i+1));
        System.out.println("The books title is "+ books.get(i).getTitle()+". The book's author is "+books.get(i).getAuthor()+ " It costs " +books.get(i).getPrice()+ "and it's version number is "+ books.get(i).getVersion());
        count++;
      }
    }
    if (count==0){
      System.out.println("We don't have any books for your budget.");
    }
  }
}