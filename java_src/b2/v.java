package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.join.mgps.db.tables.GamePaiWeiUpTaskTable;
import java.sql.SQLException;
import java.util.List;
/* compiled from: GamePaiWeiTableManager.java */
/* loaded from: classes4.dex */
public class v extends p1.b<GamePaiWeiUpTaskTable> {

    /* renamed from: b  reason: collision with root package name */
    private static v f237b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<GamePaiWeiUpTaskTable, Integer> f238c;

    private v() {
        super(f238c);
    }

    public static v n() {
        if (f237b == null) {
            f238c = p1.e.d(null).c().T();
            f237b = new v();
        }
        return f237b;
    }

    public List<GamePaiWeiUpTaskTable> o(String str) {
        if (str == null) {
            return null;
        }
        return f238c.queryForEq("userId", str);
    }

    public List<GamePaiWeiUpTaskTable> p(String str) {
        if (str == null) {
            return null;
        }
        QueryBuilder<GamePaiWeiUpTaskTable, Integer> queryBuilder = f238c.queryBuilder();
        try {
            Where<GamePaiWeiUpTaskTable, Integer> where = queryBuilder.where();
            where.eq("userId", str).and();
            where.eq("isUped", Boolean.FALSE);
            queryBuilder.setWhere(where);
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
