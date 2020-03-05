package com.onkiup.simplian.db.mysql;

import com.onkiup.simplian.AnEntity;
import com.onkiup.simplian.db.AStorage;

import java.sql.Connection;

public class MySQLIntegration implements AStorage {
    private Connection connection;

    public MySQLIntegration(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Connection connection() {
        return connection;
    }

    @Override
    public EntityTable readTable(Class<? extends AnEntity> target) {
        return null;
    }
}
