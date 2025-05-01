package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.WarMatchAndLocalTable;
/* compiled from: WarMatchAndLocalTableManager.java */
/* loaded from: classes4.dex */
public class o0 extends p1.b<WarMatchAndLocalTable> {

    /* renamed from: b  reason: collision with root package name */
    private static o0 f223b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<WarMatchAndLocalTable, Integer> f224c;

    private o0() {
        super(f224c);
    }

    public static o0 n() {
        if (f223b == null) {
            f224c = p1.e.d(null).c().v0();
            f223b = new o0();
        }
        return f223b;
    }
}
