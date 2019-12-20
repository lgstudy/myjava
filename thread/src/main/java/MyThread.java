import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @description: 一个线程
 * @author: longgui
 * @create: 2019-12-20 10:38
 **/
public class MyThread extends Thread {
    public static final Logger log = LogManager.getLogger(MyThread.class) ;

    public void run() {
        log.info(currentThread().getName()+"正在执行...");
        System.out.println(currentThread().getName()+"正在执行...");
    }

}
