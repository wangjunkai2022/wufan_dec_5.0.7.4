package cn.sharesdk.sina.weibo.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class LoadingBar extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private int f1113a;

    /* renamed from: b  reason: collision with root package name */
    private int f1114b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f1115c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f1116d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1117e;

    public LoadingBar(Context context) {
        super(context);
        this.f1117e = new Runnable() { // from class: cn.sharesdk.sina.weibo.sdk.LoadingBar.1
            @Override // java.lang.Runnable
            public void run() {
                LoadingBar.this.f1113a++;
                LoadingBar loadingBar = LoadingBar.this;
                loadingBar.a(loadingBar.f1113a);
            }
        };
        a(context);
    }

    private Rect b() {
        int left = getLeft();
        int top = getTop();
        return new Rect(0, 0, (getLeft() + (((getRight() - getLeft()) * this.f1113a) / 100)) - left, getBottom() - top);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1115c.setColor(this.f1114b);
        canvas.drawRect(b(), this.f1115c);
    }

    private void a(Context context) {
        this.f1116d = new Handler();
        this.f1115c = new Paint();
        a();
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LoadingBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a(context);
    }

    public void a() {
        this.f1114b = -11693826;
    }

    public void a(int i4) {
        if (i4 < 7) {
            this.f1116d.postDelayed(this.f1117e, 70L);
        } else {
            this.f1116d.removeCallbacks(this.f1117e);
            this.f1113a = i4;
        }
        invalidate();
    }
}
