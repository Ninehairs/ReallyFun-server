package com.reallyfun.server.service.impl;

import com.reallyfun.server.entity.Game;
import com.reallyfun.server.mapper.IGameMapper;
import com.reallyfun.server.service.IGameService;
import com.reallyfun.server.service.ex.GameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GameServiceImpl implements IGameService {
    @Autowired(required = false)
    private IGameMapper gameMapper;

    @Override
    public void create(Game game){
        String title=game.getTitle();
        Integer user=game.getUserId();
        Game result=gameMapper.findByTitle(title);
        if(result !=null){
            throw new GameException("游戏名已占用");
        }
        Date now=new Date();
        game.setCreatedUser(user);
        game.setCreatedTime(now);
        game.setModifiedUser(user);
        game.setModifiedTime(now);

        //调用持久层insert方法，创建并获取返回值
        Integer rows=gameMapper.insert(game);
        if(rows!=1){
            //插入出现错误
            throw new GameException("创建游戏出现错误");
        }


    }
}
