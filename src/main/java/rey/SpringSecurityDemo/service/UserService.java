package rey.SpringSecurityDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rey.SpringSecurityDemo.model.Users;
import rey.SpringSecurityDemo.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    public Users register(Users user){
        return repo.save(user);
    }
}
