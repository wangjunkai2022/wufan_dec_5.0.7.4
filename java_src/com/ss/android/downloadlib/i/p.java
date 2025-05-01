package com.ss.android.downloadlib.i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.ss.android.downloadlib.addownload.b;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: m  reason: collision with root package name */
    private static volatile p f60615m;
    private SQLiteDatabase vv;

    private p() {
        try {
            this.vv = new m(b.getContext()).getWritableDatabase();
        } catch (Throwable th) {
            com.ss.android.downloadlib.o.p.vv().vv(th, "ClickEventHelper");
        }
    }

    public static p vv() {
        if (f60615m == null) {
            synchronized (p.class) {
                if (f60615m == null) {
                    f60615m = new p();
                }
            }
        }
        return f60615m;
    }

    public boolean m() {
        return com.ss.android.socialbase.downloader.n.vv.p().vv("click_event_switch", 0) == 1;
    }

    public boolean p() {
        return com.ss.android.socialbase.downloader.n.vv.p().vv("click_event_switch", 0) == 2;
    }

    private void p(long j4, String str) {
        SQLiteDatabase sQLiteDatabase = this.vv;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j4 <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String optString = new JSONObject(str).optString("req_id");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            this.vv.delete("click_event", "time < ? AND ad_id = ? AND req_id = ?", new String[]{String.valueOf(System.currentTimeMillis() - 1209600000), String.valueOf(j4), optString});
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean m(long j4, String str) {
        SQLiteDatabase sQLiteDatabase = this.vv;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j4 <= 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                String optString = new JSONObject(str).optString("req_id");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                cursor = this.vv.query("click_event", m.vv, "time > ? AND ad_id = ? AND req_id = ?", new String[]{String.valueOf(System.currentTimeMillis() - 1209600000), String.valueOf(j4), optString}, null, null, null, null);
                boolean z4 = cursor.getCount() > 0;
                cursor.close();
                return z4;
            } catch (Exception e5) {
                e5.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void vv(long j4, String str) {
        String optString;
        SQLiteDatabase sQLiteDatabase = this.vv;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j4 <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            optString = new JSONObject(str).optString("req_id");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MediationConstant.EXTRA_ADID, Long.valueOf(j4));
        contentValues.put("req_id", optString);
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        this.vv.insert("click_event", null, contentValues);
        p(j4, str);
    }
}
