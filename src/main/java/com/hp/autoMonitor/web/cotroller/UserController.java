package com.hp.autoMonitor.web.cotroller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.hp.autoMonitor.core.entity.JSONResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hp.autoMonitor.web.model.SysUser;
import com.hp.autoMonitor.web.service.UserService;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public List<SysUser> toIndex() {
        List<SysUser> list = userService.getAllUsers();
        System.out.println("***************");
        return list;
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long userId) throws Exception {
        String result="0";
        if(userId!=null){
            try{
                userService.delete(userId);
            }catch (Exception e){
                e.printStackTrace();
                result ="1";
            }
        }else{
            result="1";
        }
        return result;
    }

    @RequestMapping("/userMenu")
    public ModelAndView userMenu(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/user/users");
        return mv;
    }
}

 
 
