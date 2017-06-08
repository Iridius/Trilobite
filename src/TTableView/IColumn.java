package TTableView;

public interface IColumn {
    public String getKey();
    public IColumn setKey(String key);

    public String getCaption();
    public IColumn setCaption(String caption);
}