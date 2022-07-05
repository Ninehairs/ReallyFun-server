package com.reallyfun.server.controller;

import com.reallyfun.server.entity.Game;
import com.reallyfun.server.service.IGameService;
import com.reallyfun.server.service.ex.GameException;
import com.reallyfun.server.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class GameController extends BaseController{
    @Autowired
    private IGameService gameService;

    @RequestMapping("create")
    public ResponseResult<Void> create(Game game){
        //创建返回值
        ResponseResult<Void> response=new ResponseResult<>();
            gameService.create(game);
            return ResponseResult.getResponseResult("注册成功");
    }

}
