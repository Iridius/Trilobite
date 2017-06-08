package TTableView;

import java.util.HashMap;

public class TRow implements IRow {
    private HashMap<String, Object> _row;

    public TRow(){
        _row = new HashMap<>();
    }

    @Override
    public Object get(String key) {
        return _row.get(key);
    }

    @Override
    public void set(String key, Object value) {
        _row.put(key, value);
    }
}
