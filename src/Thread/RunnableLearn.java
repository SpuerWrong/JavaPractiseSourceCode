package Thread;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className RuunableLearn
 * @package Thread
 * @description Runnable类
 */
public class RunnableLearn implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableLearn runnableLearn = new RunnableLearn();
        //Runnable RunnableLearn = null;
        Thread thread = new Thread(runnableLearn);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程"+i);
        }

    }
}
