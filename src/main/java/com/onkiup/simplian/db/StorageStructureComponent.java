package com.onkiup.simplian.db;

/**
 * Describes a database table component
 * (a field, an index, etc)
 */
public interface StorageStructureComponent {
    String batchCreateSQL();
    String batchUpdateSQL();
    String batchDeleteSQL();
    String isolatedCreateSQL();
    String isolatedUpdateSQL();
    String isolatedDeleteSQL();
}
