package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
/* compiled from: EventBlackList.java */
/* loaded from: classes6.dex */
public class a extends EventList {

    /* renamed from: a  reason: collision with root package name */
    private d f63268a;

    /* renamed from: b  reason: collision with root package name */
    private Object f63269b;

    public a(String str, String str2) {
        super(str, str2);
        this.f63269b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f63269b) {
            this.f63268a = null;
            this.f63268a = new d(false, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean a5;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f63269b) {
            if (this.f63268a == null) {
                this.f63268a = new d(false, this.mEventList);
            }
            a5 = this.f63268a.a(str);
        }
        return a5;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z4) {
        AnalyticsConfig.CLEAR_EKV_BL = z4;
    }
}
