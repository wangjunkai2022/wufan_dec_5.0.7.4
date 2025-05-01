package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.join.mgps.db.tables.DownloadHistoryTable;
import java.util.List;
/* compiled from: DownloadHistoryTableManager.java */
/* loaded from: classes4.dex */
public class k extends p1.b<DownloadHistoryTable> {

    /* renamed from: b  reason: collision with root package name */
    private static k f207b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<DownloadHistoryTable, Integer> f208c;

    private k() {
        super(f208c);
    }

    public static k n() {
        if (f207b == null) {
            f208c = p1.e.d(null).c().A();
            f207b = new k();
        }
        return f207b;
    }

    public List<DownloadHistoryTable> o() {
        QueryBuilder<DownloadHistoryTable, Integer> queryBuilder = f208c.queryBuilder();
        try {
            queryBuilder.orderBy("create_time", false);
            return queryBuilder.query();
        } catch (Exception unused) {
            return null;
        }
    }

    public DownloadHistoryTable p(String str) {
        List<DownloadHistoryTable> queryForEq;
        if (str == null || (queryForEq = f208c.queryForEq("crc_link_type_val", str)) == null || queryForEq.size() <= 0) {
            return null;
        }
        return queryForEq.get(0);
    }
}
