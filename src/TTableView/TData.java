package TTableView;

import Observer.IObservable;
import Observer.IObserver;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Collection;

public class TData implements ITable, IObservable {
    private Collection<IColumn> _columns;
    private Collection<IRow> _rows;
    private Collection<IObserver> _observers;

    public TData(){
        _columns = new ArrayList<>();
        _rows = new ArrayList<>();
        _observers = new ArrayList<>();
    }

    @Override
    public Collection<IColumn> getColumns() {
        return _columns;
    }

    @Override
    public void setColumns(Collection<IColumn> columns) {
        _columns = columns;
    }

    @Override
    public Collection<IRow> getItems() {
        return _rows;
    }

    @Override
    public void setItems(Collection<IRow> rows) {
        _rows = rows;
    }

    @Override
    public IRow addNewItem() {
        IRow row = new TRow();
        for(IColumn column: _columns){
            row.set(column.getKey(), null);
        }

        _rows.add(row);
        notifyObserver();
        return row;
    }

    @Override
    public void addObserver(IObserver observer) {
        _observers.add(observer);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(IObserver observer: _observers){
            observer.setColumns(_columns);
            observer.loadData(_rows);
        }
    }
}
