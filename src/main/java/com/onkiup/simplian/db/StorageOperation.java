package com.onkiup.simplian.db;

import java.util.concurrent.CompletableFuture;

public interface StorageOperation {
   StorageOperationType type();
   CompletableFuture<StorageOperationResult> execute();
}
