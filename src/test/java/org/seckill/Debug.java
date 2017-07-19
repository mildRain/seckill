package org.seckill;

/**
 * Created by zzt on 2017/7/9.
 */
public class Debug {

    public static void main(String[] args){
        System.out.print("nihao!");
        System.out.print(test());
    }
    private static Integer test(){
        int ret = 0;
        try{
            throw new Exception();
        }
        catch(Exception e){
            ret = 1;
            return ret;
        }
        finally{
            ret = 2;
        }
      //  System.out.print(ret);
    }
}
