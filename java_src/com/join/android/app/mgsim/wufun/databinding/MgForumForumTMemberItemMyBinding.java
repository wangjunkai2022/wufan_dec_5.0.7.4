package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgForumForumTMemberItemMyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23911b;

    private MgForumForumTMemberItemMyBinding(@NonNull RelativeLayout relativeLayout) {
        this.f23911b = relativeLayout;
    }

    @NonNull
    public static MgForumForumTMemberItemMyBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgForumForumTMemberItemMyBinding((RelativeLayout) view);
    }

    @NonNull
    public static MgForumForumTMemberItemMyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23911b;
    }

    @NonNull
    public static MgForumForumTMemberItemMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_t_member_item_my, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
