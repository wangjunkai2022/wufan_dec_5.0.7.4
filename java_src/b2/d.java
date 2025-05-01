package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.BannerAndTablesTable;
/* compiled from: BannerAndTanlesTableManager.java */
/* loaded from: classes4.dex */
public class d extends p1.b<BannerAndTablesTable> {

    /* renamed from: b  reason: collision with root package name */
    private static d f179b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<BannerAndTablesTable, Integer> f180c;

    private d() {
        super(f180c);
    }

    public static d n() {
        if (f179b == null) {
            f180c = p1.e.d(null).c().k();
            f179b = new d();
        }
        return f179b;
    }
}
