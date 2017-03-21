/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.FrameworkBean;
import domain.User;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author bram
 */
@Controller
public class UserController {
    
    @RequestMapping(value={"user"}, method = RequestMethod.GET)
    public String showHomePage(Model model){
        List<String> listFrameworks = (new FrameworkBean()).getWebFrameworkList();
        User user = new User();
        user.setFavFramework(new String[]{listFrameworks.get(0)});
        model.addAttribute("webFrameworkList",listFrameworks);
        model.addAttribute("user",user);
        return "userForm";
    }
    
    @RequestMapping(value = {"user"}, method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute User user){
        return "resultView";
    }
}
