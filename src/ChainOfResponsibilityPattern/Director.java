package ChainOfResponsibilityPattern;

/**
 * Created by WeichengXu on 2016/5/24.
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE &&
                request.getAmount() < 1000){
            System.out.println("Director approves conference less than 1000.");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
