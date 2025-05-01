package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.HandShankTable;
import java.sql.SQLException;
import java.util.List;
/* compiled from: HandShankTableManager.java */
/* loaded from: classes4.dex */
public class x extends p1.b<HandShankTable> {

    /* renamed from: b  reason: collision with root package name */
    private static x f241b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<HandShankTable, Integer> f242c;

    private x() {
        super(f242c);
    }

    public static x p() {
        if (f241b == null) {
            f242c = p1.e.d(null).c().V();
            f241b = new x();
        }
        return f241b;
    }

    public void n(HandShankTable handShankTable) {
        f242c.createOrUpdate(handShankTable);
    }

    public List<HandShankTable> o() {
        List<HandShankTable> list = null;
        try {
            list = f242c.queryBuilder().orderBy("time", false).query();
            for (int i4 = 0; i4 < list.size(); i4++) {
                HandShankTable handShankTable = list.get(i4);
                if (com.join.mgps.joystick.map.a.b().f(handShankTable.getName())) {
                    f242c.delete((RuntimeExceptionDao<HandShankTable, Integer>) handShankTable);
                    list.remove(i4);
                }
            }
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
        return list;
    }

    public boolean q(String str) {
        try {
            List<HandShankTable> query = f242c.queryBuilder().orderBy("time", false).where().eq("address", str).query();
            if (query != null) {
                if (query.size() > 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
