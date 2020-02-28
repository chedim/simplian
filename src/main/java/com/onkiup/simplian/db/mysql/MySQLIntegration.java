package com.onkiup.simplian.db.mysql;

import com.onkiup.simplian.Entity;
import com.onkiup.simplian.db.DatabaseIntegration;
import com.onkiup.simplian.db.EntityTable;

import java.sql.Connection;

public class MySQLIntegration implements DatabaseIntegration {
    private Connection connection;

    public MySQLIntegration(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Connection connection() {
        return connection;
    }

    @Override
    public EntityTable readTable(Class<? extends Entity> target) {
        return null;
    }
}
