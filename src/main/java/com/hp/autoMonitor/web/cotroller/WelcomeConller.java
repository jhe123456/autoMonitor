package com.hp.autoMonitor.web.cotroller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hp.autoMonitor.web.model.SysUser;
import com.hp.autoMonitor.web.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class WelcomeConller {

    Logger log= Logger.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value="/")
    public ModelAndView firstPage() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return  mv;
    }


    /**
     * 登录页
     */
    @RequestMapping(value="/login")
    public ModelAndView login() {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("login");
        return  mv;
    }

    /**
     * 登录页
     */
    @RequestMapping(value="/logout")
    public ModelAndView logout() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login");
        return  mv;
    }

    @RequestMapping(value="/index",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView index(){
    	  ModelAndView mv = new ModelAndView();  
    	  mv.addObject("uname","何自强 先生/小姐");
    	  System.out.println("-------------------");
//    	  return "redirect:/index.jsp";
    	  mv.setViewName("index");
    	  return mv;
    }

//    @RequestMapping(value="/user/{userId}",method = RequestMethod.GET)
//    public SysUser welcome(@PathVariable String userId) {
//        SysUser user= userService.selectById(Long.parseLong(userId));
//        return user;
//    }
}
