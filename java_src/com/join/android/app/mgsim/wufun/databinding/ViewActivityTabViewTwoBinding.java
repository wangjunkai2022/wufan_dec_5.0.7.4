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
public final class ViewActivityTabViewTwoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27016b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27017c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27018d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27019e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27020f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27021g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27022h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27023i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27024j;

    private ViewActivityTabViewTwoBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f27016b = linearLayout;
        this.f27017c = imageView;
        this.f27018d = imageView2;
        this.f27019e = linearLayout2;
        this.f27020f = linearLayout3;
        this.f27021g = textView;
        this.f27022h = textView2;
        this.f27023i = textView3;
        this.f27024j = textView4;
    }

    @NonNull
    public static ViewActivityTabViewTwoBinding bind(@NonNull View view) {
        int i4 = R.id.iv_icon_2;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_2);
        if (imageView != null) {
            i4 = R.id.iv_icon_3;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_3);
            if (imageView2 != null) {
                i4 = R.id.ll_tab_2;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab_2);
                if (linearLayout != null) {
                    i4 = R.id.ll_tab_3;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab_3);
                    if (linearLayout2 != null) {
                        i4 = R.id.tv_desc_2;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_2);
                        if (textView != null) {
                            i4 = R.id.tv_desc_3;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_3);
                            if (textView2 != null) {
                                i4 = R.id.tv_title_2;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_2);
                                if (textView3 != null) {
                                    i4 = R.id.tv_title_3;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_3);
                                    if (textView4 != null) {
                                        return new ViewActivityTabViewTwoBinding((LinearLayout) view, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewActivityTabViewTwoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27016b;
    }

    @NonNull
    public static ViewActivityTabViewTwoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_activity_tab_view_two, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
