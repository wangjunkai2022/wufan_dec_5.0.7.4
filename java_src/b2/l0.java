package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.TokenTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: TokenTableManager.java */
/* loaded from: classes4.dex */
public class l0 extends p1.b<TokenTable> {

    /* renamed from: b  reason: collision with root package name */
    private static l0 f213b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<TokenTable, Integer> f214c;

    private l0() {
        super(f214c);
    }

    public static l0 p() {
        if (f213b == null) {
            f214c = p1.e.d(null).c().s0();
            f213b = new l0();
        }
        return f213b;
    }

    public String n(long j4) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("uid", Long.valueOf(j4));
        List<TokenTable> h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return null;
        }
        return h4.get(0).getToken();
    }

    public TokenTable o(long j4) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("uid", Long.valueOf(j4));
        List<TokenTable> h4 = h(hashMap);
        if (h4 == null || h4.size() == 0) {
            return null;
        }
        return h4.get(0);
    }
}
