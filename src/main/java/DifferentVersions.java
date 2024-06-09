import java.util.ArrayList;
import java.util.Scanner;

public class DifferentVersions{
  private ArrayList<Integer> versionNumbers= new ArrayList<Integer>();
  private ArrayList<Integer> posList= new ArrayList<Integer>();
  public DifferentVersions(ArrayList<Book> books, Scanner scanner){
    System.out.println("Hello, which book are you looking for?");
    String input="";
    input=scanner.nextLine();
    for (int i=0; i<books.size(); i++){
      if (books.get(i).getTitle().equals(input)){
        posList.add(i+1);
        while (true){
          for (int j=0; i<versionNumbers.size(); j++){
            if (versionNumbers.get(j)==books.get(i).getVersion()){
              break;
            }
          }
          versionNumbers.add(books.get(i).getVersion());
        } 
      }
    }
    System.out.println("We have" +versionNumbers.size()+ "different versions of that book.");
    System.out.println("Here are the positions of the books and their versions:");
    for (int i=0; i<posList.size(); i++){
      System.out.println("The book's position is "+posList.get(i)+" and the version number is "+versionNumbers.get(books.get(posList.get(i)).getVersion()));
    } 
    
  }
  public ArrayList<Integer> getVersionNumbers(){
    return versionNumbers;
  }
}