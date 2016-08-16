package com.hp.autoMonitor.web.cotroller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class WelcomeConller {

    Logger log= Logger.getLogger(this.getClass());

    /**
     * 登录页
     */
    @RequestMapping(value="/login")
    public ModelAndView login() {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("login");
        return  mv;
    }

    @RequestMapping(value="/index",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView index(ModelMap model){
    	  ModelAndView mv = new ModelAndView();  
    	  mv.addObject("uname","何自强先生");
    	  System.out.println("-------------------");
//    	  return "redirect:/index.jsp";
    	  mv.setViewName("index");
    	  return mv;
    }

 


    @RequestMapping(value="/hzl/{user}", method={RequestMethod.POST,RequestMethod.GET})
    public List welcome(@PathVariable String user,ModelMap model) {//Welcome page, non-rest
    	System.out.println(user);
        model.addAttribute("message", "Welcome to RestTemplate Example.");
        User u=new User();
        List l=new ArrayList<>();
        Set s=new HashSet();
        s.add("111");
        s.add("222");
        u.setName(user);
        u.setSex("男");
        u.setSet(s);
        l.add(u);
        User u1=new User();
        u1.setName("tiancai");
        u1.setSex("");
        Set s1=new HashSet();
        s1.add("111");
        s1.add("222");
        u1.setSet(s1);
        l.add(u1);
        return l;
    }
    
    static class User{
    	private String name ;
    	private String sex;
    	private Set set;
    	
    	
		public Set getSet() {
			return set;
		}
		public void setSet(Set set) {
			this.set = set;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
    	
    }
    


    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

}
