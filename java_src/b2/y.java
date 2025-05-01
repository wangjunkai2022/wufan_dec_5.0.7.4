package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.HeadPortraitTable;
/* compiled from: HeadPortraitTableManager.java */
/* loaded from: classes4.dex */
public class y extends p1.b<HeadPortraitTable> {

    /* renamed from: b  reason: collision with root package name */
    private static y f243b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<HeadPortraitTable, Integer> f244c;

    private y() {
        super(f244c);
    }

    public static y n() {
        if (f243b == null) {
            f244c = p1.e.d(null).c().W();
            f243b = new y();
        }
        return f243b;
    }
}
