package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumMyDynamicActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23987b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23988c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f23989d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final VideoLayoutBinding f23990e;

    private MgForumMyDynamicActivityBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull FrameLayout frameLayout, @NonNull VideoLayoutBinding videoLayoutBinding) {
        this.f23987b = linearLayout;
        this.f23988c = mgForumTitleLayoutBinding;
        this.f23989d = frameLayout;
        this.f23990e = videoLayoutBinding;
    }

    @NonNull
    public static MgForumMyDynamicActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContainer);
            if (frameLayout != null) {
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.videoLayout);
                if (findChildViewById2 != null) {
                    return new MgForumMyDynamicActivityBinding((LinearLayout) view, bind, frameLayout, VideoLayoutBinding.bind(findChildViewById2));
                }
                i4 = R.id.videoLayout;
            } else {
                i4 = R.id.videoContainer;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumMyDynamicActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23987b;
    }

    @NonNull
    public static MgForumMyDynamicActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_my_dynamic_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
