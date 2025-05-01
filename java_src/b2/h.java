package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.CloudBackupsDataTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: CloudBackupsDataTableManager.java */
/* loaded from: classes4.dex */
public class h extends p1.b<CloudBackupsDataTable> {

    /* renamed from: b  reason: collision with root package name */
    private static h f195b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<CloudBackupsDataTable, Integer> f196c;

    private h() {
        super(f196c);
    }

    public static h o() {
        if (f195b == null) {
            f196c = p1.e.d(null).c().u();
            f195b = new h();
        }
        return f195b;
    }

    public CloudBackupsDataTable n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gameId", str);
        List<CloudBackupsDataTable> h4 = o().h(hashMap);
        if (h4 == null || h4.size() <= 0) {
            return null;
        }
        return h4.get(0);
    }
}
