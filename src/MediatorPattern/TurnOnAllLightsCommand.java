package MediatorPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class TurnOnAllLightsCommand implements Command{

    private Mediator med;

    //This command does not hold reference to lights object
    //It interact with a mediator, which bring the complexity down.
    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }

}
