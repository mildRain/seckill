package org.seckill.dao;


import java.util.List;

/**
 * Created by zzt on 2017/7/15.
 */
public interface ScoreDao {

    /**
     * 批量删除
     * @return
     */
   void batcheDelete(List list);
}
