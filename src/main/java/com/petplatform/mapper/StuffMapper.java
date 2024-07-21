package com.petplatform.mapper;

import com.petplatform.POJO.Stuff;

import java.util.List;

public interface StuffMapper {
    List<Stuff> selectStuffs();
    Stuff selectByStuffIdNumber(Stuff stuff);
    void insertStuff(Stuff stuff);
    void updateStuff(Stuff stuff);
    void deleteStuff(Stuff stuff);
}
