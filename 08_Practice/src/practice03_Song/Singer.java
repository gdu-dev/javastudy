package practice03_Song;

import java.util.ArrayList;
import java.util.List;

public class Singer {

	private String name;
	private List<Song> songs;
	
	public Singer(String name) {
		this.name = name;
		songs = new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		if(song != null) {
			songs.add(song);
			System.out.println(song.getTitle() + " 노래를 추가했습니다.");
		}
	}
	
	public void changeSong(String title, Song song) {
		if(songs.isEmpty()) {
			System.out.println("등록된 노래가 없습니다.");
			return;
		}
		if(title != null && song != null) {			
			for(int i = 0; i < songs.size(); i++) {
				if(title.equals(songs.get(i).getTitle())) {
					songs.set(i, song);
					return;
				}
			}
		}
		System.out.println(title + " 노래가 존재하지 않습니다.");
	}
	
	public void info() {
		System.out.println("가수이름 : " + name);
		System.out.println("대표곡 목록");
		for(int i = 0; i < songs.size(); i++) {
			songs.get(i).info();
		}
	}
	
}
