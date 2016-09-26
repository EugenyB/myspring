package ua.mk.berkut.myspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by eugen on 26.09.2016.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("index");
    }

}
