package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hackman
 */

@Controller
@RequestMapping("cheese")
public class CheeseController {

    //Request path; /cheese
    @RequestMapping(value ="")
    public String index() {
        return "cheese/index";
    }

}
