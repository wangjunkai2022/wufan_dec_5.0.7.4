package com.j256.ormlite.support;

import com.j256.ormlite.dao.ObjectCache;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
/* loaded from: classes3.dex */
public interface DatabaseResults {
    void close() throws SQLException;

    void closeQuietly();

    int findColumn(String str) throws SQLException;

    boolean first() throws SQLException;

    BigDecimal getBigDecimal(int i4) throws SQLException;

    InputStream getBlobStream(int i4) throws SQLException;

    boolean getBoolean(int i4) throws SQLException;

    byte getByte(int i4) throws SQLException;

    byte[] getBytes(int i4) throws SQLException;

    char getChar(int i4) throws SQLException;

    int getColumnCount() throws SQLException;

    String[] getColumnNames() throws SQLException;

    double getDouble(int i4) throws SQLException;

    float getFloat(int i4) throws SQLException;

    int getInt(int i4) throws SQLException;

    long getLong(int i4) throws SQLException;

    ObjectCache getObjectCache();

    short getShort(int i4) throws SQLException;

    String getString(int i4) throws SQLException;

    Timestamp getTimestamp(int i4) throws SQLException;

    boolean last() throws SQLException;

    boolean moveAbsolute(int i4) throws SQLException;

    boolean moveRelative(int i4) throws SQLException;

    boolean next() throws SQLException;

    boolean previous() throws SQLException;

    boolean wasNull(int i4) throws SQLException;
}
