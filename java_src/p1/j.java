package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Order;
/* compiled from: OrderManager.java */
/* loaded from: classes3.dex */
public class j extends b<Order> {

    /* renamed from: b  reason: collision with root package name */
    private static j f73114b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Order, Integer> f73115c;

    private j() {
        super(f73115c);
    }

    public static j n() {
        if (f73114b == null) {
            f73115c = e.d(null).c().f0();
            f73114b = new j();
        }
        return f73114b;
    }
}
