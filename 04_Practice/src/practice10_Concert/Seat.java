package practice10_Concert;

public class Seat {

	private Person person;  // 좌석 예약한 사람
	
	public Seat() {
		
	}
	
	public Seat(Person person) {
		super();
		this.person = person;
	}
	
	// getter
	public Person getPerson() {
		return person;
	}
	
	// setter
	public void setPerson(Person person) {
		this.person = person;
	}
	
	// 예약
	public void reserve(Person person) {
		setPerson(person);
	}
	
	// 예약 취소
	public void cancel() {
		setPerson(null);
	}
	
	// 예약 여부 확인
	public boolean isOccupied() {
		return person != null;  // null이 아니면 true 반환(예약되어있으면 true 반환)
	}
	
	// 예약자 확인
	public boolean isMatched(String name) {
		return person != null && name.equals(person.getName());
	}
	
}
