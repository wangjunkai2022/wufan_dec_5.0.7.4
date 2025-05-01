package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
/* compiled from: EventWhiteList.java */
/* loaded from: classes6.dex */
public class b extends EventList {

    /* renamed from: a  reason: collision with root package name */
    private d f63270a;

    /* renamed from: b  reason: collision with root package name */
    private Object f63271b;

    public b(String str, String str2) {
        super(str, str2);
        this.f63271b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f63271b) {
            this.f63270a = null;
            this.f63270a = new d(true, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean a5;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f63271b) {
            if (this.f63270a == null) {
                this.f63270a = new d(true, this.mEventList);
            }
            a5 = this.f63270a.a(str);
        }
        return a5;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z4) {
        AnalyticsConfig.CLEAR_EKV_WL = z4;
    }
}
