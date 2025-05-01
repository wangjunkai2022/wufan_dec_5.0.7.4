package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.TipBeanTable;
/* compiled from: TipBeanTableManager.java */
/* loaded from: classes4.dex */
public class k0 extends p1.b<TipBeanTable> {

    /* renamed from: b  reason: collision with root package name */
    private static k0 f209b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<TipBeanTable, Integer> f210c;

    private k0() {
        super(f210c);
    }

    public static k0 n() {
        if (f209b == null) {
            f210c = p1.e.d(null).c().r0();
            f209b = new k0();
        }
        return f209b;
    }
}
