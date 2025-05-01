package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.ForumSearchRecordTable;
/* compiled from: ForumSearchRecordTableManager.java */
/* loaded from: classes4.dex */
public class s extends p1.b<ForumSearchRecordTable> {

    /* renamed from: b  reason: collision with root package name */
    private static s f231b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<ForumSearchRecordTable, Integer> f232c;

    private s() {
        super(f232c);
    }

    public static s n() {
        if (f231b == null) {
            f232c = p1.e.d(null).c().N();
            f231b = new s();
        }
        return f231b;
    }
}
