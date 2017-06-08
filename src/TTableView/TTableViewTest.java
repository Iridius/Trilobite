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

        assertEquals("Expected another number of columns.", expected, actual);
    }

    @Test
    public void TTableView_number_rows() {
        ITable table = Mock.getTable();
        TTableView view = new TTableView(table);
    }
}