package com.mob.commons.b;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.mob.commons.C0811r;
import com.mob.commons.b.h;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
/* loaded from: classes5.dex */
public class p extends h {

    /* renamed from: c  reason: collision with root package name */
    private a f56233c;

    /* renamed from: d  reason: collision with root package name */
    private String f56234d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        private int f56235a;

        /* renamed from: b  reason: collision with root package name */
        private p f56236b;

        public a(p pVar, int i4) {
            super(null);
            this.f56235a = i4;
            this.f56236b = pVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            p pVar = this.f56236b;
            if (pVar != null) {
                pVar.a(z4, this.f56235a);
            }
        }
    }

    public p(Context context) {
        super(context);
        this.f56233c = null;
        this.f56234d = "100215079";
        if (!TextUtils.isEmpty(C0811r.f56465j)) {
            this.f56234d = C0811r.f56465j;
        }
        NLog mobLog = MobLog.getInstance();
        mobLog.d("oamt vivo appid: " + this.f56234d, new Object[0]);
    }

    private void c(int i4) {
        if (i4 == 0 && this.f56233c == null) {
            this.f56233c = new a(this, 0);
            this.f56214a.getContentResolver().registerContentObserver(Uri.parse(b(0)), true, this.f56233c);
        }
    }

    @Override // com.mob.commons.b.h
    protected h.b b() {
        h.b bVar = new h.b();
        bVar.f56222a = a(0);
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.b(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L42
            android.content.Context r0 = r8.f56214a     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L39
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L39
            java.lang.String r2 = "005$ff)fiBfi]h"
            java.lang.String r2 = com.mob.commons.l.a(r2)     // Catch: java.lang.Throwable -> L37
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L37
            r0.close()     // Catch: java.lang.Throwable -> L33
        L33:
            r8.c(r9)     // Catch: java.lang.Throwable -> L36
        L36:
            return r1
        L37:
            r2 = move-exception
            goto L44
        L39:
            if (r0 == 0) goto L3e
        L3b:
            r0.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            r8.c(r9)     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L42:
            r2 = move-exception
            r0 = r1
        L44:
            com.mob.tools.log.NLog r3 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L4f
            r3.d(r2)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L3e
            goto L3b
        L4e:
            return r1
        L4f:
            r1 = move-exception
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.lang.Throwable -> L55
        L55:
            r8.c(r9)     // Catch: java.lang.Throwable -> L58
        L58:
            goto L5a
        L59:
            throw r1
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.p.a(int):java.lang.String");
    }

    private String b(int i4) {
        if (i4 == 0) {
            return com.mob.commons.l.a("051eBfm,gkhgkmnneIfmfhfnfffkfffmfnfffhhkfnggfeinflfmfffkfe:h^fl2n3ggfe=hgk)fkghfk@h!flggfe4n1ijhfgghn");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z4, int i4) {
        try {
            String a5 = a(i4);
            if (i4 == 0) {
                a(a5);
            }
        } catch (Throwable unused) {
        }
    }
}
