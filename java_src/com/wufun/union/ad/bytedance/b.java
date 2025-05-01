package com.wufun.union.ad.bytedance;

import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
/* compiled from: RewardBundleModel.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f65616a;

    /* renamed from: b  reason: collision with root package name */
    private String f65617b;

    /* renamed from: c  reason: collision with root package name */
    private String f65618c;

    /* renamed from: d  reason: collision with root package name */
    private int f65619d;

    /* renamed from: e  reason: collision with root package name */
    private float f65620e;

    public b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f65616a = bundle.getInt(TTRewardVideoAd.REWARD_EXTRA_KEY_ERROR_CODE);
        this.f65617b = bundle.getString(TTRewardVideoAd.REWARD_EXTRA_KEY_ERROR_MSG);
        this.f65618c = bundle.getString(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_NAME);
        this.f65619d = bundle.getInt(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_AMOUNT);
        this.f65620e = bundle.getFloat(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_PROPOSE);
    }

    public int a() {
        return this.f65619d;
    }

    public String b() {
        return this.f65618c;
    }

    public float c() {
        return this.f65620e;
    }

    public int d() {
        return this.f65616a;
    }

    public String e() {
        return this.f65617b;
    }
}
