package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.join.mgps.db.tables.LatestGameFileTable;
import java.sql.SQLException;
import java.util.List;
/* compiled from: LatestGameTableManager.java */
/* loaded from: classes4.dex */
public class b0 extends p1.b<LatestGameFileTable> {

    /* renamed from: b  reason: collision with root package name */
    private static b0 f173b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<LatestGameFileTable, Integer> f174c;

    private b0() {
        super(f174c);
    }

    public static b0 n() {
        if (f173b == null) {
            f174c = p1.e.d(null).c().a0();
            f173b = new b0();
        }
        return f173b;
    }

    public List<LatestGameFileTable> o() {
        QueryBuilder<LatestGameFileTable, Integer> queryBuilder = f174c.queryBuilder();
        try {
            queryBuilder.orderBy("createTime", false);
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
