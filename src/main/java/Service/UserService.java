package Service;

import entitiy.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final repository.userRepository userRepository;

    public UserService(repository.userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteuser(User user) {
        userRepository.delete(user);
        return;
        //todo
    }

    public void createuser(User user) {
        userRepository.save(user);
        return;
    }

    public void createuser() {
        userRepository.save(new User());
    }
}
