package com.pick.nalsoom.Dto.Notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {

    private String notification_proper_num;    
    private String notification_content;
    private String notification_type;
    private String notification_read_yn;
    private String user_proper_num;
    
}
