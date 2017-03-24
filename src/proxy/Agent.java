package proxy;

/**
 * Created by dell on 2017/3/24.
 */
public class Agent implements Rentble {

    private Rentor rentor;

    public Agent() {
        super();
        rentor = new Rentor();
    }

    @Override
    public void rent() {
        beforeRent();
        rentor.rent();
        afterRent();

    }

    private void afterRent() {
        System.out.println("after rent");
    }

    private void beforeRent() {

        System.out.println("before rent");
    }
}
