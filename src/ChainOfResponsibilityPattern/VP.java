package ChainOfResponsibilityPattern;

/**
 * Created by WeichengXu on 2016/5/24.
 */
public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE &&
                request.getAmount() < 2000){
            System.out.println("VP approves purchase less than 2000.");
        }
        else
        {
            successor.handleRequest(request);
        }
    }
}
