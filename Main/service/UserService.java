package service;

import org.apache.catalina.User;

import java.util.List;
//import com.example.Example.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    List<model.User> getAllUsers();
}
