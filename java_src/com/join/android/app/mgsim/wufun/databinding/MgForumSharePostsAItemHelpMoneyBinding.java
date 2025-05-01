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
public final class MgForumSharePostsAItemHelpMoneyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24301b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f24302c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24303d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24304e;

    private MgForumSharePostsAItemHelpMoneyBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f24301b = relativeLayout;
        this.f24302c = relativeLayout2;
        this.f24303d = imageView;
        this.f24304e = textView;
    }

    @NonNull
    public static MgForumSharePostsAItemHelpMoneyBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.itemRadioImg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.itemRadioImg);
        if (imageView != null) {
            i4 = R.id.itemRadioText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemRadioText);
            if (textView != null) {
                return new MgForumSharePostsAItemHelpMoneyBinding(relativeLayout, relativeLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSharePostsAItemHelpMoneyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24301b;
    }

    @NonNull
    public static MgForumSharePostsAItemHelpMoneyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_share_posts_a_item_help_money, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
