package MediatorPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class TurnOffAllLightsCommand implements Command{

    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
