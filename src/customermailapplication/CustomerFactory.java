package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type){
        
        if(type.equals("Delinquent"))
            return new DelinquentCustomer();
        if(type.equals("Mountain"))  
            return new MountainCustomer();
        if(type.equals("Regular"))      
            return new RegularCustomer();
        return null;

    }
}
