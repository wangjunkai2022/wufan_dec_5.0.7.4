package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class RewardBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26251b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26252c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26253d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26254e;

    private RewardBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f26251b = relativeLayout;
        this.f26252c = imageView;
        this.f26253d = linearLayout;
        this.f26254e = textView;
    }

    @NonNull
    public static RewardBinding bind(@NonNull View view) {
        int i4 = R.id.moneyPackage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.moneyPackage);
        if (imageView != null) {
            i4 = R.id.rewardContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rewardContainer);
            if (linearLayout != null) {
                i4 = R.id.txt;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt);
                if (textView != null) {
                    return new RewardBinding((RelativeLayout) view, imageView, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static RewardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26251b;
    }

    @NonNull
    public static RewardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.reward, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
