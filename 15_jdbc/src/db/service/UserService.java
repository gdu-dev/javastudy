package db.service;

import java.util.List;

import db.dto.UserDto;

public interface UserService {
  List<UserDto> getUsers();
  UserDto getUser(int user_no);
  int saveUser(UserDto userDto);
  int modifyUser(UserDto userDto);
  int removeUser(int user_no);
}