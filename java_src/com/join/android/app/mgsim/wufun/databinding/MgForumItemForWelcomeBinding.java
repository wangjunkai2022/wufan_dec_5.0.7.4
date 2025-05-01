package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumItemForWelcomeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23972b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23973c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f23974d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23975e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23976f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f23977g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f23978h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23979i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23980j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23981k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f23982l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f23983m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f23984n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f23985o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f23986p;

    private MgForumItemForWelcomeBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView5, @NonNull LinearLayout linearLayout5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f23972b = linearLayout;
        this.f23973c = textView;
        this.f23974d = button;
        this.f23975e = linearLayout2;
        this.f23976f = textView2;
        this.f23977g = linearLayout3;
        this.f23978h = simpleDraweeView;
        this.f23979i = textView3;
        this.f23980j = linearLayout4;
        this.f23981k = textView4;
        this.f23982l = relativeLayout;
        this.f23983m = textView5;
        this.f23984n = linearLayout5;
        this.f23985o = textView6;
        this.f23986p = textView7;
    }

    @NonNull
    public static MgForumItemForWelcomeBinding bind(@NonNull View view) {
        int i4 = R.id.forum_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_desc);
        if (textView != null) {
            i4 = R.id.forum_follow;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_follow);
            if (button != null) {
                i4 = R.id.forum_follow_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_follow_layout);
                if (linearLayout != null) {
                    i4 = R.id.forum_follow_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_follow_tv);
                    if (textView2 != null) {
                        i4 = R.id.forumFollowsParent;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forumFollowsParent);
                        if (linearLayout2 != null) {
                            i4 = R.id.forum_icon;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forum_icon);
                            if (simpleDraweeView != null) {
                                i4 = R.id.forum_name;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_name);
                                if (textView3 != null) {
                                    i4 = R.id.forumPostsParent;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forumPostsParent);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.forum_posts_tv;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_posts_tv);
                                        if (textView4 != null) {
                                            i4 = R.id.forumTodayPostsParent;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.forumTodayPostsParent);
                                            if (relativeLayout != null) {
                                                i4 = R.id.forum_today_posts_tv;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_today_posts_tv);
                                                if (textView5 != null) {
                                                    i4 = R.id.forumUsersParent;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forumUsersParent);
                                                    if (linearLayout4 != null) {
                                                        i4 = R.id.forum_users_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_users_tv);
                                                        if (textView6 != null) {
                                                            i4 = R.id.textView14;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView14);
                                                            if (textView7 != null) {
                                                                return new MgForumItemForWelcomeBinding((LinearLayout) view, textView, button, linearLayout, textView2, linearLayout2, simpleDraweeView, textView3, linearLayout3, textView4, relativeLayout, textView5, linearLayout4, textView6, textView7);
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
    public static MgForumItemForWelcomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23972b;
    }

    @NonNull
    public static MgForumItemForWelcomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_item_for_welcome, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
