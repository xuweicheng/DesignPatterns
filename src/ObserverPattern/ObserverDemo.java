package ObserverPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class ObserverDemo {
    public static void main(String[] args) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new Message!");

        tabletClient.addMessage("Here is another new Message!");
    }
}
