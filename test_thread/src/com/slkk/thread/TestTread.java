package com.slkk.thread;

import java.util.Scanner;

/*
* 守护进程最重要的特点就是主进程结束，自己也会自动结束
* 1）、thread.setDaemon(true)必须在thread.start()之前设置。

　　否则会跑出一个IllegalThreadStateException异常。你不能把正在运行的常规线程设置为守护线程。  （备注：这点与守护进程有着明显的区别，守护进程是创建后，让进程摆脱原会话的控制+让进程摆脱原进程组的控制+让进程摆脱原控制终端的控制；所以说寄托于虚拟机的语言机制跟系统级语言有着本质上面的区别）

2）、 在Daemon线程中产生的新线程也是Daemon的。

　　  （这一点又是有着本质的区别了：守护进程fork()出来的子进程不再是守护进程，尽管它把父进程的进程相关信息复制过去了，但是子进程的进程的父进程不是init进程，所谓的守护进程本质上说就是“父进程挂掉，init收养，然后文件0,1,2都是/dev/null，当前目录到/”）

3）、不是所有的应用都可以分配给Daemon线程来进行服务，比如读写操作或者计算逻辑。因为在Daemon Thread还没来的及进行操作时，虚拟机可能已经退出了
*
* */
public class TestTread {
    public TestTread() {

    }

    public void test() {

//        System.out.println(Thread.currentThread());
//        System.out.println("sd");
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String next = scanner.next();
//            System.out.println(next);

//        }

        System.out.println("进入主进程");

        Daemon daemon = new Daemon();
        Thread thread = new Thread(daemon);
        thread.setDaemon(true);
        thread.start();

//        Scanner sc = new Scanner(System.in);
//        sc.next();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("退出主进程");

    }

    class Daemon implements Runnable {

        @Override
        public void run() {
            System.out.println("进入守护进程");
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("守护进程输出" + i++);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("退出守护进程");
        }
    }


}

