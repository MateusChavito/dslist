package com.mateuschaves.dslist.repositories;

import com.mateuschaves.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
