package com.pick.nalsoom.Domain.Click;

import com.pick.nalsoom.Dto.Click.ClickDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLICK")
@Builder
@Entity
public class Click {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLICK_PROPER_NUM")
    private Long clickProperNum;

    @Column(name = "COOLING_CENTER_CLICK")
    private int coolingCenterClick;

    @Column(name = "WARMING_CENTER_CLICK")
    private int warmingCenterClick;

    @Column(name = "FINEDUST_SHELTER_CLICK")
    private int finedustShelterClick;

    @Column(name = "USER_PROPER_NUM")
    private String userProperNum;

    public ClickDto toDto() {
        return ClickDto.builder()
                .clickProperNum(clickProperNum)
                .coolingCenterClick(coolingCenterClick)
                .warmingCenterClick(warmingCenterClick)
                .finedustShelterClick(finedustShelterClick)
                .userProperNum(userProperNum)
                .build();
    }
}
