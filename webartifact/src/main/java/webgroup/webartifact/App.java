package webgroup.webartifact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
	@RequestMapping("/hello")
    public static ModelAndView helloWorld()
    {
		ModelAndView mav = new ModelAndView("helloWorld");
        mav.addObject("message", "Java is so weird");
        return mav;
    }
}
