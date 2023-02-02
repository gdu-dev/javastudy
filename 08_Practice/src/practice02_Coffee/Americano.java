package practice02_Coffee;

import java.util.ArrayList;
import java.util.List;

// 아메리카노

public class Americano {

	// 필드
	private List<Espresso> cups;  // 에스프레소 여러 잔 들어갈 수 있음
	private int shotCount;        // 아메리카노에 들어간 에스프레소 개수(샷)
	private int extraWater;       // 물
	
	// 생성자
	public Americano(int shotCount, int extraWater) {
		cups = new ArrayList<Espresso>();
		this.shotCount = shotCount;
		this.extraWater = extraWater;
	}
	
	// 샷 추가 addEspresso 메소드
	public void addEspresso(Espresso espresso) {
		if(shotCount == 0) {
			System.out.println("더 이상 shot을 추가할 수 없습니다.");
			return;
		}
		cups.add(espresso);
		shotCount--;
	}
	
	// 조회 info 메소드
	public void info() {
		int totalWater = 0;
		for(int i = 0; i < cups.size(); i++) {
			System.out.println("◁◁◁ " + (i + 1) + "번째 샷 정보 ▷▷▷");
			cups.get(i).info();
			totalWater += cups.get(i).getWater();
		}
		totalWater += extraWater;
		System.out.println("아메리카노 총 ml : " + totalWater + "ml");
	}
	
}
