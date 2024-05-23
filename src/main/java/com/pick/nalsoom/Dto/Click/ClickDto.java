package com.pick.nalsoom.Dto.Click;

import com.pick.nalsoom.Domain.Click.Click;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClickDto {

    private Long clickProperNum;
    private int coolingCenterClick;
    private int warmingCenterClick;
    private int finedustShelterClick;
    private String userProperNum;

    public Click toEntity() {
        return Click.builder()
                .clickProperNum(clickProperNum)
                .coolingCenterClick(coolingCenterClick)
                .warmingCenterClick(warmingCenterClick)
                .finedustShelterClick(finedustShelterClick)
                .userProperNum(userProperNum)
                .build();
    }
}
