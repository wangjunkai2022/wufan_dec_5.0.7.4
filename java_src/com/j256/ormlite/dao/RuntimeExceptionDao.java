package com.j256.ormlite.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Log;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.PreparedUpdate;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.ObjectFactory;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class RuntimeExceptionDao<T, ID> implements CloseableIterable<T> {
    private static final Log.Level LOG_LEVEL = Log.Level.DEBUG;
    private static final Logger logger = LoggerFactory.getLogger(RuntimeExceptionDao.class);
    private Dao<T, ID> dao;

    public RuntimeExceptionDao(Dao<T, ID> dao) {
        this.dao = dao;
    }

    public static <T, ID> RuntimeExceptionDao<T, ID> createDao(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return new RuntimeExceptionDao<>(DaoManager.createDao(connectionSource, cls));
    }

    private void logMessage(Exception exc, String str) {
        logger.log(LOG_LEVEL, exc, str);
    }

    public void assignEmptyForeignCollection(T t4, String str) {
        try {
            this.dao.assignEmptyForeignCollection(t4, str);
        } catch (SQLException e5) {
            logMessage(e5, "assignEmptyForeignCollection threw exception on " + str);
            throw new RuntimeException(e5);
        }
    }

    public <CT> CT callBatchTasks(Callable<CT> callable) {
        try {
            return (CT) this.dao.callBatchTasks(callable);
        } catch (Exception e5) {
            logMessage(e5, "callBatchTasks threw exception on: " + callable);
            throw new RuntimeException(e5);
        }
    }

    public void clearObjectCache() {
        this.dao.clearObjectCache();
    }

    public void closeLastIterator() {
        try {
            this.dao.closeLastIterator();
        } catch (SQLException e5) {
            logMessage(e5, "closeLastIterator threw exception");
            throw new RuntimeException(e5);
        }
    }

    @Override // com.j256.ormlite.dao.CloseableIterable
    public CloseableIterator<T> closeableIterator() {
        return this.dao.closeableIterator();
    }

    public void commit(DatabaseConnection databaseConnection) {
        try {
            this.dao.commit(databaseConnection);
        } catch (SQLException e5) {
            logMessage(e5, "commit(" + databaseConnection + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    public long countOf() {
        try {
            return this.dao.countOf();
        } catch (SQLException e5) {
            logMessage(e5, "countOf threw exception");
            throw new RuntimeException(e5);
        }
    }

    public int create(T t4) {
        try {
            return this.dao.create(t4);
        } catch (SQLException e5) {
            logMessage(e5, "create threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public T createIfNotExists(T t4) {
        try {
            return this.dao.createIfNotExists(t4);
        } catch (SQLException e5) {
            logMessage(e5, "createIfNotExists threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public Dao.CreateOrUpdateStatus createOrUpdate(T t4) {
        try {
            return this.dao.createOrUpdate(t4);
        } catch (SQLException e5) {
            logMessage(e5, "createOrUpdate threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public int delete(T t4) {
        try {
            return this.dao.delete((Dao<T, ID>) t4);
        } catch (SQLException e5) {
            logMessage(e5, "delete threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public DeleteBuilder<T, ID> deleteBuilder() {
        return this.dao.deleteBuilder();
    }

    public int deleteById(ID id) {
        try {
            return this.dao.deleteById(id);
        } catch (SQLException e5) {
            logMessage(e5, "deleteById threw exception on: " + id);
            throw new RuntimeException(e5);
        }
    }

    public int deleteIds(Collection<ID> collection) {
        try {
            return this.dao.deleteIds(collection);
        } catch (SQLException e5) {
            logMessage(e5, "deleteIds threw exception on: " + collection);
            throw new RuntimeException(e5);
        }
    }

    public void endThreadConnection(DatabaseConnection databaseConnection) {
        try {
            this.dao.endThreadConnection(databaseConnection);
        } catch (SQLException e5) {
            logMessage(e5, "endThreadConnection(" + databaseConnection + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    public int executeRaw(String str, String... strArr) {
        try {
            return this.dao.executeRaw(str, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "executeRaw threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public int executeRawNoArgs(String str) {
        try {
            return this.dao.executeRawNoArgs(str);
        } catch (SQLException e5) {
            logMessage(e5, "executeRawNoArgs threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public ID extractId(T t4) {
        try {
            return this.dao.extractId(t4);
        } catch (SQLException e5) {
            logMessage(e5, "extractId threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public FieldType findForeignFieldType(Class<?> cls) {
        return this.dao.findForeignFieldType(cls);
    }

    public ConnectionSource getConnectionSource() {
        return this.dao.getConnectionSource();
    }

    public Class<T> getDataClass() {
        return this.dao.getDataClass();
    }

    public <FT> ForeignCollection<FT> getEmptyForeignCollection(String str) {
        try {
            return this.dao.getEmptyForeignCollection(str);
        } catch (SQLException e5) {
            logMessage(e5, "getEmptyForeignCollection threw exception on " + str);
            throw new RuntimeException(e5);
        }
    }

    public ObjectCache getObjectCache() {
        return this.dao.getObjectCache();
    }

    public RawRowMapper<T> getRawRowMapper() {
        return this.dao.getRawRowMapper();
    }

    public GenericRowMapper<T> getSelectStarRowMapper() {
        try {
            return this.dao.getSelectStarRowMapper();
        } catch (SQLException e5) {
            logMessage(e5, "getSelectStarRowMapper threw exception");
            throw new RuntimeException(e5);
        }
    }

    public CloseableWrappedIterable<T> getWrappedIterable() {
        return this.dao.getWrappedIterable();
    }

    public boolean idExists(ID id) {
        try {
            return this.dao.idExists(id);
        } catch (SQLException e5) {
            logMessage(e5, "idExists threw exception on " + id);
            throw new RuntimeException(e5);
        }
    }

    @Deprecated
    public boolean isAutoCommit() {
        try {
            return this.dao.isAutoCommit();
        } catch (SQLException e5) {
            logMessage(e5, "isAutoCommit() threw exception");
            throw new RuntimeException(e5);
        }
    }

    public boolean isTableExists() {
        try {
            return this.dao.isTableExists();
        } catch (SQLException e5) {
            logMessage(e5, "isTableExists threw exception");
            throw new RuntimeException(e5);
        }
    }

    public boolean isUpdatable() {
        return this.dao.isUpdatable();
    }

    public T mapSelectStarRow(DatabaseResults databaseResults) {
        try {
            return this.dao.mapSelectStarRow(databaseResults);
        } catch (SQLException e5) {
            logMessage(e5, "mapSelectStarRow threw exception on results");
            throw new RuntimeException(e5);
        }
    }

    public String objectToString(T t4) {
        return this.dao.objectToString(t4);
    }

    public boolean objectsEqual(T t4, T t5) {
        try {
            return this.dao.objectsEqual(t4, t5);
        } catch (SQLException e5) {
            logMessage(e5, "objectsEqual threw exception on: " + t4 + " and " + t5);
            throw new RuntimeException(e5);
        }
    }

    public List<T> query(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.query(preparedQuery);
        } catch (SQLException e5) {
            logMessage(e5, "query threw exception on: " + preparedQuery);
            throw new RuntimeException(e5);
        }
    }

    public QueryBuilder<T, ID> queryBuilder() {
        return this.dao.queryBuilder();
    }

    public List<T> queryForAll() {
        try {
            return this.dao.queryForAll();
        } catch (SQLException e5) {
            logMessage(e5, "queryForAll threw exception");
            throw new RuntimeException(e5);
        }
    }

    public List<T> queryForEq(String str, Object obj) {
        try {
            return this.dao.queryForEq(str, obj);
        } catch (SQLException e5) {
            logMessage(e5, "queryForEq threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public List<T> queryForFieldValues(Map<String, Object> map) {
        try {
            return this.dao.queryForFieldValues(map);
        } catch (SQLException e5) {
            logMessage(e5, "queryForFieldValues threw exception");
            throw new RuntimeException(e5);
        }
    }

    public List<T> queryForFieldValuesArgs(Map<String, Object> map) {
        try {
            return this.dao.queryForFieldValuesArgs(map);
        } catch (SQLException e5) {
            logMessage(e5, "queryForFieldValuesArgs threw exception");
            throw new RuntimeException(e5);
        }
    }

    public T queryForFirst(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.queryForFirst(preparedQuery);
        } catch (SQLException e5) {
            logMessage(e5, "queryForFirst threw exception on: " + preparedQuery);
            throw new RuntimeException(e5);
        }
    }

    public T queryForId(ID id) {
        try {
            return this.dao.queryForId(id);
        } catch (SQLException e5) {
            logMessage(e5, "queryForId threw exception on: " + id);
            throw new RuntimeException(e5);
        }
    }

    public List<T> queryForMatching(T t4) {
        try {
            return this.dao.queryForMatching(t4);
        } catch (SQLException e5) {
            logMessage(e5, "queryForMatching threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public List<T> queryForMatchingArgs(T t4) {
        try {
            return this.dao.queryForMatchingArgs(t4);
        } catch (SQLException e5) {
            logMessage(e5, "queryForMatchingArgs threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public T queryForSameId(T t4) {
        try {
            return this.dao.queryForSameId(t4);
        } catch (SQLException e5) {
            logMessage(e5, "queryForSameId threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public GenericRawResults<String[]> queryRaw(String str, String... strArr) {
        try {
            return this.dao.queryRaw(str, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "queryRaw threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public long queryRawValue(String str, String... strArr) {
        try {
            return this.dao.queryRawValue(str, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "queryRawValue threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public int refresh(T t4) {
        try {
            return this.dao.refresh(t4);
        } catch (SQLException e5) {
            logMessage(e5, "refresh threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public void rollBack(DatabaseConnection databaseConnection) {
        try {
            this.dao.rollBack(databaseConnection);
        } catch (SQLException e5) {
            logMessage(e5, "rollBack(" + databaseConnection + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    @Deprecated
    public void setAutoCommit(boolean z4) {
        try {
            this.dao.setAutoCommit(z4);
        } catch (SQLException e5) {
            logMessage(e5, "setAutoCommit(" + z4 + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    public void setObjectCache(boolean z4) {
        try {
            this.dao.setObjectCache(z4);
        } catch (SQLException e5) {
            logMessage(e5, "setObjectCache(" + z4 + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    public void setObjectFactory(ObjectFactory<T> objectFactory) {
        this.dao.setObjectFactory(objectFactory);
    }

    public DatabaseConnection startThreadConnection() {
        try {
            return this.dao.startThreadConnection();
        } catch (SQLException e5) {
            logMessage(e5, "startThreadConnection() threw exception");
            throw new RuntimeException(e5);
        }
    }

    public int update(T t4) {
        try {
            return this.dao.update((Dao<T, ID>) t4);
        } catch (SQLException e5) {
            logMessage(e5, "update threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public UpdateBuilder<T, ID> updateBuilder() {
        return this.dao.updateBuilder();
    }

    public int updateId(T t4, ID id) {
        try {
            return this.dao.updateId(t4, id);
        } catch (SQLException e5) {
            logMessage(e5, "updateId threw exception on: " + t4);
            throw new RuntimeException(e5);
        }
    }

    public int updateRaw(String str, String... strArr) {
        try {
            return this.dao.updateRaw(str, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "updateRaw threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public CloseableWrappedIterable<T> getWrappedIterable(PreparedQuery<T> preparedQuery) {
        return this.dao.getWrappedIterable(preparedQuery);
    }

    @Override // java.lang.Iterable
    public CloseableIterator<T> iterator() {
        return this.dao.iterator();
    }

    public static <T, ID> RuntimeExceptionDao<T, ID> createDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return new RuntimeExceptionDao<>(DaoManager.createDao(connectionSource, databaseTableConfig));
    }

    public CloseableIterator<T> iterator(int i4) {
        return this.dao.iterator(i4);
    }

    public long countOf(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.countOf(preparedQuery);
        } catch (SQLException e5) {
            logMessage(e5, "countOf threw exception on " + preparedQuery);
            throw new RuntimeException(e5);
        }
    }

    public int delete(Collection<T> collection) {
        try {
            return this.dao.delete((Collection) collection);
        } catch (SQLException e5) {
            logMessage(e5, "delete threw exception on: " + collection);
            throw new RuntimeException(e5);
        }
    }

    public boolean isAutoCommit(DatabaseConnection databaseConnection) {
        try {
            return this.dao.isAutoCommit(databaseConnection);
        } catch (SQLException e5) {
            logMessage(e5, "isAutoCommit(" + databaseConnection + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.iterator(preparedQuery);
        } catch (SQLException e5) {
            logMessage(e5, "iterator threw exception on: " + preparedQuery);
            throw new RuntimeException(e5);
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(String str, RawRowMapper<UO> rawRowMapper, String... strArr) {
        try {
            return this.dao.queryRaw(str, rawRowMapper, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "queryRaw threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public void setAutoCommit(DatabaseConnection databaseConnection, boolean z4) {
        try {
            this.dao.setAutoCommit(databaseConnection, z4);
        } catch (SQLException e5) {
            logMessage(e5, "setAutoCommit(" + databaseConnection + "," + z4 + ") threw exception");
            throw new RuntimeException(e5);
        }
    }

    public void setObjectCache(ObjectCache objectCache) {
        try {
            this.dao.setObjectCache(objectCache);
        } catch (SQLException e5) {
            logMessage(e5, "setObjectCache threw exception on " + objectCache);
            throw new RuntimeException(e5);
        }
    }

    public int update(PreparedUpdate<T> preparedUpdate) {
        try {
            return this.dao.update((PreparedUpdate) preparedUpdate);
        } catch (SQLException e5) {
            logMessage(e5, "update threw exception on: " + preparedUpdate);
            throw new RuntimeException(e5);
        }
    }

    public int delete(PreparedDelete<T> preparedDelete) {
        try {
            return this.dao.delete((PreparedDelete) preparedDelete);
        } catch (SQLException e5) {
            logMessage(e5, "delete threw exception on: " + preparedDelete);
            throw new RuntimeException(e5);
        }
    }

    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery, int i4) {
        try {
            return this.dao.iterator(preparedQuery, i4);
        } catch (SQLException e5) {
            logMessage(e5, "iterator threw exception on: " + preparedQuery);
            throw new RuntimeException(e5);
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(String str, DataType[] dataTypeArr, RawRowObjectMapper<UO> rawRowObjectMapper, String... strArr) {
        try {
            return this.dao.queryRaw(str, dataTypeArr, rawRowObjectMapper, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "queryRaw threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }

    public GenericRawResults<Object[]> queryRaw(String str, DataType[] dataTypeArr, String... strArr) {
        try {
            return this.dao.queryRaw(str, dataTypeArr, strArr);
        } catch (SQLException e5) {
            logMessage(e5, "queryRaw threw exception on: " + str);
            throw new RuntimeException(e5);
        }
    }
}
