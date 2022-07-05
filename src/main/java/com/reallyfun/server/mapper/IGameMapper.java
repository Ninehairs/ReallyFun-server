package com.reallyfun.server.mapper;

import com.reallyfun.server.entity.Game;

public interface IGameMapper {
    /**
     * 插入游戏数据
     *
     * @param game 游戏数据
     * @return 受影响行数
     */
    Integer insert(Game game);

    /**
     * 根据游戏名查询游戏数据
     *
     * @param title 游戏名
     * @return 游戏数据，若无则null
     */
    Game findByTitle(String title);
}
