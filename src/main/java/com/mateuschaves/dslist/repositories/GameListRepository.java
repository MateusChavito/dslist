package com.mateuschaves.dslist.repositories;

import com.mateuschaves.dslist.entities.Game;
import com.mateuschaves.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
