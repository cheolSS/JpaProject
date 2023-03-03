package controller;

import entitiy.User;
import Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public void createUser() {
        userService.createuser(new User());
        return;
        //todo
    }

    @GetMapping("/delete")
    public void deleteUser(User user) {
        userService.deleteuser(user);
        return;
        //todo
    }
}
