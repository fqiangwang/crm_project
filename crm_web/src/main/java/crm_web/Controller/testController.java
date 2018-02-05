package crm_web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class testController {

	@RequestMapping("/test")
	public String test(){
		return "test";
	}
}
