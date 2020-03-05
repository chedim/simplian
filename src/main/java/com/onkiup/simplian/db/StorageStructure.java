package com.onkiup.simplian.db;

import com.onkiup.simplian.db.mysql.MySQLIntegration;

public interface StorageStructure {
    public void update(MySQLIntegration connection);
}
