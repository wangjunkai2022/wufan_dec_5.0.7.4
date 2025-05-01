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
public final class MgFragmentGameTopicHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24413b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f24414c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24415d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24416e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24417f;

    private MgFragmentGameTopicHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f24413b = linearLayout;
        this.f24414c = simpleDraweeView;
        this.f24415d = view;
        this.f24416e = textView;
        this.f24417f = linearLayout2;
    }

    @NonNull
    public static MgFragmentGameTopicHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_avatar_src;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forum_post_avatar_src);
        if (simpleDraweeView != null) {
            i4 = R.id.forum_post_divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
            if (findChildViewById != null) {
                i4 = R.id.forum_post_nickname;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_nickname);
                if (textView != null) {
                    i4 = R.id.layout_posts_top;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_posts_top);
                    if (linearLayout != null) {
                        return new MgFragmentGameTopicHeaderBinding((LinearLayout) view, simpleDraweeView, findChildViewById, textView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgFragmentGameTopicHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24413b;
    }

    @NonNull
    public static MgFragmentGameTopicHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_fragment_game_topic_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
