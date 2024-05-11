package com.pick.nalsoom.Dto.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    
    private String user_proper_num;
    private String user_id;
    private String user_pw;
    private String email;
}
