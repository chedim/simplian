package com.onkiup.simplian.db;

public interface AnEntityTable extends StorageStructure, Persistable {
    AStorage connection();
    AnEntityField[] fields();
}