package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Account;
/* compiled from: AccountManager.java */
/* loaded from: classes3.dex */
public class a extends b<Account> {

    /* renamed from: b  reason: collision with root package name */
    private static a f73096b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Account, Integer> f73097c;

    private a() {
        super(f73097c);
    }

    public static a n() {
        if (f73096b == null) {
            f73097c = e.d(null).c().b();
            f73096b = new a();
        }
        return f73096b;
    }
}
