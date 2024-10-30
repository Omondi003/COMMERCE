package org.example.commerces.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User_model {
    private String id;
    private String username;
    private  String first_name;
    private  String last_name;
    private  String phoneNumber;


}
