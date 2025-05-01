package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.H5GameAccountDataTable;
import java.util.List;
/* compiled from: H5GameTableManager.java */
/* loaded from: classes4.dex */
public class w extends p1.b<H5GameAccountDataTable> {

    /* renamed from: b  reason: collision with root package name */
    private static w f239b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<H5GameAccountDataTable, Integer> f240c;

    private w() {
        super(f240c);
    }

    public static w o() {
        if (f239b == null) {
            f240c = p1.e.d(null).c().w0();
            f239b = new w();
        }
        return f239b;
    }

    public List<H5GameAccountDataTable> n(String str) {
        List<H5GameAccountDataTable> queryForEq;
        if (str == null || "".equals(str) || (queryForEq = f240c.queryForEq("appkey", str)) == null || queryForEq.size() == 0) {
            return null;
        }
        return queryForEq;
    }
}
