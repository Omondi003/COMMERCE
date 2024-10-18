package org.example.commerces.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Shopping_session {
    @Id
    @GeneratedValue(strategy =GenerationType.UUID)
    private  String  id;

    private  String  user_id;

    private String Total;
}
