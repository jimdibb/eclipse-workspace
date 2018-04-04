package webgroup.webartifact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
	@RequestMapping("/hello")
    public static String helloWorld( String[] args )
    {
        return "WEB-INF/helloWorld.jsp";
    }
}
