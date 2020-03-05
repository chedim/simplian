package com.onkiup.simplian.db;

import java.lang.reflect.Field;

public interface AnIndex extends StorageStructureComponent {
   AnEntityField[] fields();
   boolean unique();
}
