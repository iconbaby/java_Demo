package decorator;

/**
 * Created by dell on 2017/3/24.
 */
public class Source implements Sourceble {
    @Override
    public void run() {
        System.out.println("from Source");
    }
}
