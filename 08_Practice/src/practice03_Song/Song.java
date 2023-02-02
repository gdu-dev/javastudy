package practice03_Song;

public class Song {

	private String title;
	private String genre;
	
	public Song(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void info() {
		System.out.println("[title=" + title + ", genre=" + genre + "]");
	}
	
}
