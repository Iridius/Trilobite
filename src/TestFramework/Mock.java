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
            columns.add(new TColumnData().setKey("id").setCaption("Ключ"));
            columns.add(new TColumnData().setKey("name").setCaption("Наименование"));

        ITable table = new TTableData()
                .setName("TableData")
                .setCaption("Caption")
                .setColumns(columns);

        return table;
    }
}
