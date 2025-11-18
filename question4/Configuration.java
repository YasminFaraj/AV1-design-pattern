import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private static Configuration instance;

    private Map<String, String> values = new HashMap<>();

    private Configuration() {} // construtor privado

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public void setValue(String key, String value) {
        values.put(key, value);
    }

    public String getValue(String key) {
        return values.get(key);
    }
}
