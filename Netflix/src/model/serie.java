package model;

public class serie {
	
	public serie(String major_genre, String title, String subgenre, int premiere_year, String episodes, String status,
			int imds_rating) {
		super();
		this.major_genre = major_genre;
		this.title = title;
		this.subgenre = subgenre;
		this.premiere_year = premiere_year;
		this.episodes = episodes;
		this.status = status;
		this.imdb_rating = imds_rating;
	}
	
	public String major_genre;
	public String title;
	private String subgenre;
	public int premiere_year;
	public String episodes;
	public String status;
	public int imdb_rating;
	
	
	@Override 
	public String toString () {
		return major_genre+","+title+","+subgenre+","+premiere_year+","+episodes+","+status+","+imdb_rating;
	}
	
}
