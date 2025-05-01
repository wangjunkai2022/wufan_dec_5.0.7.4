package com.ss.android.downloadlib.addownload.m;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u {

    /* renamed from: i  reason: collision with root package name */
    private final ConcurrentHashMap<Long, DownloadController> f60519i;

    /* renamed from: m  reason: collision with root package name */
    private final ConcurrentHashMap<Long, DownloadModel> f60520m;

    /* renamed from: o  reason: collision with root package name */
    private final ConcurrentHashMap<Long, com.ss.android.downloadad.api.vv.m> f60521o;

    /* renamed from: p  reason: collision with root package name */
    private final ConcurrentHashMap<Long, DownloadEventConfig> f60522p;
    private volatile boolean vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static u vv = new u();
    }

    public com.ss.android.downloadad.api.vv.m i(long j4) {
        return this.f60521o.get(Long.valueOf(j4));
    }

    @NonNull
    public o o(long j4) {
        o oVar = new o();
        oVar.vv = j4;
        oVar.f60510m = vv(j4);
        DownloadEventConfig m4 = m(j4);
        oVar.f60512p = m4;
        if (m4 == null) {
            oVar.f60512p = new com.ss.android.download.api.download.p();
        }
        DownloadController p4 = p(j4);
        oVar.f60509i = p4;
        if (p4 == null) {
            oVar.f60509i = new com.ss.android.download.api.download.m();
        }
        return oVar;
    }

    public DownloadController p(long j4) {
        return this.f60519i.get(Long.valueOf(j4));
    }

    public void u(long j4) {
        this.f60520m.remove(Long.valueOf(j4));
        this.f60522p.remove(Long.valueOf(j4));
        this.f60519i.remove(Long.valueOf(j4));
    }

    private u() {
        this.vv = false;
        this.f60520m = new ConcurrentHashMap<>();
        this.f60522p = new ConcurrentHashMap<>();
        this.f60519i = new ConcurrentHashMap<>();
        this.f60521o = new ConcurrentHashMap<>();
    }

    public void m() {
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.addownload.m.u.1
            @Override // java.lang.Runnable
            public void run() {
                if (u.this.vv) {
                    return;
                }
                synchronized (u.class) {
                    if (!u.this.vv) {
                        u.this.f60521o.putAll(wv.vv().m());
                        u.this.vv = true;
                    }
                }
            }
        }, true);
    }

    public ConcurrentHashMap<Long, com.ss.android.downloadad.api.vv.m> p() {
        return this.f60521o;
    }

    public static u vv() {
        return vv.vv;
    }

    public DownloadEventConfig m(long j4) {
        return this.f60522p.get(Long.valueOf(j4));
    }

    public com.ss.android.downloadad.api.vv.m m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.ss.android.downloadad.api.vv.m mVar : this.f60521o.values()) {
            if (mVar != null && str.equals(mVar.vv())) {
                return mVar;
            }
        }
        return null;
    }

    public void vv(DownloadModel downloadModel) {
        if (downloadModel != null) {
            this.f60520m.put(Long.valueOf(downloadModel.getId()), downloadModel);
            if (downloadModel.getDeepLink() != null) {
                downloadModel.getDeepLink().setId(downloadModel.getId());
                downloadModel.getDeepLink().setPackageName(downloadModel.getPackageName());
            }
        }
    }

    public void m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        for (DownloadModel downloadModel : this.f60520m.values()) {
            if ((downloadModel instanceof AdDownloadModel) && TextUtils.equals(downloadModel.getDownloadUrl(), str)) {
                ((AdDownloadModel) downloadModel).setPackageName(str2);
            }
        }
    }

    public void vv(long j4, DownloadEventConfig downloadEventConfig) {
        if (downloadEventConfig != null) {
            this.f60522p.put(Long.valueOf(j4), downloadEventConfig);
        }
    }

    public void vv(long j4, DownloadController downloadController) {
        if (downloadController != null) {
            this.f60519i.put(Long.valueOf(j4), downloadController);
        }
    }

    public synchronized void vv(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return;
        }
        this.f60521o.put(Long.valueOf(mVar.m()), mVar);
        wv.vv().vv(mVar);
    }

    public DownloadModel vv(long j4) {
        return this.f60520m.get(Long.valueOf(j4));
    }

    public com.ss.android.downloadad.api.vv.m vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.ss.android.downloadad.api.vv.m mVar : this.f60521o.values()) {
            if (mVar != null && str.equals(mVar.o())) {
                return mVar;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.vv.m vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        for (com.ss.android.downloadad.api.vv.m mVar : this.f60521o.values()) {
            if (mVar != null && mVar.la() == downloadInfo.getId()) {
                return mVar;
            }
        }
        if (!TextUtils.isEmpty(downloadInfo.getExtra())) {
            try {
                long vv2 = jh.vv(new JSONObject(downloadInfo.getExtra()), "extra");
                if (vv2 != 0) {
                    for (com.ss.android.downloadad.api.vv.m mVar2 : this.f60521o.values()) {
                        if (mVar2 != null && mVar2.m() == vv2) {
                            return mVar2;
                        }
                    }
                    com.ss.android.downloadlib.o.p.vv().vv("getNativeModelByInfo");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        for (com.ss.android.downloadad.api.vv.m mVar3 : this.f60521o.values()) {
            if (mVar3 != null && TextUtils.equals(mVar3.vv(), downloadInfo.getUrl())) {
                return mVar3;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.vv.m vv(int i4) {
        for (com.ss.android.downloadad.api.vv.m mVar : this.f60521o.values()) {
            if (mVar != null && mVar.la() == i4) {
                return mVar;
            }
        }
        return null;
    }

    @NonNull
    public Map<Long, com.ss.android.downloadad.api.vv.m> vv(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (com.ss.android.downloadad.api.vv.m mVar : this.f60521o.values()) {
                if (mVar != null && TextUtils.equals(mVar.vv(), str)) {
                    mVar.m(str2);
                    hashMap.put(Long.valueOf(mVar.m()), mVar);
                }
            }
        }
        return hashMap;
    }

    public synchronized void vv(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        for (Long l4 : list) {
            long longValue = l4.longValue();
            arrayList.add(String.valueOf(longValue));
            this.f60521o.remove(Long.valueOf(longValue));
        }
        wv.vv().vv((List<String>) arrayList);
    }
}
