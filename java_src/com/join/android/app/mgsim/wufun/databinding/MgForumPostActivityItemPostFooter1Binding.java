package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemPostFooter1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24050b;

    private MgForumPostActivityItemPostFooter1Binding(@NonNull LinearLayout linearLayout) {
        this.f24050b = linearLayout;
    }

    @NonNull
    public static MgForumPostActivityItemPostFooter1Binding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgForumPostActivityItemPostFooter1Binding((LinearLayout) view);
    }

    @NonNull
    public static MgForumPostActivityItemPostFooter1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24050b;
    }

    @NonNull
    public static MgForumPostActivityItemPostFooter1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_footer1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
