package StatePattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest(){
        System.out.println("Turning fan on to off.");
        fan.setState(fan.getFanOffState());
    }

    public String toString(){
        return "Fan is high.";
    }
}
