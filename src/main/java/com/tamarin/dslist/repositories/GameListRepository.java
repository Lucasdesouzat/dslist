package com.tamarin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamarin.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

