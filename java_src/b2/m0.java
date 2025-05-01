package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.Where;
import com.join.mgps.db.tables.UserPurchaseInfo;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
/* compiled from: UserPurchaseInfoManager.java */
/* loaded from: classes4.dex */
public class m0 extends p1.b<UserPurchaseInfo> {

    /* renamed from: b  reason: collision with root package name */
    private static m0 f215b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<UserPurchaseInfo, Integer> f216c;

    private m0() {
        super(f216c);
    }

    public static m0 p() {
        if (f215b == null) {
            f216c = p1.e.d(null).c().t0();
            f215b = new m0();
        }
        return f215b;
    }

    public void delete(String str) {
        DeleteBuilder<UserPurchaseInfo, Integer> deleteBuilder = f216c.deleteBuilder();
        Where<UserPurchaseInfo, Integer> where = deleteBuilder.where();
        try {
            where.eq("uid", str);
            deleteBuilder.setWhere(where);
            f216c.delete(deleteBuilder.prepare());
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public List<UserPurchaseInfo> n(String str) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("uid", str);
        return h(hashMap);
    }

    public List<UserPurchaseInfo> o(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(0);
        hashMap.put("uid", str);
        hashMap.put("game_id", str2);
        return h(hashMap);
    }
}
