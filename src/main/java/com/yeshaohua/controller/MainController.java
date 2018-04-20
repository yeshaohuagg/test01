package com.yeshaohua.controller;

import com.yeshaohua.model.User;
import com.yeshaohua.service.IUserService;
import com.yeshaohua.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    private IUserService service = new UserServiceImpl();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(User user) {
        return "index";
    }
    @RequestMapping(value="/nice",method = RequestMethod.GET)
    @ResponseBody
    public List<User> nice(Model model){
        return service.getAllUsers();
    }

    @RequestMapping(value ="/toJson",method=RequestMethod.POST)
    @ResponseBody
    public User toJson(User user){
        service.addUser(user);
        return service.findUserById(2);
    }
}
