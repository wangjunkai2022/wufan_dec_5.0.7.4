package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ViewRvListEmptyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27069b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27070c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27071d;

    private ViewRvListEmptyBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f27069b = relativeLayout;
        this.f27070c = imageView;
        this.f27071d = textView;
    }

    @NonNull
    public static ViewRvListEmptyBinding bind(@NonNull View view) {
        int i4 = R.id.iv_no_data;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_no_data);
        if (imageView != null) {
            i4 = R.id.tv_no_data;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data);
            if (textView != null) {
                return new ViewRvListEmptyBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewRvListEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27069b;
    }

    @NonNull
    public static ViewRvListEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_rv_list_empty, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
