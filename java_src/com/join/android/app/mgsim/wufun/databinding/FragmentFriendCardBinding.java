package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentFriendCardBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19784b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f19785c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19786d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f19787e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19788f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final GridView f19789g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19790h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f19791i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f19792j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19793k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19794l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final Group f19795m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19796n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f19797o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f19798p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f19799q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f19800r;

    private FragmentFriendCardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull GridView gridView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Group group, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f19784b = constraintLayout;
        this.f19785c = simpleDraweeView;
        this.f19786d = textView;
        this.f19787e = view;
        this.f19788f = textView2;
        this.f19789g = gridView;
        this.f19790h = imageView;
        this.f19791i = imageView2;
        this.f19792j = imageView3;
        this.f19793k = textView3;
        this.f19794l = textView4;
        this.f19795m = group;
        this.f19796n = textView5;
        this.f19797o = textView6;
        this.f19798p = textView7;
        this.f19799q = textView8;
        this.f19800r = textView9;
    }

    @NonNull
    public static FragmentFriendCardBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.button;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.button);
            if (textView != null) {
                i4 = R.id.close;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.close);
                if (findChildViewById != null) {
                    i4 = R.id.desc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
                    if (textView2 != null) {
                        i4 = R.id.gridView;
                        GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.gridView);
                        if (gridView != null) {
                            i4 = R.id.icLike;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icLike);
                            if (imageView != null) {
                                i4 = R.id.icVip;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icVip);
                                if (imageView2 != null) {
                                    i4 = R.id.iv1;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
                                    if (imageView3 != null) {
                                        i4 = R.id.lbLevel;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.lbLevel);
                                        if (textView3 != null) {
                                            i4 = R.id.likeCount;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.likeCount);
                                            if (textView4 != null) {
                                                i4 = R.id.main;
                                                Group group = (Group) ViewBindings.findChildViewById(view, R.id.main);
                                                if (group != null) {
                                                    i4 = R.id.name;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                    if (textView5 != null) {
                                                        i4 = R.id.netFailed;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.netFailed);
                                                        if (textView6 != null) {
                                                            i4 = R.id.noRecord;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.noRecord);
                                                            if (textView7 != null) {
                                                                i4 = R.id.state;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.state);
                                                                if (textView8 != null) {
                                                                    i4 = R.id.textView48;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.textView48);
                                                                    if (textView9 != null) {
                                                                        return new FragmentFriendCardBinding((ConstraintLayout) view, simpleDraweeView, textView, findChildViewById, textView2, gridView, imageView, imageView2, imageView3, textView3, textView4, group, textView5, textView6, textView7, textView8, textView9);
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
    public static FragmentFriendCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19784b;
    }

    @NonNull
    public static FragmentFriendCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_card, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
