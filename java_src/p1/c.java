package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Chapter;
/* compiled from: ChapterManager.java */
/* loaded from: classes3.dex */
public class c extends b<Chapter> {

    /* renamed from: b  reason: collision with root package name */
    private static c f73099b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Chapter, Integer> f73100c;

    private c() {
        super(f73100c);
    }

    public static c n() {
        if (f73099b == null) {
            f73100c = e.d(null).c().r();
            f73099b = new c();
        }
        return f73099b;
    }
}
