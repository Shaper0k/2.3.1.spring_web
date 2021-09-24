package web.controller;


import hiber.model.User;
import hiber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class UserControllers {


    private final UserService userService;
    @Autowired
    public UserControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "/user-list";
    }


    @GetMapping("user-create")
    public String createUserForm(User user){
        return "user-create";
    }
    @PostMapping
    public String createUser(User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

}
