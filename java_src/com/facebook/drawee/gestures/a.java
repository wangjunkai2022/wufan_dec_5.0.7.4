package com.facebook.drawee.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.common.internal.VisibleForTesting;
import javax.annotation.Nullable;
/* compiled from: GestureDetector.java */
/* loaded from: classes.dex */
public class a {
    @VisibleForTesting
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    InterfaceC0261a f11359a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final float f11360b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    boolean f11361c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    boolean f11362d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    long f11363e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    float f11364f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    float f11365g;

    /* compiled from: GestureDetector.java */
    /* renamed from: com.facebook.drawee.gestures.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0261a {
        boolean onClick();
    }

    public a(Context context) {
        this.f11360b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f11359a = null;
        e();
    }

    public boolean b() {
        return this.f11361c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0261a interfaceC0261a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11361c = true;
            this.f11362d = true;
            this.f11363e = motionEvent.getEventTime();
            this.f11364f = motionEvent.getX();
            this.f11365g = motionEvent.getY();
        } else if (action == 1) {
            this.f11361c = false;
            if (Math.abs(motionEvent.getX() - this.f11364f) > this.f11360b || Math.abs(motionEvent.getY() - this.f11365g) > this.f11360b) {
                this.f11362d = false;
            }
            if (this.f11362d && motionEvent.getEventTime() - this.f11363e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0261a = this.f11359a) != null) {
                interfaceC0261a.onClick();
            }
            this.f11362d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f11361c = false;
                this.f11362d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f11364f) > this.f11360b || Math.abs(motionEvent.getY() - this.f11365g) > this.f11360b) {
            this.f11362d = false;
        }
        return true;
    }

    public void e() {
        this.f11361c = false;
        this.f11362d = false;
    }

    public void f(InterfaceC0261a interfaceC0261a) {
        this.f11359a = interfaceC0261a;
    }
}
