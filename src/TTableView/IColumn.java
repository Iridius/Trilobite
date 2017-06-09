package TTableView;

import TDictionary.IDictionary;

public interface IColumn {
    String getKey();
    IColumn setKey(String key);

    String getCaption();
    IColumn setCaption(String caption);

    IDictionary getDataSet();
    IColumn setDataSet(IDictionary data);
}