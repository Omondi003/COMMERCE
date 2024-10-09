package org.example.commerces.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@RestController
@RequestMapping("/commerce")
public class User_Controller {
    private String User_id;
    private String username;
    private  String first_name;
    private  String last_name;
    private  String phoneNumber;


}
