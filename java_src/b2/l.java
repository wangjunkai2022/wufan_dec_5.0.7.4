package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.DownloadUrlTable;
/* compiled from: DownloadUrlTableManager.java */
/* loaded from: classes4.dex */
public class l extends p1.b<DownloadUrlTable> {

    /* renamed from: b  reason: collision with root package name */
    private static l f211b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<DownloadUrlTable, Integer> f212c;

    private l() {
        super(f212c);
    }

    public static l n() {
        if (f211b == null) {
            f212c = p1.e.d(null).c().B();
            f211b = new l();
        }
        return f211b;
    }
}
