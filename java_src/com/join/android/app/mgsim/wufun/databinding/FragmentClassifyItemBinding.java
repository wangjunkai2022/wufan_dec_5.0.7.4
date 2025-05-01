package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentClassifyItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19635b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19636c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19637d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19638e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f19639f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19640g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19641h;

    private FragmentClassifyItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f19635b = relativeLayout;
        this.f19636c = textView;
        this.f19637d = textView2;
        this.f19638e = linearLayout;
        this.f19639f = simpleDraweeView;
        this.f19640g = textView3;
        this.f19641h = textView4;
    }

    @NonNull
    public static FragmentClassifyItemBinding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
            if (textView2 != null) {
                i4 = R.id.nameParent;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nameParent);
                if (linearLayout != null) {
                    i4 = R.id.onlin_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.onlin_icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.onlin_number;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.onlin_number);
                        if (textView3 != null) {
                            i4 = R.id.onlin_number_tip;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.onlin_number_tip);
                            if (textView4 != null) {
                                return new FragmentClassifyItemBinding((RelativeLayout) view, textView, textView2, linearLayout, simpleDraweeView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentClassifyItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19635b;
    }

    @NonNull
    public static FragmentClassifyItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_classify_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
