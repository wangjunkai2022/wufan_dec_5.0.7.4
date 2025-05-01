package q.rorbin.badgeview;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: Badge.java */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: Badge.java */
    /* renamed from: q.rorbin.badgeview.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0806a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f73154a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f73155b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f73156c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f73157d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f73158e = 5;

        void a(int i4, a aVar, View view);
    }

    float a(boolean z4);

    boolean b();

    a c(View view);

    float d(boolean z4);

    a e(String str);

    float f(boolean z4);

    a g(int i4);

    Drawable getBadgeBackground();

    int getBadgeBackgroundColor();

    int getBadgeGravity();

    int getBadgeNumber();

    String getBadgeText();

    int getBadgeTextColor();

    PointF getDragCenter();

    View getTargetView();

    boolean h();

    void hide(boolean z4);

    a i(InterfaceC0806a interfaceC0806a);

    float j(boolean z4);

    boolean k();

    a l(int i4);

    a m(float f5, boolean z4);

    a n(int i4, float f5, boolean z4);

    a o(int i4);

    a p(Drawable drawable);

    a q(int i4);

    a r(float f5, float f6, boolean z4);

    a s(boolean z4);

    a t(boolean z4);

    a u(float f5, boolean z4);

    a v(float f5, boolean z4);

    a w(Drawable drawable, boolean z4);
}
