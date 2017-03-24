package adapter;

/**
 * Created by dell on 2017/3/24.
 */
public class Adapter extends Animal implements Sportable {

    @Override
    public void eat() {
        System.out.println("from Adapter eat");
    }
}
