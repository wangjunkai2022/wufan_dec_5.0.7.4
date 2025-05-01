package com.beizi.fusion.e.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.beizi.fusion.e.a.b;
/* compiled from: MeizuDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f6781a;

    public e(Context context) {
        this.f6781a = context;
    }

    public void a(b.a aVar) {
        try {
            this.f6781a.getPackageManager().getPackageInfo("com.meizu.flyme.openidsdk", 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            Cursor query = this.f6781a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            String a5 = a(query);
            if (aVar != null) {
                aVar.a(a5);
            }
            query.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        String string = columnIndex > 0 ? cursor.getString(columnIndex) : null;
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 > 0) {
            cursor.getInt(columnIndex2);
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 > 0) {
            cursor.getLong(columnIndex3);
        }
        return string;
    }
}
