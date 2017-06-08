package TTableView;

public interface IRow {
    Object get(String key);
    void set(String key, Object value);
}