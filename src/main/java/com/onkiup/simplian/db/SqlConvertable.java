package com.onkiup.simplian.db;

public interface SqlConvertable {
    String asSQL();
    default int parameterCount() {
        return 0;
    }
}
