import java.util.ArrayList;
import java.util.Scanner;


public class AuthorBased{
  public AuthorBased(ArrayList<Book> books, Scanner scanner){
    System.out.println("Hello! Which author's books do you want to look for?");
    String author=scanner.nextLine();
    int count=0;
    for(int i=0; i<books.size(); i++){
      if (author.equals(books.get(i).getAuthor())){
        System.out.println("We have that author! It's position number in the list is "+(i+1));
        count++;
        System.out.println("The book's title is "+books.get(i).getTitle()+ "It costs" +books.get(i).getPrice()+ "and it's version number is "+ books.get(i).getVersion());
      }
    }
    if (count==0){
      System.out.println("We don't have that author.");
    }
  }
}