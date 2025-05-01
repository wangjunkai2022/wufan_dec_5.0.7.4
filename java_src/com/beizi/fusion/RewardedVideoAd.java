package com.beizi.fusion;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.beizi.fusion.d.s;
/* loaded from: classes2.dex */
public class RewardedVideoAd {

    /* renamed from: a  reason: collision with root package name */
    private s f6494a;

    /* renamed from: b  reason: collision with root package name */
    private String f6495b;

    /* renamed from: c  reason: collision with root package name */
    private String f6496c;

    public RewardedVideoAd(Context context, String str, RewardedVideoAdListener rewardedVideoAdListener, long j4, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request RewardedVideoAd adUnitId:");
        sb.append(str);
        this.f6494a = new s(context, str, rewardedVideoAdListener, j4, i4);
    }

    public void destroy() {
        s sVar = this.f6494a;
        if (sVar != null) {
            sVar.D();
        }
    }

    public int getECPM() {
        s sVar = this.f6494a;
        if (sVar != null) {
            return sVar.C();
        }
        return -1;
    }

    public String getExtra() {
        return this.f6496c;
    }

    public String getUserId() {
        return this.f6495b;
    }

    public boolean isLoaded() {
        s sVar = this.f6494a;
        if (sVar != null) {
            return sVar.A();
        }
        return false;
    }

    public void loadAd() {
        s sVar = this.f6494a;
        if (sVar != null) {
            sVar.B();
        }
    }

    public void setExtra(String str) {
        s sVar = this.f6494a;
        if (sVar != null) {
            sVar.h(str);
        }
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        s sVar = this.f6494a;
        if (sVar != null) {
            sVar.a(rewardedVideoAdListener);
        }
    }

    public void setUserId(String str) {
        s sVar = this.f6494a;
        if (sVar != null) {
            sVar.g(str);
        }
    }

    public void showAd(@NonNull Activity activity) {
        s sVar = this.f6494a;
        if (sVar != null) {
            sVar.a(activity);
        }
    }
}
