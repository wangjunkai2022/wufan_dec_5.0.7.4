package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.AppBeanMainTable;
/* compiled from: AppBeanMainTableManager.java */
/* loaded from: classes4.dex */
public class a extends p1.b<AppBeanMainTable> {

    /* renamed from: b  reason: collision with root package name */
    private static a f167b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<AppBeanMainTable, Integer> f168c;

    private a() {
        super(f168c);
    }

    public static a n() {
        if (f167b == null) {
            f168c = p1.e.d(null).c().d();
            f167b = new a();
        }
        return f167b;
    }
}
