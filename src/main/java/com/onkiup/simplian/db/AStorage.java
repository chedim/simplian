package com.onkiup.simplian.db;

import com.onkiup.simplian.AnEntity;

import java.sql.Connection;
import java.util.concurrent.CompletableFuture;

public interface AStorage {
    boolean available();
    CompletableFuture<StorageOperationResult> execute(StorageOperation operation);
}
