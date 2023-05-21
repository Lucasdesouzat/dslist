package com.tamarin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamarin.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

