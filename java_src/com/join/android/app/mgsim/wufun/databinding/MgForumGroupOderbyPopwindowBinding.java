package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumGroupOderbyPopwindowBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23945b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RadioButton f23946c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f23947d;

    private MgForumGroupOderbyPopwindowBinding(@NonNull RelativeLayout relativeLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2) {
        this.f23945b = relativeLayout;
        this.f23946c = radioButton;
        this.f23947d = radioButton2;
    }

    @NonNull
    public static MgForumGroupOderbyPopwindowBinding bind(@NonNull View view) {
        int i4 = R.id.latestComment;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.latestComment);
        if (radioButton != null) {
            i4 = R.id.latestPost;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.latestPost);
            if (radioButton2 != null) {
                return new MgForumGroupOderbyPopwindowBinding((RelativeLayout) view, radioButton, radioButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumGroupOderbyPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23945b;
    }

    @NonNull
    public static MgForumGroupOderbyPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_group_oderby_popwindow, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
