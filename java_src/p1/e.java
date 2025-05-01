package p1;

import android.content.Context;
import com.MApplication;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.join.android.app.common.db.DatabaseHelper;
/* compiled from: DBManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static e f73103c;

    /* renamed from: a  reason: collision with root package name */
    private Context f73104a;

    /* renamed from: b  reason: collision with root package name */
    private DatabaseHelper f73105b = null;

    private e(Context context) {
        this.f73104a = context;
    }

    private void a() {
        if (this.f73104a == null) {
            this.f73104a = MApplication.f1497x;
        }
    }

    public static e d(Context context) {
        if (f73103c == null) {
            f73103c = new e(context);
        }
        return f73103c;
    }

    public void b(String str) {
        if (this.f73105b != null) {
            if (DatabaseHelper.a().equals(str)) {
                return;
            }
            OpenHelperManager.releaseHelper();
        }
        if (this.f73105b == null || !DatabaseHelper.a().equals(str)) {
            a();
            DatabaseHelper.y0(str);
            this.f73105b = (DatabaseHelper) OpenHelperManager.getHelper(this.f73104a, DatabaseHelper.class);
        }
    }

    public DatabaseHelper c() {
        if (this.f73105b == null) {
            a();
            this.f73105b = (DatabaseHelper) OpenHelperManager.getHelper(this.f73104a, DatabaseHelper.class);
        }
        return this.f73105b;
    }

    public void e() {
        if (this.f73105b != null) {
            OpenHelperManager.releaseHelper();
            this.f73105b = null;
        }
    }
}
