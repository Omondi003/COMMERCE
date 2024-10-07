package org.example.commerces.Tables;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@
public class Payment_details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String  id;

    private  String  User_id;

    private String Total;

    private String Payment_id;
}
