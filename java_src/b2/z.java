package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.JPushRecordTable;
/* compiled from: JPushRecordTableManager.java */
/* loaded from: classes4.dex */
public class z extends p1.b<JPushRecordTable> {

    /* renamed from: b  reason: collision with root package name */
    private static z f245b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<JPushRecordTable, Integer> f246c;

    private z() {
        super(f246c);
    }

    public static z n() {
        if (f245b == null) {
            f246c = p1.e.d(null).c().Y();
            f245b = new z();
        }
        return f245b;
    }
}
