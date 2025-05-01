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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class MgForumForumTMemberItemModeratorsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23904b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f23905c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23906d;

    private MgForumForumTMemberItemModeratorsBinding(@NonNull LinearLayout linearLayout, @NonNull HListView hListView, @NonNull TextView textView) {
        this.f23904b = linearLayout;
        this.f23905c = hListView;
        this.f23906d = textView;
    }

    @NonNull
    public static MgForumForumTMemberItemModeratorsBinding bind(@NonNull View view) {
        int i4 = R.id.list;
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.list);
        if (hListView != null) {
            i4 = R.id.noMoreModerator;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noMoreModerator);
            if (textView != null) {
                return new MgForumForumTMemberItemModeratorsBinding((LinearLayout) view, hListView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumForumTMemberItemModeratorsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23904b;
    }

    @NonNull
    public static MgForumForumTMemberItemModeratorsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_t_member_item_moderators, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
