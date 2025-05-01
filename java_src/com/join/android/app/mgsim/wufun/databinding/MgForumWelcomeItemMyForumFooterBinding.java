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
public final class MgForumWelcomeItemMyForumFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24387b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24388c;

    private MgForumWelcomeItemMyForumFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f24387b = linearLayout;
        this.f24388c = textView;
    }

    @NonNull
    public static MgForumWelcomeItemMyForumFooterBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.my_forum_count_tv);
        if (textView != null) {
            return new MgForumWelcomeItemMyForumFooterBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.my_forum_count_tv)));
    }

    @NonNull
    public static MgForumWelcomeItemMyForumFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24387b;
    }

    @NonNull
    public static MgForumWelcomeItemMyForumFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_my_forum_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
