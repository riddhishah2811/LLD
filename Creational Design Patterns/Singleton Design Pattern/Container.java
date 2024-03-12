
public class Container {
        private static Container container = new Container();
        
        private Container(){}

        public static Container getInstance(){
            return container;
        }

        public int hashCode1() {
            return container.hashCode();
        }    
}
