package com.pick.nalsoom.Repository.Favorites;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pick.nalsoom.Domain.Favorites.Favorites;

public interface FavoritesRepository extends JpaRepository<Favorites, String>{

    
}