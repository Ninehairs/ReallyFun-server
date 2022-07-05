package com.reallyfun.server.service;


import com.reallyfun.server.entity.Game;

public interface IGameService{
    /**
     * 游戏创建
     * @param game 游戏数据
     */
    void create(Game game);
}
