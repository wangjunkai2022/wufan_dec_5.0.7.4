package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CloudDownRecoderTableManager.java */
/* loaded from: classes4.dex */
public class i extends p1.b<CloudDownRecoderTable> {

    /* renamed from: b  reason: collision with root package name */
    private static i f199b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<CloudDownRecoderTable, Integer> f200c;

    private i() {
        super(f200c);
    }

    public static i o() {
        if (f199b == null) {
            f200c = p1.e.d(null).c().v();
            f199b = new i();
        }
        return f199b;
    }

    public List<CloudDownRecoderTable> n(String str) {
        if (str != null && !"".equals(str)) {
            List<CloudDownRecoderTable> queryForEq = f200c.queryForEq("gameId", str);
            return (queryForEq == null || queryForEq.size() == 0) ? new ArrayList() : queryForEq;
        }
        return new ArrayList();
    }
}
