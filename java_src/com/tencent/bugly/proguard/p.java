package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.umeng.analytics.pro.bq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f62661a;

    /* renamed from: b  reason: collision with root package name */
    private static q f62662b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f62663c;

    private p(Context context, List<com.tencent.bugly.a> list) {
        f62662b = new q(context, list);
    }

    private synchronized boolean b(r rVar) {
        ContentValues d5;
        if (rVar == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase == null || (d5 = d(rVar)) == null) {
                return false;
            }
            long replace = writableDatabase.replace("t_pf", "_id", d5);
            if (replace >= 0) {
                x.c("[Database] insert %s success.", "t_pf");
                rVar.f62686a = replace;
                return true;
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                return false;
            } finally {
            }
        }
    }

    private static ContentValues c(r rVar) {
        if (rVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j4 = rVar.f62686a;
            if (j4 > 0) {
                contentValues.put("_id", Long.valueOf(j4));
            }
            contentValues.put(bq.f63522e, Integer.valueOf(rVar.f62687b));
            contentValues.put("_pc", rVar.f62688c);
            contentValues.put("_th", rVar.f62689d);
            contentValues.put("_tm", Long.valueOf(rVar.f62690e));
            byte[] bArr = rVar.f62692g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static ContentValues d(r rVar) {
        if (rVar != null && !z.a(rVar.f62691f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j4 = rVar.f62686a;
                if (j4 > 0) {
                    contentValues.put("_id", Long.valueOf(j4));
                }
                contentValues.put(bq.f63522e, rVar.f62691f);
                contentValues.put("_tm", Long.valueOf(rVar.f62690e));
                byte[] bArr = rVar.f62692g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static synchronized p a(Context context, List<com.tencent.bugly.a> list) {
        p pVar;
        synchronized (p.class) {
            if (f62661a == null) {
                f62661a = new p(context, list);
            }
            pVar = f62661a;
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BUGLY */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private int f62664a;

        /* renamed from: b  reason: collision with root package name */
        private o f62665b;

        /* renamed from: c  reason: collision with root package name */
        private String f62666c;

        /* renamed from: d  reason: collision with root package name */
        private ContentValues f62667d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f62668e;

        /* renamed from: f  reason: collision with root package name */
        private String[] f62669f;

        /* renamed from: g  reason: collision with root package name */
        private String f62670g;

        /* renamed from: h  reason: collision with root package name */
        private String[] f62671h;

        /* renamed from: i  reason: collision with root package name */
        private String f62672i;

        /* renamed from: j  reason: collision with root package name */
        private String f62673j;

        /* renamed from: k  reason: collision with root package name */
        private String f62674k;

        /* renamed from: l  reason: collision with root package name */
        private String f62675l;

        /* renamed from: m  reason: collision with root package name */
        private String f62676m;

        /* renamed from: n  reason: collision with root package name */
        private String[] f62677n;

        /* renamed from: o  reason: collision with root package name */
        private int f62678o;

        /* renamed from: p  reason: collision with root package name */
        private String f62679p;

        /* renamed from: q  reason: collision with root package name */
        private byte[] f62680q;

        public a(int i4, o oVar) {
            this.f62664a = i4;
            this.f62665b = oVar;
        }

        public final void a(boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
            this.f62668e = z4;
            this.f62666c = str;
            this.f62669f = strArr;
            this.f62670g = str2;
            this.f62671h = strArr2;
            this.f62672i = str3;
            this.f62673j = str4;
            this.f62674k = str5;
            this.f62675l = str6;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f62664a) {
                case 1:
                    p.this.a(this.f62666c, this.f62667d, this.f62665b);
                    return;
                case 2:
                    p.this.a(this.f62666c, this.f62676m, this.f62677n, this.f62665b);
                    return;
                case 3:
                    Cursor a5 = p.this.a(this.f62668e, this.f62666c, this.f62669f, this.f62670g, this.f62671h, this.f62672i, this.f62673j, this.f62674k, this.f62675l, this.f62665b);
                    if (a5 != null) {
                        a5.close();
                        return;
                    }
                    return;
                case 4:
                    p.this.a(this.f62678o, this.f62679p, this.f62680q, this.f62665b);
                    return;
                case 5:
                    p.this.a(this.f62678o, this.f62665b);
                    return;
                case 6:
                    p.this.a(this.f62678o, this.f62679p, this.f62665b);
                    return;
                default:
                    return;
            }
        }

        public final void a(int i4, String str, byte[] bArr) {
            this.f62678o = i4;
            this.f62679p = str;
            this.f62680q = bArr;
        }
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            pVar = f62661a;
        }
        return pVar;
    }

    public final long a(String str, ContentValues contentValues, o oVar, boolean z4) {
        return a(str, contentValues, (o) null);
    }

    private synchronized List<r> c(int i4) {
        Cursor cursor;
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase != null) {
                String str = "_id = " + i4;
                cursor = writableDatabase.query("t_pf", null, str, null, null, null, null);
                if (cursor == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        r b5 = b(cursor);
                        if (b5 != null) {
                            arrayList.add(b5);
                        } else {
                            String string = cursor.getString(cursor.getColumnIndex(bq.f63522e));
                            sb.append(" or _tp");
                            sb.append(" = ");
                            sb.append(string);
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append(" and _id");
                        sb.append(" = ");
                        sb.append(i4);
                        x.d("[Database] deleted %s illegal data %d.", "t_pf", Integer.valueOf(writableDatabase.delete("t_pf", str.substring(4), null)));
                    }
                    cursor.close();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        return null;
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, o oVar, boolean z4) {
        return a(false, str, strArr, str2, null, null, null, null, null, null);
    }

    public final int a(String str, String str2, String[] strArr, o oVar, boolean z4) {
        return a(str, str2, (String[]) null, (o) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized long a(String str, ContentValues contentValues, o oVar) {
        long j4;
        j4 = 0;
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long replace = writableDatabase.replace(str, "_id", contentValues);
                if (replace >= 0) {
                    x.c("[Database] insert %s success.", str);
                } else {
                    x.d("[Database] replace %s error.", str);
                }
                j4 = replace;
            }
        } catch (Throwable th) {
            try {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j4;
    }

    public final synchronized void b(int i4) {
        String str;
        SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
        if (writableDatabase != null) {
            if (i4 >= 0) {
                str = "_tp = " + i4;
            } else {
                str = null;
            }
            x.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", str, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Cursor a(boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, o oVar) {
        Cursor cursor;
        cursor = null;
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase != null) {
                cursor = writableDatabase.query(z4, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
        } finally {
            try {
                return cursor;
            } finally {
            }
        }
        return cursor;
    }

    private static r b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            r rVar = new r();
            rVar.f62686a = cursor.getLong(cursor.getColumnIndex("_id"));
            rVar.f62690e = cursor.getLong(cursor.getColumnIndex("_tm"));
            rVar.f62691f = cursor.getString(cursor.getColumnIndex(bq.f63522e));
            rVar.f62692g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return rVar;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int a(String str, String str2, String[] strArr, o oVar) {
        int i4;
        i4 = 0;
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase != null) {
                i4 = writableDatabase.delete(str, str2, strArr);
            }
        } catch (Throwable th) {
            try {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i4;
    }

    public final boolean a(int i4, String str, byte[] bArr, o oVar, boolean z4) {
        if (!z4) {
            a aVar = new a(4, null);
            aVar.a(i4, str, bArr);
            w.a().a(aVar);
            return true;
        }
        return a(i4, str, bArr, (o) null);
    }

    public final Map<String, byte[]> a(int i4, o oVar, boolean z4) {
        return a(i4, (o) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i4, String str, byte[] bArr, o oVar) {
        try {
            r rVar = new r();
            rVar.f62686a = i4;
            rVar.f62691f = str;
            rVar.f62690e = System.currentTimeMillis();
            rVar.f62692g = bArr;
            return b(rVar);
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, byte[]> a(int i4, o oVar) {
        HashMap hashMap = null;
        try {
            List<r> c5 = c(i4);
            if (c5 != null) {
                HashMap hashMap2 = new HashMap();
                try {
                    for (r rVar : c5) {
                        byte[] bArr = rVar.f62692g;
                        if (bArr != null) {
                            hashMap2.put(rVar.f62691f, bArr);
                        }
                    }
                    return hashMap2;
                } catch (Throwable th) {
                    th = th;
                    hashMap = hashMap2;
                    if (x.a(th)) {
                        return hashMap;
                    }
                    th.printStackTrace();
                    return hashMap;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean a(r rVar) {
        ContentValues c5;
        if (rVar == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase == null || (c5 = c(rVar)) == null) {
                return false;
            }
            long replace = writableDatabase.replace("t_lr", "_id", c5);
            if (replace >= 0) {
                x.c("[Database] insert %s success.", "t_lr");
                rVar.f62686a = replace;
                return true;
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                return false;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:14:0x0031, B:30:0x0099, B:39:0x00ad, B:35:0x00a2, B:37:0x00a8), top: B:51:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[Catch: all -> 0x00ba, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:14:0x0031, B:30:0x0099, B:39:0x00ad, B:35:0x00a2, B:37:0x00a8), top: B:51:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.tencent.bugly.proguard.r> a(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.tencent.bugly.proguard.q r0 = com.tencent.bugly.proguard.p.f62662b     // Catch: java.lang.Throwable -> Lba
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> Lba
            r9 = 0
            if (r0 == 0) goto Lb8
            if (r12 < 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "_tp = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            r1.append(r12)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            r4 = r12
            goto L21
        L1c:
            r12 = move-exception
            r0 = r9
            goto La2
        L20:
            r4 = r9
        L21:
            java.lang.String r2 = "t_lr"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c
            if (r12 != 0) goto L36
            if (r12 == 0) goto L34
            r12.close()     // Catch: java.lang.Throwable -> Lba
        L34:
            monitor-exit(r11)
            return r9
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9e
            r2.<init>()     // Catch: java.lang.Throwable -> L9e
        L40:
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> L9e
            r4 = 0
            if (r3 == 0) goto L71
            com.tencent.bugly.proguard.r r3 = a(r12)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L51
            r2.add(r3)     // Catch: java.lang.Throwable -> L9e
            goto L40
        L51:
            java.lang.String r3 = "_id"
            int r3 = r12.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L69
            long r5 = r12.getLong(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = " or _id"
            r1.append(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = " = "
            r1.append(r3)     // Catch: java.lang.Throwable -> L69
            r1.append(r5)     // Catch: java.lang.Throwable -> L69
            goto L40
        L69:
            java.lang.String r3 = "[Database] unknown id."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9e
            com.tencent.bugly.proguard.x.d(r3, r4)     // Catch: java.lang.Throwable -> L9e
            goto L40
        L71:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L9e
            if (r3 <= 0) goto L99
            r3 = 4
            java.lang.String r1 = r1.substring(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "t_lr"
            int r0 = r0.delete(r3, r1, r9)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "[Database] deleted %s illegal data %d"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "t_lr"
            r3[r4] = r5     // Catch: java.lang.Throwable -> L9e
            r4 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            r3[r4] = r0     // Catch: java.lang.Throwable -> L9e
            com.tencent.bugly.proguard.x.d(r1, r3)     // Catch: java.lang.Throwable -> L9e
        L99:
            r12.close()     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r11)
            return r2
        L9e:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        La2:
            boolean r1 = com.tencent.bugly.proguard.x.a(r12)     // Catch: java.lang.Throwable -> Lb1
            if (r1 != 0) goto Lab
            r12.printStackTrace()     // Catch: java.lang.Throwable -> Lb1
        Lab:
            if (r0 == 0) goto Lb8
            r0.close()     // Catch: java.lang.Throwable -> Lba
            goto Lb8
        Lb1:
            r12 = move-exception
            if (r0 == 0) goto Lb7
            r0.close()     // Catch: java.lang.Throwable -> Lba
        Lb7:
            throw r12     // Catch: java.lang.Throwable -> Lba
        Lb8:
            monitor-exit(r11)
            return r9
        Lba:
            r12 = move-exception
            monitor-exit(r11)
            goto Lbe
        Lbd:
            throw r12
        Lbe:
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(int):java.util.List");
    }

    public final synchronized void a(List<r> list) {
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
                if (writableDatabase != null) {
                    StringBuilder sb = new StringBuilder();
                    for (r rVar : list) {
                        sb.append(" or _id");
                        sb.append(" = ");
                        sb.append(rVar.f62686a);
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        sb2 = sb2.substring(4);
                    }
                    sb.setLength(0);
                    x.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", sb2, null)));
                }
            }
        }
    }

    private static r a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            r rVar = new r();
            rVar.f62686a = cursor.getLong(cursor.getColumnIndex("_id"));
            rVar.f62687b = cursor.getInt(cursor.getColumnIndex(bq.f63522e));
            rVar.f62688c = cursor.getString(cursor.getColumnIndex("_pc"));
            rVar.f62689d = cursor.getString(cursor.getColumnIndex("_th"));
            rVar.f62690e = cursor.getLong(cursor.getColumnIndex("_tm"));
            rVar.f62692g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return rVar;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(int i4, String str, o oVar) {
        boolean z4;
        String str2;
        z4 = false;
        try {
            SQLiteDatabase writableDatabase = f62662b.getWritableDatabase();
            if (writableDatabase != null) {
                if (z.a(str)) {
                    str2 = "_id = " + i4;
                } else {
                    str2 = "_id = " + i4 + " and _tp = \"" + str + m.a.f71493g;
                }
                int delete = writableDatabase.delete("t_pf", str2, null);
                x.c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(delete));
                if (delete > 0) {
                    z4 = true;
                }
            }
        } catch (Throwable th) {
            try {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z4;
    }
}
