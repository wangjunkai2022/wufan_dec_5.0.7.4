package com.join.kotlin.ui.userrecom;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.TipBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: UserRecomTagView.kt */
/* loaded from: classes3.dex */
public final class UserRecomTagView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRecomTagView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
    }

    public final void setDatas(@NotNull List<? extends TipBean> tipBeans) {
        Intrinsics.checkNotNullParameter(tipBeans, "tipBeans");
        removeAllViews();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp7);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.wdp1);
        for (TipBean tipBean : tipBeans) {
            TextView textView = new TextView(getContext());
            textView.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelOffset(R.dimen.wdp12);
            textView.setLayoutParams(layoutParams);
            textView.setText(tipBean.getName());
            textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp22));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(getResources().getDimensionPixelOffset(R.dimen.wdp5));
            if (Intrinsics.areEqual("平台精选", tipBean.getName())) {
                gradientDrawable.setColor(Color.parseColor("#FFF4ED"));
                textView.setTextColor(Color.parseColor("#C54F00"));
            } else if (Intrinsics.areEqual("热度飙升", tipBean.getName())) {
                gradientDrawable.setColor(Color.parseColor("#FFE8E8"));
                textView.setTextColor(Color.parseColor("#D84E4E"));
            } else if (Intrinsics.areEqual("新游上线", tipBean.getName())) {
                gradientDrawable.setColor(Color.parseColor("#EEF9E8"));
                textView.setTextColor(Color.parseColor("#536F47"));
            } else {
                gradientDrawable.setColor(Color.parseColor("#F9F9F9"));
                textView.setTextColor(Color.parseColor("#8C91A7"));
            }
            textView.setBackground(gradientDrawable);
            addView(textView);
        }
    }
}
