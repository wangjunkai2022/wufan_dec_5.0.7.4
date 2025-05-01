package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.EMUUpdateTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: EMUUpdateTableManager.java */
/* loaded from: classes4.dex */
public class q extends p1.b<EMUUpdateTable> {

    /* renamed from: b  reason: collision with root package name */
    private static q f227b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<EMUUpdateTable, Integer> f228c;

    private q() {
        super(f228c);
    }

    public static q o() {
        if (f227b == null) {
            f228c = p1.e.d(null).c().D();
            f227b = new q();
        }
        return f227b;
    }

    public EMUUpdateTable n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("crc_sign_id", str);
        List<EMUUpdateTable> h4 = h(hashMap);
        if (h4 == null || h4.size() <= 0) {
            return null;
        }
        return h4.get(0);
    }
}
