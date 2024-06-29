package controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String showContactForm() {
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
    public String handleForm(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, Model model){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        //processing the data
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
//        model.addAttribute("message", "You have successfully submitted the form");
        return "success";
    }
}
