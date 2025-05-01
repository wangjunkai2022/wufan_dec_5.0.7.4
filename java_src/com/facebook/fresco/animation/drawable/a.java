package com.facebook.fresco.animation.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.e;
import javax.annotation.Nullable;
/* compiled from: AnimatedDrawable2.java */
/* loaded from: classes.dex */
public class a extends Drawable implements Animatable, i0.a {

    /* renamed from: p  reason: collision with root package name */
    private static final Class<?> f11451p = a.class;

    /* renamed from: q  reason: collision with root package name */
    private static final c f11452q = new d();

    /* renamed from: r  reason: collision with root package name */
    private static final int f11453r = 8;

    /* renamed from: s  reason: collision with root package name */
    private static final int f11454s = 0;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.fresco.animation.backend.a f11455b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.fresco.animation.frame.b f11456c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f11457d;

    /* renamed from: e  reason: collision with root package name */
    private long f11458e;

    /* renamed from: f  reason: collision with root package name */
    private long f11459f;

    /* renamed from: g  reason: collision with root package name */
    private long f11460g;

    /* renamed from: h  reason: collision with root package name */
    private int f11461h;

    /* renamed from: i  reason: collision with root package name */
    private long f11462i;

    /* renamed from: j  reason: collision with root package name */
    private long f11463j;

    /* renamed from: k  reason: collision with root package name */
    private int f11464k;

    /* renamed from: l  reason: collision with root package name */
    private volatile c f11465l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private volatile b f11466m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private e f11467n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f11468o;

