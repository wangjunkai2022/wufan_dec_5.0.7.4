package u2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
/* compiled from: SmallVideoTouch.java */
/* loaded from: classes5.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private int f73365b;

    /* renamed from: c  reason: collision with root package name */
    private int f73366c;

    /* renamed from: d  reason: collision with root package name */
    private int f73367d;

    /* renamed from: e  reason: collision with root package name */
    private int f73368e;

    /* renamed from: f  reason: collision with root package name */
    private int f73369f;

    /* renamed from: g  reason: collision with root package name */
    private int f73370g;

    /* renamed from: h  reason: collision with root package name */
    private GSYBaseVideoPlayer f73371h;

    public a(GSYBaseVideoPlayer gSYBaseVideoPlayer, int i4, int i5) {
        this.f73367d = i4;
        this.f73368e = i5;
        this.f73371h = gSYBaseVideoPlayer;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f73365b = rawX;
            this.f73366c = rawY;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73371h.getLayoutParams();
            this.f73369f = rawX - layoutParams.leftMargin;
            this.f73370g = rawY - layoutParams.topMargin;
        } else if (action == 1) {
            return Math.abs(this.f73366c - rawY) >= 5 || Math.abs(this.f73365b - rawX) >= 5;
        } else if (action == 2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f73371h.getLayoutParams();
            int i4 = rawX - this.f73369f;
            layoutParams2.leftMargin = i4;
            int i5 = rawY - this.f73370g;
            layoutParams2.topMargin = i5;
            int i6 = this.f73367d;
            if (i4 >= i6) {
                layoutParams2.leftMargin = i6;
            }
            int i7 = this.f73368e;
            if (i5 >= i7) {
                layoutParams2.topMargin = i7;
            }
            if (layoutParams2.leftMargin <= 0) {
                layoutParams2.leftMargin = 0;
            }
            if (layoutParams2.topMargin <= 0) {
                layoutParams2.topMargin = 0;
            }
            this.f73371h.setLayoutParams(layoutParams2);
        }
        return false;
    }
}
