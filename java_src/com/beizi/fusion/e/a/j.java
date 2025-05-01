package com.beizi.fusion.e.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
/* compiled from: VivoDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: b  reason: collision with root package name */
    private Context f6800b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6801c = false;

    /* renamed from: a  reason: collision with root package name */
    String f6799a = null;

    public j(Context context) {
        this.f6800b = context;
    }

    public String a() {
        Cursor query = this.f6800b.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
        if (query != null) {
            r1 = query.moveToNext() ? query.getString(query.getColumnIndex("value")) : null;
            query.close();
        }
        return r1;
    }
}
