package com.tencent.bugly.crashreport.biz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import com.umeng.analytics.pro.bq;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BUGLY */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f62218a;

    /* renamed from: b  reason: collision with root package name */
    private long f62219b;

    /* renamed from: c  reason: collision with root package name */
    private int f62220c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62221d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.biz.a$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements Runnable {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.this.c();
            } catch (Throwable th) {
                x.a(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.biz.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0660a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f62225a;

        /* renamed from: b  reason: collision with root package name */
        private UserInfoBean f62226b;

        public RunnableC0660a(UserInfoBean userInfoBean, boolean z4) {
            this.f62226b = userInfoBean;
            this.f62225a = z4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.bugly.crashreport.common.info.a b5;
            try {
                UserInfoBean userInfoBean = this.f62226b;
                if (userInfoBean != null) {
                    if (userInfoBean != null && (b5 = com.tencent.bugly.crashreport.common.info.a.b()) != null) {
                        userInfoBean.f62208j = b5.e();
                    }
                    x.c("[UserInfo] Record user info.", new Object[0]);
                    a.a(a.this, this.f62226b, false);
                }
                if (this.f62225a) {
                    a aVar = a.this;
                    w a5 = w.a();
                    if (a5 != null) {
                        a5.a(new AnonymousClass2());
                    }
                }
            } catch (Throwable th) {
                if (x.a(th)) {
                    return;
                }
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BUGLY */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < a.this.f62219b) {
                w.a().a(new b(), (a.this.f62219b - currentTimeMillis) + 5000);
                return;
            }
            a.this.a(3, false, 0L);
            a.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BUGLY */
    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private long f62229a;

        public c(long j4) {
            this.f62229a = 21600000L;
            this.f62229a = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            w a5 = w.a();
            if (a5 != null) {
                a5.a(new AnonymousClass2());
            }
            a aVar2 = a.this;
            long j4 = this.f62229a;
            w.a().a(new c(j4), j4);
        }
    }

    public a(Context context, boolean z4) {
        this.f62221d = true;
        this.f62218a = context;
        this.f62221d = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[Catch: all -> 0x016f, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:15:0x0017, B:17:0x001d, B:21:0x0027, B:23:0x003c, B:26:0x0045, B:28:0x004c, B:29:0x004f, B:31:0x0055, B:33:0x0069, B:34:0x0079, B:38:0x0081, B:39:0x008b, B:40:0x0090, B:42:0x0096, B:44:0x00a4, B:46:0x00b1, B:47:0x00b4, B:49:0x00c2, B:55:0x00cc, B:58:0x00d3, B:61:0x00e8, B:63:0x00ee, B:65:0x00f3, B:68:0x00fa, B:72:0x0112, B:74:0x0118, B:77:0x0121, B:79:0x0127, B:82:0x0130, B:84:0x013a, B:87:0x0143, B:91:0x0161, B:94:0x0166, B:59:0x00e2), top: B:102:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:15:0x0017, B:17:0x001d, B:21:0x0027, B:23:0x003c, B:26:0x0045, B:28:0x004c, B:29:0x004f, B:31:0x0055, B:33:0x0069, B:34:0x0079, B:38:0x0081, B:39:0x008b, B:40:0x0090, B:42:0x0096, B:44:0x00a4, B:46:0x00b1, B:47:0x00b4, B:49:0x00c2, B:55:0x00cc, B:58:0x00d3, B:61:0x00e8, B:63:0x00ee, B:65:0x00f3, B:68:0x00fa, B:72:0x0112, B:74:0x0118, B:77:0x0121, B:79:0x0127, B:82:0x0130, B:84:0x013a, B:87:0x0143, B:91:0x0161, B:94:0x0166, B:59:0x00e2), top: B:102:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121 A[Catch: all -> 0x016f, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:15:0x0017, B:17:0x001d, B:21:0x0027, B:23:0x003c, B:26:0x0045, B:28:0x004c, B:29:0x004f, B:31:0x0055, B:33:0x0069, B:34:0x0079, B:38:0x0081, B:39:0x008b, B:40:0x0090, B:42:0x0096, B:44:0x00a4, B:46:0x00b1, B:47:0x00b4, B:49:0x00c2, B:55:0x00cc, B:58:0x00d3, B:61:0x00e8, B:63:0x00ee, B:65:0x00f3, B:68:0x00fa, B:72:0x0112, B:74:0x0118, B:77:0x0121, B:79:0x0127, B:82:0x0130, B:84:0x013a, B:87:0x0143, B:91:0x0161, B:94:0x0166, B:59:0x00e2), top: B:102:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.biz.a.c():void");
    }

    static /* synthetic */ void a(a aVar, UserInfoBean userInfoBean, boolean z4) {
        List<UserInfoBean> a5;
        if (userInfoBean != null) {
            if (!z4 && userInfoBean.f62200b != 1 && (a5 = aVar.a(com.tencent.bugly.crashreport.common.info.a.a(aVar.f62218a).f62253d)) != null && a5.size() >= 20) {
                x.a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(a5.size()));
                return;
            }
            long a6 = p.a().a("t_ui", a(userInfoBean), (o) null, true);
            if (a6 >= 0) {
                x.c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(a6));
                userInfoBean.f62199a = a6;
            }
        }
    }

    public final void b() {
        w a5 = w.a();
        if (a5 != null) {
            a5.a(new AnonymousClass2());
        }
    }

    public final void a(int i4, boolean z4, long j4) {
        com.tencent.bugly.crashreport.common.strategy.a a5 = com.tencent.bugly.crashreport.common.strategy.a.a();
        if (a5 != null && !a5.c().f62284f && i4 != 1 && i4 != 3) {
            x.e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i4 == 1 || i4 == 3) {
            this.f62220c++;
        }
        com.tencent.bugly.crashreport.common.info.a a6 = com.tencent.bugly.crashreport.common.info.a.a(this.f62218a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f62200b = i4;
        userInfoBean.f62201c = a6.f62253d;
        userInfoBean.f62202d = a6.g();
        userInfoBean.f62203e = System.currentTimeMillis();
        userInfoBean.f62204f = -1L;
        userInfoBean.f62212n = a6.f62259j;
        userInfoBean.f62213o = i4 == 1 ? 1 : 0;
        userInfoBean.f62210l = a6.a();
        userInfoBean.f62211m = a6.f62265p;
        userInfoBean.f62205g = a6.f62266q;
        userInfoBean.f62206h = a6.f62267r;
        userInfoBean.f62207i = a6.f62268s;
        userInfoBean.f62209k = a6.f62269t;
        userInfoBean.f62216r = a6.u();
        userInfoBean.f62217s = a6.z();
        userInfoBean.f62214p = a6.A();
        userInfoBean.f62215q = a6.B();
        w.a().a(new RunnableC0660a(userInfoBean, z4), 0L);
    }

    public final void a() {
        this.f62219b = z.b() + 86400000;
        w.a().a(new b(), (this.f62219b - System.currentTimeMillis()) + 5000);
    }

    public final List<UserInfoBean> a(String str) {
        Cursor cursor;
        String str2;
        try {
            if (z.a(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursor = p.a().a("t_ui", null, str2, null, null, true);
            if (cursor == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    UserInfoBean a5 = a(cursor);
                    if (a5 != null) {
                        arrayList.add(a5);
                    } else {
                        long j4 = cursor.getLong(cursor.getColumnIndex("_id"));
                        sb.append(" or _id");
                        sb.append(" = ");
                        sb.append(j4);
                    }
                }
                String sb2 = sb.toString();
                if (sb2.length() > 0) {
                    x.d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(p.a().a("t_ui", sb2.substring(4), (String[]) null, (o) null, true)));
                }
                cursor.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    private static void a(List<UserInfoBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size() && i4 < 50; i4++) {
            sb.append(" or _id");
            sb.append(" = ");
            sb.append(list.get(i4).f62199a);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            sb2 = sb2.substring(4);
        }
        String str = sb2;
        sb.setLength(0);
        try {
            x.c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(p.a().a("t_ui", str, (String[]) null, (o) null, true)));
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private static ContentValues a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j4 = userInfoBean.f62199a;
            if (j4 > 0) {
                contentValues.put("_id", Long.valueOf(j4));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f62203e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f62204f));
            contentValues.put(bq.f63522e, Integer.valueOf(userInfoBean.f62200b));
            contentValues.put("_pc", userInfoBean.f62201c);
            contentValues.put("_dt", z.a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static UserInfoBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j4 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) z.a(blob, UserInfoBean.CREATOR);
            if (userInfoBean != null) {
                userInfoBean.f62199a = j4;
            }
            return userInfoBean;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }
}
