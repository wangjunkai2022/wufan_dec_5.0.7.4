package com.join.mgps.customview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
/* loaded from: classes4.dex */
public class DragImageView extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    private int f46912b;

    /* renamed from: c  reason: collision with root package name */
    private int f46913c;

    /* renamed from: d  reason: collision with root package name */
    private int f46914d;

    /* renamed from: e  reason: collision with root package name */
    private int f46915e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46916f;

    /* renamed from: g  reason: collision with root package name */
    private int f46917g;

    public DragImageView(Context context) {
        this(context, null, 0);
    }

    private boolean a() {
        return !this.f46916f && (getX() == ((float) this.f46917g) || getX() == ((float) ((this.f46913c - getWidth()) - this.f46917g)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f46916f = false;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f46914d = rawX;
            this.f46915e = rawY;
            if (getParent() != null) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                this.f46912b = viewGroup.getHeight();
                this.f46913c = viewGroup.getWidth();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ACTION_DOWN:");
            sb.append(this.f46913c);
        } else if (action != 1) {
            if (action == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ACTION_MOVE:");
                sb2.append(this.f46913c);
                if (this.f46912b > 0 && this.f46913c != 0) {
                    this.f46916f = true;
                    int i4 = rawX - this.f46914d;
                    int i5 = rawY - this.f46915e;
                    if (((int) Math.sqrt((i4 * i4) + (i5 * i5))) <= 10) {
                        this.f46916f = false;
                    } else {
                        float x4 = getX() + i4;
                        float y2 = getY() + i5;
                        if (x4 < 0.0f) {
                            x4 = 0.0f;
                        } else if (x4 > this.f46913c - getWidth()) {
                            x4 = this.f46913c - getWidth();
                        }
                        if (getY() < 0.0f) {
                            y2 = 0.0f;
                        } else {
                            float y4 = getY() + getHeight();
                            int i6 = this.f46912b;
                            if (y4 > i6) {
                                y2 = i6 - getHeight();
                            }
                        }
                        setX(x4);
                        setY(y2);
                        this.f46914d = rawX;
                        this.f46915e = rawY;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("isDrag=");
                        sb3.append(this.f46916f);
                        sb3.append("getX=");
                        sb3.append(getX());
                        sb3.append(";getY=");
                        sb3.append(getY());
                        sb3.append(";parentWidth=");
                        sb3.append(this.f46913c);
                    }
                } else {
                    this.f46916f = false;
                }
            }
        } else if (!a()) {
            if (rawX >= this.f46913c / 2) {
                animate().setInterpolator(new DecelerateInterpolator()).setDuration(500L).xBy(((this.f46913c - getWidth()) - getX()) - this.f46917g).start();
            } else {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "x", getX(), this.f46917g);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.setDuration(500L);
                ofFloat.start();
            }
        }
        return !a() || super.onTouchEvent(motionEvent);
    }

    public DragImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46917g = 0;
        this.f46917g = com.join.mgps.Util.c0.a(context, 10.0f);
    }
}
