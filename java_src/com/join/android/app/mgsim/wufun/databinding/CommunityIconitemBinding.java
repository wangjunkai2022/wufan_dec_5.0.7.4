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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CommunityIconitemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18238b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f18239c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f18240d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18241e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18242f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18243g;

    private CommunityIconitemBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18238b = relativeLayout;
        this.f18239c = relativeLayout2;
        this.f18240d = simpleDraweeView;
        this.f18241e = textView;
        this.f18242f = textView2;
        this.f18243g = textView3;
    }

    @NonNull
    public static CommunityIconitemBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.simv;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.simv);
        if (simpleDraweeView != null) {
            i4 = R.id.tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
            if (textView != null) {
                i4 = R.id.tv_reply;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reply);
                if (textView2 != null) {
                    i4 = R.id.tv_time;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                    if (textView3 != null) {
                        return new CommunityIconitemBinding(relativeLayout, relativeLayout, simpleDraweeView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommunityIconitemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18238b;
    }

    @NonNull
    public static CommunityIconitemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.community_iconitem, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
