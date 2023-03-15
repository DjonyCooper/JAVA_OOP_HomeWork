package OOP_3.drugs.impl.components;

import OOP_3.drugs.Component;

public class Azitron extends Component {
    public Azitron(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Azitron(String weight, int power) {
        this("Азитромицин", weight, power);
    }
}