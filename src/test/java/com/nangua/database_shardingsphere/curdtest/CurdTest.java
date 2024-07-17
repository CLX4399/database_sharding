package com.nangua.database_shardingsphere.curdtest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nangua.database_shardingsphere.dao.AppleMapper;
import com.nangua.database_shardingsphere.model.Apple;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * TODO
 *
 * @author CLX
 * @since 2024/7/17 10:09
 */
@SpringBootTest
@Log
public class CurdTest {

    @Autowired
    private AppleMapper appleMapper;

    @Test
    public void selectTest(){
        List<Apple> apples = appleMapper.selectList(new LambdaQueryWrapper<Apple>().eq(Apple::getId,"976"));
        log.info(apples.toString());
    }

    @Test
    public void pageSelect(){
        Page<Apple> applePage = appleMapper.selectPage(new Page<>(), null);
        log.info(applePage.toString());
    }

}
