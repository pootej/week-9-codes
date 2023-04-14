import java.util.ArrayList;
import java.util.*;

class Movie implements Comparable<Movie>{
  private String title;
  private String director;
  private int year;

  public Movie(String title, String director, int year){
    this.title=title;
    this.director=director;
    this.year=year;
  }
  public int compareTo(Movie mo){
    if(year>mo.year){
      return -1;
    }
    else if(year<mo.year){
      return 1;
    }
    else{
       return 0;
    }
  }
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}  

class MovieDemo{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    ArrayList<Movie> movie= new ArrayList<Movie>();
     for(int i=0;i<2;i++){
      movie.add(new Movie(sc.nextLine(), sc.nextLine(), sc.nextInt()));
    }
    Collections.sort(movie);
    for(Movie mo:movie){
      System.out.println(mo.getTitle()+" "+ mo.getDirector()+" "+ mo.getYear());