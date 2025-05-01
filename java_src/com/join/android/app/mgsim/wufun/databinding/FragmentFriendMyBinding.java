package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentFriendMyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19821b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f19822c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f19823d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f19824e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19825f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19826g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19827h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19828i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19829j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f19830k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19831l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f19832m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f19833n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView f19834o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f19835p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f19836q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f19837r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f19838s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f19839t;

    private FragmentFriendMyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView6, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ImageView imageView7) {
        this.f19821b = constraintLayout;
        this.f19822c = simpleDraweeView;
        this.f19823d = constraintLayout2;
        this.f19824e = constraintLayout3;
        this.f19825f = imageView;
        this.f19826g = imageView2;
        this.f19827h = imageView3;
        this.f19828i = textView;
        this.f19829j = textView2;
        this.f19830k = linearLayout;
        this.f19831l = textView3;
        this.f19832m = imageView4;
        this.f19833n = imageView5;
        this.f19834o = recyclerView;
        this.f19835p = imageView6;
        this.f19836q = textView4;
        this.f19837r = textView5;
        this.f19838s = textView6;
        this.f19839t = imageView7;
    }

    @NonNull
    public static FragmentFriendMyBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.bottom;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.bottom);
            if (constraintLayout != null) {
                i4 = R.id.constraintLayout7;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout7);
                if (constraintLayout2 != null) {
                    i4 = R.id.icVip;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icVip);
                    if (imageView != null) {
                        i4 = R.id.inviteFriend;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.inviteFriend);
                        if (imageView2 != null) {
                            i4 = R.id.msg;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.msg);
                            if (imageView3 != null) {
                                i4 = R.id.msgCount;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.msgCount);
                                if (textView != null) {
                                    i4 = R.id.nickname;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.nickname);
                                    if (textView2 != null) {
                                        i4 = R.id.noRecord;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.noRecord);
                                        if (linearLayout != null) {
                                            i4 = R.id.onlineState;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.onlineState);
                                            if (textView3 != null) {
                                                i4 = R.id.onlineStateArr;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.onlineStateArr);
                                                if (imageView4 != null) {
                                                    i4 = R.id.qq;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.qq);
                                                    if (imageView5 != null) {
                                                        i4 = R.id.recyclerView;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                                                        if (recyclerView != null) {
                                                            i4 = R.id.searchFriend;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.searchFriend);
                                                            if (imageView6 != null) {
                                                                i4 = R.id.textView89;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView89);
                                                                if (textView4 != null) {
                                                                    i4 = R.id.textView90;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView90);
                                                                    if (textView5 != null) {
                                                                        i4 = R.id.unlogin;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.unlogin);
                                                                        if (textView6 != null) {
                                                                            i4 = R.id.wechat;
                                                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.wechat);
                                                                            if (imageView7 != null) {
                                                                                return new FragmentFriendMyBinding((ConstraintLayout) view, simpleDraweeView, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, textView, textView2, linearLayout, textView3, imageView4, imageView5, recyclerView, imageView6, textView4, textView5, textView6, imageView7);
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
    public static FragmentFriendMyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19821b;
    }

    @NonNull
    public static FragmentFriendMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_my, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
