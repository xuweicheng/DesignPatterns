package ChainOfResponsibilityPattern;

/**
 * Created by WeichengXu on 2016/5/24.
 */
public class Request {

    private RequestType requestType;
    private int amount;

    public Request(RequestType requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public int getAmount() {
        return amount;
    }
}
