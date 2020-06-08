package controller;

import modol.SignIn;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class SignInControler {
    @GetMapping()
    public ModelAndView showSignIn(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("signin", new SignIn());
        return modelAndView;
    }

    @PostMapping("/validateSignIn")
    public ModelAndView checkValidation(@Validated @ModelAttribute("signin")SignIn signIn, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("index");
        }
        return new ModelAndView("result");
    }
}
