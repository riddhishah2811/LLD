package Example2;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IVehicle v1 = VehicalFactory.build(TwoWheeler.class);
        printVehicalDetails(v1);

        IVehicle v2 = VehicalFactory.build(ThreeWheeler.class);
        printVehicalDetails(v2);
        
    }
    public static void printVehicalDetails(IVehicle v){
        System.out.println(v.name()+"\t"+v.model());
    }
}
