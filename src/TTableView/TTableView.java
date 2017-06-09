package TTableView;

import Observer.IObservable;
import Observer.IObserver;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.Collection;

public class TTableView extends TableView implements IObserver {
    private Collection<IRow> _rows;

    public TTableView(IObservable observable){
        _rows = new ArrayList<>();
        observable.addObserver(this);

        this.setVisible(true);
    }

    @Override
    public void setColumns(Collection<IColumn> columns) {
        this.getColumns().clear();
        for(IColumn column: columns){
            TableColumn newColumn = new TableColumn();
            newColumn.setId(column.getKey());
            newColumn.setText(column.getCaption());

            this.getColumns().add(newColumn);
        }
    }

    @Override
    public void loadData(Collection<IRow> rows) {

    }

    /**
     * Возвращает новую строку данных заданной таблицы
     * @return Новая строка данных таблицы
     */
//    public IRow getNewRow() {
//        IRow row = new TRow();
//        for(IColumn column: _table.getColumns()){
//            row.set(column.getKey(), "");
//        }
//
//        _rows.add(row);
//        return row;
//    }
}