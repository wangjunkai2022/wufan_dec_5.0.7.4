package com.tencent.stat;

import android.database.Cursor;
import com.tencent.stat.common.StatLogger;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f63025a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(n nVar) {
        this.f63025a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        w wVar;
        Cursor cursor = null;
        try {
            wVar = this.f63025a.f63012d;
            cursor = wVar.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                int i4 = cursor.getInt(0);
                String string = cursor.getString(1);
                String string2 = cursor.getString(2);
                int i5 = cursor.getInt(3);
                b bVar = new b(i4);
                bVar.f62923a = i4;
                bVar.f62924b = new JSONObject(string);
                bVar.f62925c = string2;
                bVar.f62926d = i5;
                StatConfig.a(bVar);
            }
        } catch (Throwable th) {
            try {
                statLogger = n.f63007e;
                statLogger.e(th);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }
}
