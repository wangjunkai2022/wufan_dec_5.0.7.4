package com.ss.android.downloadlib.addownload.vv;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        b.getContext().getSharedPreferences(str, 0).edit().putString(str2, "").apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.m.vv> vv(String str, String str2) {
        CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.m.vv> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String string = b.getContext().getSharedPreferences(str, 0).getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    com.ss.android.downloadlib.addownload.m.vv vv = com.ss.android.downloadlib.addownload.m.vv.vv(jSONObject.optJSONObject(keys.next()));
                    if (vv != null) {
                        copyOnWriteArrayList.add(vv);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(String str, String str2, CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.m.vv> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<com.ss.android.downloadlib.addownload.m.vv> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                com.ss.android.downloadlib.addownload.m.vv next = it2.next();
                if (next != null) {
                    jSONObject.put(String.valueOf(next.f60524m), next.vv());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        b.getContext().getSharedPreferences(str, 0).edit().putString(str2, jSONObject.toString()).apply();
    }
}
