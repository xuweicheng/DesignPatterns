package ObserverPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
