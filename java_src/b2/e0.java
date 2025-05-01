package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.PurchasedListTable;
import java.util.List;
/* compiled from: PurchasedListTableManager.java */
/* loaded from: classes4.dex */
public class e0 extends p1.b<PurchasedListTable> {

    /* renamed from: b  reason: collision with root package name */
    private static e0 f185b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<PurchasedListTable, Integer> f186c;

    private e0() {
        super(f186c);
    }

    public static e0 o() {
        if (f185b == null) {
            f186c = p1.e.d(null).c().i0();
            f185b = new e0();
        }
        return f185b;
    }

    public synchronized PurchasedListTable n(String str) {
        try {
            List<PurchasedListTable> query = f186c.queryBuilder().where().eq("game_id", str).query();
            if (query != null && query.size() > 0) {
                return query.get(0);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean p(String str) {
        try {
            List<PurchasedListTable> query = f186c.queryBuilder().where().eq("game_id", str).query();
            if (query != null) {
                return query.size() > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
