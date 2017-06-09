package TTableView;

import TDictionary.IDictionary;

public class TColumnData implements IColumn {
    private String _key;
    private String _caption;
    private IDictionary _dictionary;

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

    @Override
    public IDictionary getDataSet() {
        return _dictionary;
    }

    @Override
    public IColumn setDataSet(IDictionary data) {
        _dictionary = data;
        return this;
    }
}
