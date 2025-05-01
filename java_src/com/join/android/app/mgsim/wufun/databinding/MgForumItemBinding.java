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
import com.join.android.app.common.view.RoundImageView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23958b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RoundImageView f23959c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23960d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23961e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23962f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f23963g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f23964h;

    private MgForumItemBinding(@NonNull LinearLayout linearLayout, @NonNull RoundImageView roundImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f23958b = linearLayout;
        this.f23959c = roundImageView;
        this.f23960d = textView;
        this.f23961e = textView2;
        this.f23962f = textView3;
        this.f23963g = imageView;
        this.f23964h = imageView2;
    }

    @NonNull
    public static MgForumItemBinding bind(@NonNull View view) {
        int i4 = R.id.forum_icon;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, R.id.forum_icon);
        if (roundImageView != null) {
            i4 = R.id.forum_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_name);
            if (textView != null) {
                i4 = R.id.forum_posts_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_posts_tv);
                if (textView2 != null) {
                    i4 = R.id.forum_users_tv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_users_tv);
                    if (textView3 != null) {
                        i4 = R.id.imageView6;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView6);
                        if (imageView != null) {
                            i4 = R.id.imageView7;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView7);
                            if (imageView2 != null) {
                                return new MgForumItemBinding((LinearLayout) view, roundImageView, textView, textView2, textView3, imageView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23958b;
    }

    @NonNull
    public static MgForumItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
