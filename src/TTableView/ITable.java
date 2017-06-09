package TTableView;

import java.util.Collection;

public interface ITable {
    Collection<IColumn> getColumns();
    void setColumns(Collection<IColumn> columns);

    Collection<IRow> getItems();
    void setItems(Collection<IRow> rows);

    IRow addNewItem();
}
