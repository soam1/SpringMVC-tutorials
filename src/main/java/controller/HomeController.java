package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
