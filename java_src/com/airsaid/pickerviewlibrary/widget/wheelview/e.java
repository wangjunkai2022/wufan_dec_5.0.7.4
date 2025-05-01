package com.airsaid.pickerviewlibrary.widget.wheelview;

import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmoothScrollTimerTask.java */
/* loaded from: classes2.dex */
public final class e extends TimerTask {

    /* renamed from: b  reason: collision with root package name */
    int f4505b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    int f4506c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f4507d;

    /* renamed from: e  reason: collision with root package name */
    final WheelView f4508e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(WheelView wheelView, int i4) {
        this.f4508e = wheelView;
        this.f4507d = i4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f4505b == Integer.MAX_VALUE) {
            this.f4505b = this.f4507d;
        }
        int i4 = this.f4505b;
        int i5 = (int) (i4 * 0.1f);
        this.f4506c = i5;
        if (i5 == 0) {
            if (i4 < 0) {
                this.f4506c = -1;
            } else {
                this.f4506c = 1;
            }
        }
        if (Math.abs(i4) <= 1) {
            this.f4508e.a();
            this.f4508e.f4472c.sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f4508e;
        wheelView.f4493x += this.f4506c;
        if (!wheelView.f4489t) {
            float f5 = wheelView.f4485p;
            float f6 = (-wheelView.f4494y) * f5;
            WheelView wheelView2 = this.f4508e;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView2.f4494y) * f5;
            int i6 = wheelView2.f4493x;
            if (i6 <= f6 || i6 >= itemsCount) {
                wheelView2.f4493x = i6 - this.f4506c;
                wheelView2.a();
                this.f4508e.f4472c.sendEmptyMessage(3000);
                return;
            }
        }
        this.f4508e.f4472c.sendEmptyMessage(1000);
        this.f4505b -= this.f4506c;
    }
}
