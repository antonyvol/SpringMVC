package org.antonyvol.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Антон on 27.08.2017.
 */

@Controller
public class HelloWorldController {
    // mapping on the according "path" on the mvc-config.xml
    @RequestMapping("/helloworld")
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "this is hello from the controller!");
        // return the path to the according jsp
        return "/helloworld/helloworld";
    }
}
