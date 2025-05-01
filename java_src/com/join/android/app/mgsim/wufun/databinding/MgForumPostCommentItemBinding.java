package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.common.view.RoundImageView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class MgForumPostCommentItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24160b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24161c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RoundImageView f24162d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f24163e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f24164f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24165g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24166h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24167i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24168j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f24169k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f24170l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f24171m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f24172n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24173o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24174p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f24175q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f24176r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final View f24177s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f24178t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f24179u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final VipView f24180v;

    private MgForumPostCommentItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull RoundImageView roundImageView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView10, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView11, @NonNull VipView vipView) {
        this.f24160b = relativeLayout;
        this.f24161c = textView;
        this.f24162d = roundImageView;
        this.f24163e = linearLayout;
        this.f24164f = imageView;
        this.f24165g = imageView2;
        this.f24166h = imageView3;
        this.f24167i = imageView4;
        this.f24168j = imageView5;
        this.f24169k = imageView6;
        this.f24170l = imageView7;
        this.f24171m = imageView8;
        this.f24172n = imageView9;
        this.f24173o = textView2;
        this.f24174p = textView3;
        this.f24175q = imageView10;
        this.f24176r = linearLayout2;
        this.f24177s = view;
        this.f24178t = linearLayout3;
        this.f24179u = imageView11;
        this.f24180v = vipView;
    }

    @NonNull
    public static MgForumPostCommentItemBinding bind(@NonNull View view) {
        int i4 = R.id.comment_add_time;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_add_time);
        if (textView != null) {
            i4 = R.id.comment_avatar_src;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, R.id.comment_avatar_src);
            if (roundImageView != null) {
                i4 = R.id.comment_images;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.comment_images);
                if (linearLayout != null) {
                    i4 = R.id.comment_img_1;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_1);
                    if (imageView != null) {
                        i4 = R.id.comment_img_2;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_2);
                        if (imageView2 != null) {
                            i4 = R.id.comment_img_3;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_3);
                            if (imageView3 != null) {
                                i4 = R.id.comment_img_4;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_4);
                                if (imageView4 != null) {
                                    i4 = R.id.comment_img_5;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_5);
                                    if (imageView5 != null) {
                                        i4 = R.id.comment_img_6;
                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_6);
                                        if (imageView6 != null) {
                                            i4 = R.id.comment_img_7;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_7);
                                            if (imageView7 != null) {
                                                i4 = R.id.comment_img_8;
                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_8);
                                                if (imageView8 != null) {
                                                    i4 = R.id.comment_img_9;
                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_img_9);
                                                    if (imageView9 != null) {
                                                        i4 = R.id.comment_message;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_message);
                                                        if (textView2 != null) {
                                                            i4 = R.id.comment_nickname;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_nickname);
                                                            if (textView3 != null) {
                                                                i4 = R.id.comment_reply;
                                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_reply);
                                                                if (imageView10 != null) {
                                                                    i4 = R.id.comment_reply_container;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.comment_reply_container);
                                                                    if (linearLayout2 != null) {
                                                                        i4 = R.id.comment_reply_divider;
                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.comment_reply_divider);
                                                                        if (findChildViewById != null) {
                                                                            i4 = R.id.linearLayout9;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout9);
                                                                            if (linearLayout3 != null) {
                                                                                i4 = R.id.officialIcon;
                                                                                ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, R.id.officialIcon);
                                                                                if (imageView11 != null) {
                                                                                    i4 = R.id.vipFlag;
                                                                                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipFlag);
                                                                                    if (vipView != null) {
                                                                                        return new MgForumPostCommentItemBinding((RelativeLayout) view, textView, roundImageView, linearLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, textView2, textView3, imageView10, linearLayout2, findChildViewById, linearLayout3, imageView11, vipView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumPostCommentItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24160b;
    }

    @NonNull
    public static MgForumPostCommentItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_comment_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
