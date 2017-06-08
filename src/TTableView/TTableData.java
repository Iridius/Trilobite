package TTableView;

import java.util.ArrayList;
import java.util.Collection;

public class TTableData implements ITable {
    private String _name;
    private String _caption;
    private Collection<IColumn> _columns;

    public TTableData(){
        _name = "";
        _caption = "";
        _columns = new ArrayList<IColumn>();
    }

    @Override
    public ITable setName(final String name){
        _name = name;
        return this;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ITable setCaption(final String caption){
        _caption = caption;
        return this;
    }

    @Override
    public String getCaption() {
        return null;
    }

    @Override
    public Collection<IColumn> getColumns() {
        return _columns;
    }

    @Override
    public ITable setColumns(Collection<IColumn> columns) {
        _columns = columns;
        return this;
    }
}
