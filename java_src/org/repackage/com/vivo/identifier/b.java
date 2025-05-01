package org.repackage.com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
/* compiled from: DataBaseOperation.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f73014b = "VMS_SDK_DB";

    /* renamed from: c  reason: collision with root package name */
    private static final String f73015c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: d  reason: collision with root package name */
    private static final String f73016d = "content://com.vivo.abe.exidentifier/guid";

    /* renamed from: e  reason: collision with root package name */
    private static final String f73017e = "value";

    /* renamed from: f  reason: collision with root package name */
    private static final String f73018f = "OAID";

    /* renamed from: g  reason: collision with root package name */
    private static final String f73019g = "AAID";

    /* renamed from: h  reason: collision with root package name */
    private static final String f73020h = "VAID";

    /* renamed from: i  reason: collision with root package name */
    private static final String f73021i = "OAIDBLACK";

    /* renamed from: j  reason: collision with root package name */
    private static final String f73022j = "OAIDSTATUS";

    /* renamed from: k  reason: collision with root package name */
    private static final String f73023k = "STATISTICS";

    /* renamed from: l  reason: collision with root package name */
    private static final int f73024l = 0;

    /* renamed from: m  reason: collision with root package name */
    private static final int f73025m = 1;

    /* renamed from: n  reason: collision with root package name */
    private static final int f73026n = 2;

    /* renamed from: o  reason: collision with root package name */
    private static final int f73027o = 3;

    /* renamed from: p  reason: collision with root package name */
    private static final int f73028p = 4;

    /* renamed from: q  reason: collision with root package name */
    private static final int f73029q = 5;

    /* renamed from: r  reason: collision with root package name */
    private static final int f73030r = 6;

    /* renamed from: s  reason: collision with root package name */
    private static final int f73031s = 7;

    /* renamed from: t  reason: collision with root package name */
    private static final String f73032t = "UDID";

    /* renamed from: a  reason: collision with root package name */
    private Context f73033a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f73033a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r8 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L64
            r1 = 1
            if (r8 == r1) goto L4e
            r1 = 2
            if (r8 == r1) goto L38
            r1 = 3
            if (r8 == r1) goto L31
            r1 = 4
            if (r8 == r1) goto L1b
            r9 = 5
            if (r8 == r9) goto L14
            r2 = r0
            goto L6b
        L14:
            java.lang.String r8 = "content://com.vivo.abe.exidentifier/guid"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L6a
        L1b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L6a
        L31:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/UDID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L6a
        L38:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L6a
        L4e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L6a
        L64:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L6a:
            r2 = r8
        L6b:
            if (r2 != 0) goto L6e
            return r0
        L6e:
            android.content.Context r8 = r7.f73033a     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La0
            if (r8 == 0) goto L93
            boolean r9 = r8.moveToNext()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> La1
            if (r9 == 0) goto L93
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> La1
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> La1
            r0 = r9
            goto L93
        L90:
            r9 = move-exception
            r0 = r8
            goto L9a
        L93:
            if (r8 == 0) goto La4
        L95:
            r8.close()
            goto La4
        L99:
            r9 = move-exception
        L9a:
            if (r0 == 0) goto L9f
            r0.close()
        L9f:
            throw r9
        La0:
            r8 = r0
        La1:
            if (r8 == 0) goto La4
            goto L95
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.vivo.identifier.b.a(int, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i4, String str, String str2, String str3) {
        Uri parse;
        int delete;
        if (i4 != 6) {
            parse = null;
        } else {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        }
        if (parse == null) {
            return false;
        }
        try {
            delete = this.f73033a.getContentResolver().delete(parse, "packageName=? and uid=?", new String[]{str2, str3});
            StringBuilder sb = new StringBuilder();
            sb.append("delete:");
            sb.append(delete);
        } catch (Exception unused) {
        }
        return delete != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i4, String str, ContentValues[] contentValuesArr) {
        Uri parse;
        int bulkInsert;
        if (i4 == 6) {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        } else if (i4 != 7) {
            parse = null;
        } else {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_" + str);
        }
        if (parse == null) {
            return false;
        }
        try {
            bulkInsert = this.f73033a.getContentResolver().bulkInsert(parse, contentValuesArr);
            StringBuilder sb = new StringBuilder();
            sb.append("insert:");
            sb.append(bulkInsert);
        } catch (Exception unused) {
        }
        return bulkInsert != 0;
    }
}
