package com.j256.ormlite.dao;

import java.sql.SQLException;
import java.util.Collection;
/* loaded from: classes3.dex */
public interface ForeignCollection<T> extends Collection<T>, CloseableIterable<T> {
    @Override // java.util.Collection
    boolean add(T t4);

    void closeLastIterator() throws SQLException;

    CloseableIterator<T> closeableIterator(int i4);

    CloseableWrappedIterable<T> getWrappedIterable();

    CloseableWrappedIterable<T> getWrappedIterable(int i4);

    boolean isEager();

    CloseableIterator<T> iterator(int i4);

    CloseableIterator<T> iteratorThrow() throws SQLException;

    CloseableIterator<T> iteratorThrow(int i4) throws SQLException;

    int refresh(T t4) throws SQLException;

    int refreshAll() throws SQLException;

    int refreshCollection() throws SQLException;

    int update(T t4) throws SQLException;

    int updateAll() throws SQLException;
}
