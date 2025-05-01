package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ViewActivityTabViewOneBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26997b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26998c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26999d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27000e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27001f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27002g;

    private ViewActivityTabViewOneBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26997b = linearLayout;
        this.f26998c = imageView;
        this.f26999d = imageView2;
        this.f27000e = linearLayout2;
        this.f27001f = textView;
        this.f27002g = textView2;
    }

    @NonNull
    public static ViewActivityTabViewOneBinding bind(@NonNull View view) {
        int i4 = R.id.imageView5;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
        if (imageView != null) {
            i4 = R.id.iv_icon_1;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_1);
            if (imageView2 != null) {
                i4 = R.id.ll_tab_1;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab_1);
                if (linearLayout != null) {
                    i4 = R.id.tv_desc_1;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_1);
                    if (textView != null) {
                        i4 = R.id.tv_title_1;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_1);
                        if (textView2 != null) {
                            return new ViewActivityTabViewOneBinding((LinearLayout) view, imageView, imageView2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewActivityTabViewOneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26997b;
    }

    @NonNull
    public static ViewActivityTabViewOneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_activity_tab_view_one, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
