package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import repo.UserRepo;

@Service
public class UserService {

	@Autowired
    private UserRepo repo;
	
public User saveUser(User user) {
    return repo.save(user);
}

public List<User> saveUsers(List<User> users) {
    return repo.saveAll(users);
}

public List<User> getProducts() {
    return repo.findAll();
}



public User getUserById(int id) {
    return repo.findById(id).orElse(null);
}
//public User getUserByName(String name) {
//    return repository.findByName(name);
//}

}
