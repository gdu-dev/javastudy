package service;

import java.util.Scanner;

import dao.ContactDAO;
import dto.ContactDTO;

public class ContactServiceImpl implements ContactService {

	
	/********** 1. field **********/
	private Scanner sc;
	private ContactDAO dao;
	
	
	/********** 2. constructor **********/
	public ContactServiceImpl() {
		sc = new Scanner(System.in);
		dao = ContactDAO.getInstance();
	}
	
	
	/********** 3. method **********/
	
	@Override
	public void addContact() {
		
		System.out.println("===== 연락처 추가하기 =====");
		
		System.out.print("신규 연락처 이름 >>> ");
		String name = sc.next();
		System.out.print("신규 연락처 번호 >>> ");
		String tel = sc.next();
		System.out.print("신규 연락처 이메일 >>> ");
		String email = sc.next();
		System.out.print("신규 연락처 주소 >>> ");
		String address = sc.next();
		
		ContactDTO contact = new ContactDTO();
		contact.setName(name);
		contact.setTel(tel);
		contact.setEmail(email);
		contact.setAddress(address);
		
		int addResult = dao.insertContact(contact);
		System.out.println(addResult + "개의 연락처가 등록되었습니다.");

	}

}










