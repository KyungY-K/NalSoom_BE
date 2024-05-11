package com.pick.nalsoom.Domain.Click;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Click {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String click_proper_num;
    private int cooling_center_click;
    private int warming_center_click;
    private int finedust_shelter_click;
    private String user_proper_num;
    
}
