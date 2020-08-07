package com.ncs.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ExceptionHandler implements ErrorController {

    @Autowired
    private ErrorAttributes errorAttributes;

    @Override
    public String getErrorPath() {
        return "error";
    }

    @RequestMapping(value = "/error",  produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseMessage error(HttpServletRequest request) {
        ServletWebRequest requestAttributes = new ServletWebRequest(request);
        Map<String, Object> body = this.errorAttributes.getErrorAttributes(requestAttributes, true);
        return ResponseMessage.fail("error msg！", body);
    }

}
