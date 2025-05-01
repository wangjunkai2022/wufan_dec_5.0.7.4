package com.kwad.components.ad.splashscreen.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public class KsSplashSlidePathView extends ImageView {
    private Path Ho;
    private Paint Hp;
    private float Hq;
    private float Hr;
    private float Hs;
    private float Ht;
    private int Hu;
    private a Hv;
    private GestureDetector Hw;

    /* loaded from: classes5.dex */
    public interface a {
        void a(float f5, float f6, float f7, float f8);

        void lv();
    }

    public KsSplashSlidePathView(Context context) {
        super(context);
        this.Hu = Color.parseColor("#66ffffff");
        init();
    }

    private void b(MotionEvent motionEvent) {
        if (this.Hw.onTouchEvent(motionEvent)) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Ho.reset();
            this.Hq = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.Hr = y2;
            float f5 = this.Hq;
            this.Hs = f5;
            this.Ht = y2;
            this.Ho.moveTo(f5, y2);
            invalidate();
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                return;
            }
            c(motionEvent.getX(), motionEvent.getY());
            invalidate();
        } else {
            this.Ho.reset();
            invalidate();
            a aVar = this.Hv;
            if (aVar != null) {
                aVar.a(this.Hq, this.Hr, motionEvent.getX(), motionEvent.getY());
            }
        }
    }

    private void c(float f5, float f6) {
        float abs = Math.abs(f5 - this.Hs);
        float abs2 = Math.abs(f6 - this.Ht);
        if (abs >= 3.0f || abs2 >= 3.0f) {
            Path path = this.Ho;
            float f7 = this.Hs;
            float f8 = this.Ht;
            path.quadTo(f7, f8, (f5 + f7) / 2.0f, (f6 + f8) / 2.0f);
            this.Hs = f5;
            this.Ht = f6;
        }
    }

    private void init() {
        this.Ho = new Path();
        Paint paint = new Paint();
        this.Hp = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.Hp.setStrokeWidth(com.kwad.sdk.c.a.a.a(getContext(), 15.0f));
        this.Hp.setStyle(Paint.Style.STROKE);
        this.Hp.setColor(this.Hu);
        this.Hp.setDither(true);
        this.Hw = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.1
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (KsSplashSlidePathView.this.Hv != null) {
                    KsSplashSlidePathView.this.Hv.lv();
                    return true;
                }
                return false;
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.Ho, this.Hp);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        return true;
    }

    public void setOnSlideTouchListener(a aVar) {
        this.Hv = aVar;
    }

    public KsSplashSlidePathView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Hu = Color.parseColor("#66ffffff");
        init();
    }
}
