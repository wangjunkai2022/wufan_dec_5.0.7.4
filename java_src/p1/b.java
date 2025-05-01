package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: BaseManager.java */
/* loaded from: classes.dex */
public class b<E> {

    /* renamed from: a  reason: collision with root package name */
    private RuntimeExceptionDao f73098a;

    public b(RuntimeExceptionDao runtimeExceptionDao) {
        this.f73098a = runtimeExceptionDao;
    }

    public int a() {
        try {
            return this.f73098a.deleteBuilder().delete();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public int b(Object obj) {
        return this.f73098a.deleteById(obj);
    }

    public int c(Collection collection) {
        return this.f73098a.deleteIds(collection);
    }

    public List<E> d() {
        return this.f73098a.queryForAll();
    }

    public int delete(E e5) {
        return this.f73098a.delete((RuntimeExceptionDao) e5);
    }

    public List<E> e(Map<String, Object> map, String str, boolean z4, String str2, boolean z5) {
        QueryBuilder queryBuilder = this.f73098a.queryBuilder();
        try {
            queryBuilder.orderBy(str, z4);
            queryBuilder.orderBy(str2, z5);
            Where<T, ID> where = queryBuilder.where();
            Set<Map.Entry<String, Object>> entrySet = map.entrySet();
            int i4 = 0;
            for (Map.Entry<String, Object> entry : entrySet) {
                i4++;
                if (i4 == entrySet.size()) {
                    where.eq(entry.getKey(), entry.getValue());
                } else {
                    where.eq(entry.getKey(), entry.getValue()).and();
                }
            }
            queryBuilder.setWhere(where);
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public List<E> f(Where where, String str, boolean z4) {
        QueryBuilder queryBuilder = this.f73098a.queryBuilder();
        try {
            queryBuilder.setWhere(where);
            queryBuilder.orderBy(str, z4);
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public E g(Object obj) {
        return (E) this.f73098a.queryForId(obj);
    }

    public List<E> h(Map<String, Object> map) {
        return this.f73098a.queryForFieldValues(map);
    }

    public List<E> i(long j4, long j5, String str, boolean z4) {
        QueryBuilder queryBuilder = this.f73098a.queryBuilder();
        try {
            queryBuilder.orderBy(str, z4);
            queryBuilder.offset(Long.valueOf(j4));
            queryBuilder.limit(Long.valueOf(j5));
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public List<E> j(Where where, long j4, long j5, String str, boolean z4) {
        QueryBuilder queryBuilder = this.f73098a.queryBuilder();
        try {
            queryBuilder.setWhere(where);
            queryBuilder.orderBy(str, z4);
            queryBuilder.offset(Long.valueOf(j4));
            queryBuilder.limit(Long.valueOf(j5));
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public int k(E e5) {
        return this.f73098a.create(e5);
    }

    public E l(E e5) {
        return (E) this.f73098a.createIfNotExists(e5);
    }

    public E m(E e5) {
        return (E) this.f73098a.createOrUpdate(e5);
    }

    public int update(E e5) {
        return this.f73098a.update((RuntimeExceptionDao) e5);
    }

    public int delete(Collection collection) {
        return this.f73098a.delete(collection);
    }
}
