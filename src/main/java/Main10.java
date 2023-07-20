import java.util.Arrays;
import java.util.HashMap;

public class Main10 {
    public static void main(String[] args) {
        //new object
        BankAccount bankAccount = new BankAccount();
        bankAccount.name = "Alex";
        bankAccount.account = 500;
        //to sent new object to object
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Name", "Alex");
        headers.put("Age", null);
        headers.put("Height", 190);
        headers.put("Bank account", bankAccount );
        System.out.println(headers);
    }
}
