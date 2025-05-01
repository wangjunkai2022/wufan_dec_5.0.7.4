package com.umeng.analytics.pro;

import android.text.TextUtils;
/* compiled from: TimePeriodItem.java */
/* loaded from: classes6.dex */
public class ak {

    /* renamed from: a  reason: collision with root package name */
    private String f63307a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f63311e = false;

    /* renamed from: d  reason: collision with root package name */
    private int f63310d = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f63309c = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f63308b = -1;

    public ak(String str) {
        this.f63307a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a();
    }

    private void a() {
        try {
            if (this.f63307a.contains("-")) {
                String[] split = this.f63307a.split("-");
                if (split.length == 2) {
                    this.f63308b = Integer.valueOf(split[0]).intValue();
                    int intValue = Integer.valueOf(split[1]).intValue();
                    this.f63309c = intValue;
                    if (this.f63308b < 1) {
                        this.f63308b = 1;
                    }
                    if (intValue > 24) {
                        this.f63309c = 24;
                    }
                }
                this.f63311e = true;
                return;
            }
            this.f63310d = Integer.valueOf(this.f63307a).intValue();
            this.f63311e = false;
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i4) {
        int i5;
        if (this.f63311e) {
            int i6 = this.f63308b;
            if (i6 != -1 && (i5 = this.f63309c) != -1 && i4 >= i6 && i4 <= i5) {
                return true;
            }
        } else {
            int i7 = this.f63310d;
            if (i7 != -1 && i4 == i7) {
                return true;
            }
        }
        return false;
    }
}
