package TTableView;

import Observer.IObservable;
import Observer.IObserver;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

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
        this.getItems().addAll(rows);

        //this.getItems().clear();
        //for(IRow row: rows) {
        //    //this.getItems().add(row);
        //}
        ObservableList data = FXCollections.observableArrayList();

        for(int i=0; i < this.getColumns().size(); i++){
            TableColumn column = (TableColumn)this.getColumns().get(i);
            final int j = i;

            if(column != null) {
                column.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<TRow, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TRow, String> param) {
                        if (param.getValue().get("key") != null) {
                            return new SimpleStringProperty(param.getValue().get("key").toString());
                        }

                        return new SimpleStringProperty("");
                    }
                });
            }

            for(IRow r: rows){
                ObservableList<String> row = FXCollections.observableArrayList();
                Object[] rs = rows.toArray();

                for(int k=0; k <= rs.length-1; k++){
                    row.add(rs[k].toString());
                }
                data.add(row);
            }

            this.setItems(data);
        }
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