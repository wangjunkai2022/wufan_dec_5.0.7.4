package com.ta.utdid2.core.persistent;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.ta.utdid2.android.utils.i;
import com.ta.utdid2.core.persistent.b;
import java.io.File;
import java.util.Map;
/* loaded from: classes5.dex */
public class c {

    /* renamed from: m  reason: collision with root package name */
    private static final String f62069m = "t";

    /* renamed from: n  reason: collision with root package name */
    private static final String f62070n = "t2";

    /* renamed from: a  reason: collision with root package name */
    private String f62071a;

    /* renamed from: b  reason: collision with root package name */
    private String f62072b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62073c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62074d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62075e;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f62076f;

    /* renamed from: g  reason: collision with root package name */
    private b f62077g;

    /* renamed from: h  reason: collision with root package name */
    private SharedPreferences.Editor f62078h = null;

    /* renamed from: i  reason: collision with root package name */
    private b.a f62079i = null;

    /* renamed from: j  reason: collision with root package name */
    private Context f62080j;

    /* renamed from: k  reason: collision with root package name */
    private d f62081k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f62082l;

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017b A[Catch: Exception -> 0x0185, TRY_LEAVE, TryCatch #3 {Exception -> 0x0185, blocks: (B:81:0x0177, B:83:0x017b), top: B:94:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.core.persistent.c.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private boolean a() {
        b bVar = this.f62077g;
        if (bVar != null) {
            boolean a5 = bVar.a();
            if (!a5) {
                c();
            }
            return a5;
        }
        return false;
    }

    private void d(b bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit;
        if (bVar == null || sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.clear();
        for (Map.Entry<String, ?> entry : bVar.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(key, (String) value);
            } else if (value instanceof Integer) {
                edit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        edit.commit();
    }

    private void e(SharedPreferences sharedPreferences, b bVar) {
        b.a edit;
        if (sharedPreferences == null || bVar == null || (edit = bVar.edit()) == null) {
            return;
        }
        edit.clear();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(key, (String) value);
            } else if (value instanceof Integer) {
                edit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        edit.commit();
    }

    private File k(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    private d m(String str) {
        File k4 = k(str);
        if (k4 != null) {
            d dVar = new d(k4.getAbsolutePath());
            this.f62081k = dVar;
            return dVar;
        }
        return null;
    }

    private void n() {
        b bVar;
        SharedPreferences sharedPreferences;
        if (this.f62078h == null && (sharedPreferences = this.f62076f) != null) {
            this.f62078h = sharedPreferences.edit();
        }
        if (this.f62075e && this.f62079i == null && (bVar = this.f62077g) != null) {
            this.f62079i = bVar.edit();
        }
        a();
    }

    public void b() {
        n();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.clear();
            this.f62078h.putLong("t", currentTimeMillis);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.clear();
            this.f62079i.putLong("t", currentTimeMillis);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(4:3|(1:7)|8|(9:10|11|(1:15)|16|17|18|19|(4:21|(2:23|(2:25|(3:27|(1:29)(1:31)|30))(2:32|(1:36)))|37|(3:43|44|(1:46)))|49))|54|11|(2:13|15)|16|17|18|19|(0)|49) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r6.f62078h
            r3 = 0
            if (r2 == 0) goto L20
            boolean r4 = r6.f62082l
            if (r4 != 0) goto L16
            android.content.SharedPreferences r4 = r6.f62076f
            if (r4 == 0) goto L16
            java.lang.String r4 = "t"
            r2.putLong(r4, r0)
        L16:
            android.content.SharedPreferences$Editor r0 = r6.f62078h
            boolean r0 = r0.commit()
            if (r0 != 0) goto L20
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            android.content.SharedPreferences r1 = r6.f62076f
            if (r1 == 0) goto L31
            android.content.Context r1 = r6.f62080j
            if (r1 == 0) goto L31
            java.lang.String r2 = r6.f62071a
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r6.f62076f = r1
        L31:
            r1 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L37
            goto L3b
        L37:
            r2 = move-exception
            r2.printStackTrace()
        L3b:
            boolean r2 = com.ta.utdid2.android.utils.i.c(r1)
            if (r2 != 0) goto L9e
            java.lang.String r2 = "mounted"
            boolean r4 = r1.equals(r2)
            if (r4 == 0) goto L80
            com.ta.utdid2.core.persistent.b r4 = r6.f62077g
            if (r4 != 0) goto L75
            java.lang.String r4 = r6.f62072b
            com.ta.utdid2.core.persistent.d r4 = r6.m(r4)
            if (r4 == 0) goto L80
            java.lang.String r5 = r6.f62071a
            com.ta.utdid2.core.persistent.b r4 = r4.c(r5, r3)
            r6.f62077g = r4
            boolean r5 = r6.f62082l
            if (r5 != 0) goto L67
            android.content.SharedPreferences r5 = r6.f62076f
            r6.e(r5, r4)
            goto L6c
        L67:
            android.content.SharedPreferences r5 = r6.f62076f
            r6.d(r4, r5)
        L6c:
            com.ta.utdid2.core.persistent.b r4 = r6.f62077g
            com.ta.utdid2.core.persistent.b$a r4 = r4.edit()
            r6.f62079i = r4
            goto L80
        L75:
            com.ta.utdid2.core.persistent.b$a r4 = r6.f62079i
            if (r4 == 0) goto L80
            boolean r4 = r4.commit()
            if (r4 != 0) goto L80
            r0 = 0
        L80:
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L92
            java.lang.String r2 = "mounted_ro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L9e
            com.ta.utdid2.core.persistent.b r1 = r6.f62077g
            if (r1 == 0) goto L9e
        L92:
            com.ta.utdid2.core.persistent.d r1 = r6.f62081k     // Catch: java.lang.Exception -> L9e
            if (r1 == 0) goto L9e
            java.lang.String r2 = r6.f62071a     // Catch: java.lang.Exception -> L9e
            com.ta.utdid2.core.persistent.b r1 = r1.c(r2, r3)     // Catch: java.lang.Exception -> L9e
            r6.f62077g = r1     // Catch: java.lang.Exception -> L9e
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.core.persistent.c.c():boolean");
    }

    public Map<String, ?> f() {
        a();
        SharedPreferences sharedPreferences = this.f62076f;
        if (sharedPreferences != null) {
            return sharedPreferences.getAll();
        }
        b bVar = this.f62077g;
        if (bVar != null) {
            return bVar.getAll();
        }
        return null;
    }

    public boolean g(String str) {
        a();
        SharedPreferences sharedPreferences = this.f62076f;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, false);
        }
        b bVar = this.f62077g;
        if (bVar != null) {
            return bVar.getBoolean(str, false);
        }
        return false;
    }

