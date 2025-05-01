package com.papa91.arc.widget;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
/* loaded from: classes5.dex */
public class MyFrameAnimation extends AnimationDrawable {
    private int maxDuration;
    private OnFrameAnimationListener onFrameAnimationListener;
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() { // from class: com.papa91.arc.widget.MyFrameAnimation.1
        @Override // java.lang.Runnable
        public void run() {
            MyFrameAnimation myFrameAnimation = MyFrameAnimation.this;
            if (myFrameAnimation.getFrame(myFrameAnimation.getNumberOfFrames() - 1) != MyFrameAnimation.this.getCurrent()) {
                MyFrameAnimation.this.initHandler();
            } else {
                MyFrameAnimation.this.unRunning();
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface OnFrameAnimationListener {
        void onEnd();

        void onStart();
    }

    private int getMaxDuration() {
        for (int i4 = 0; i4 < getNumberOfFrames(); i4++) {
            if (this.maxDuration < getDuration(i4)) {
                this.maxDuration = getDuration(i4);
            }
        }
        int i5 = this.maxDuration;
        if (i5 > 1000) {
            return 1000;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initHandler() {
        Handler handler = this.handler;
        Runnable runnable = this.runnable;
        int i4 = this.maxDuration;
        if (i4 == 0) {
            i4 = getMaxDuration();
        }
        handler.postDelayed(runnable, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unRunning() {
        OnFrameAnimationListener onFrameAnimationListener = this.onFrameAnimationListener;
        if (onFrameAnimationListener != null) {
            onFrameAnimationListener.onEnd();
        }
        this.handler.removeCallbacks(this.runnable);
    }

    public void setOnFrameAnimationListener(OnFrameAnimationListener onFrameAnimationListener) {
        this.onFrameAnimationListener = onFrameAnimationListener;
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        initHandler();
        OnFrameAnimationListener onFrameAnimationListener = this.onFrameAnimationListener;
        if (onFrameAnimationListener != null) {
            onFrameAnimationListener.onStart();
        }
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
    }
}
