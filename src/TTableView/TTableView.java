package TTableView;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.util.ArrayList;
import java.util.Collection;

public class TTableView extends TableView {
    private ITable _table;
    private Collection<IRow> _rows;

    public TTableView(ITable table){
        _table = table;
        _rows = new ArrayList<>();

        this.getColumns().addAll(getDataColumns(_table));
        this.setVisible(true);
    }

    private void load(TTableData data) {
        for(IColumn column: data.getColumns()){
            ;
        }
    }

    private Collection<TableColumn> getDataColumns(ITable table) {
        Collection<TableColumn> columns = new ArrayList<TableColumn>();

        for(IColumn icolumn: table.getColumns()){
            TableColumn column = new TableColumn();

            column.setCellValueFactory(new PropertyValueFactory(icolumn.getKey()));
            column.setId(icolumn.getKey());
            column.setGraphic(new Label(icolumn.getCaption()));
            column.setVisible(true);
            columns.add(column);
        }

        return columns;
    }

    /**
     * Возвращает новую строку данных заданной таблицы
     * @return Новая строка данных таблицы
     */
    public IRow getNewRow() {
        IRow row = new TRow();
        for(IColumn column: _table.getColumns()){
            row.set(column.getKey(), "");
        }

        _rows.add(row);
        return row;
    }
}