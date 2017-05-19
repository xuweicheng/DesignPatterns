package MediatorPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 *
 * With Mediator, Command and lights are loose coupled
 * Communication between Command and lights are simplified, Commands are much simpler.
 * But be careful, do not make a mediator a giant object.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        TurnOnAllLightsCommand turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();

        TurnOffAllLightsCommand turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

        turnOffAllLightsCommand.execute();
    }
}
