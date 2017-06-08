package TTableView;

import java.util.Collection;

public interface ITable {
    String getName();
    ITable setName(String name);

    String getCaption();
    ITable setCaption(String caption);

    Collection<IColumn> getColumns();
    ITable setColumns(Collection<IColumn> columns);

    Collection<IRow> getRows();
    void addNewRow();
}