    /* compiled from: AnimatedDrawable2.java */
    /* renamed from: com.facebook.fresco.animation.drawable.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0264a implements Runnable {
        RunnableC0264a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.unscheduleSelf(aVar.f11468o);
            a.this.invalidateSelf();
        }
    }

    /* compiled from: AnimatedDrawable2.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(a aVar, com.facebook.fresco.animation.frame.b bVar, int i4, boolean z4, boolean z5, long j4, long j5, long j6, long j7, long j8, long j9, long j10);
    }

    public a() {
        this(null);
    }

    @Nullable
    private static com.facebook.fresco.animation.frame.b b(@Nullable com.facebook.fresco.animation.backend.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new com.facebook.fresco.animation.frame.a(aVar);
    }

    private long l() {
        return SystemClock.uptimeMillis();
    }

    private void m() {
        this.f11464k++;
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.V(f11451p, "Dropped a frame. Count: %s", Integer.valueOf(this.f11464k));
        }
    }

    private void n(long j4) {
        long j5 = this.f11458e + j4;
        this.f11460g = j5;
        scheduleSelf(this.f11468o, j5);
    }

    @Nullable
    public com.facebook.fresco.animation.backend.a c() {
        return this.f11455b;
    }

    @Override // i0.a
    public void d() {
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long j4;
        long j5;
        a aVar;
        long j6;
        if (this.f11455b == null || this.f11456c == null) {
            return;
        }
        long l4 = l();
        long max = this.f11457d ? (l4 - this.f11458e) + this.f11463j : Math.max(this.f11459f, 0L);
        int c5 = this.f11456c.c(max, this.f11459f);
        if (c5 == -1) {
            c5 = this.f11455b.a() - 1;
            this.f11465l.b(this);
            this.f11457d = false;
        } else if (c5 == 0 && this.f11461h != -1 && l4 >= this.f11460g) {
            this.f11465l.e(this);
        }
        int i4 = c5;
        boolean h4 = this.f11455b.h(this, canvas, i4);
        if (h4) {
            this.f11465l.c(this, i4);
            this.f11461h = i4;
        }
        if (!h4) {
            m();
        }
        long l5 = l();
        if (this.f11457d) {
            long b5 = this.f11456c.b(l5 - this.f11458e);
            if (b5 != -1) {
                long j7 = this.f11462i + b5;
                n(j7);
                j5 = j7;
            } else {
                j5 = -1;
            }
            j4 = b5;
        } else {
            j4 = -1;
            j5 = -1;
        }
        b bVar = this.f11466m;
        if (bVar != null) {
            bVar.a(this, this.f11456c, i4, h4, this.f11457d, this.f11458e, max, this.f11459f, l4, l5, j4, j5);
            aVar = this;
            j6 = max;
        } else {
            aVar = this;
            j6 = max;
        }
        aVar.f11459f = j6;
    }

    public long e() {
        return this.f11464k;
    }

    public int f() {
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar == null) {
            return 0;
        }
        return aVar.a();
    }

    public int g() {
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar == null) {
            return 0;
        }
        return aVar.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public long h() {
        if (this.f11455b == null) {
            return 0L;
        }
        com.facebook.fresco.animation.frame.b bVar = this.f11456c;
        if (bVar != null) {
            return bVar.e();
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f11455b.a(); i5++) {
            i4 += this.f11455b.j(i5);
        }
        return i4;
    }

    public long i() {
        return this.f11458e;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f11457d;
    }

    public boolean j() {
        com.facebook.fresco.animation.frame.b bVar = this.f11456c;
        return bVar != null && bVar.d();
    }

    public void k(int i4) {
        com.facebook.fresco.animation.frame.b bVar;
        if (this.f11455b == null || (bVar = this.f11456c) == null) {
            return;
        }
        this.f11459f = bVar.a(i4);
        long l4 = l() - this.f11459f;
        this.f11458e = l4;
        this.f11460g = l4;
        invalidateSelf();
    }

    public void o(@Nullable com.facebook.fresco.animation.backend.a aVar) {
        this.f11455b = aVar;
        if (aVar != null) {
            this.f11456c = new com.facebook.fresco.animation.frame.a(aVar);
            this.f11455b.e(getBounds());
            e eVar = this.f11467n;
            if (eVar != null) {
                eVar.a(this);
            }
        }
        this.f11456c = b(this.f11455b);
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar != null) {
            aVar.e(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        if (this.f11457d) {
            return false;
        }
        long j4 = i4;
        if (this.f11459f != j4) {
            this.f11459f = j4;
            invalidateSelf();
            return true;
        }
        return false;
    }

    public void p(@Nullable c cVar) {
        if (cVar == null) {
            cVar = f11452q;
        }
        this.f11465l = cVar;
    }

    public void q(@Nullable b bVar) {
        this.f11466m = bVar;
    }

    public void r(long j4) {
        this.f11462i = j4;
    }

    public void s(long j4) {
        this.f11463j = j4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f11467n == null) {
            this.f11467n = new e();
        }
        this.f11467n.b(i4);
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar != null) {
            aVar.k(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f11467n == null) {
            this.f11467n = new e();
        }
        this.f11467n.c(colorFilter);
        com.facebook.fresco.animation.backend.a aVar = this.f11455b;
        if (aVar != null) {
            aVar.g(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        com.facebook.fresco.animation.backend.a aVar;
        if (this.f11457d || (aVar = this.f11455b) == null || aVar.a() <= 1) {
            return;
        }
        this.f11457d = true;
        long l4 = l();
        this.f11458e = l4;
        this.f11460g = l4;
        this.f11459f = -1L;
        this.f11461h = -1;
        invalidateSelf();
        this.f11465l.a(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f11457d) {
            this.f11457d = false;
            this.f11458e = 0L;
            this.f11460g = 0L;
            this.f11459f = -1L;
            this.f11461h = -1;
            unscheduleSelf(this.f11468o);
            this.f11465l.b(this);
        }
    }

    public a(@Nullable com.facebook.fresco.animation.backend.a aVar) {
        this.f11462i = 8L;
        this.f11463j = 0L;
        this.f11465l = f11452q;
        this.f11466m = null;
        this.f11468o = new RunnableC0264a();
        this.f11455b = aVar;
        this.f11456c = b(aVar);
    }
}
