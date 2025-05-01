package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
/* loaded from: classes3.dex */
public class MappedUpdate<T, ID> extends BaseMappedStatement<T, ID> {
    private final FieldType versionFieldType;
    private final int versionFieldTypeIndex;

    private MappedUpdate(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType fieldType, int i4) {
        super(tableInfo, str, fieldTypeArr);
        this.versionFieldType = fieldType;
        this.versionFieldTypeIndex = i4;
    }

    public static <T, ID> MappedUpdate<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) throws SQLException {
        FieldType[] fieldTypes;
        FieldType[] fieldTypes2;
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            StringBuilder sb = new StringBuilder(64);
            BaseMappedStatement.appendTableName(databaseType, sb, "UPDATE ", tableInfo.getTableName());
            FieldType fieldType = null;
            int i4 = 0;
            int i5 = -1;
            for (FieldType fieldType2 : tableInfo.getFieldTypes()) {
                if (isFieldUpdatable(fieldType2, idField)) {
                    if (fieldType2.isVersion()) {
                        i5 = i4;
                        fieldType = fieldType2;
                    }
                    i4++;
                }
            }
            boolean z4 = true;
            int i6 = i4 + 1;
            if (fieldType != null) {
                i6++;
            }
            FieldType[] fieldTypeArr = new FieldType[i6];
            int i7 = 0;
            for (FieldType fieldType3 : tableInfo.getFieldTypes()) {
                if (isFieldUpdatable(fieldType3, idField)) {
                    if (z4) {
                        sb.append("SET ");
                        z4 = false;
                    } else {
                        sb.append(", ");
                    }
                    BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType3, null);
                    fieldTypeArr[i7] = fieldType3;
                    sb.append("= ?");
                    i7++;
                }
            }
            sb.append(' ');
            BaseMappedStatement.appendWhereFieldEq(databaseType, idField, sb, null);
            int i8 = i7 + 1;
            fieldTypeArr[i7] = idField;
            if (fieldType != null) {
                sb.append(" AND ");
                BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType, null);
                sb.append("= ?");
                fieldTypeArr[i8] = fieldType;
            }
            return new MappedUpdate<>(tableInfo, sb.toString(), fieldTypeArr, fieldType, i5);
        }
        throw new SQLException("Cannot update " + tableInfo.getDataClass() + " because it doesn't have an id field");
    }

    private static boolean isFieldUpdatable(FieldType fieldType, FieldType fieldType2) {
        return (fieldType == fieldType2 || fieldType.isForeignCollection() || fieldType.isReadOnly()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int update(DatabaseConnection databaseConnection, T t4, ObjectCache objectCache) throws SQLException {
        Object obj;
        FieldType[] fieldTypes;
        try {
            if (this.argFieldTypes.length <= 1) {
                return 0;
            }
            Object[] fieldObjects = getFieldObjects(t4);
            FieldType fieldType = this.versionFieldType;
            if (fieldType != null) {
                obj = this.versionFieldType.moveToNextValue(fieldType.extractJavaFieldValue(t4));
                fieldObjects[this.versionFieldTypeIndex] = this.versionFieldType.convertJavaFieldToSqlArgValue(obj);
            } else {
                obj = null;
            }
            int update = databaseConnection.update(this.statement, fieldObjects, this.argFieldTypes);
            if (update > 0) {
                if (obj != null) {
                    this.versionFieldType.assignField(t4, obj, false, null);
                }
                if (objectCache != 0) {
                    Object obj2 = objectCache.get(this.clazz, this.idField.extractJavaFieldValue(t4));
                    if (obj2 != null && obj2 != t4) {
                        for (FieldType fieldType2 : this.tableInfo.getFieldTypes()) {
                            if (fieldType2 != this.idField) {
                                fieldType2.assignField(obj2, fieldType2.extractJavaFieldValue(t4), false, objectCache);
                            }
                        }
                    }
                }
            }
            BaseMappedStatement.logger.debug("update data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(fieldObjects.length), Integer.valueOf(update));
            if (fieldObjects.length > 0) {
                BaseMappedStatement.logger.trace("update arguments: {}", (Object) fieldObjects);
            }
            return update;
        } catch (SQLException e5) {
            throw SqlExceptionUtil.create("Unable to run update stmt on object " + t4 + ": " + this.statement, e5);
        }
    }
}
