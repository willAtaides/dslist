package com.listgames.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listgames.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
