package com.onkiup.simplian.db;

import com.onkiup.simplian.Entity;

import java.util.HashSet;
import java.util.Set;

public class EntityTable<E extends Entity> {
    private Class<E> model;
    private Set<EntityField> javaFields = new HashSet<>();
    private Set<EntityField> dbFields = new HashSet<>();

    public EntityTable(Class<E> model) {
        this.model = model;
    }

    // reads fields from the model and database table,
    // generates list of differences in field definitions between the model and its table
    // updates the table so that it corresponds to the model
    public void upgrade() {

    }

    private void readClassFields() {

    }
}
