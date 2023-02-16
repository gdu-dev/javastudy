package ex06_select;

import java.sql.Date;

public class Member {

	// 필드는 테이블의 칼럼과 1:1로 매칭한다.
	private int member_no;
	private String id;
	private String name;
	private String address;
	private Date join_date;
	
	public Member() { }

	public Member(int member_no, String id, String name, String address, Date join_date) {
		super();
		this.member_no = member_no;
		this.id = id;
		this.name = name;
		this.address = address;
		this.join_date = join_date;
	}

	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	@Override
	public String toString() {
		return "Member [member_no=" + member_no + ", id=" + id + ", name=" + name + ", address=" + address
				+ ", join_date=" + join_date + "]";
	}
	
}
