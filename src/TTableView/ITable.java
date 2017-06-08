package TTableView;

import java.util.Collection;

public interface ITable {
    public String getName();
    ITable setName(String name);

    public String getCaption();
    ITable setCaption(String caption);

    public Collection<IColumn> getColumns();
    ITable setColumns(Collection<IColumn> columns);
}
