package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.CategoryRecordTable;
/* compiled from: CategoryRecordTableManager.java */
/* loaded from: classes4.dex */
public class f extends p1.b<CategoryRecordTable> {

    /* renamed from: b  reason: collision with root package name */
    private static f f187b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<CategoryRecordTable, Integer> f188c;

    private f() {
        super(f188c);
    }

    public static f n() {
        if (f187b == null) {
            f188c = p1.e.d(null).c().p();
            f187b = new f();
        }
        return f187b;
    }
}
