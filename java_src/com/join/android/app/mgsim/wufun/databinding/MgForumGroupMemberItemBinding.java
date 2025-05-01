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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumGroupMemberItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23937b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23938c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23939d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23940e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23941f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23942g;

    private MgForumGroupMemberItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23937b = relativeLayout;
        this.f23938c = textView;
        this.f23939d = simpleDraweeView;
        this.f23940e = textView2;
        this.f23941f = textView3;
        this.f23942g = textView4;
    }

    @NonNull
    public static MgForumGroupMemberItemBinding bind(@NonNull View view) {
        int i4 = R.id.addTime;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.addTime);
        if (textView != null) {
            i4 = R.id.avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
            if (simpleDraweeView != null) {
                i4 = R.id.grade;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.grade);
                if (textView2 != null) {
                    i4 = R.id.groupAction;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.groupAction);
                    if (textView3 != null) {
                        i4 = R.id.nickName;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.nickName);
                        if (textView4 != null) {
                            return new MgForumGroupMemberItemBinding((RelativeLayout) view, textView, simpleDraweeView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumGroupMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23937b;
    }

    @NonNull
    public static MgForumGroupMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_group_member_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
