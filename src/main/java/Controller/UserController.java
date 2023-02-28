package Controller;

import Entity.User;
import Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main1")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login/register")
    public String CreateUser(User user){

        userService.createuser(user);
        return null;
    }

    @GetMapping("/login")
    public String DeleteUser(User user) {
        userService.deleteuser(user);
        return null;
    }
}
