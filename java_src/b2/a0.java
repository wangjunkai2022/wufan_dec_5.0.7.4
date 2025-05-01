package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.JoystickTable;
import java.util.List;
/* compiled from: JoystickManager.java */
/* loaded from: classes4.dex */
public class a0 extends p1.b<JoystickTable> {

    /* renamed from: b  reason: collision with root package name */
    private static a0 f169b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<JoystickTable, Integer> f170c;

    public a0() {
        super(f170c);
    }

    public static a0 o() {
        if (f169b == null) {
            f170c = p1.e.d(null).c().Z();
            f169b = new a0();
        }
        return f169b;
    }

    public JoystickTable n(String str) {
        try {
            List<JoystickTable> query = f170c.queryBuilder().orderBy("time", false).where().eq("mac", str).query();
            if (query == null || query.size() <= 0) {
                return null;
            }
            return query.get(0);
        } catch (Exception unused) {
            return null;
        }
    }
}
