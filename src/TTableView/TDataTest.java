package TTableView;

import TestFramework.JavaFXThreadingRule;
import TestFramework.Mock;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class TDataTest {
    @Rule
    public JavaFXThreadingRule javafxRule = new JavaFXThreadingRule();

    @Test
    public void TData_getColumns_early_initialization(){
        TData data = Mock.getData();
        data.setColumns(Mock.getTable().getColumns());

        TTableView view = new TTableView(data);

        int expected = data.getColumns().size();
        int actual = view.getColumns().size();

        assertEquals("Ожидалось, что в представлении таблицы будет столько же колонок, сколько в модели.", expected, actual);
    }

    @Test
    public void TData_getColumns_latest_initialization(){
        TData data = Mock.getData();
        TTableView view = new TTableView(data);

        data.setColumns(Mock.getTable().getColumns());

        int expected = data.getColumns().size();
        int actual = view.getColumns().size();

        assertEquals("Ожидалось, что в представлении таблицы будет столько же колонок, сколько в модели.", expected, actual);
    }

    @Test
    public void TData_getRows_early_initialization(){
        ITable table = Mock.getTable();

        TData data = new TData();
        data.addNewItem();
        data.addNewItem();

        TTableView view = new TTableView(data);

        int expected = data.getItems().size();
        int actual = view.getItems().size();

        assertEquals("Ожидалось, что в представлении таблицы будет столько же строк, сколько в модели.", expected, actual);
    }
}