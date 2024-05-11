package com.pick.nalsoom.Dto.Click;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClickDto {

    private String click_proper_num;
    private int cooling_center_click;
    private int warming_center_click;
    private int finedust_shelter_click;
    private String user_proper_num;
}
