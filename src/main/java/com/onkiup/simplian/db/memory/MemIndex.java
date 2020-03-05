package com.onkiup.simplian.db.memory;

import com.onkiup.simplian.db.AnEntityField;
import com.onkiup.simplian.db.AnIndex;

public class MemIndex implements AnIndex {



    @Override
    public AnEntityField fields() {
        return null;
    }

    @Override
    public boolean unique() {
        return false;
    }

    @Override
    public String batchCreateSQL() {
        return null;
    }

    @Override
    public String batchUpdateSQL() {
        return null;
    }

    @Override
    public String batchDeleteSQL() {
        return null;
    }

    @Override
    public String isolatedCreateSQL() {
        return null;
    }

    @Override
    public String isolatedUpdateSQL() {
        return null;
    }

    @Override
    public String isolatedDeleteSQL() {
        return null;
    }
}
