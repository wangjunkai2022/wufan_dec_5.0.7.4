package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.VideoWatchLogTable;
/* compiled from: VideoWatchLogManager.java */
/* loaded from: classes4.dex */
public class n0 extends p1.b<VideoWatchLogTable> {

    /* renamed from: b  reason: collision with root package name */
    private static n0 f219b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<VideoWatchLogTable, Integer> f220c;

    private n0() {
        super(f220c);
    }

    public static n0 n() {
        if (f219b == null) {
            f220c = p1.e.d(null).c().u0();
            f219b = new n0();
        }
        return f219b;
    }
}
