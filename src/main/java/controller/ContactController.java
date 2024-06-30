package controller;

import jakarta.servlet.http.HttpServletRequest;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @ModelAttribute
    public void commonDataForModel(Model m) {
        m.addAttribute("Header", "Learning Spring MVC");
    }

    @RequestMapping("/contact")
    public String showContactForm(Model m) {
        m.addAttribute("Header", "Learning Spring MVC");
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
//    public String handleForm(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        System.out.println("Name: " + name);
//        String email = request.getParameter("email");
//        System.out.println("Email: " + email);
//        return "";
//    }
    public String handleForm(@ModelAttribute User user, Model model) {

        System.out.println(user);
//        we dont even need model to pass the user object to the view
//        model.addAttribute("user", user);
        //bs model class ke attributes(variables)(User) ka nam match krna chahiye form ke input fields ke name se
        return "success";
    }
}
