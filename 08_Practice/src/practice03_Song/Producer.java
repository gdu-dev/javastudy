package practice03_Song;

public class Producer {
	
	// produce 메소드 오버로딩
	
	public void produce(Singer singer, Song song) {
		singer.addSong(song);
	}
	
	public void produce(Singer singer, String title, Song song) {
		singer.changeSong(title, song);
	}

}
