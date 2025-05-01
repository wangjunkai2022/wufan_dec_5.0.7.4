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
public final class ListItemUserBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23463b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23464c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23465d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23466e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23467f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f23468g;

    private ListItemUserBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f23463b = linearLayout;
        this.f23464c = linearLayout2;
        this.f23465d = textView;
        this.f23466e = textView2;
        this.f23467f = textView3;
        this.f23468g = simpleDraweeView;
    }

    @NonNull
    public static ListItemUserBinding bind(@NonNull View view) {
        int i4 = R.id.ll_user;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_user);
        if (linearLayout != null) {
            i4 = R.id.tv_load;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_load);
            if (textView != null) {
                i4 = R.id.tv_size;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size);
                if (textView2 != null) {
                    i4 = R.id.tv_username;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_username);
                    if (textView3 != null) {
                        i4 = R.id.user_icon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.user_icon);
                        if (simpleDraweeView != null) {
                            return new ListItemUserBinding((LinearLayout) view, linearLayout, textView, textView2, textView3, simpleDraweeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ListItemUserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23463b;
    }

    @NonNull
    public static ListItemUserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.list_item_user, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
