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
public final class MgForumPostActivityItemPostRichMessageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24143b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24144c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24145d;

    private MgForumPostActivityItemPostRichMessageBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f24143b = linearLayout;
        this.f24144c = textView;
        this.f24145d = linearLayout2;
    }

    @NonNull
    public static MgForumPostActivityItemPostRichMessageBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_message);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new MgForumPostActivityItemPostRichMessageBinding(linearLayout, textView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forum_post_message)));
    }

    @NonNull
    public static MgForumPostActivityItemPostRichMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24143b;
    }

    @NonNull
    public static MgForumPostActivityItemPostRichMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_rich_message, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
