package com.onkiup.simplian.db;

import com.onkiup.simplian.AnEntity;

public interface AConstraint<E extends AnEntity> extends StorageStructureComponent {
    boolean validate(E target);
}
