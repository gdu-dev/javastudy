package b;

import javax.swing.JOptionPane;

public class SeatGroup {

	private String seatType;  // "S", "R", "A"
	private Seat[] seats;     // 배열의 선언
	
	// new SeatGroup("S", 30)  :  "S"석이 30개 있다.
	public SeatGroup(String seatType, int length) {
		this.seatType = seatType;     // 좌석 타입 설정
		seats = new Seat[length];     // 배열의 생성
		for(int i = 0; i < length; i++) {
			seats[i] = new Seat();    // 점유되지 않은 빈 좌석을 배열의 길이만큼 만들기
		}
	}
	
	// 예매 상황
	public void info() {
		
		System.out.println("[" + seatType + "] 타입");
		for(int i = 0; i < seats.length; i++) {
			
			System.out.print((i < 9 ? "0" : "") + (i + 1));
			if(seats[i].isOccupied() == false) {
				System.out.print("     ");
			} else {
				System.out.print(seats[i].getName());
			}
			
			// 인덱스의 일의 자리가 9이면 줄을 바꾸고 아니면 공백을 준다.
			if(i % 10 == 9) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
			
		}
		
	}
	
	// 예약하기
	public boolean reserve() {
		info();  // 예매 상황 보여주기
		String strNo = JOptionPane.showInputDialog("예약할 시트번호를 입력하세요.");
		int seatNo = Integer.parseInt(strNo);
		if(seatNo < 1 || seatNo > seats.length) {
			JOptionPane.showMessageDialog(null, seatNo + "번 좌석은 없는 좌석입니다.");
			return false;  // 예약하기 실패
		}
		if(seats[seatNo - 1].isOccupied()) {
			JOptionPane.showMessageDialog(null, seatNo + "번 좌석은 이미 예약된 좌석입니다.");
			return false;  // 예약하기 실패
		}
		String name = JOptionPane.showInputDialog("예약자 성함을 입력하세요.");
		seats[seatNo - 1].setName(name);
		JOptionPane.showMessageDialog(null, seatNo + "번 좌석 예약이 성공했습니다.");
		return true;  // 예약하기 성공
	}
	
	// 예약취소하기
	public boolean cancel() {
		info();
		String name = JOptionPane.showInputDialog("취소자 성함을 입력하세요.");
		for(int i = 0; i < seats.length; i++) {
			if(seats[i].isOccupied() && seats[i].isMatched(name)) {  // 같은 이름은 없다는 가정으로 풉니다.
				seats[i].setName(null);
				JOptionPane.showMessageDialog(null, "예약자 " + name + "의 예약이 취소되었습니다.");
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "입력된 이름 " + name + "은 존재하지 않습니다.");
		return false;
	}
	
}