package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.ResourceShare;
/* compiled from: ResourceShareManager.java */
/* loaded from: classes3.dex */
public class l extends b<ResourceShare> {

    /* renamed from: b  reason: collision with root package name */
    private static l f73118b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<ResourceShare, Integer> f73119c;

    private l() {
        super(f73119c);
    }

    public static l n() {
        if (f73118b == null) {
            f73119c = e.d(null).c().l0();
            f73118b = new l();
        }
        return f73118b;
    }
}
