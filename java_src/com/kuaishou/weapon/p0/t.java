package com.kuaishou.weapon.p0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class t {
    private static t E = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f55682a = "k";

    /* renamed from: b  reason: collision with root package name */
    public static final String f55683b = "p";

    /* renamed from: c  reason: collision with root package name */
    public static final String f55684c = "v";

    /* renamed from: d  reason: collision with root package name */
    public static final String f55685d = "l";

    /* renamed from: e  reason: collision with root package name */
    public static final String f55686e = "i";

    /* renamed from: f  reason: collision with root package name */
    public static final String f55687f = "a";

    /* renamed from: g  reason: collision with root package name */
    public static final String f55688g = "s";

    /* renamed from: h  reason: collision with root package name */
    public static final String f55689h = "n";

    /* renamed from: i  reason: collision with root package name */
    public static final String f55690i = "u";

    /* renamed from: j  reason: collision with root package name */
    public static final String f55691j = "c";

    /* renamed from: k  reason: collision with root package name */
    public static final String f55692k = "r";

    /* renamed from: l  reason: collision with root package name */
    public static final String f55693l = "b";

    /* renamed from: m  reason: collision with root package name */
    public static final String f55694m = "m";

    /* renamed from: n  reason: collision with root package name */
    public static final String f55695n = "el";

    /* renamed from: o  reason: collision with root package name */
    public static final String f55696o = "ail";

    /* renamed from: p  reason: collision with root package name */
    public static final String f55697p = "aps";

    /* renamed from: q  reason: collision with root package name */
    public static final String f55698q = "dp";

    /* renamed from: r  reason: collision with root package name */
    public static final String f55699r = "pcn";

    /* renamed from: s  reason: collision with root package name */
    public static final String f55700s = "pst";

    /* renamed from: t  reason: collision with root package name */
    public static final String f55701t = "d";

    /* renamed from: u  reason: collision with root package name */
    public static final String f55702u = "at";

    /* renamed from: v  reason: collision with root package name */
    public static final String f55703v = "dm";

    /* renamed from: w  reason: collision with root package name */
    public static final String f55704w = "rm";

    /* renamed from: x  reason: collision with root package name */
    public static final String f55705x = "pc";

    /* renamed from: y  reason: collision with root package name */
    public static final String f55706y = "cbl";
    private a B;
    private SQLiteDatabase C;
    private Context D;

    /* renamed from: z  reason: collision with root package name */
    private int f55707z = 1;
    private String A = "create table wp(k INTEGER PRIMARY KEY ON CONFLICT ABORT,p TEXT UNIQUE ON CONFLICT ABORT,v TEXT,n INTEGER,s INTEGER,i INTEGER,u INTEGER,el INTEGER,c INTEGER,r INTEGER,aps INTEGER,dp TEXT,pcn TEXT,b TEXT,m TEXT,ail BLOB,pst INTEGER,d INTEGER,at INTEGER,dm TEXT,rm INTEGER,l TEXT,pc INTEGER DEFAULT -1,a TEXT,cbl INTEGER)";

    /* loaded from: classes5.dex */
    class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, bi.f55323p, (SQLiteDatabase.CursorFactory) null, t.this.f55707z);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(t.this.A);
            } catch (Throwable unused) {
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            if (i4 >= 3 || i5 < 3) {
                return;
            }
            try {
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE wp ADD COLUMN pc INTEGER  DEFAULT -1");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                }
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused2) {
            }
        }
    }

    private t(Context context) {
        this.D = context.getApplicationContext();
        this.B = new a(context.getApplicationContext());
        try {
            if (context.getFilesDir().getParentFile().exists()) {
                this.C = this.B.getWritableDatabase();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "n"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "wp"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r11)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            if (r11 == 0) goto L35
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L33
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L33
            r1 = r0
            goto L35
        L33:
            goto L42
        L35:
            if (r11 == 0) goto L4b
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4b
        L3d:
            r11.close()
            goto L4b
        L41:
            r11 = 0
        L42:
            if (r11 == 0) goto L4b
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4b
            goto L3d
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.c(int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "s"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "wp"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L44
            r5.append(r11)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L44
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L38
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L38
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L36
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L36
            r2 = 1
            if (r0 != r2) goto L38
            r1 = 1
            goto L38
        L36:
            goto L45
        L38:
            if (r11 == 0) goto L4e
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4e
        L40:
            r11.close()
            goto L4e
        L44:
            r11 = 0
        L45:
            if (r11 == 0) goto L4e
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4e
            goto L40
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.d(int):boolean");
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (E == null) {
                E = new t(context);
            }
            tVar = E;
        }
        return tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r10.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r10.isClosed() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r10) {
        /*
            r9 = this;
            java.lang.String r1 = "wp"
            r8 = 0
            android.database.sqlite.SQLiteDatabase r0 = r9.C     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "p"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            r3.append(r10)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            if (r10 == 0) goto L2e
            int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L2c
            if (r0 <= 0) goto L2e
            r0 = 1
            r8 = 1
            goto L2e
        L2c:
            goto L3b
        L2e:
            if (r10 == 0) goto L44
            boolean r0 = r10.isClosed()
            if (r0 != 0) goto L44
        L36:
            r10.close()
            goto L44
        L3a:
            r10 = 0
        L3b:
            if (r10 == 0) goto L44
            boolean r0 = r10.isClosed()
            if (r0 != 0) goto L44
            goto L36
        L44:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.b(int):boolean");
    }

    public long a(s sVar) {
        long j4 = 0;
        if (sVar == null) {
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(f55689h, Integer.valueOf(sVar.f55658b));
        contentValues.put(f55697p, Integer.valueOf(sVar.f55672p));
        contentValues.put("p", sVar.f55659c);
        contentValues.put("a", sVar.f55661e);
        contentValues.put(f55685d, sVar.f55664h);
        contentValues.put("v", sVar.f55660d);
        contentValues.put(f55698q, sVar.f55670n);
        contentValues.put("a", sVar.f55661e);
        contentValues.put(f55699r, sVar.f55671o);
        contentValues.put(f55700s, Long.valueOf(sVar.f55675s));
        contentValues.put(f55704w, Integer.valueOf(sVar.f55679w));
        contentValues.put(f55702u, Integer.valueOf(sVar.f55673q));
        contentValues.put(f55705x, Integer.valueOf(sVar.f55680x));
        contentValues.put(f55706y, Integer.valueOf(sVar.f55681y ? 1 : 0));
        if (!TextUtils.isEmpty(sVar.f55666j)) {
            contentValues.put(f55703v, sVar.f55666j);
        }
        try {
            if (b(sVar.f55657a)) {
                j4 = this.C.update(bi.f55324q, contentValues, "k=" + sVar.f55657a, null);
            } else {
                contentValues.put(f55682a, Integer.valueOf(sVar.f55657a));
                j4 = this.C.insert(bi.f55324q, null, contentValues);
            }
        } catch (Throwable unused) {
        }
        return j4;
    }

    public void b() {
        ArrayList<s> arrayList = new ArrayList();
        for (s sVar : a()) {
            if (!dn.a(sVar.f55661e)) {
                arrayList.add(sVar);
            }
        }
        try {
            r a5 = r.a();
            for (s sVar2 : arrayList) {
                if (a5 != null) {
                    a5.a(sVar2.f55661e);
                }
                SQLiteDatabase sQLiteDatabase = this.C;
                sQLiteDatabase.delete(bi.f55324q, "k=" + sVar2.f55657a, null);
                List<Integer> list = r.f55649b;
                if (list != null && !list.contains(Integer.valueOf(sVar2.f55657a))) {
                    dn.c(this.D.getFilesDir().getCanonicalPath() + bi.f55317j + sVar2.f55657a);
                }
                if (a5.b() != null && a5.b().get(sVar2.f55659c) != null) {
                    dn.c(this.D.getFileStreamPath(sVar2.f55659c).getAbsolutePath());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f55689h, (Integer) 0);
        try {
            this.C.update(bi.f55324q, contentValues, "n=-1", null);
        } catch (Throwable unused) {
        }
    }

    public void d() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("u", (Integer) 0);
        try {
            this.C.update(bi.f55324q, contentValues, "u=1", null);
        } catch (Throwable unused) {
        }
    }

    public void c(int i4, int i5) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(f55705x, Integer.valueOf(i5));
            SQLiteDatabase sQLiteDatabase = this.C;
            sQLiteDatabase.update(bi.f55324q, contentValues, "k=" + i4, null);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
        if (r1.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
        if (r1.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.kuaishou.weapon.p0.s> a() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r9.C     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "wp"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto La4
        L15:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto La4
            com.kuaishou.weapon.p0.s r2 = new com.kuaishou.weapon.p0.s     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "k"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55657a = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "p"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55659c = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "a"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55661e = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "l"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55664h = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "v"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55660d = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "pst"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55675s = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "d"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55676t = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "rm"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55679w = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "pc"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.f55680x = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "cbl"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r4 = 1
            if (r3 != r4) goto L9a
            goto L9b
        L9a:
            r4 = 0
        L9b:
            r2.f55681y = r4     // Catch: java.lang.Throwable -> La2
            r0.add(r2)     // Catch: java.lang.Throwable -> La2
            goto L15
        La2:
            goto Lae
        La4:
            if (r1 == 0) goto Lb9
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto Lb9
            goto Lb6
        Lad:
            r1 = 0
        Lae:
            if (r1 == 0) goto Lb9
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto Lb9
        Lb6:
            r1.close()
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.a():java.util.List");
    }

    public void b(int i4, int i5) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(f55689h, Integer.valueOf(i5));
            SQLiteDatabase sQLiteDatabase = this.C;
            sQLiteDatabase.update(bi.f55324q, contentValues, "k=" + i4, null);
        } catch (Throwable unused) {
        }
    }

    public s b(String str) {
        s sVar;
        Cursor cursor = null;
        r1 = null;
        s sVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean z4 = true;
            Cursor query = this.C.query(bi.f55324q, null, "p=?", new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        sVar = new s();
                        try {
                            sVar.f55657a = query.getInt(query.getColumnIndex(f55682a));
                            sVar.f55658b = query.getInt(query.getColumnIndex(f55689h));
                            sVar.f55659c = query.getString(query.getColumnIndex("p"));
                            sVar.f55661e = query.getString(query.getColumnIndex("a"));
                            sVar.f55664h = query.getString(query.getColumnIndex(f55685d));
                            sVar.f55660d = query.getString(query.getColumnIndex("v"));
                            sVar.f55670n = query.getString(query.getColumnIndex(f55698q));
                            sVar.f55672p = query.getInt(query.getColumnIndex(f55697p));
                            sVar.f55671o = query.getString(query.getColumnIndex(f55699r));
                            sVar.f55673q = query.getInt(query.getColumnIndex(f55702u));
                            sVar.f55675s = query.getLong(query.getColumnIndex(f55700s));
                            sVar.f55676t = query.getInt(query.getColumnIndex(f55701t));
                            sVar.f55679w = query.getInt(query.getColumnIndex(f55704w));
                            sVar.f55666j = query.getString(query.getColumnIndex(f55703v));
                            sVar.f55680x = query.getInt(query.getColumnIndex(f55705x));
                            if (query.getInt(query.getColumnIndex(f55706y)) != 1) {
                                z4 = false;
                            }
                            sVar.f55681y = z4;
                            sVar2 = sVar;
                        } catch (Throwable unused) {
                            cursor = query;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return sVar;
                        }
                    }
                } catch (Throwable unused2) {
                    sVar = null;
                }
            }
            if (query == null || query.isClosed()) {
                return sVar2;
            }
            query.close();
            return sVar2;
        } catch (Throwable unused3) {
            sVar = null;
        }
    }

    public s a(int i4) {
        s sVar;
        Cursor cursor = null;
        r0 = null;
        s sVar2 = null;
        try {
            Cursor query = this.C.query(bi.f55324q, null, "k=" + i4, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        sVar = new s();
                        try {
                            sVar.f55657a = i4;
                            sVar.f55658b = query.getInt(query.getColumnIndex(f55689h));
                            sVar.f55659c = query.getString(query.getColumnIndex("p"));
                            sVar.f55661e = query.getString(query.getColumnIndex("a"));
                            sVar.f55664h = query.getString(query.getColumnIndex(f55685d));
                            sVar.f55660d = query.getString(query.getColumnIndex("v"));
                            sVar.f55670n = query.getString(query.getColumnIndex(f55698q));
                            sVar.f55672p = query.getInt(query.getColumnIndex(f55697p));
                            sVar.f55671o = query.getString(query.getColumnIndex(f55699r));
                            sVar.f55673q = query.getInt(query.getColumnIndex(f55702u));
                            sVar.f55675s = query.getLong(query.getColumnIndex(f55700s));
                            sVar.f55676t = query.getInt(query.getColumnIndex(f55701t));
                            sVar.f55679w = query.getInt(query.getColumnIndex(f55704w));
                            sVar.f55666j = query.getString(query.getColumnIndex(f55703v));
                            sVar.f55680x = query.getInt(query.getColumnIndex(f55705x));
                            boolean z4 = true;
                            if (query.getInt(query.getColumnIndex(f55706y)) != 1) {
                                z4 = false;
                            }
                            sVar.f55681y = z4;
                            sVar2 = sVar;
                        } catch (Throwable unused) {
                            cursor = query;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return sVar;
                        }
                    }
                } catch (Throwable unused2) {
                    sVar = null;
                }
            }
            if (query == null || query.isClosed()) {
                return sVar2;
            }
            query.close();
            return sVar2;
        } catch (Throwable unused3) {
            sVar = null;
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.C.delete(bi.f55324q, "p=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public int a(int i4, int i5) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("u", Integer.valueOf(i5));
            SQLiteDatabase sQLiteDatabase = this.C;
            return sQLiteDatabase.update(bi.f55324q, contentValues, "k=" + i4, null);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
