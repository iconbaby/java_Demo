package abstractfactory;

import commonfactory.Sender;

/**
 * Created by skll on 2017/3/23.
 */
public interface Provider {
    public Sender produce();
}
