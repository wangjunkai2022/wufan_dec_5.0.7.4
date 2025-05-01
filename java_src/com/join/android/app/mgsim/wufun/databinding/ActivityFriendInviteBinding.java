package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityFriendInviteBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16188b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16189c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f16190d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16191e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16192f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f16193g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f16194h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f16195i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16196j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16197k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16198l;

    private ActivityFriendInviteBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f16188b = relativeLayout;
        this.f16189c = textView;
        this.f16190d = simpleDraweeView;
        this.f16191e = textView2;
        this.f16192f = textView3;
        this.f16193g = imageView;
        this.f16194h = imageView2;
        this.f16195i = view;
        this.f16196j = textView4;
        this.f16197k = textView5;
        this.f16198l = textView6;
    }

    @NonNull
    public static ActivityFriendInviteBinding bind(@NonNull View view) {
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
                        i4 = R.id.imageView66;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView66);
                        if (imageView != null) {
                            i4 = R.id.imageView68;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView68);
                            if (imageView2 != null) {
                                i4 = R.id.iv_close;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv_close);
                                if (findChildViewById != null) {
                                    i4 = R.id.name;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                    if (textView4 != null) {
                                        i4 = R.id.textView84;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView84);
                                        if (textView5 != null) {
                                            i4 = R.id.textView97;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView97);
                                            if (textView6 != null) {
                                                return new ActivityFriendInviteBinding((RelativeLayout) view, textView, simpleDraweeView, textView2, textView3, imageView, imageView2, findChildViewById, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityFriendInviteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16188b;
    }

    @NonNull
    public static ActivityFriendInviteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_friend_invite, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
