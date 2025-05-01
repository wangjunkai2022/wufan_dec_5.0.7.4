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
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class MgForumForumTMemberItemModeratorsItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23907b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23908c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23909d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final VipView f23910e;

    private MgForumForumTMemberItemModeratorsItemBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull VipView vipView) {
        this.f23907b = linearLayout;
        this.f23908c = simpleDraweeView;
        this.f23909d = textView;
        this.f23910e = vipView;
    }

    @NonNull
    public static MgForumForumTMemberItemModeratorsItemBinding bind(@NonNull View view) {
        int i4 = R.id.itemImg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.itemImg);
        if (simpleDraweeView != null) {
            i4 = R.id.itemName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemName);
            if (textView != null) {
                i4 = R.id.vipView;
                VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipView);
                if (vipView != null) {
                    return new MgForumForumTMemberItemModeratorsItemBinding((LinearLayout) view, simpleDraweeView, textView, vipView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumForumTMemberItemModeratorsItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23907b;
    }

    @NonNull
    public static MgForumForumTMemberItemModeratorsItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_t_member_item_moderators_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
