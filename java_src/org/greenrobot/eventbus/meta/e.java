package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.ThreadMode;
/* compiled from: SubscriberMethodInfo.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    final String f72389a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f72390b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f72391c;

    /* renamed from: d  reason: collision with root package name */
    final int f72392d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f72393e;

    public e(String str, Class<?> cls, ThreadMode threadMode, int i4, boolean z4) {
        this.f72389a = str;
        this.f72390b = threadMode;
        this.f72391c = cls;
        this.f72392d = i4;
        this.f72393e = z4;
    }

    public e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }
}
