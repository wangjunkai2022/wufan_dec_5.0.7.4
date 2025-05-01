package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumProfileMessageItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24219b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24220c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24221d;

    private MgForumProfileMessageItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull TextView textView) {
        this.f24219b = relativeLayout;
        this.f24220c = view;
        this.f24221d = textView;
    }

    @NonNull
    public static MgForumProfileMessageItemBinding bind(@NonNull View view) {
        int i4 = R.id.mg_forum_profile_message_divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.mg_forum_profile_message_divider);
        if (findChildViewById != null) {
            i4 = R.id.mg_forum_profile_message_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.mg_forum_profile_message_tv);
            if (textView != null) {
                return new MgForumProfileMessageItemBinding((RelativeLayout) view, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumProfileMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24219b;
    }

    @NonNull
    public static MgForumProfileMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_message_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
