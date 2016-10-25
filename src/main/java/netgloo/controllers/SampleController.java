package netgloo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping(value="/getHello", produces = "text/html; charset=utf-8")
    public @ResponseBody
    String getHello(HttpServletRequest request) {
        return "Hello Spring Boot.";
    }
}
