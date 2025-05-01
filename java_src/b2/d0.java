package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.PlayGameTimeTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: PlayGameTimeTableManager.java */
/* loaded from: classes4.dex */
public class d0 extends p1.b<PlayGameTimeTable> {

    /* renamed from: b  reason: collision with root package name */
    private static d0 f181b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<PlayGameTimeTable, Integer> f182c;

    private d0() {
        super(f182c);
    }

    public static d0 n() {
        if (f181b == null) {
            f182c = p1.e.d(null).c().h0();
            f181b = new d0();
        }
        return f181b;
    }

    public List<PlayGameTimeTable> o(String str, String str2) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uId", str);
        hashMap.put("gameId", str2);
        return f182c.queryForFieldValues(hashMap);
    }
}
