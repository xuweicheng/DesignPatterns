package ChainOfResponsibilityPattern;

/**
 * Created by WeichengXu on 2016/5/24.
 */
public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approved anything.");
    }
}
