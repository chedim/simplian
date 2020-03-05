package com.onkiup.simplian.db.mysql;

import com.onkiup.simplian.AnEntity;
import com.onkiup.simplian.db.AStorage;
import com.onkiup.simplian.db.AnEntityField;
import com.onkiup.simplian.db.AnEntityTable;

public class MySQLTable implements AnEntityTable {

    private Class<? extends AnEntity> model;
    private MySQLIntegration connection;
    private String name;
    private String persistedName;
    private AnEntityField[] fields;

    public MySQLTable(MySQLIntegration connection, Class<? extends AnEntity> model) {
       this.connection = connection;
       this.model = model;
    }

    @Override
    public AStorage connection() {
        return connection;
    }

    @Override
    public AnEntityField[] fields() {
        return new AnEntityField[0];
    }

    @Override
    public void update() {

    }

    @Override
    public boolean persisted() {
        for (int i = 0; i < fields.length; i++) {
            if (!fields[i].persisted()) {
                return false;
            }
        }

        return name.equals(persistedName);
    }

    @Override
    public String asSQL() {
        return null;
    }
}
