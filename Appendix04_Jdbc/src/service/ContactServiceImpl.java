package service;

import java.util.List;
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

	@Override
	public void removeContact() {
		
		System.out.println("===== 연락처 삭제하기 =====");
		
		System.out.print("삭제할 연락처 이름 >>> ");
		String name = sc.next();
		
		List<ContactDTO> contactList = dao.selectContactsByName(name);
		System.out.println("<<< 조회된 연락처 목록 >>>");
		for(ContactDTO contact : contactList) {
			System.out.println(contact);
		}
		
		System.out.print("삭제할 연락처 No >>> ");
		int contact_no = sc.nextInt();
		
		int removeResult = dao.deleteContact(contact_no);
		
		System.out.println(removeResult + "개의 연락처가 삭제되었습니다.");
		
	}
	
	@Override
	public void modifyContact() {
		
		System.out.println("===== 연락처 수정하기 =====");
		
		System.out.print("수정할 연락처 이름 >>> ");
		String name = sc.next();
		
		List<ContactDTO> contactList = dao.selectContactsByName(name);
		System.out.println("<<< 조회된 연락처 목록 >>>");
		for(ContactDTO contact : contactList) {
			System.out.println(contact);
		}
		
		System.out.print("수정할 연락처 No >>> ");
		int contact_no = sc.nextInt();
		ContactDTO contact = dao.selectContactByNo(contact_no);  // 수정하기 전의 내용을 저장한 contact 객체
		
		System.out.print("수정할 항목 선택(1.이름  2.전화  3.이메일  4.주소) >>> ");
		String choice = sc.next();
		switch(choice) {
		case "1":
			System.out.print("수정할 이름 입력 >>> ");
			contact.setName( sc.next() );
			break;
		case "2":
			System.out.print("수정할 전화 입력 >>> ");
			contact.setTel( sc.next() );
			break;
		case "3":
			System.out.print("수정할 이메일 입력 >>> ");
			contact.setEmail( sc.next() );
			break;
		case "4":
			System.out.println("수정할 주소 입력 >>> ");
			contact.setAddress( sc.next() );
			break;
		default:
			System.out.println("잘못된 입력입니다. 수정을 취소합니다.");
			return;
		}
		
		int modifyResult = dao.updateContact(contact);
		
		System.out.println(modifyResult + "개의 연락처가 수정되었습니다.");
		
	}
	
	@Override
	public void findContactsByName() {
		
		System.out.println("===== 연락처 조회하기 =====");
		
		System.out.print("조회할 연락처 이름 >>> ");
		String name = sc.next();
		
		List<ContactDTO> contactList = dao.selectContactsByName(name);
		for(ContactDTO contact : contactList) {
			System.out.println(contact);
		}
		
	}
	
	@Override
	public void findAllContacts() {
		
		System.out.println("===== 전체 연락처 목록 =====");
		
		for(ContactDTO contact : dao.selectAllContacts()) {
			System.out.println(contact);
		}
		
	}
	
	
	
	
}