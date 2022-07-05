package com.reallyfun.server.service;

import com.reallyfun.server.entity.Game;
import com.reallyfun.server.service.ex.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameServiceTests {
    @Autowired
    private IGameService iGameService;

    @Test
    public void create(){
        try {
            Game game = new Game();
            game.setUserId(1);
            game.setTitle("testtitle3");
            game.setIntro("This is the intro");
            game.setTutorial("This is the tutorial");
            game.setEntry("/mmmm/nnnn/");
            game.setSource("source");
            game.setThumb("/mmm/yyyy");
            game.setHidden(Boolean.FALSE);
            game.setRating(1.5);
            iGameService.create(game);
            System.out.println("注册成功");
        }catch (ServiceException e){
            System.out.println("注册失败"+e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
