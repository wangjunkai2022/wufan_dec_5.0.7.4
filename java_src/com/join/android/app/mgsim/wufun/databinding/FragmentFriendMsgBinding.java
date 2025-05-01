package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentFriendMsgBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19801b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f19802c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19803d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f19804e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19805f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19806g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19807h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ViewPager f19808i;

    private FragmentFriendMsgBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ViewPager viewPager) {
        this.f19801b = constraintLayout;
        this.f19802c = view;
        this.f19803d = imageView;
        this.f19804e = view2;
        this.f19805f = textView;
        this.f19806g = textView2;
        this.f19807h = textView3;
        this.f19808i = viewPager;
    }

    @NonNull
    public static FragmentFriendMsgBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.close);
        if (findChildViewById != null) {
            i4 = R.id.iv1;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
            if (imageView != null) {
                i4 = R.id.likeDot;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.likeDot);
                if (findChildViewById2 != null) {
                    i4 = R.id.tabLike;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tabLike);
                    if (textView != null) {
                        i4 = R.id.tabReq;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tabReq);
                        if (textView2 != null) {
                            i4 = R.id.textView48;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView48);
                            if (textView3 != null) {
                                i4 = R.id.viewPager;
                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                if (viewPager != null) {
                                    return new FragmentFriendMsgBinding((ConstraintLayout) view, findChildViewById, imageView, findChildViewById2, textView, textView2, textView3, viewPager);
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
    public static FragmentFriendMsgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19801b;
    }

    @NonNull
    public static FragmentFriendMsgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_msg, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
