package com.onkiup.simplian.db.mysql;

import com.onkiup.simplian.db.AType;

public enum MySQLType implements AType {
    ;

    private Class javaClass;
    private String sqlDefinition;

    private MySQLType(Class javaClass, String sqlDefinition) {
        this.javaClass = javaClass;
        this.sqlDefinition = sqlDefinition;
    }

    @Override
    public Class asJava() {
        return javaClass;
    }

    @Override
    public String asSql() {
        return sqlDefinition;
    }
}
