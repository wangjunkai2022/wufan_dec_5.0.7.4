package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.DownloadFileTable;
/* compiled from: DownloadFileTableManager.java */
/* loaded from: classes.dex */
public class j extends p1.b<DownloadFileTable> {

    /* renamed from: b  reason: collision with root package name */
    private static j f203b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<DownloadFileTable, Integer> f204c;

    private j() {
        super(f204c);
    }

    public static j n() {
        if (f203b == null) {
            f204c = p1.e.d(null).c().z();
            f203b = new j();
        }
        return f203b;
    }
}
