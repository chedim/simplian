package com.onkiup.simplian;

import java.util.UUID;

public interface Entity {
    UUID id();
    void id(UUID id);
    default <T extends Entity> T as(Class<T> target) {

    }
}
