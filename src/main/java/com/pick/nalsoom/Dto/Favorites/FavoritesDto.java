package com.pick.nalsoom.Dto.Favorites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoritesDto {

    private String favorites_proper_num;
    private String favorites_location;
    private String user_proper_num;

}
