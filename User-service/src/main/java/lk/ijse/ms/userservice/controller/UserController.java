package lk.ijse.ms.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dilan
 * @created 25/11/2023 - 11:49 am
 */

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return "In user service";
    }
    @GetMapping("/save")
    public String save(){
        return restTemplate.getForObject("http://localhost:8082/app/order",String.class);
    }

}
