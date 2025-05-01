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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemDiscoveryTopViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22011b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22012c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22013d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22014e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22015f;

    private ItemDiscoveryTopViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22011b = relativeLayout;
        this.f22012c = simpleDraweeView;
        this.f22013d = imageView;
        this.f22014e = textView;
        this.f22015f = textView2;
    }

    @NonNull
    public static ItemDiscoveryTopViewBinding bind(@NonNull View view) {
        int i4 = R.id.ItemIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ItemIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.ItemMy;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ItemMy);
            if (imageView != null) {
                i4 = R.id.ItemName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ItemName);
                if (textView != null) {
                    i4 = R.id.ItemNum;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ItemNum);
                    if (textView2 != null) {
                        return new ItemDiscoveryTopViewBinding((RelativeLayout) view, simpleDraweeView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemDiscoveryTopViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22011b;
    }

    @NonNull
    public static ItemDiscoveryTopViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_discovery_top_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
