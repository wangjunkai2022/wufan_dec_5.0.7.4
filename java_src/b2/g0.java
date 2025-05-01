package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.RewardBananaTable;
import com.umeng.umcrash.UMCrash;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
/* compiled from: RewardBananaTableManager.java */
/* loaded from: classes4.dex */
public class g0 extends p1.b<RewardBananaTable> {

    /* renamed from: b  reason: collision with root package name */
    private static g0 f193b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<RewardBananaTable, Integer> f194c;

    public g0() {
        super(f194c);
    }

    public static g0 q() {
        if (f193b == null) {
            f194c = p1.e.d(null).c().m0();
            f193b = new g0();
        }
        return f193b;
    }

    public RewardBananaTable n(String str) {
        List<RewardBananaTable> list;
        new HashMap().put("gameId", str);
        try {
            list = f194c.queryBuilder().orderBy(UMCrash.SP_KEY_TIMESTAMP, false).where().eq("gameId", str).query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public RewardBananaTable o(String str) {
        List<RewardBananaTable> list;
        new HashMap().put("uniqueId", str);
        try {
            list = f194c.queryBuilder().orderBy(UMCrash.SP_KEY_TIMESTAMP, false).where().eq("uniqueId", str).query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public List<RewardBananaTable> p(int i4) {
        List<RewardBananaTable> list;
        try {
            list = f194c.queryBuilder().orderBy(UMCrash.SP_KEY_TIMESTAMP, false).where().eq("type", Integer.valueOf(i4)).and().ne("status", 1).query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }
}
