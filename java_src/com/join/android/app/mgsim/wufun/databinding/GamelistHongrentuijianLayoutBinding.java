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
public final class GamelistHongrentuijianLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21170b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21171c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21172d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21173e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21174f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21175g;

    private GamelistHongrentuijianLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f21170b = linearLayout;
        this.f21171c = textView;
        this.f21172d = linearLayout2;
        this.f21173e = simpleDraweeView;
        this.f21174f = textView2;
        this.f21175g = textView3;
    }

    @NonNull
    public static GamelistHongrentuijianLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.folloNum;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.folloNum);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.userIcon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
            if (simpleDraweeView != null) {
                i4 = R.id.userName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                if (textView2 != null) {
                    i4 = R.id.userTag;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userTag);
                    if (textView3 != null) {
                        return new GamelistHongrentuijianLayoutBinding(linearLayout, textView, linearLayout, simpleDraweeView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamelistHongrentuijianLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21170b;
    }

    @NonNull
    public static GamelistHongrentuijianLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamelist_hongrentuijian_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
