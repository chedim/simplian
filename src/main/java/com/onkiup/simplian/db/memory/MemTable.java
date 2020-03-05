package com.onkiup.simplian.db.memory;

import com.onkiup.simplian.db.AStorage;
import com.onkiup.simplian.db.AnEntityField;
import com.onkiup.simplian.db.AnEntityTable;
import com.onkiup.simplian.db.Persistable;
import com.onkiup.simplian.db.mysql.MySQLIntegration;

import java.util.concurrent.CompletableFuture;

public class MemTable implements AnEntityTable {

    private MemStorage connection;

    @Override
    public AStorage connection() {
        return null;
    }

    @Override
    public AnEntityField[] fields() {
        return new AnEntityField[0];
    }

    @Override
    public boolean persisted() {
        return false;
    }

    @Override
    public CompletableFuture<Persistable> persist() {
        return null;
    }

    @Override
    public CompletableFuture<Persistable> delete() {
        return null;
    }

    @Override
    public void update(MySQLIntegration connection) {

    }
}
