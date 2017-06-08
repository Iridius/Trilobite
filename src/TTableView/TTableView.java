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

    public TTableView(ITable table){
        _table = table;

        //this.setEditable(true);
        this.getColumns().addAll(getDataColumns(_table));
        //this.getColumns().addAll(_table.getColumns());
        this.setVisible(true);
    }

    private Collection<TableColumn> getDataColumns(ITable table) {
        Collection<TableColumn> columns = new ArrayList<TableColumn>();

        for(IColumn icolumn: table.getColumns()){
            TableColumn column = new TableColumn();
            //column.setCellFactory(TextFieldTableCell.<ObservableList<StringProperty>>forTableColumn());
            column.setCellValueFactory(new PropertyValueFactory(icolumn.getKey()));
            column.setId(icolumn.getKey());
            column.setGraphic(new Label(icolumn.getCaption()));
            column.setVisible(true);
//            column.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
//                @Override
//                public void handle(TableColumn.CellEditEvent event) {
//
//                }
//            });

            columns.add(column);
        }

        return columns;
    }
}