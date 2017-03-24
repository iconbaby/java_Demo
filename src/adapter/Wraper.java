package adapter;

import javax.swing.*;

/**
 * Created by dell on 2017/3/24.
 */
public class Wraper implements Sportable {

    private Animal animal;

    public Wraper(Animal animal) {
        super();
        this.animal = animal;
    }

    @Override
    public void run() {
        animal.run();

    }

    @Override
    public void eat() {
        System.out.println("from wraper");
    }
}
