package TTableView;

public class TColumnData implements IColumn {
    private String _key;
    private String _caption;

    public TColumnData(){
        _key = "";
        _caption = "";
    }

    @Override
    public String getKey() {
        return _key;
    }

    @Override
    public IColumn setKey(String key) {
        _key = key;
        return this;
    }

    @Override
    public String getCaption() {
        return _caption;
    }

    @Override
    public IColumn setCaption(String caption) {
        _caption = caption;
        return this;
    }
}
