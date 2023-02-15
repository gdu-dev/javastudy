package ex02_Runnable;

public class Gun {

	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shoot() {
		if(bullet == 0) {
			throw new RuntimeException("총알이 없습니다.");
		}
		bullet--;
		System.out.println("빵! " + bullet + "발 남았습니다.");
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}

}
