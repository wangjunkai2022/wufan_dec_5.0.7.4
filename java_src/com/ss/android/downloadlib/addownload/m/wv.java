package com.ss.android.downloadlib.addownload.m;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class wv {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static wv vv = new wv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences p() {
        return b.getContext().getSharedPreferences("sp_ad_download_event", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ConcurrentHashMap<Long, com.ss.android.downloadad.api.vv.m> m() {
        ConcurrentHashMap<Long, com.ss.android.downloadad.api.vv.m> concurrentHashMap = new ConcurrentHashMap<>();
        Map<String, ?> all = p().getAll();
        if (all == null) {
            return concurrentHashMap;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    long longValue = Long.valueOf(entry.getKey()).longValue();
                    com.ss.android.downloadad.api.vv.m m4 = com.ss.android.downloadad.api.vv.m.m(new JSONObject(String.valueOf(entry.getValue())));
                    if (longValue > 0 && m4 != null) {
                        concurrentHashMap.put(Long.valueOf(longValue), m4);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        return concurrentHashMap;
    }

    private wv() {
    }

    public static wv vv() {
        return vv.vv;
    }

    public void vv(com.ss.android.downloadad.api.vv.m mVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar);
        vv((Collection<com.ss.android.downloadad.api.vv.m>) arrayList);
    }

    public synchronized void vv(final Collection<com.ss.android.downloadad.api.vv.m> collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.addownload.m.wv.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SharedPreferences.Editor edit = wv.this.p().edit();
                        for (com.ss.android.downloadad.api.vv.m mVar : collection) {
                            if (mVar != null && mVar.m() != 0) {
                                edit.putString(String.valueOf(mVar.m()), mVar.uw().toString());
                            }
                        }
                        edit.apply();
                    }
                }, true);
            }
        }
    }

    public void vv(final List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.addownload.m.wv.2
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor edit = wv.this.p().edit();
                for (String str : list) {
                    edit.remove(str);
                }
                edit.apply();
            }
        }, true);
    }
}
