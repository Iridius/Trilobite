package Observer;

import TTableView.IColumn;
import TTableView.IRow;

import java.util.Collection;

public interface IObserver {
    void setColumns(Collection<IColumn> columns);
    void loadData(Collection<IRow> rows);
}
