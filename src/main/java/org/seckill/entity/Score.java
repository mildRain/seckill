package org.seckill.entity;

/**
 * Created by zzt on 2017/7/15.
 */
public class Score {

    private int cr_id;
    private int st_id;
    private int score;

    public int getCr_id() {
        return cr_id;
    }

    public void setCr_id(int cr_id) {
        this.cr_id = cr_id;
    }

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "cr_id=" + cr_id +
                ", st_id=" + st_id +
                ", score=" + score +
                '}';
    }
}
