import java.util.ArrayList;
import java.util.Scanner;


public class BookSearch{
  public BookSearch(ArrayList<Book> books, Scanner scanner){
    System.out.println("Which book are you looking for?");
    String input=scanner.nextLine();
    int count=0;
    for(int i=0; i<books.size(); i++){
      if (input.equals(books.get(i).getTitle())){
        System.out.println("We have that book! It's position number in the list is "+(i+1));
        count++;
        System.out.println("The book's author is "+books.get(i).getAuthor()+ "It costs" +books.get(i).getPrice()+ "and it's version number is "+ books.get(i).getVersion());
      }
    }
    if (count==0){
      System.out.println("We don't have that book.");
    }
  }
}