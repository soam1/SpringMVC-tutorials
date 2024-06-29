package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("this is index page");
        model.addAttribute("name", "Akash Soam");

        List<String> friends = new ArrayList<String>();
        friends.add("bajaj");
        friends.add("atul");
        friends.add("pandi");
        friends.add("bhuria");
        model.addAttribute("f", friends);
        return "index";
    }


    @RequestMapping("/about")
    public String about() {
        System.out.println("This is about section");
        return "about";
    }


//    @RequestMapping("/help")
//    public String help() {
//        System.out.println("This is help page");
//        return "help";
//    }

    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("This is help page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Akash Soam");
        modelAndView.addObject("roll", 3);
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
