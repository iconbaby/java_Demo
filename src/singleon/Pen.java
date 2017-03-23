package singleon;

/**
 * Created by skll on 2017/3/23.
 */
public class Pen {
    private static Pen pen = null;

    private Pen() {
    }

    public static Pen getInstance() {
        if (pen == null) {
            synchronized (pen) {
                if (pen == null) {
                    pen = new Pen();
                }
            }
        }
        return pen;
    }
}
