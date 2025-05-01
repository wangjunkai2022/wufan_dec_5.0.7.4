package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Notice;
/* compiled from: NoticeManager.java */
/* loaded from: classes3.dex */
public class i extends b<Notice> {

    /* renamed from: b  reason: collision with root package name */
    private static i f73112b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Notice, Integer> f73113c;

    private i() {
        super(f73113c);
    }

    public static i n() {
        if (f73112b == null) {
            f73113c = e.d(null).c().e0();
            f73112b = new i();
        }
        return f73112b;
    }
}
