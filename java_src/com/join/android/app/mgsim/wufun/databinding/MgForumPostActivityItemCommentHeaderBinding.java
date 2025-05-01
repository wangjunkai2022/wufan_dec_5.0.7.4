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
public final class MgForumPostActivityItemCommentHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24019b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24020c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24021d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24022e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24023f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24024g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24025h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24026i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final Button f24027j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f24028k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f24029l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f24030m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f24031n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24032o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final VipView f24033p;

    private MgForumPostActivityItemCommentHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageView imageView2, @NonNull Button button, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull VipView vipView) {
        this.f24019b = relativeLayout;
        this.f24020c = textView;
        this.f24021d = simpleDraweeView;
        this.f24022e = textView2;
        this.f24023f = textView3;
        this.f24024g = imageView;
        this.f24025h = view;
        this.f24026i = imageView2;
        this.f24027j = button;
        this.f24028k = imageView3;
        this.f24029l = imageView4;
        this.f24030m = linearLayout;
        this.f24031n = textView4;
        this.f24032o = textView5;
        this.f24033p = vipView;
    }

    @NonNull
    public static MgForumPostActivityItemCommentHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.comment_add_time;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_add_time);
        if (textView != null) {
            i4 = R.id.comment_avatar_src;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.comment_avatar_src);
            if (simpleDraweeView != null) {
                i4 = R.id.comment_floor;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_floor);
                if (textView2 != null) {
                    i4 = R.id.comment_nickname;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_nickname);
                    if (textView3 != null) {
                        i4 = R.id.comment_reply;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.comment_reply);
                        if (imageView != null) {
                            i4 = R.id.divider;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                            if (findChildViewById != null) {
                                i4 = R.id.flagBestAnswer;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.flagBestAnswer);
                                if (imageView2 != null) {
                                    i4 = R.id.forum_post_host;
                                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_host);
                                    if (button != null) {
                                        i4 = R.id.forum_post_moderator;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_moderator);
                                        if (imageView3 != null) {
                                            i4 = R.id.isOfficial;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.isOfficial);
                                            if (imageView4 != null) {
                                                i4 = R.id.ll_main;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_main);
                                                if (linearLayout != null) {
                                                    i4 = R.id.member_honor;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.member_honor);
                                                    if (textView4 != null) {
                                                        i4 = R.id.moderator;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.moderator);
                                                        if (textView5 != null) {
                                                            i4 = R.id.vipFlag;
                                                            VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipFlag);
                                                            if (vipView != null) {
                                                                return new MgForumPostActivityItemCommentHeaderBinding((RelativeLayout) view, textView, simpleDraweeView, textView2, textView3, imageView, findChildViewById, imageView2, button, imageView3, imageView4, linearLayout, textView4, textView5, vipView);
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
    public static MgForumPostActivityItemCommentHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24019b;
    }

    @NonNull
    public static MgForumPostActivityItemCommentHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_comment_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
