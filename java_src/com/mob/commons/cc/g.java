package com.mob.commons.cc;

import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final SharePrefrenceHelper f56269a;

    public g(String str, int i4) {
        SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
        this.f56269a = sharePrefrenceHelper;
        sharePrefrenceHelper.open(str, i4);
    }

    public void a(String str, long j4) {
        this.f56269a.putLong(str, Long.valueOf(j4));
    }

    public long b(String str, long j4) {
        return this.f56269a.getLong(str, j4);
    }

    public void a(String str, int i4) {
        this.f56269a.putInt(str, Integer.valueOf(i4));
    }

    public int b(String str, int i4) {
        return this.f56269a.getInt(str, i4);
    }

    public void a(String str, boolean z4) {
        this.f56269a.putBoolean(str, Boolean.valueOf(z4));
    }

    public boolean b(String str, boolean z4) {
        return this.f56269a.getBoolean(str, z4);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.f56269a.remove(str);
        } else {
            this.f56269a.putString(str, str2);
        }
    }

    public String b(String str, String str2) {
        return this.f56269a.getString(str, str2);
    }

    public void a(String str, Object obj) {
        this.f56269a.put(str, obj);
    }

    public Object a(String str) {
        return this.f56269a.get(str);
    }
}
