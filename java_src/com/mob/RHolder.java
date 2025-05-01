package com.mob;

import com.mob.tools.proguard.PublicMemberKeeper;
@Deprecated
/* loaded from: classes5.dex */
public class RHolder implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static RHolder f56017a;

    /* renamed from: b  reason: collision with root package name */
    private int f56018b;

    /* renamed from: c  reason: collision with root package name */
    private int f56019c;

    /* renamed from: d  reason: collision with root package name */
    private int f56020d;

    private RHolder() {
    }

    public static RHolder getInstance() {
        if (f56017a == null) {
            synchronized (RHolder.class) {
                if (f56017a == null) {
                    f56017a = new RHolder();
                }
            }
        }
        return f56017a;
    }

    public int getActivityThemeId() {
        return this.f56018b;
    }

    public int getDialogLayoutId() {
        return this.f56019c;
    }

    public int getDialogThemeId() {
        return this.f56020d;
    }

    public RHolder setActivityThemeId(int i4) {
        this.f56018b = i4;
        return f56017a;
    }

    public RHolder setDialogLayoutId(int i4) {
        this.f56019c = i4;
        return f56017a;
    }

    public RHolder setDialogThemeId(int i4) {
        this.f56020d = i4;
        return f56017a;
    }
}
