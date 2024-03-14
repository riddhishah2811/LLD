package Example2;

public class TwoWheeler implements IVehicle{

    String name;
    String model;

    public TwoWheeler(){
        name = "Two Wheeler";
        model = "Two Wheeler model";
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
