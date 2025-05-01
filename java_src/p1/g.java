package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Live;
/* compiled from: LiveManager.java */
/* loaded from: classes3.dex */
public class g extends b<Live> {

    /* renamed from: b  reason: collision with root package name */
    private static g f73108b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Live, Integer> f73109c;

    private g() {
        super(f73109c);
    }

    public static g n() {
        if (f73108b == null) {
            f73109c = e.d(null).c().b0();
            f73108b = new g();
        }
        return f73108b;
    }
}
