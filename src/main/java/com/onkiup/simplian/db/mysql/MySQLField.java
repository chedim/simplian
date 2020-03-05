package com.onkiup.simplian.db.mysql;

import com.onkiup.simplian.db.AnEntityField;

import java.lang.reflect.Field;

public class MySQLField implements AnEntityField {

    private Field javaField;
    private MySQLType type;

    @Override
    public String asSQL() {
        return null;
    }
}
