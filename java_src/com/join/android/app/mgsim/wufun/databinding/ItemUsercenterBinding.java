package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemUsercenterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22919b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22920c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22921d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22922e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22923f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22924g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22925h;

    private ItemUsercenterBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22919b = linearLayout;
        this.f22920c = view;
        this.f22921d = simpleDraweeView;
        this.f22922e = linearLayout2;
        this.f22923f = textView;
        this.f22924g = textView2;
        this.f22925h = textView3;
    }

    @NonNull
    public static ItemUsercenterBinding bind(@NonNull View view) {
        int i4 = R.id.emptyDivider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.emptyDivider);
        if (findChildViewById != null) {
            i4 = R.id.iv_module_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_module_icon);
            if (simpleDraweeView != null) {
                i4 = R.id.ll_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
                if (linearLayout != null) {
                    i4 = R.id.messageBadge;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.messageBadge);
                    if (textView != null) {
                        i4 = R.id.tv_module_doings;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_module_doings);
                        if (textView2 != null) {
                            i4 = R.id.tv_module_name;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_module_name);
                            if (textView3 != null) {
                                return new ItemUsercenterBinding((LinearLayout) view, findChildViewById, simpleDraweeView, linearLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemUsercenterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22919b;
    }

    @NonNull
    public static ItemUsercenterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_usercenter, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
