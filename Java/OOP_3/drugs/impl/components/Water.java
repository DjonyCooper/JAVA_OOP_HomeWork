package OOP_3.drugs.impl.components;

import OOP_3.drugs.Component;

public class Water extends Component {
    public Water(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Water(String weight, int power) {
        super("Вода", weight, power);
    }
}