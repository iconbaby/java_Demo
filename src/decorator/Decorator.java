package decorator;

import java.text.DecimalFormat;

/**
 * Created by dell on 2017/3/24.
 */
public class Decorator implements Sourceble {

    private Source source;

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void run() {
        System.out.println("befor run");
        source.run();
        System.out.println("after run");
    }
}
