package org.example.commerces.Tables;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User_payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String  id;

    private  String  user_id;

    private String Payment_type;

    private String Card_type;

    private String Account_no;
}
