package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by zzt on 2017/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class scoreTest {


    @Resource
    private ScoreDao scoreDao;

    @Test
    public void testBatcheDelete(){

        List list = new ArrayList<String>();
        list.add(1);
        list.add(2);
        //list.add(3);
        scoreDao.batcheDelete(list);


    }
}
