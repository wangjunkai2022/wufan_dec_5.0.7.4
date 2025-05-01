package com.beizi.fusion.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
/* loaded from: classes2.dex */
public class RegionClickView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    GradientDrawable f7225a;

    /* renamed from: b  reason: collision with root package name */
    TextView f7226b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7227c;

    public RegionClickView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7227c = false;
        init(context);
    }

    private void a(Context context, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f7225a = gradientDrawable;
        gradientDrawable.setColor(Color.parseColor("#80000000"));
        if (i4 == 1) {
            this.f7225a.setStroke(1, Color.parseColor("#E8E8E8"));
        }
        this.f7225a.setCornerRadius(av.a(context, 30.0f));
        setBackgroundDrawable(this.f7225a);
    }

    public void init(Context context) {
        if (this.f7227c) {
            return;
        }
        this.f7227c = true;
        a(context, 1);
        TextView textView = new TextView(context);
        this.f7226b = textView;
        textView.setLines(1);
        this.f7226b.setTextSize(2, 18.0f);
        this.f7226b.setTextColor(Color.parseColor("#949494"));
        this.f7226b.setText("点击跳转详情页或第三方应用     >");
        this.f7226b.setGravity(17);
        setGravity(17);
        setOrientation(1);
        addView(this.f7226b);
    }

    public void setBackGroundAlpha(double d5) {
        GradientDrawable gradientDrawable = this.f7225a;
        if (gradientDrawable == null || d5 <= 0.0d) {
            return;
        }
        gradientDrawable.setAlpha((int) (d5 * 255.0d));
    }

    public void setBackgroundColor(String str) {
        GradientDrawable gradientDrawable = this.f7225a;
        if (gradientDrawable == null || str == null) {
            return;
        }
        try {
            gradientDrawable.setColor(Color.parseColor(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setRegionalClickViewBean(AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean) {
        if (regionalClickViewBean == null) {
            return;
        }
        setTitle(regionalClickViewBean.getTitle());
        setTitleColor(regionalClickViewBean.getTitleColor());
        setBackGroundAlpha(regionalClickViewBean.getBackgroundAlpha());
        setBackgroundColor(regionalClickViewBean.getBackgroundColor());
    }

    public void setTitle(String str) {
        TextView textView = this.f7226b;
        if (textView == null || str == null) {
            return;
        }
        try {
            textView.setText(str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setTitleColor(String str) {
        TextView textView = this.f7226b;
        if (textView == null || str == null) {
            return;
        }
        try {
            textView.setTextColor(Color.parseColor(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public RegionClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7227c = false;
        init(context);
    }

    public RegionClickView(Context context) {
        super(context);
        this.f7227c = false;
        init(context);
    }
}
