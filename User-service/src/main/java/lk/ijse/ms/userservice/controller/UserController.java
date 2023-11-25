package lk.ijse.ms.userservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lk.ijse.ms.userservice.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    //trying param as
    @GetMapping("/update")
    public String callback(String name){
        System.err.println(name);
        return restTemplate.postForObject("http://localhost:8082/app/order/save?name="+name,name,String.class);
    }

    @PostMapping("/add")
    public String save(@RequestBody OrderDTO orderDTO) throws JsonProcessingException {
        System.err.println(orderDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<OrderDTO> requestEntity = new HttpEntity<>(orderDTO, headers);

        return restTemplate.postForObject("http://localhost:8082/app/order/add",requestEntity,String.class);
    }

}
