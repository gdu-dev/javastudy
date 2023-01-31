package b;

public class Seat {

	private String name;        // 필드는 null 값으로 초기화 되어 있다.
	
	public Seat() { }           // new Seat() + setName("홍길동")
	public Seat(String name) {  // new Seat("홍길동")
		this.name = name;
	}
	
	public String getName() {    // name 확인용 메소드 (예약자 확인용)
		return name;
	}
	public void setName(String name) {  // 실제 name 저장용 메소드 (예약 처리용)
		this.name = name;
	}
	public void reserve(String name) {  // 예약 처리할 때 보여줄 메소드 : reserve("홍길동")을 호출하면 setName("홍길동")이 다시 호출되어서 처리된다.
		setName(name);
	}
	public void cancel() {  // 예약 취소
		name = null;
	}
	public boolean isOccupied() {  // 좌석이 점유되었으면 true 반환
		if(name == null) {
			return false;  // 점유되어 있지 않다.
		} else {
			return true;   // 점유되어 있다.
		}
		// 추천하는 코드
		// return name != null;
	}
	public boolean isMatched(String name) {  // 좌석의 name(필드 : this.name)과 매개변수 String name이 동일하면 true 반환
		if(this.name.equals(name)) {
			return true;
		} else {
			return false;
		}
		// 추천하는 코드
		// return this.name.equals(name);
	}
	
}