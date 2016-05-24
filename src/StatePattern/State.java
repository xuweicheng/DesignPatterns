package StatePattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public abstract class State {

    public void handleRequest()
    {
        System.out.println("Shouldn't be able to get here");
    }
}
