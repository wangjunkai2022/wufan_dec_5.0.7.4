package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.GameMainTable;
import java.util.List;
/* compiled from: GameMainTableManager.java */
/* loaded from: classes4.dex */
public class u extends p1.b<GameMainTable> {

    /* renamed from: b  reason: collision with root package name */
    private static u f235b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<GameMainTable, Integer> f236c;

    private u() {
        super(f236c);
    }

    public static u n() {
        if (f235b == null) {
            f236c = p1.e.d(null).c().S();
            f235b = new u();
        }
        return f235b;
    }

    public GameMainTable o(String str) {
        List<GameMainTable> queryForEq;
        if (str == null || (queryForEq = f236c.queryForEq("gameid", str)) == null || queryForEq.size() <= 0) {
            return null;
        }
        return queryForEq.get(0);
    }
}
