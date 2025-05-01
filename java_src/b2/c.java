package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.AppMoreBeanTable;
/* compiled from: AppMoreBeanTableManager.java */
/* loaded from: classes4.dex */
public class c extends p1.b<AppMoreBeanTable> {

    /* renamed from: b  reason: collision with root package name */
    private static c f175b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<AppMoreBeanTable, Integer> f176c;

    private c() {
        super(f176c);
    }

    public static c n() {
        if (f175b == null) {
            f176c = p1.e.d(null).c().h();
            f175b = new c();
        }
        return f175b;
    }
}
