package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemDiscoveryPaiweiListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22003b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22004c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f22005d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22006e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22007f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22008g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22009h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22010i;

    private ItemDiscoveryPaiweiListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f22003b = constraintLayout;
        this.f22004c = simpleDraweeView;
        this.f22005d = frameLayout;
        this.f22006e = imageView;
        this.f22007f = textView;
        this.f22008g = textView2;
        this.f22009h = textView3;
        this.f22010i = textView4;
    }

    @NonNull
    public static ItemDiscoveryPaiweiListBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.avatarBg;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.avatarBg);
            if (frameLayout != null) {
                i4 = R.id.ivRank;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivRank);
                if (imageView != null) {
                    i4 = R.id.tvDesc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                    if (textView != null) {
                        i4 = R.id.tvNickname;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNickname);
                        if (textView2 != null) {
                            i4 = R.id.tvRank;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRank);
                            if (textView3 != null) {
                                i4 = R.id.tvScore;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScore);
                                if (textView4 != null) {
                                    return new ItemDiscoveryPaiweiListBinding((ConstraintLayout) view, simpleDraweeView, frameLayout, imageView, textView, textView2, textView3, textView4);
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
    public static ItemDiscoveryPaiweiListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22003b;
    }

    @NonNull
    public static ItemDiscoveryPaiweiListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_discovery_paiwei_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
