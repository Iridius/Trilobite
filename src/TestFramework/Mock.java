package TestFramework;

import Observer.IObservable;
import TDictionary.IDictionary;
import TTableView.ITable;
import TTableView.IColumn;
import TTableView.TColumnData;
import TTableView.TData;

import java.util.ArrayList;
import java.util.Collection;

public class Mock {


    private static IObservable data;

    /**
     * Получение тестовой таблицы данных (структура)
     * @return
     */
    public static ITable getTable(){
        IDictionary dataset = new TMockDictionary();

        Collection<IColumn> columns = new ArrayList<>();
            columns.add(new TColumnData().setKey("id").setCaption("Ключ"));
            columns.add(new TColumnData().setKey("name").setCaption("Наименование"));
            columns.add(new TColumnData().setKey("type").setCaption("Тип").setDataSet(dataset));

        ITable table = new TData();
        table.setColumns(columns);

        return table;
    }

    /**
     * Получение тестового набора данных
     * @return
     */
    public static TData getData() {
        ITable table = getTable();
        TData data = new TData();

        data.setColumns(table.getColumns());
        data.addNewItem();
        data.addNewItem();

        return data;
    }
}
