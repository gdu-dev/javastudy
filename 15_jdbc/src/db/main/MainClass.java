package db.main;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;

public class MainClass {

  public static void main(String[] args) {
    
    //UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);
    //UserDao userDao = UserDao.getInstance();
    //int result = userDao.saveUser(userDto);
    //System.out.println(result + "행이 삽입되었습니다.");

    UserService userService = new UserServiceImpl();
    
    List<UserDto> users = userService.getUsers();
    for(UserDto user : users) {
      System.out.println(user);
    }
    
    //UserDto userDto = userDao.getUser(1);
    //System.out.println(userDto);
    
    //UserDto userDto = new UserDto(1, "수정이름", "수정연락처", null);
    //int result = userDao.modifyUser(userDto);
    //System.out.println(result + "행이 수정되었습니다.");
    
    //int result = userDao.removeUser(1);
    //System.out.println(result + "행이 삭제되었습니다.");
    
  }

}
