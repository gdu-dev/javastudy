package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class EditView implements View {

  @Override
  public UserDto display() {
    
    String user_no = JOptionPane.showInputDialog("수정할 사용자 번호를 입력하세요.");
    String user_name = JOptionPane.showInputDialog("수정할 이름을 입력하세요.");
    String user_tel = JOptionPane.showInputDialog("수정할 연락처를 입력하세요.");
    
    return new UserDto(Integer.parseInt(user_no), user_name, user_tel, null);
    
  }

}
