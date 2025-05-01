package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemHideAppHomeViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22386b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22387c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22388d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22389e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22390f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22391g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22392h;

    private ItemHideAppHomeViewpagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f22386b = constraintLayout;
        this.f22387c = imageView;
        this.f22388d = imageView2;
        this.f22389e = textView;
        this.f22390f = textView2;
        this.f22391g = textView3;
        this.f22392h = textView4;
    }

    @NonNull
    public static ItemHideAppHomeViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.ic_pretend;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ic_pretend);
        if (imageView != null) {
            i4 = R.id.ic_wf;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ic_wf);
            if (imageView2 != null) {
                i4 = R.id.tvBtn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                if (textView != null) {
                    i4 = R.id.tvDesc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                    if (textView2 != null) {
                        i4 = R.id.tvResetPwd;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResetPwd);
                        if (textView3 != null) {
                            i4 = R.id.tvTitle;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                            if (textView4 != null) {
                                return new ItemHideAppHomeViewpagerBinding((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemHideAppHomeViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22386b;
    }

    @NonNull
    public static ItemHideAppHomeViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_hide_app_home_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
