package db.app;

import javax.swing.JOptionPane;

import db.ctrl.UserController;
import db.view.DeleteView;
import db.view.DetailView;
import db.view.EditView;
import db.view.ListView;
import db.view.RegisterView;
import db.view.View;

public class UserApp {

  public static void main(String[] args) {
    
    UserController userController = new UserController();

    while(true) {
      String choice = JOptionPane.showInputDialog("1.전체명단\n2.상세조회\n3.등록\n4.편집\n5.삭제\n0.종료\n원하는 작업 번호를 입력하세요.");
      View view = null;
      switch(choice) {
      case "1": view = new ListView(); break;
      case "2": view = new DetailView(); break;
      case "3": view = new RegisterView(); break;
      case "4": view = new EditView(); break;
      case "5": view = new DeleteView(); break;
      case "0": JOptionPane.showMessageDialog(null, "사용자 앱을 종료합니다."); return;
      default: JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");
      }
      if(view != null) {
        String message = userController.requestHandle(choice, view.display());
        JOptionPane.showMessageDialog(null, message);
      }
    }
    
  }

}
