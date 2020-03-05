package com.onkiup.simplian;

import java.util.UUID;

public interface AnEntity {
    UUID id();
    void id(UUID id);
    default <T extends AnEntity> T as(Class<T> target) {

    }
}
