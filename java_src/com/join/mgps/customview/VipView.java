package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* loaded from: classes4.dex */
public class VipView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    Context f48076b;

    /* renamed from: c  reason: collision with root package name */
    int f48077c;

    /* renamed from: d  reason: collision with root package name */
    int f48078d;

    public VipView(Context context) {
        super(context);
        this.f48076b = context;
    }

    private int a(int i4) {
        switch (i4) {
            case 2:
                return R.drawable.vip_gold_number_2;
            case 3:
                return R.drawable.vip_gold_number_3;
            case 4:
                return R.drawable.vip_gold_number_4;
            case 5:
                return R.drawable.vip_gold_number_5;
            case 6:
                return R.drawable.vip_gold_number_6;
            case 7:
                return R.drawable.vip_gold_number_7;
            case 8:
                return R.drawable.vip_gold_number_8;
            case 9:
                return R.drawable.vip_gold_number_9;
            default:
                return R.drawable.vip_gold_number_1;
        }
    }

    public void setSize(int i4, int i5) {
        this.f48077c = i4;
        this.f48078d = i5;
    }

    public void setVipData(int i4, int i5) {
        int i6;
        removeAllViewsInLayout();
        ImageView imageView = new ImageView(this.f48076b);
        addView(imageView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.gravity = 16;
        int i7 = this.f48077c;
        if (i7 != 0 && (i6 = this.f48078d) != 0) {
            layoutParams.height = i6;
            layoutParams.width = i7;
        } else {
            layoutParams.height = this.f48076b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
            layoutParams.width = this.f48076b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
        }
        imageView.setImageResource(AsyncImageView.DEFAULT_TRANSPARENT);
        if (i5 > 0) {
            setVisibility(0);
            imageView.setVisibility(0);
            imageView.setImageResource(a(i5));
        } else if (i4 > 0) {
            setVisibility(0);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.vip_red_back);
            com.join.mgps.Util.j0.W0(imageView);
        } else {
            setVisibility(8);
            imageView.setVisibility(8);
        }
        invalidate();
    }

    public void setVipDataForUserCenter(int i4, int i5) {
        removeAllViewsInLayout();
        ImageView imageView = new ImageView(this.f48076b);
        addView(imageView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.gravity = 16;
        layoutParams.height = this.f48076b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
        layoutParams.width = this.f48076b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
        if (i5 > 0) {
            imageView.setImageResource(a(i5));
        } else if (i4 > 0) {
            imageView.setImageResource(R.drawable.vip_red_back);
            com.join.mgps.Util.j0.W0(imageView);
        } else {
            imageView.setImageResource(R.drawable.vip_defalut_image);
        }
        invalidate();
    }

    public VipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48076b = context;
    }

    public VipView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48076b = context;
    }

    public void setVipDataForUserCenter(int i4, int i5, boolean z4) {
        removeAllViewsInLayout();
        ImageView imageView = new ImageView(this.f48076b);
        addView(imageView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.gravity = 16;
        layoutParams.height = this.f48076b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
        layoutParams.width = this.f48076b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
        if (i5 > 0) {
            imageView.setImageResource(a(i5));
        } else if (i4 > 0) {
            imageView.setImageResource(R.drawable.vip_red_back);
        } else {
            imageView.setImageResource(R.drawable.vip_defalut_image_god);
        }
        invalidate();
    }
}
