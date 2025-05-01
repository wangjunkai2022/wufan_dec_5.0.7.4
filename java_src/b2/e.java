package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.Where;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.g2;
import com.join.mgps.db.tables.CacheTable;
import com.join.mgps.dto.GameWorldGlobalData;
import com.join.mgps.dto.GameWorldRealTimeWorshipBean;
import com.join.mgps.dto.GameWorldUserInfoWrap;
import com.join.mgps.dto.GradeListInfoData;
import java.sql.SQLException;
import java.util.List;
/* compiled from: CacheTableManager.java */
/* loaded from: classes4.dex */
public class e extends p1.b<CacheTable> {

    /* renamed from: b  reason: collision with root package name */
    private static e f183b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<CacheTable, Integer> f184c;

    private e() {
        super(f184c);
    }

    public static e r() {
        if (f183b == null) {
            f184c = p1.e.d(null).c().l();
            f183b = new e();
        }
        return f183b;
    }

    public void n(long j4) {
        DeleteBuilder<CacheTable, Integer> deleteBuilder = f184c.deleteBuilder();
        Where<CacheTable, Integer> where = deleteBuilder.where();
        try {
            where.eq("type", Integer.valueOf(CacheTable.TYPE_GAME_WORLD_GLOBAL_DATA)).and();
            where.eq("gameId", Long.valueOf(j4));
            deleteBuilder.setWhere(where);
            f184c.delete(deleteBuilder.prepare());
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public void o(long j4) {
        DeleteBuilder<CacheTable, Integer> deleteBuilder = f184c.deleteBuilder();
        Where<CacheTable, Integer> where = deleteBuilder.where();
        try {
            where.eq("type", Integer.valueOf(CacheTable.TYPE_GAME_WORLD_GRADE)).and();
            where.eq("gameId", Long.valueOf(j4));
            deleteBuilder.setWhere(where);
            f184c.delete(deleteBuilder.prepare());
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public void p(String str, long j4) {
        DeleteBuilder<CacheTable, Integer> deleteBuilder = f184c.deleteBuilder();
        Where<CacheTable, Integer> where = deleteBuilder.where();
        try {
            where.eq("type", Integer.valueOf(CacheTable.TYPE_GAME_WORLD_USER_INFO)).and();
            if (g2.i(str)) {
                where.eq("uid", str).and();
            }
            where.eq("gameId", Long.valueOf(j4));
            deleteBuilder.setWhere(where);
            f184c.delete(deleteBuilder.prepare());
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public void q(long j4) {
        DeleteBuilder<CacheTable, Integer> deleteBuilder = f184c.deleteBuilder();
        Where<CacheTable, Integer> where = deleteBuilder.where();
        try {
            where.eq("type", Integer.valueOf(CacheTable.TYPE_GAME_WORLD_WORSHIP)).and();
            where.eq("gameId", Long.valueOf(j4));
            deleteBuilder.setWhere(where);
            f184c.delete(deleteBuilder.prepare());
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public void s(long j4, GameWorldGlobalData gameWorldGlobalData) {
        CacheTable cacheTable = new CacheTable();
        cacheTable.setGameId(j4);
        cacheTable.setType(CacheTable.TYPE_GAME_WORLD_GLOBAL_DATA);
        cacheTable.setData(JsonMapper.getInstance().toJson(gameWorldGlobalData));
        k(cacheTable);
    }

    public void t(long j4, List<GradeListInfoData> list) {
        CacheTable cacheTable = new CacheTable();
        cacheTable.setGameId(j4);
        cacheTable.setType(CacheTable.TYPE_GAME_WORLD_GRADE);
        cacheTable.setData(JsonMapper.getInstance().toJson(list));
        k(cacheTable);
    }

    public void u(String str, long j4, GameWorldUserInfoWrap gameWorldUserInfoWrap) {
        CacheTable cacheTable = new CacheTable();
        cacheTable.setGameId(j4);
        cacheTable.setUid(str);
        cacheTable.setType(CacheTable.TYPE_GAME_WORLD_USER_INFO);
        cacheTable.setData(JsonMapper.getInstance().toJson(gameWorldUserInfoWrap));
        k(cacheTable);
    }

    public void v(long j4, List<GameWorldRealTimeWorshipBean> list) {
        CacheTable cacheTable = new CacheTable();
        cacheTable.setGameId(j4);
        cacheTable.setType(CacheTable.TYPE_GAME_WORLD_WORSHIP);
        cacheTable.setData(JsonMapper.getInstance().toJson(list));
        k(cacheTable);
    }
}
