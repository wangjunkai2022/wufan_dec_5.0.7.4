package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class RecomeWifiItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26228b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26229c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f26230d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f26231e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f26232f;

    private RecomeWifiItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2) {
        this.f26228b = relativeLayout;
        this.f26229c = textView;
        this.f26230d = checkBox;
        this.f26231e = simpleDraweeView;
        this.f26232f = relativeLayout2;
    }

    @NonNull
    public static RecomeWifiItemBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.box;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.box);
            if (checkBox != null) {
                i4 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.re;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.re);
                    if (relativeLayout != null) {
                        return new RecomeWifiItemBinding((RelativeLayout) view, textView, checkBox, simpleDraweeView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static RecomeWifiItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26228b;
    }

    @NonNull
    public static RecomeWifiItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.recome_wifi_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
