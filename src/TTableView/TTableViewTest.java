package TTableView;

import TestFramework.JavaFXThreadingRule;
import TestFramework.Mock;
import javafx.scene.control.TableView;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTableViewTest {
    @Rule
    public JavaFXThreadingRule javafxRule = new JavaFXThreadingRule();

    @Test
    public void TTableView_number_columns(){
        ITable table = Mock.getTable();
        TTableView view = new TTableView(table);

        int expected = table.getColumns().size();
        int actual = view.getColumns().size();

        assertEquals("Ожидалось, что количество колонок в таблице будет соответствовать количеству полей в наборе данных.", expected, actual);
    }

    @Test
    public void TTableView_new_row_have_all_columns() {
        ITable table = Mock.getTable();
        TTableView view = new TTableView(table);
        IRow row = view.getNewRow();

        assertTrue("Ожидалось, что в новой строке будет поле «id»", !row.get("id").equals(null));
        assertTrue("Ожидалось, что в новой строке будет поле «name»", !row.get("name").equals(null));
    }

    @Test
    public void TTableView_number_rows() {
        ITable table = Mock.getTable();
        TTableView view = new TTableView(table);
        view.getNewRow();
        view.getNewRow();

        assertEquals("Ожидалось, что в таблице будет 2 строки.", 2, view.getItems().size());
    }
}