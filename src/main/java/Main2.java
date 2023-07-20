import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        //to add object1 from its class
        Accomodation accomodation = new Accomodation("Makajonka", 91, 100);
        //System.out.println(accomodation);
        //to add object2 from its class
        Passport passport = new Passport("12335778", "12.10.1982", accomodation);
        //System.out.println(passport);
        //to fill JSON by keys and values=objects
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("name", "Peter");
        headers.put("passport", passport);
        headers.put("age", 40);
        System.out.println(headers);
    }
}
