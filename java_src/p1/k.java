package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Reference;
/* compiled from: ReferenceManager.java */
/* loaded from: classes3.dex */
public class k extends b<Reference> {

    /* renamed from: b  reason: collision with root package name */
    private static k f73116b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Reference, Integer> f73117c;

    private k() {
        super(f73117c);
    }

    public static k n() {
        if (f73116b == null) {
            f73117c = e.d(null).c().k0();
            f73116b = new k();
        }
        return f73116b;
    }
}
