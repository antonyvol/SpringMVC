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
@RequestMapping("/helloworld.html")
public class HelloWorldController extends ParameterizableViewController {
    private String viewName = "/helloworld/helloworld";

    // mapping on the according "path" on the mvc-config.xml
    public HelloWorldController() {
        super.setViewName(viewName);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "this is hello from the controller!");
        // return the path to the according jsp
        return viewName;
    }
}
