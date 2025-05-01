package com.efs.sdk.base.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.a.a;
import com.efs.sdk.base.core.util.d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.qq.e.comm.pi.ACTD;
import com.tencent.cos.common.COSHttpResponseKey;
import com.tencent.stat.DeviceInfo;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class GlobalInfo {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f10336a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f10336a.put(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object b(String str, Object obj) {
        Object obj2 = this.f10336a.get(str);
        return (obj2 != null || this.f10336a.containsKey(str)) ? obj2 : obj;
    }

    public Map<String, Object> getGlobalInfoMap() {
        HashMap hashMap = new HashMap(this.f10336a);
        a.a();
        hashMap.put(COSHttpResponseKey.Data.CTIME, Long.valueOf(a.b() / 1000));
        a.a();
        hashMap.put("w_tm", Long.valueOf(a.b() / 1000));
        return hashMap;
    }

    public List<AbsSection> getGlobalSectionList(String str) {
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection put = kVSection.put("type", str).put(ACTD.APPID_KEY, this.f10336a.get(ACTD.APPID_KEY)).put("wid", this.f10336a.get("wid")).put(ForumPostsTagSelectActivity_.f30896z, this.f10336a.get(ForumPostsTagSelectActivity_.f30896z)).put("pkg", this.f10336a.get("pkg")).put(DeviceInfo.TAG_VERSION, this.f10336a.get(DeviceInfo.TAG_VERSION)).put("vcode", this.f10336a.get("vcode")).put("ps", this.f10336a.get("ps")).put("stime", this.f10336a.get("stime"));
        a.a();
        KVSection put2 = put.put(COSHttpResponseKey.Data.CTIME, Long.valueOf(a.b() / 1000));
        a.a();
        put2.put("w_tm", Long.valueOf(a.b() / 1000)).put("sdk_ver", this.f10336a.get("sdk_ver"));
        String valueOf = String.valueOf(b("uid", ""));
        if (!TextUtils.isEmpty(valueOf)) {
            kVSection.put("uid", valueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", this.f10336a.get("lang")).put("brand", this.f10336a.get("brand")).put("model", this.f10336a.get("model")).put("build_model", this.f10336a.get("build_model")).put("rom", this.f10336a.get("rom")).put(com.umeng.ccg.a.f64025r, this.f10336a.get(com.umeng.ccg.a.f64025r)).put("dsp_h", this.f10336a.get("dsp_h")).put("dsp_w", this.f10336a.get("dsp_w")).put("tzone", this.f10336a.get("tzone")).put("net", this.f10336a.get("net")).put("fr", this.f10336a.get("fr"));
        try {
            if (this.f10336a.containsKey(UMCrash.KEY_HEADER_ACCESS)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS, this.f10336a.get(UMCrash.KEY_HEADER_ACCESS));
            }
            if (this.f10336a.containsKey(UMCrash.KEY_HEADER_ACCESS_SUBTYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, this.f10336a.get(UMCrash.KEY_HEADER_ACCESS_SUBTYPE));
            }
            if (this.f10336a.containsKey(UMCrash.KEY_HEADER_NETWORK_TYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_NETWORK_TYPE, this.f10336a.get(UMCrash.KEY_HEADER_NETWORK_TYPE));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        arrayList.add(kVSection2);
        return arrayList;
    }

    public String getUUID(Context context) {
        String valueOf = String.valueOf(b("wid", ""));
        if (TextUtils.isEmpty(valueOf)) {
            String a5 = d.a(context);
            a("wid", a5);
            return a5;
        }
        return valueOf;
    }
}
