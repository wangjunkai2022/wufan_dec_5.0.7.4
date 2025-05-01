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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemPostMessageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24138b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24139c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24140d;

    private MgForumPostActivityItemPostMessageBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f24138b = linearLayout;
        this.f24139c = textView;
        this.f24140d = linearLayout2;
    }

    @NonNull
    public static MgForumPostActivityItemPostMessageBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_message);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new MgForumPostActivityItemPostMessageBinding(linearLayout, textView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forum_post_message)));
    }

    @NonNull
    public static MgForumPostActivityItemPostMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24138b;
    }

    @NonNull
    public static MgForumPostActivityItemPostMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_message, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
