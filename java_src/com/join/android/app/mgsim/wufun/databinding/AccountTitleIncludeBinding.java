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
public final class AccountTitleIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15678b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15679c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f15680d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f15681e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15682f;

    private AccountTitleIncludeBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f15678b = linearLayout;
        this.f15679c = imageView;
        this.f15680d = relativeLayout;
        this.f15681e = textView;
        this.f15682f = textView2;
    }

    @NonNull
    public static AccountTitleIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.relativeLayout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
            if (relativeLayout != null) {
                i4 = R.id.rightTextButn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.rightTextButn);
                if (textView != null) {
                    i4 = R.id.titleText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                    if (textView2 != null) {
                        return new AccountTitleIncludeBinding((LinearLayout) view, imageView, relativeLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AccountTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15678b;
    }

    @NonNull
    public static AccountTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.account_title_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
