package com.beizi.fusion.sm.a.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VivoImpl.java */
/* loaded from: classes2.dex */
public class p implements com.beizi.fusion.sm.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7109a;

    public p(Context context) {
        this.f7109a = context;
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return com.beizi.fusion.sm.a.g.a("persist.sys.identifierid.supported", "0").equals("1");
    }

    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (this.f7109a == null || cVar == null) {
            return;
        }
        try {
            Cursor query = this.f7109a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
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
