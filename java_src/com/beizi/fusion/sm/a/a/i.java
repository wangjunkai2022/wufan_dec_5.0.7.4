package com.beizi.fusion.sm.a.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Objects;
/* compiled from: MeizuImpl.java */
/* loaded from: classes2.dex */
class i implements com.beizi.fusion.sm.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7096a;

    public i(Context context) {
        this.f7096a = context;
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        Context context = this.f7096a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null;
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
            return false;
        }
    }

    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (this.f7096a == null || cVar == null) {
            return;
        }
        try {
            Cursor query = this.f7096a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            Objects.requireNonNull(query);
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("value"));
            if (string != null && string.length() != 0) {
                com.beizi.fusion.sm.a.f.a("OAID query success: " + string);
                cVar.a(string);
                query.close();
                return;
            }
            throw new com.beizi.fusion.sm.a.e("OAID query failed");
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
            cVar.a(e5);
        }
    }
}
