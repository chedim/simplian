package com.onkiup.simplian.db.memory;

import com.onkiup.simplian.db.AStorage;
import com.onkiup.simplian.db.StorageOperation;
import com.onkiup.simplian.db.StorageOperationResult;

import javax.swing.text.html.parser.Entity;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class MemStorage implements AStorage {

    private Map<MemIndex, Map<Object, Entity>> storage;

    @Override
    public boolean available() {
        return true;
    }

    @Override
    public CompletableFuture<StorageOperationResult> execute(StorageOperation operation) {
        return null;
    }
}
