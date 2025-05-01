package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.qq.e.ads.nativ.NativeUnifiedADAppInfoImpl;
import com.ss.android.download.api.config.g;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.downloadlib.n.p;
import com.umeng.analytics.pro.bm;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.regex.Pattern;
import m.a;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class m {
    private SoftReference<Activity> vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static m vv = new m();
    }

    public void m(long j4) {
        com.ss.android.downloadlib.addownload.o vv2 = com.ss.android.downloadlib.n.vv().vv(com.ss.android.downloadlib.addownload.m.u.vv().o(j4).f60510m.getDownloadUrl());
        if (vv2 != null) {
            vv2.vv(true, true);
            return;
        }
        n.vv(11, j4);
        com.ss.android.downloadlib.o.p.vv().m("startDownload handler null");
    }

    private m() {
    }

    public static m vv() {
        return vv.vv;
    }

    public void vv(long j4) {
        TTDelegateActivity.vv(j4);
    }

    public boolean vv(DownloadModel downloadModel) {
        if (downloadModel.isAd() && b.wv().optInt("ad_lp_show_app_dialog") != 0) {
            String webUrl = downloadModel.getDeepLink() == null ? null : downloadModel.getDeepLink().getWebUrl();
            return (TextUtils.isEmpty(webUrl) || Pattern.compile(b.wv().optString("ad_allow_web_url_regex", ".+(www.chengzijianzhan.com|www.toutiaopage.com/tetris/page|ad.toutiao.com/tetris/page).+")).matcher(webUrl).matches()) ? false : true;
        }
        return false;
    }

    public Activity m() {
        Activity activity = this.vv.get();
        this.vv = null;
        return activity;
    }

    public boolean vv(@NonNull com.ss.android.downloadlib.addownload.m.o oVar) {
        long j4;
        long j5;
        if (!TextUtils.isEmpty(oVar.f60510m.getLogExtra())) {
            try {
                j4 = jh.vv(new JSONObject(oVar.f60510m.getLogExtra()), "convert_id");
            } catch (Exception e5) {
                e5.printStackTrace();
                j4 = 0;
            }
            if (j4 <= 0) {
                n.vv(3, oVar);
            }
            j5 = j4;
        } else {
            n.vv(9, oVar);
            com.ss.android.downloadlib.o.p.vv().vv("requestAppInfo getLogExtra null");
            j5 = 0;
        }
        final long j6 = oVar.vv;
        com.ss.android.downloadlib.addownload.m.m vv2 = p.vv().vv(j5, j6);
        if (vv2 != null) {
            i.vv().vv(vv2.vv(), j6, vv2.f60501i);
            vv(vv2.vv());
            n.vv("lp_app_dialog_try_show", oVar);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if (j5 > 0) {
            sb.append("convert_id=");
            sb.append(j5);
        }
        if (!TextUtils.isEmpty(oVar.f60510m.getPackageName())) {
            if (sb.length() > 0) {
                sb.append(a.f71490d);
            }
            sb.append("package_name=");
            sb.append(oVar.f60510m.getPackageName());
        }
        if (sb.length() <= 0) {
            n.vv(6, oVar);
            return false;
        }
        final long j7 = j5;
        com.ss.android.downloadlib.n.p.vv((p.vv<String, R>) new p.vv<String, Boolean>() { // from class: com.ss.android.downloadlib.addownload.compliance.m.2
            @Override // com.ss.android.downloadlib.n.p.vv
            public Boolean vv(String str) {
                final boolean[] zArr = {false};
                b.i().vv("GET", str, new HashMap(), new g() { // from class: com.ss.android.downloadlib.addownload.compliance.m.2.1
                    @Override // com.ss.android.download.api.config.g
                    public void vv(String str2) {
                        boolean[] zArr2 = zArr;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        zArr2[0] = m.this.vv(j7, j6, str2);
                    }

                    @Override // com.ss.android.download.api.config.g
                    public void vv(Throwable th) {
                        n.vv(2, j6);
                        zArr[0] = false;
                    }
                });
                return Boolean.valueOf(zArr[0]);
            }
        }, "https://apps.oceanengine.com/customer/api/app/pkg_info?" + sb.toString()).vv(new p.vv<Boolean, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.m.1
            @Override // com.ss.android.downloadlib.n.p.vv
            public Object vv(Boolean bool) {
                if (bool.booleanValue()) {
                    m.this.vv(com.ss.android.downloadlib.addownload.m.m.vv(j7, j6));
                    n.m("lp_app_dialog_try_show", j6);
                    return null;
                }
                m.this.m(j6);
                return null;
            }
        }).vv();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vv(long j4, long j5, String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("package");
            if (optJSONObject != null && optJSONObject.length() != 0) {
                com.ss.android.downloadlib.addownload.m.m mVar = new com.ss.android.downloadlib.addownload.m.m();
                mVar.vv = j4;
                mVar.f60502m = j5;
                mVar.f60501i = optJSONObject.optString("icon_url");
                mVar.f60504o = optJSONObject.optString("app_name");
                mVar.f60505p = optJSONObject.optString(bm.f63454o);
                mVar.f60506u = optJSONObject.optString(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME);
                mVar.f60503n = optJSONObject.optString("developer_name");
                mVar.wv = optJSONObject.optString("policy_url");
                JSONArray optJSONArray = optJSONObject.optJSONArray("permissions");
                if (optJSONArray != null) {
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        JSONObject jSONObject = (JSONObject) optJSONArray.get(i4);
                        mVar.qv.add(new Pair<>(jSONObject.optString("permission_name"), jSONObject.optString("permission_desc")));
                    }
                }
                p.vv().vv(mVar);
                i.vv().vv(mVar.vv(), j5, mVar.f60501i);
                return true;
            }
            n.vv(7, j5);
            return false;
        } catch (Exception e5) {
            com.ss.android.downloadlib.o.p.vv().vv(e5, "AdLpComplianceManager parseResponse");
            n.vv(7, j5);
            return false;
        }
    }

    public void vv(Activity activity) {
        this.vv = new SoftReference<>(activity);
    }
}
