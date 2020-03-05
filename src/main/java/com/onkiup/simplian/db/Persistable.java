package com.onkiup.simplian.db;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface Persistable {
    /**
     *
     * @return
     */
    boolean persisted();
    CompletableFuture<Persistable> persist();
    CompletableFuture<Persistable> delete();
}
