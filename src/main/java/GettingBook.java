import java.util.ArrayList;
import java.util.Scanner;

public class GettingBook{
  public GettingBook(ArrayList<Book> books, Scanner scanner){
    String input=scanner.nextLine();
    DifferentVersions versions= new DifferentVersions(books, scanner);
    ArrayList<Integer> verList= versions.getVersionNumbers();  
    System.out.println("We have the following versions of the book:");    
    for (int i=0; i<verList.size(); i++){
      System.out.print(verList.get(i)+", ");
    }
    System.out.println("Which version do you want?");
    int verNum=Integer.parseInt(scanner.nextLine());
    while (true){
      for (int i=0; i<books.size(); i++){
        if (input.equals(books.get(i).getTitle())){
          if (verNum==books.get(i).getVersion()){
            books.remove(i);
            break;
          }
        }
      }
    }

  }
    

}
