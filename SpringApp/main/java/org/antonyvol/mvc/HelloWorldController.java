package org.antonyvol.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

/**
 * Created by Антон on 27.08.2017.
 */

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController extends ParameterizableViewController {
    // mapping on the according "path" on the mvc-config.xml
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "this is hello from the controller!");
        // return the path to the according jsp
        return "/helloworld/helloworld";
    }
}
