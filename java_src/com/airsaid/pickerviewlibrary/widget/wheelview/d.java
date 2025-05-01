package com.airsaid.pickerviewlibrary.widget.wheelview;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnItemSelectedRunnable.java */
/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final WheelView f4504b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(WheelView wheelView) {
        this.f4504b = wheelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WheelView wheelView = this.f4504b;
        wheelView.f4474e.a(wheelView.getCurrentItem());
    }
}
