package in.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hi")
    public String test() {
        this.logger.warn("method is called...");
        return "Welcome to Ashok IT..!!";
    }
}
