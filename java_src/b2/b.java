package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.AppBeanTable;
/* compiled from: AppBeanTableManager.java */
/* loaded from: classes4.dex */
public class b extends p1.b<AppBeanTable> {

    /* renamed from: b  reason: collision with root package name */
    private static b f171b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<AppBeanTable, Integer> f172c;

    private b() {
        super(f172c);
    }

    public static b n() {
        if (f171b == null) {
            f172c = p1.e.d(null).c().g();
            f171b = new b();
        }
        return f171b;
    }
}
