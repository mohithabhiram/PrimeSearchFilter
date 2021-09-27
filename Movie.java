import java.util.*;
public class Movie {
	
	    private String movieName;
	    private int yearOfRelease;
	    private double rating;
	    private int views;
	    public Movie() {

	    }
	    public Movie(String movieName,int yearOfRelease ,double rating,
	             int views) {

	        this.movieName = movieName;
	        this.yearOfRelease = yearOfRelease;
	        this.rating = rating;
	        this.views = views;
	    }
	    public int getYearOfRelease() {
	    	return yearOfRelease;
	    }
	    public void setYearOfRelease(int yearOfRelease) {
	    	this.yearOfRelease = yearOfRelease;
	    }
	    public int getViews() {
	        return views;
	    }
	    public void setViews(int views) {
	        this.views = views;
	    }
	    public String getMovieName() {
	        return movieName;
	    }
	    public void setmovieName(String movieName) {
	        this.movieName = movieName;
	    }
	    public double getRating() {
	        return rating;
	    }
	    public void setRating(double rating) {
	        this.rating = rating;
	    }
	    public static Comparator<Movie> viewsComp = new Comparator <Movie>() {
	    	public int compare(Movie m1,Movie m2) {
	    		int v1=m1.getViews();
	    		int v2=m2.getViews();
	    		return v2-v1;
	    	}
	    };
		
public static void main(String [] args)
{
	
  ArrayList<Movie> mve = new ArrayList<Movie>();
  Scanner sc = new Scanner(System.in);

  mve.add(new Movie("Arrival",2016,7.9,3100));
  mve.add(new Movie("The Shawshank Redemption",1994,9.2,3500));
  mve.add(new Movie("12 Angry Men",1957,8.9,3200));
  mve.add(new Movie("The Prestige",2006,8.5,4200));
  mve.add(new Movie("The Dark Knight Rises",2012,8.3,2800));
  mve.add(new Movie("A Beautiful Mind",2001,8.1,2890));
  mve.add(new Movie("Shutter Island",2010,8.1,3200));
  mve.add(new Movie("Prisoners",2013,8.1,2910));
  mve.add(new Movie("Incendies",2010,8.3,3100));
  mve.add(new Movie("Interstellar",2014,8.6, 3580));
  mve.add(new Movie("Drive",2011,7.8, 2960));
  mve.add(new Movie("Django Unchained",2012,8.4,3560));
  mve.add(new Movie("Fight Club",1999,8.8,4696));
  while(true) {
	  System.out.println("_______________________________");
	  System.out.println("Choose the required filter:");
	  System.out.println("1.Order by IMDB rating");
	  System.out.println("2.Order by year of release");
	  System.out.println("3.Order by number of views");
	  System.out.println("4.Exit");
	  int choice = sc.nextInt();
  switch(choice)
  {
  case 1:
	  System.out.println("Please enter the IMDB rating");
	  double rating = sc.nextDouble();
	  fetchByRating(mve,rating);
	  break;
  case 2:
	  System.out.println("Please enter the range for year of release");
	  System.out.print("From:");
	  int from = sc.nextInt();
	  System.out.print("To:");
	  int to = sc.nextInt();
	  fetchByYearOfRelease(mve,from,to);
	  break;
  case 3:
	  System.out.println("Ordering by number of views");
	  fetchByViews(mve);
	  break;
  default:
	  	System.exit(0);
		break;	    
  }
  
  }
  
}
private static void fetchByViews(ArrayList<Movie> mve) {
	Collections.sort(mve,Movie.viewsComp);
	for(int i = 0; i < mve.size(); i++){

	    Movie m = mve.get(i);

	    System.out.println(m.getMovieName()+", "+"Views:"+m.getViews());
	}
	
}
private static void fetchByYearOfRelease(ArrayList<Movie> mve, int from, int to) {
	Movie m;
	for(int i = 0; i < mve.size(); i++){
		m = mve.get(i);
		if(m.getYearOfRelease()>=from && m.getYearOfRelease()<=to)
		{
			System.out.println(m.getMovieName()+", "+"Year:"+m.getYearOfRelease());
		}
	}
	
	
}
private static void fetchByRating(ArrayList<Movie> mve, double rating2) {
	Movie m;
	for(int i = 0; i < mve.size(); i++){
		m = mve.get(i);
		if(m.getRating()>=rating2) {
			System.out.println(m.getMovieName()+", "+"Rating:"+m.getRating());
		
	}
	}
	
}
}



