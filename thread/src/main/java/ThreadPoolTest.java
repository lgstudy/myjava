import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

/**
 * @description: 线程池
 * @author: longgui
 * @create: 2019-12-19 21:10
 **/
public class ThreadPoolTest {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ThreadPoolTest.class) ;
        String name = "{$JAVA:}" ;
        logger.info("{}",name);
        /*ExecutorService pool123 = Executors.newScheduledThreadPool(1) ;
        MyThread myThread1 = new MyThread() ;
        MyThread myThread2 = new MyThread() ;
        MyThread myThread3 = new MyThread() ;
        MyThread myThread4 = new MyThread() ;
        MyThread myThread5 = new MyThread() ;
        pool123.submit(myThread1) ;
        pool123.submit(myThread2) ;
        pool123.submit(myThread3) ;
        pool123.submit(myThread4) ;
        pool123.submit(myThread5) ;
        pool123.shutdown();*/
    }
}
