package TestFramework;

import TTableView.ITable;
import TTableView.IColumn;
import TTableView.TColumnData;
import TTableView.TTableData;

import java.util.ArrayList;
import java.util.Collection;

public class Mock {
    public static ITable getTable(){
        Collection<IColumn> columns = new ArrayList<IColumn>();
            columns.add(new TColumnData().setKey("key1").setCaption("caption1"));
            columns.add(new TColumnData().setKey("key2").setCaption("caption2"));

        ITable table = new TTableData()
                .setName("TableData")
                .setCaption("Caption")
                .setColumns(columns);

        return table;
    }
}
