package TestFramework;

import TDictionary.IDictionary;

import java.util.HashMap;

public class TMockDictionary implements IDictionary {
    private static HashMap<Integer, String> types = new HashMap<>();
    static {
        types.put(1, "Первый");
        types.put(2, "Второй");
        types.put(3, "Третий");
    }

    @Override
    public String getName(int key) {
        return types.get(key);
    }
}
