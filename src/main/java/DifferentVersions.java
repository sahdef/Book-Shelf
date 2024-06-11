import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class DifferentVersions{
  private ArrayList<Integer> versionNumbers= new ArrayList<Integer>();
  private ArrayList<Integer> posList= new ArrayList<Integer>();
  public DifferentVersions(ArrayList<Book> books, Scanner scanner){
    System.out.println("Hello, which book are you looking for?");
    String input=scanner.nextLine();
    Set<Integer> versionSet= new HashSet<Integer>(); 
    for (int i=0; i<books.size(); i++){
      if (books.get(i).getTitle().equals(input)){
        posList.add(i+1);
        int version= books.get(i).getVersion();
        if (!versionSet.contains(version)){
          versionSet.add(version);
          versionNumbers.add(version);
        }
      }
    }
    System.out.println("We have " +versionNumbers.size()+ " different versions of that book.");
    System.out.println("Here are the positions of the books and their versions:");
    for (int i=0; i<posList.size(); i++){
      System.out.println("The book's position is "+posList.get(i)+" and the version number is "+books.get(posList.get(i)-1).getVersion());
    } 
    
  }
  public ArrayList<Integer> getVersionNumbers(){
    return versionNumbers;
  }
}