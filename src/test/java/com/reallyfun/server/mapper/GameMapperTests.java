package com.reallyfun.server.mapper;

import com.reallyfun.server.entity.Game;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootTest
public class GameMapperTests {
    @Autowired(required = false)
    private IGameMapper gameMapper;

    @Test
    public void insert()
    {
        Game game=new Game();
        game.setUserId(1);
        game.setTitle("testtitle2");
        game.setIntro("This is the intro");
        game.setTutorial("This is the tutorial");
        game.setEntry("/mmmm/nnnn/");
        game.setSource("source");
        game.setThumb("/mmm/yyyy");
        game.setHidden(Boolean.FALSE);
        game.setRating(1.5);
        game.setCreatedTime(new Date());
        game.setCreatedUser(1);
        game.setModifiedTime(new Date());
        game.setModifiedUser(1);
        Integer rows= gameMapper.insert(game);
        System.out.println("rows="+rows);

    }

    @Test
    public void findByTitle()
    {
        String title="testTitle";
        Game game=gameMapper.findByTitle(title);
        System.out.println(game);
    }
}