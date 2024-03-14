package Example2;

public class ThreeWheeler implements IVehicle{

    String name;
    String model;

    public ThreeWheeler(){
        name = "Three Wheeler";
        model = "Three Wheeler model";
    }
    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return model;
    }
    
}
