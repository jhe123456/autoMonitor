package com.hp.autoMonitor.web.cotroller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.autoMonitor.web.model.SysUser;
import com.hp.autoMonitor.web.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserById(userId);
        List<SysUser> list = userService.getAllUsers();
        model.addAttribute("user", list);
        System.out.println("***************");
        return "showUser";
    }
}

 
 
