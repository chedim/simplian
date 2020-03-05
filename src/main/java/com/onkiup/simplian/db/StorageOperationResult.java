package com.onkiup.simplian.db;

import java.util.stream.Stream;

public interface StorageOperationResult {
    boolean successful();
    int readEntriesCount();
    int persistedEntriesCount();
    int deletedEntriesCount();
    Stream<Persistable> readEntries();
}
