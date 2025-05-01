package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.DownlodTaskCopyTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: DownlodTaskCopyTableManager.java */
/* loaded from: classes4.dex */
public class n extends p1.b<DownlodTaskCopyTable> {

    /* renamed from: b  reason: collision with root package name */
    private static n f217b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<DownlodTaskCopyTable, Integer> f218c;

    private n() {
        super(f218c);
    }

    public static n o() {
        if (f217b == null) {
            f218c = p1.e.d(null).c().C();
            f217b = new n();
        }
        return f217b;
    }

    public DownlodTaskCopyTable n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gameId", str);
        List<DownlodTaskCopyTable> queryForFieldValues = f218c.queryForFieldValues(hashMap);
        if (queryForFieldValues == null || queryForFieldValues.size() <= 0) {
            return null;
        }
        return queryForFieldValues.get(0);
    }
}
