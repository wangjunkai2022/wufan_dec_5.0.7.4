package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.join.mgps.db.tables.CloudArchiveTable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: CloudArchiveTableManager.java */
/* loaded from: classes.dex */
public class g extends p1.b<CloudArchiveTable> {

    /* renamed from: b  reason: collision with root package name */
    private static g f191b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<CloudArchiveTable, Integer> f192c;

    private g() {
        super(f192c);
    }

    public static g t() {
        if (f191b == null) {
            f192c = p1.e.d(null).c().t();
            f191b = new g();
        }
        return f191b;
    }

    public void n(String str) {
        Map<String, Object> hashMap = new HashMap<>(0);
        hashMap.put("packageName", str);
        List h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return;
        }
        delete((Collection) h4);
    }

    public void o(String str, String str2) {
        Map<String, Object> hashMap = new HashMap<>(0);
        hashMap.put("packageName", str);
        hashMap.put("archiveId", str2);
        List h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return;
        }
        delete((Collection) h4);
    }

    public CloudArchiveTable p(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(0);
        hashMap.put("archiveId", str);
        List<CloudArchiveTable> h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return null;
        }
        return h4.get(0);
    }

    public List<CloudArchiveTable> q(String str) {
        QueryBuilder<CloudArchiveTable, Integer> queryBuilder = f192c.queryBuilder();
        queryBuilder.orderBy("id", false);
        try {
            Where<CloudArchiveTable, Integer> where = queryBuilder.where();
            where.eq("gameId", str);
            queryBuilder.setWhere(where);
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return new ArrayList();
        }
    }

    public CloudArchiveTable r(String str, String str2) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("gameId", str);
        hashMap.put("archiveId", str2);
        List<CloudArchiveTable> h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return null;
        }
        return h4.get(0);
    }

    public CloudArchiveTable s(String str, int i4) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("gameId", str);
        hashMap.put("userId", Integer.valueOf(i4));
        List<CloudArchiveTable> h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return null;
        }
        return h4.get(0);
    }
}
