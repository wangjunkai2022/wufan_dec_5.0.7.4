package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumForumActivityTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23842b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23843c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f23844d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23845e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f23846f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23847g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23848h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23849i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23850j;

    private MgForumForumActivityTopBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f23842b = relativeLayout;
        this.f23843c = textView;
        this.f23844d = button;
        this.f23845e = textView2;
        this.f23846f = simpleDraweeView;
        this.f23847g = textView3;
        this.f23848h = textView4;
        this.f23849i = textView5;
        this.f23850j = textView6;
    }

    @NonNull
    public static MgForumForumActivityTopBinding bind(@NonNull View view) {
        int i4 = R.id.forumDescTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forumDescTv);
        if (textView != null) {
            i4 = R.id.forumFollowBtn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.forumFollowBtn);
            if (button != null) {
                i4 = R.id.forum_follow_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_follow_tv);
                if (textView2 != null) {
                    i4 = R.id.forum_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forum_icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.forum_name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_name);
                        if (textView3 != null) {
                            i4 = R.id.forum_posts_tv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_posts_tv);
                            if (textView4 != null) {
                                i4 = R.id.forum_users_tv;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_users_tv);
                                if (textView5 != null) {
                                    i4 = R.id.textView14;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView14);
                                    if (textView6 != null) {
                                        return new MgForumForumActivityTopBinding((RelativeLayout) view, textView, button, textView2, simpleDraweeView, textView3, textView4, textView5, textView6);
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
    public static MgForumForumActivityTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23842b;
    }

    @NonNull
    public static MgForumForumActivityTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_activity_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
