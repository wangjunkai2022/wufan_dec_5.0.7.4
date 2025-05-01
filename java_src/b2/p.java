package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.EMUApkTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: EMUApkTableManager.java */
/* loaded from: classes4.dex */
public class p extends p1.b<EMUApkTable> {

    /* renamed from: b  reason: collision with root package name */
    private static p f225b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<EMUApkTable, Integer> f226c;

    private p() {
        super(f226c);
    }

    public static p o() {
        if (f225b == null) {
            f226c = p1.e.d(null).c().J();
            f225b = new p();
        }
        return f225b;
    }

    public EMUApkTable n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag_id", str);
        List<EMUApkTable> h4 = h(hashMap);
        if (h4 == null || h4.size() <= 0) {
            return null;
        }
        return h4.get(0);
    }
}
