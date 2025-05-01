package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class XListViewHeader extends LinearLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final int f48264j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f48265k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f48266l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f48267m = 3;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f48268b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f48269c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f48270d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48271e;

    /* renamed from: f  reason: collision with root package name */
    private int f48272f;

    /* renamed from: g  reason: collision with root package name */
    private Animation f48273g;

    /* renamed from: h  reason: collision with root package name */
    private Animation f48274h;

    /* renamed from: i  reason: collision with root package name */
    private final int f48275i;

    public XListViewHeader(Context context) {
        super(context);
        this.f48272f = 0;
        this.f48275i = 180;
        a(context);
    }

    private void a(Context context) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.xlistview_header, (ViewGroup) null);
        this.f48268b = linearLayout;
        addView(linearLayout, layoutParams);
        setGravity(80);
        this.f48269c = (ImageView) findViewById(R.id.xlistview_header_arrow);
        this.f48271e = (TextView) findViewById(R.id.xlistview_header_hint_textview);
        this.f48270d = (ProgressBar) findViewById(R.id.xlistview_header_progressbar);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f48273g = rotateAnimation;
        rotateAnimation.setDuration(180L);
        this.f48273g.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f48274h = rotateAnimation2;
        rotateAnimation2.setDuration(180L);
        this.f48274h.setFillAfter(true);
    }

    public int getVisibleHeight() {
        return this.f48268b.getHeight();
    }

    public void setState(int i4) {
        if (i4 == this.f48272f) {
            return;
        }
        if (i4 == 2) {
            this.f48269c.clearAnimation();
            this.f48269c.setVisibility(4);
            this.f48270d.setVisibility(0);
        } else {
            this.f48269c.setVisibility(4);
            this.f48270d.setVisibility(4);
        }
        if (i4 == 0) {
            this.f48271e.setText(R.string.xlistview_header_hint_normal);
        } else if (i4 != 1) {
            if (i4 == 2) {
                this.f48271e.setText(R.string.xlistview_header_hint_loading);
            } else if (i4 == 3) {
                this.f48271e.setText(R.string.xlistview_header_nomore);
            }
        } else if (this.f48272f != 1) {
            this.f48271e.setText(R.string.xlistview_header_hint_ready);
        }
        this.f48272f = i4;
    }

    public void setVisibleHeight(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48268b.getLayoutParams();
        layoutParams.height = i4;
        this.f48268b.setLayoutParams(layoutParams);
    }

    public void setmState(int i4) {
        this.f48272f = i4;
    }

    public XListViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48272f = 0;
        this.f48275i = 180;
        a(context);
    }
}
