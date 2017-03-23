package singleon;

/**
 * Created by skll on 2017/3/23.
 */
public class Book {

    //私有化构造方法
    private Book() {

    }

    private static class SingletonFactory {
        private static Book book = new Book();
    }

    public static Book getBook() {
        return SingletonFactory.book;
    }

    public void writeNo() {
        System.out.println("no 1");
    }

}
