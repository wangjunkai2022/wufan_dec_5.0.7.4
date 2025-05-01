package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.FightMainTable;
/* compiled from: FightMainTableManager.java */
/* loaded from: classes4.dex */
public class r extends p1.b<FightMainTable> {

    /* renamed from: b  reason: collision with root package name */
    private static r f229b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<FightMainTable, Integer> f230c;

    private r() {
        super(f230c);
    }

    public static r n() {
        if (f229b == null) {
            f230c = p1.e.d(null).c().K();
            f229b = new r();
        }
        return f229b;
    }
}
