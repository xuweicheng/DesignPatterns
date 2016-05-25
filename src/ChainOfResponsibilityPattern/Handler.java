package ChainOfResponsibilityPattern;

/**
 * Created by WeichengXu on 2016/5/24.
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
