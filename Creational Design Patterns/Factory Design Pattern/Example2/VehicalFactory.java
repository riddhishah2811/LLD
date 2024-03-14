package Example2;

public class VehicalFactory {
    public static IVehicle build(Class<? extends IVehicle> vehicleClass) throws InstantiationException, IllegalAccessException{
        // if(o.getClass().equals(TwoWheeler.class)){
        //     return new TwoWheeler();
        // }else if(o.getClass().equals(ThreeWheeler.class)){
        //     return new ThreeWheeler();
        // }
        return vehicleClass.newInstance();
    }
}
