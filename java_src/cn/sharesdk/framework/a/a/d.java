package cn.sharesdk.framework.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import cn.sharesdk.framework.utils.SSDKLog;
import java.util.ArrayList;
/* compiled from: MessageUtils.java */
/* loaded from: classes2.dex */
public class d {
    public static synchronized long a(String str, long j4) {
        synchronized (d.class) {
            if (str != null) {
                if (str.trim() != "") {
                    b a5 = b.a();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("post_time", Long.valueOf(j4));
                    contentValues.put("message_data", str);
                    return a5.a("message", contentValues);
                }
            }
            return -1L;
        }
    }

    public static synchronized long a(ArrayList<String> arrayList) {
        synchronized (d.class) {
            if (arrayList == null) {
                return 0L;
            }
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                sb.append("'");
                sb.append(arrayList.get(i4));
                sb.append("'");
                sb.append(",");
            }
            String substring = sb.toString().substring(0, sb.length() - 1);
            b a5 = b.a();
            int a6 = a5.a("message", "_id in ( " + substring + " )", null);
            SSDKLog.b().c("delete COUNT == %s", Integer.valueOf(a6));
            return a6;
        }
    }

    private static synchronized ArrayList<c> a(String str, String[] strArr) {
        ArrayList<c> arrayList;
        synchronized (d.class) {
            arrayList = new ArrayList<>();
            c cVar = new c();
            StringBuilder sb = new StringBuilder();
            Cursor a5 = b.a().a("message", new String[]{"_id", "post_time", "message_data"}, str, strArr, null);
            while (a5 != null && a5.moveToNext()) {
                cVar.f861b.add(a5.getString(0));
                if (cVar.f861b.size() == 100) {
                    sb.append(a5.getString(2));
                    cVar.f860a = sb.toString();
                    arrayList.add(cVar);
                    cVar = new c();
                    sb = new StringBuilder();
                } else {
                    sb.append(a5.getString(2) + "\n");
                }
            }
            a5.close();
            if (cVar.f861b.size() != 0) {
                cVar.f860a = sb.toString().substring(0, sb.length() - 1);
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static synchronized ArrayList<c> a() {
        synchronized (d.class) {
            if (b.a().a("message") > 0) {
                return a((String) null, (String[]) null);
            }
            return new ArrayList<>();
        }
    }
}
