package practice03_Song;

public class MainClass {

	public static void main(String[] args) {
		
		Singer singer = new Singer("이문세");
		
		Song song1 = new Song("옛 사랑", "발라드");
		Song song2 = new Song("조조 할인", "댄스");
		Song song3 = new Song("가로수 그늘아래 서면", "발라드");
		
		Producer producer = new Producer();
		producer.produce(singer, song1);  // song1 등록
		producer.produce(singer, song2);  // song2 등록
		producer.produce(singer, song3);  // song3 등록
		
		singer.info();
		
		Song song4 = new Song("붉은 노을", "댄스");
		producer.produce(singer, "조조 할인", song4);  // 조조 할인을 song4로 교체
		
		singer.info();
		
	}

}
