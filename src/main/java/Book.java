public class Book{
  private String title;
  private String author;
  private double price;
  private int version;
  public Book(String topic, String writer, double value,int verNum){
    title=topic;
    author=writer;
    price=value;
    version=verNum;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public double getPrice(){
    return price;
  }
  public int getVersion(){
    return version;
  }
}