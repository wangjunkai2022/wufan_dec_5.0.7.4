package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.StatisticTable;
/* compiled from: StatisticTableManager.java */
/* loaded from: classes4.dex */
public class j0 extends p1.b<StatisticTable> {

    /* renamed from: b  reason: collision with root package name */
    private static j0 f205b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<StatisticTable, Integer> f206c;

    private j0() {
        super(f206c);
    }

    public static j0 n() {
        if (f205b == null) {
            f206c = p1.e.d(null).c().p0();
            f205b = new j0();
        }
        return f205b;
    }
}
