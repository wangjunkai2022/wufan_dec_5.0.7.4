package com.wufun.union.ad.gdt;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.util.AdError;
import com.wufun.union.ad.AdChannel;
import com.wufun.union.ad.AdService;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ChannelGDT.java */
/* loaded from: classes6.dex */
public class a extends AdChannel {

    /* renamed from: k  reason: collision with root package name */
    public static final int f65623k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65624l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65625m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65626n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65627o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65628p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65629q = 6;

    /* renamed from: r  reason: collision with root package name */
    public static final int f65630r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f65631s = 8;

    /* renamed from: j  reason: collision with root package name */
    RewardVideoAD f65632j;

    /* compiled from: ChannelGDT.java */
    /* renamed from: com.wufun.union.ad.gdt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0688a implements RewardVideoADListener {
        C0688a() {
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADClick() {
            a.this.i(5, Boolean.TRUE, "");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADClose() {
            a.this.i(6, Boolean.TRUE, "");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADExpose() {
            a.this.i(3, Boolean.TRUE, "");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADLoad() {
            a.this.i(1, Boolean.TRUE, "");
            ((AdChannel) a.this).f65576a = true;
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADShow() {
            a.this.i(2, Boolean.TRUE, "");
            Context context = ((AdChannel) a.this).f65580e;
            String str = ((AdChannel) a.this).f65584i;
            AdService.i(context, str, "smallExpAdSDK", ((AdChannel) a.this).f65582g + "");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onError(AdError adError) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (adError != null) {
                    jSONObject.putOpt("code", Integer.valueOf(adError.getErrorCode()));
                    jSONObject.putOpt("msg", adError.getErrorMsg());
                }
                a.this.i(8, Boolean.TRUE, jSONObject.toString());
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onReward(Map<String, Object> map) {
            a.this.i(7, Boolean.TRUE, map.get("transId") + "");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onVideoCached() {
            ((AdChannel) a.this).f65576a = true;
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onVideoComplete() {
            a.this.i(4, Boolean.TRUE, "");
            Context context = ((AdChannel) a.this).f65580e;
            String str = ((AdChannel) a.this).f65584i;
            AdService.i(context, str, "smallVideoDoneAdSDK", ((AdChannel) a.this).f65582g + "");
        }
    }

    public a() {
        this.f65578c = AdChannel.Type.GDT;
    }

    @Override // com.wufun.union.ad.AdChannel
    public void d(Context context, String str) {
        this.f65580e = context;
        try {
            GDTAdSdk.init(context, str);
            GlobalSetting.setChannel(1);
            GlobalSetting.setEnableMediationTool(true);
            this.f65577b = true;
            i(0, Boolean.TRUE, "");
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f65577b = false;
            i(0, Boolean.FALSE, "");
        }
    }

    @Override // com.wufun.union.ad.AdChannel
    public void h(String str, float f5, float f6) {
        if (TextUtils.isEmpty(str)) {
            i(1, Boolean.FALSE, "ad code id is must not null");
            return;
        }
        this.f65583h = str;
        this.f65632j = new RewardVideoAD(this.f65580e, str, new C0688a());
        this.f65632j.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().build());
        this.f65632j.loadAD();
    }

    @Override // com.wufun.union.ad.AdChannel
    public void m(Activity activity) {
        this.f65632j.showAD(activity);
        this.f65576a = false;
        if (!this.f65581f || TextUtils.isEmpty(this.f65583h)) {
            return;
        }
        g(this.f65583h);
    }
}
