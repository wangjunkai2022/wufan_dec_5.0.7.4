package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopFriendInviteBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26019b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26020c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26021d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26022e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26023f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26024g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26025h;

    private PopFriendInviteBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f26019b = constraintLayout;
        this.f26020c = textView;
        this.f26021d = simpleDraweeView;
        this.f26022e = textView2;
        this.f26023f = textView3;
        this.f26024g = textView4;
        this.f26025h = textView5;
    }

    @NonNull
    public static PopFriendInviteBinding bind(@NonNull View view) {
        int i4 = R.id.accept;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.accept);
        if (textView != null) {
            i4 = R.id.avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
            if (simpleDraweeView != null) {
                i4 = R.id.decline;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.decline);
                if (textView2 != null) {
                    i4 = R.id.gameName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                    if (textView3 != null) {
                        i4 = R.id.name;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView4 != null) {
                            i4 = R.id.textView46;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView46);
                            if (textView5 != null) {
                                return new PopFriendInviteBinding((ConstraintLayout) view, textView, simpleDraweeView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopFriendInviteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26019b;
    }

    @NonNull
    public static PopFriendInviteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_friend_invite, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
