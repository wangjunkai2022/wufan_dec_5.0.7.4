package q.rorbin.badgeview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Random;
/* compiled from: BadgeAnimator.java */
/* loaded from: classes7.dex */
public class b extends ValueAnimator {

    /* renamed from: b  reason: collision with root package name */
    private c[][] f73159b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<QBadgeView> f73160c;

    /* compiled from: BadgeAnimator.java */
    /* loaded from: classes7.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            QBadgeView qBadgeView = (QBadgeView) b.this.f73160c.get();
            if (qBadgeView != null && qBadgeView.isShown()) {
                qBadgeView.invalidate();
            } else {
                b.this.cancel();
            }
        }
    }

    /* compiled from: BadgeAnimator.java */
    /* renamed from: q.rorbin.badgeview.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    class C0807b extends AnimatorListenerAdapter {
        C0807b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QBadgeView qBadgeView = (QBadgeView) b.this.f73160c.get();
            if (qBadgeView != null) {
                qBadgeView.L();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BadgeAnimator.java */
    /* loaded from: classes7.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        Random f73163a;

        /* renamed from: b  reason: collision with root package name */
        float f73164b;

        /* renamed from: c  reason: collision with root package name */
        float f73165c;

        /* renamed from: d  reason: collision with root package name */
        float f73166d;

        /* renamed from: e  reason: collision with root package name */
        int f73167e;

        /* renamed from: f  reason: collision with root package name */
        int f73168f;

        /* renamed from: g  reason: collision with root package name */
        Paint f73169g;

        public c() {
            Paint paint = new Paint();
            this.f73169g = paint;
            paint.setAntiAlias(true);
            this.f73169g.setStyle(Paint.Style.FILL);
            this.f73163a = new Random();
        }

        public void a(float f5, Canvas canvas) {
            this.f73169g.setColor(this.f73167e);
            this.f73164b += this.f73163a.nextInt(this.f73168f) * 0.1f * (this.f73163a.nextFloat() - 0.5f);
            float nextInt = this.f73165c + (this.f73163a.nextInt(this.f73168f) * 0.1f * (this.f73163a.nextFloat() - 0.5f));
            this.f73165c = nextInt;
            float f6 = this.f73164b;
            float f7 = this.f73166d;
            canvas.drawCircle(f6, nextInt, f7 - (f5 * f7), this.f73169g);
        }
    }

    public b(Bitmap bitmap, PointF pointF, QBadgeView qBadgeView) {
        this.f73160c = new WeakReference<>(qBadgeView);
        setFloatValues(0.0f, 1.0f);
        setDuration(500L);
        this.f73159b = c(bitmap, pointF);
        addUpdateListener(new a());
        addListener(new C0807b());
    }

    private c[][] c(Bitmap bitmap, PointF pointF) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float min = Math.min(width, height) / 6.0f;
        float width2 = pointF.x - (bitmap.getWidth() / 2.0f);
        float height2 = pointF.y - (bitmap.getHeight() / 2.0f);
        c[][] cVarArr = (c[][]) Array.newInstance(c.class, (int) (height / min), (int) (width / min));
        for (int i4 = 0; i4 < cVarArr.length; i4++) {
            for (int i5 = 0; i5 < cVarArr[i4].length; i5++) {
                c cVar = new c();
                float f5 = i5 * min;
                float f6 = i4 * min;
                cVar.f73167e = bitmap.getPixel((int) f5, (int) f6);
                cVar.f73164b = f5 + width2;
                cVar.f73165c = f6 + height2;
                cVar.f73166d = min;
                cVar.f73168f = Math.max(width, height);
                cVarArr[i4][i5] = cVar;
            }
        }
        bitmap.recycle();
        return cVarArr;
    }

    public void b(Canvas canvas) {
        for (int i4 = 0; i4 < this.f73159b.length; i4++) {
            int i5 = 0;
            while (true) {
                c[][] cVarArr = this.f73159b;
                if (i5 < cVarArr[i4].length) {
                    cVarArr[i4][i5].a(Float.parseFloat(getAnimatedValue().toString()), canvas);
                    i5++;
                }
            }
        }
    }
}
