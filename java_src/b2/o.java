package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.Util.BeanUtils;
import com.join.mgps.Util.g2;
import com.join.mgps.db.tables.EMUApkArenaTable;
import com.join.mgps.db.tables.EMUApkTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: EMUApkArenaTableManager.java */
/* loaded from: classes4.dex */
public class o extends p1.b<EMUApkArenaTable> {

    /* renamed from: b  reason: collision with root package name */
    private static o f221b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<EMUApkArenaTable, Integer> f222c;

    private o() {
        super(f222c);
    }

    public static o o() {
        if (f221b == null) {
            f222c = p1.e.d(null).c().E();
            f221b = new o();
        }
        return f221b;
    }

    public EMUApkTable n(String str) {
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (g2.h(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tag_id", str);
        List<EMUApkArenaTable> h4 = h(hashMap);
        if (h4 != null && h4.size() > 0) {
            EMUApkTable eMUApkTable = (EMUApkTable) BeanUtils.g(h4.get(0), EMUApkTable.class);
            eMUApkTable.setArena(true);
            return eMUApkTable;
        }
        return null;
    }
}
