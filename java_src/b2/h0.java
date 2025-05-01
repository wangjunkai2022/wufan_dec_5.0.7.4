package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.SearchRecordTable;
/* compiled from: SearchRecordTableManager.java */
/* loaded from: classes4.dex */
public class h0 extends p1.b<SearchRecordTable> {

    /* renamed from: b  reason: collision with root package name */
    private static h0 f197b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<SearchRecordTable, Integer> f198c;

    private h0() {
        super(f198c);
    }

    public static h0 n() {
        if (f197b == null) {
            f198c = p1.e.d(null).c().n0();
            f197b = new h0();
        }
        return f197b;
    }
}
