package com.requirements;

public class Movie {
	String name;
	String language;
	String genre;
	double rating;
	
	public Movie(String name,String language,String genre,double rating){
		this.name=name;
		this.language=language;
		this.genre=genre;
		this.rating=rating;
		
		
	}
	
	public void displayMovieInfo() {
		System.out.println("Movie:" +name);
		System.out.println("Language:"+language);
		System.out.println("Genre:"+genre);
		System.out.println("Rating"+rating+"/5");
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		
		Movie m1 =new Movie("KGF","Kannada","Action",4.9);
		m1.displayMovieInfo();

	}

}
