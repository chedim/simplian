package com.onkiup.simplian.db;

import com.onkiup.simplian.Entity;

import java.sql.Connection;

public interface DatabaseIntegration {
    Connection connection();
    EntityTable readTable(Class<? extends Entity> target);
}
