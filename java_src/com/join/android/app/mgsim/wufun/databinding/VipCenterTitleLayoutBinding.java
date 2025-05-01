package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VipCenterTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27095b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f27096c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27097d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27098e;

    private VipCenterTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f27095b = relativeLayout;
        this.f27096c = view;
        this.f27097d = textView;
        this.f27098e = textView2;
    }

    @NonNull
    public static VipCenterTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.more;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.more);
            if (textView != null) {
                i4 = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView2 != null) {
                    return new VipCenterTitleLayoutBinding((RelativeLayout) view, findChildViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VipCenterTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27095b;
    }

    @NonNull
    public static VipCenterTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_center_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
