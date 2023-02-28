package Service;

import Entity.User;
import Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createuser(User user) {
        userRepository.save(user);
    }

    public void deleteuser(User user) {
        userRepository.delete(user);
    }

}
