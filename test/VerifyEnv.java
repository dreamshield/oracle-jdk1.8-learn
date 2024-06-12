import java.util.HashMap;
import java.util.Map;

public class VerifyEnv {


    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();
        m.put("k1", 0.1);
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey()  + ":" + entry.getValue());
        }
    }
}
