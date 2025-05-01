package com.airsaid.pickerviewlibrary.widget.wheelview;

import java.util.TimerTask;
/* compiled from: InertiaTimerTask.java */
/* loaded from: classes2.dex */
final class a extends TimerTask {

    /* renamed from: b  reason: collision with root package name */
    float f4496b = 2.14748365E9f;

    /* renamed from: c  reason: collision with root package name */
    final float f4497c;

    /* renamed from: d  reason: collision with root package name */
    final WheelView f4498d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(WheelView wheelView, float f5) {
        this.f4498d = wheelView;
        this.f4497c = f5;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f4496b == 2.14748365E9f) {
            if (Math.abs(this.f4497c) > 2000.0f) {
                if (this.f4497c > 0.0f) {
                    this.f4496b = 2000.0f;
                } else {
                    this.f4496b = -2000.0f;
                }
            } else {
                this.f4496b = this.f4497c;
            }
        }
        if (Math.abs(this.f4496b) >= 0.0f && Math.abs(this.f4496b) <= 20.0f) {
            this.f4498d.a();
            this.f4498d.f4472c.sendEmptyMessage(2000);
            return;
        }
        int i4 = (int) ((this.f4496b * 10.0f) / 1000.0f);
        WheelView wheelView = this.f4498d;
        wheelView.f4493x -= i4;
        if (!wheelView.f4489t) {
            float f5 = wheelView.f4485p;
            float f6 = (-wheelView.f4494y) * f5;
            WheelView wheelView2 = this.f4498d;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView2.f4494y) * f5;
            int i5 = wheelView2.f4493x;
            double d5 = i5;
            double d6 = f5;
            Double.isNaN(d6);
            double d7 = d6 * 0.3d;
            Double.isNaN(d5);
            if (d5 - d7 < f6) {
                f6 = i4 + i5;
            } else {
                double d8 = i5;
                Double.isNaN(d8);
                if (d8 + d7 > itemsCount) {
                    itemsCount = i4 + i5;
                }
            }
            if (i5 <= f6) {
                this.f4496b = 40.0f;
                wheelView2.f4493x = (int) f6;
            } else if (i5 >= itemsCount) {
                wheelView2.f4493x = (int) itemsCount;
                this.f4496b = -40.0f;
            }
        }
        float f7 = this.f4496b;
        if (f7 < 0.0f) {
            this.f4496b = f7 + 20.0f;
        } else {
            this.f4496b = f7 - 20.0f;
        }
        this.f4498d.f4472c.sendEmptyMessage(1000);
    }
}
