package com.onkiup.simplian;

import java.util.UUID;

public class Query<T extends Entity> {
    private Class<T> target;
    private UUID queryId;
    protected Query(Class<T> target) {
        this.target = target;
    }

    public static final <T extends Entity> Query<T> on(Class<T> target) {
        return new Query<>(target);
    }

    public static final <T extends Entity> Query<T> byId(Class<T> target, UUID id) {
        return new Query<>(target).id(id);
    }

    public void fetch(Consumer<Collection<T>>)

    public Query<T> id(UUID id) {
        this.queryId = id;
        return this;
    }
}
