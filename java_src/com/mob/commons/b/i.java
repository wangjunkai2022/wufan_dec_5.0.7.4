package com.mob.commons.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class i extends h {

    /* renamed from: c  reason: collision with root package name */
    private a f56223c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f56224d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f56226a;

        /* renamed from: b  reason: collision with root package name */
        private long f56227b;

        /* renamed from: c  reason: collision with root package name */
        private String f56228c;

        public a(String str) {
            this.f56226a = str;
        }

        public void a(long j4) {
            this.f56227b = j4;
        }

        public void a(String str) {
            this.f56228c = str;
        }

        public boolean a() {
            return this.f56227b > System.currentTimeMillis();
        }
    }

    public i(Context context) {
        super(context);
        this.f56223c = new a(com.mob.commons.a.l.a("004Cel4eEejed"));
    }

    private void e() {
        try {
            if (this.f56224d == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.mob.commons.a.l.a("044d4elegemegHg^ejheehemfgWh+fdegMg]emelUkgf6ejedemgefegdffhifheihihmhjfheiffgmeifeglgefhjehj"));
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.mob.commons.b.i.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        String stringExtra;
                        ArrayList<String> stringArrayListExtra;
                        if (context == null || intent == null) {
                            return;
                        }
                        try {
                            boolean z4 = false;
                            if (intent.getIntExtra(com.mob.commons.a.l.a("016Qel]kgfDffedfhelWj[ejfgfdhd=he@fk"), 0) == 2 && (stringArrayListExtra = intent.getStringArrayListExtra(com.mob.commons.a.l.a("017+el^kgf;ffedhm_ed_fi e7fkRgZgfejgjJj"))) != null) {
                                z4 = stringArrayListExtra.contains(context.getPackageName());
                            }
                            if (z4 && (stringExtra = intent.getStringExtra(com.mob.commons.a.l.a("0108el1kgfSffedgdfd1kg"))) != null && stringExtra.equals(com.mob.commons.a.l.a("004IelVeYejed"))) {
                                i.this.f56223c.a(0L);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                };
                this.f56224d = broadcastReceiver;
                if (Build.VERSION.SDK_INT < 33) {
                    this.f56214a.registerReceiver(broadcastReceiver, intentFilter, com.mob.commons.a.l.a("048d2elegemegHgIejheehemfgNh6fdeg+g2emel8kgf6ejedem(kgNekegejgjgjejelSfOemhihmhjfheiffgmeifeglgefhjehj"), null);
                } else {
                    this.f56214a.registerReceiver(broadcastReceiver, intentFilter, com.mob.commons.a.l.a("048dSelegemeg1gCejheehemfg.hYfdeg>gVemelMkgf=ejedemNkgEekegejgjgjejelLfQemhihmhjfheiffgmeifeglgefhjehj"), null, 4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.mob.commons.b.h
    public synchronized String d() {
        Context context = this.f56214a;
        if (context == null) {
            return null;
        }
        return a(context.getApplicationContext(), this.f56223c, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r9 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r9 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(android.content.Context r9, com.mob.commons.b.i.a r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            if (r11 != 0) goto L11
            boolean r1 = r10.a()
            if (r1 == 0) goto L11
            java.lang.String r9 = com.mob.commons.b.i.a.a(r10)
            return r9
        L11:
            java.lang.String r1 = "036d9elHfjgfjlmmdAelegemeg>g_ejheehemfg%h;fdeg(g;emelMkgf<ejedgjedfiEm"
            java.lang.String r1 = com.mob.commons.a.l.a(r1)
            android.net.Uri r3 = android.net.Uri.parse(r1)
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L82
            r4 = 0
            r5 = 0
            r9 = 1
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L82
            r9 = 0
            java.lang.String r1 = com.mob.commons.b.i.a.b(r10)     // Catch: java.lang.Throwable -> L82
            r6[r9] = r1     // Catch: java.lang.Throwable -> L82
            r7 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L7c
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "005>eeHehTeh!g"
            java.lang.String r1 = com.mob.commons.a.l.a(r1)     // Catch: java.lang.Throwable -> L7a
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L7a
            if (r1 < 0) goto L49
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L7a
            r10.a(r1)     // Catch: java.lang.Throwable -> L7a
            goto L4a
        L49:
            r1 = r0
        L4a:
            if (r11 != 0) goto L76
            java.lang.String r11 = "007g(fjZkRejek*g ed"
            java.lang.String r11 = com.mob.commons.a.l.a(r11)     // Catch: java.lang.Throwable -> L7a
            int r11 = r9.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L7a
            if (r11 < 0) goto L5f
            long r2 = r9.getLong(r11)     // Catch: java.lang.Throwable -> L7a
            r10.a(r2)     // Catch: java.lang.Throwable -> L7a
        L5f:
            java.lang.String r10 = "004dVeled(g"
            java.lang.String r10 = com.mob.commons.a.l.a(r10)     // Catch: java.lang.Throwable -> L7a
            int r10 = r9.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L7a
            if (r10 < 0) goto L76
            int r10 = r9.getInt(r10)     // Catch: java.lang.Throwable -> L7a
            r11 = 1000(0x3e8, float:1.401E-42)
            if (r10 == r11) goto L76
            r8.e()     // Catch: java.lang.Throwable -> L7a
        L76:
            r9.close()     // Catch: java.lang.Throwable -> L79
        L79:
            return r1
        L7a:
            r10 = move-exception
            goto L84
        L7c:
            if (r9 == 0) goto L8e
        L7e:
            r9.close()     // Catch: java.lang.Throwable -> L8e
            goto L8e
        L82:
            r10 = move-exception
            r9 = r0
        L84:
            com.mob.tools.log.NLog r11 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L8f
            r11.d(r10)     // Catch: java.lang.Throwable -> L8f
            if (r9 == 0) goto L8e
            goto L7e
        L8e:
            return r0
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            r9.close()     // Catch: java.lang.Throwable -> L95
        L95:
            goto L97
        L96:
            throw r10
        L97:
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.i.a(android.content.Context, com.mob.commons.b.i$a, boolean):java.lang.String");
    }
}
