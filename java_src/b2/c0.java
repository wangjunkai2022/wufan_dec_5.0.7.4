package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.ModleBeanTable;
/* compiled from: ModleBeanTableManager.java */
/* loaded from: classes4.dex */
public class c0 extends p1.b<ModleBeanTable> {

    /* renamed from: b  reason: collision with root package name */
    private static c0 f177b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<ModleBeanTable, Integer> f178c;

    private c0() {
        super(f178c);
    }

    public static c0 n() {
        if (f177b == null) {
            f178c = p1.e.d(null).c().d0();
            f177b = new c0();
        }
        return f177b;
    }
}
