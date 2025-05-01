package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class AccountBaseActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15671b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15672c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f15673d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f15674e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15675f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f15676g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f15677h;

    private AccountBaseActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull View view2) {
        this.f15671b = relativeLayout;
        this.f15672c = imageView;
        this.f15673d = view;
        this.f15674e = frameLayout;
        this.f15675f = textView;
        this.f15676g = linearLayout;
        this.f15677h = view2;
    }

    @NonNull
    public static AccountBaseActivityBinding bind(@NonNull View view) {
        int i4 = R.id.backButn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backButn);
        if (imageView != null) {
            i4 = R.id.backView;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.backView);
            if (findChildViewById != null) {
                i4 = R.id.childLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.childLayout);
                if (frameLayout != null) {
                    i4 = R.id.titleText;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                    if (textView != null) {
                        i4 = R.id.titlelayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.titlelayout);
                        if (linearLayout != null) {
                            i4 = R.id.view2;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view2);
                            if (findChildViewById2 != null) {
                                return new AccountBaseActivityBinding((RelativeLayout) view, imageView, findChildViewById, frameLayout, textView, linearLayout, findChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AccountBaseActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15671b;
    }

    @NonNull
    public static AccountBaseActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.account_base_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
