package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemPostHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24110b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24111c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24112d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f24113e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24114f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f24115g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24116h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f24117i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24118j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24119k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24120l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f24121m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f24122n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f24123o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f24124p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final VipView f24125q;

    private MgForumPostActivityItemPostHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull Button button, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull VipView vipView) {
        this.f24110b = linearLayout;
        this.f24111c = textView;
        this.f24112d = imageView;
        this.f24113e = relativeLayout;
        this.f24114f = textView2;
        this.f24115g = simpleDraweeView;
        this.f24116h = view;
        this.f24117i = button;
        this.f24118j = imageView2;
        this.f24119k = textView3;
        this.f24120l = textView4;
        this.f24121m = linearLayout2;
        this.f24122n = imageView3;
        this.f24123o = imageView4;
        this.f24124p = imageView5;
        this.f24125q = vipView;
    }

    @NonNull
    public static MgForumPostActivityItemPostHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.copperTitleTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.copperTitleTv);
        if (textView != null) {
            i4 = R.id.flagBestAnswer;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.flagBestAnswer);
            if (imageView != null) {
                i4 = R.id.forumExtFunc;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.forumExtFunc);
                if (relativeLayout != null) {
                    i4 = R.id.forum_post_add_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_add_time);
                    if (textView2 != null) {
                        i4 = R.id.forum_post_avatar_src;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forum_post_avatar_src);
                        if (simpleDraweeView != null) {
                            i4 = R.id.forum_post_divider;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
                            if (findChildViewById != null) {
                                i4 = R.id.forum_post_host;
                                Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_host);
                                if (button != null) {
                                    i4 = R.id.forum_post_moderator;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_moderator);
                                    if (imageView2 != null) {
                                        i4 = R.id.forum_post_nickname;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_nickname);
                                        if (textView3 != null) {
                                            i4 = R.id.forum_post_stickie;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_stickie);
                                            if (textView4 != null) {
                                                i4 = R.id.layout_posts_top;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_posts_top);
                                                if (linearLayout != null) {
                                                    i4 = R.id.moreFunc;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.moreFunc);
                                                    if (imageView3 != null) {
                                                        i4 = R.id.officialIcon;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.officialIcon);
                                                        if (imageView4 != null) {
                                                            i4 = R.id.replyFunc;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.replyFunc);
                                                            if (imageView5 != null) {
                                                                i4 = R.id.vipFlag;
                                                                VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipFlag);
                                                                if (vipView != null) {
                                                                    return new MgForumPostActivityItemPostHeaderBinding((LinearLayout) view, textView, imageView, relativeLayout, textView2, simpleDraweeView, findChildViewById, button, imageView2, textView3, textView4, linearLayout, imageView3, imageView4, imageView5, vipView);
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
    public static MgForumPostActivityItemPostHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24110b;
    }

    @NonNull
    public static MgForumPostActivityItemPostHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