    public float h(String str) {
        a();
        SharedPreferences sharedPreferences = this.f62076f;
        if (sharedPreferences != null) {
            return sharedPreferences.getFloat(str, 0.0f);
        }
        b bVar = this.f62077g;
        if (bVar != null) {
            return bVar.getFloat(str, 0.0f);
        }
        return 0.0f;
    }

    public int i(String str) {
        a();
        SharedPreferences sharedPreferences = this.f62076f;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        b bVar = this.f62077g;
        if (bVar != null) {
            return bVar.getInt(str, 0);
        }
        return 0;
    }

    public long j(String str) {
        a();
        SharedPreferences sharedPreferences = this.f62076f;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        b bVar = this.f62077g;
        if (bVar != null) {
            return bVar.getLong(str, 0L);
        }
        return 0L;
    }

    public String l(String str) {
        a();
        SharedPreferences sharedPreferences = this.f62076f;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!i.c(string)) {
                return string;
            }
        }
        b bVar = this.f62077g;
        return bVar != null ? bVar.getString(str, "") : "";
    }

    public void o(String str, boolean z4) {
        if (i.c(str) || str.equals("t")) {
            return;
        }
        n();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.putBoolean(str, z4);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.putBoolean(str, z4);
        }
    }

    public void p(String str, float f5) {
        if (i.c(str) || str.equals("t")) {
            return;
        }
        n();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.putFloat(str, f5);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.putFloat(str, f5);
        }
    }

    public void q(String str, int i4) {
        if (i.c(str) || str.equals("t")) {
            return;
        }
        n();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.putInt(str, i4);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.putInt(str, i4);
        }
    }

    public void r(String str, long j4) {
        if (i.c(str) || str.equals("t")) {
            return;
        }
        n();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.putLong(str, j4);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.putLong(str, j4);
        }
    }

    public void s(String str, String str2) {
        if (i.c(str) || str.equals("t")) {
            return;
        }
        n();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.putString(str, str2);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.putString(str, str2);
        }
    }

    public void t() {
        Context context;
        if (this.f62076f != null && (context = this.f62080j) != null) {
            this.f62076f = context.getSharedPreferences(this.f62071a, 0);
        }
        String str = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (i.c(str)) {
            return;
        }
        if (str.equals("mounted") || (str.equals("mounted_ro") && this.f62077g != null)) {
            try {
                d dVar = this.f62081k;
                if (dVar != null) {
                    this.f62077g = dVar.c(this.f62071a, 0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void u(String str) {
        if (i.c(str) || str.equals("t")) {
            return;
        }
        n();
        SharedPreferences.Editor editor = this.f62078h;
        if (editor != null) {
            editor.remove(str);
        }
        b.a aVar = this.f62079i;
        if (aVar != null) {
            aVar.remove(str);
        }
    }
}
