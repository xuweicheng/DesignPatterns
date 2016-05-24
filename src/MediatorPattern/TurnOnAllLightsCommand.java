package MediatorPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class TurnOnAllLightsCommand implements Command{

    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }

}
