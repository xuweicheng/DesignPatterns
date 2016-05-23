package ObserverPattern;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<String>();

    @Override
    void setState(String state) {
        messageHistory.add(state);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
