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
public final class MgForumTitleDetailLayoutBinding implements ViewBinding {
    @NonNull
    public final SimpleDraweeView A;
    @NonNull
    public final RelativeLayout B;
    @NonNull
    public final ImageView C;
    @NonNull
    public final VipView D;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24308b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24309c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24310d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24311e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24312f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f24313g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f24314h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24315i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24316j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24317k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24318l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f24319m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f24320n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24321o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24322p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f24323q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24324r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f24325s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f24326t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f24327u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f24328v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f24329w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f24330x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f24331y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final Button f24332z;

    private MgForumTitleDetailLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Button button, @NonNull Button button2, @NonNull ImageView imageView2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ImageView imageView3, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView4, @NonNull TextView textView11, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull ImageView imageView5, @NonNull Button button3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView6, @NonNull VipView vipView) {
        this.f24308b = relativeLayout;
        this.f24309c = imageView;
        this.f24310d = textView;
        this.f24311e = textView2;
        this.f24312f = textView3;
        this.f24313g = button;
        this.f24314h = button2;
        this.f24315i = imageView2;
        this.f24316j = textView4;
        this.f24317k = textView5;
        this.f24318l = textView6;
        this.f24319m = imageView3;
        this.f24320n = textView7;
        this.f24321o = textView8;
        this.f24322p = textView9;
        this.f24323q = textView10;
        this.f24324r = relativeLayout2;
        this.f24325s = imageView4;
        this.f24326t = textView11;
        this.f24327u = linearLayout;
        this.f24328v = linearLayout2;
        this.f24329w = textView12;
        this.f24330x = textView13;
        this.f24331y = imageView5;
        this.f24332z = button3;
        this.A = simpleDraweeView;
        this.B = relativeLayout3;
        this.C = imageView6;
        this.D = vipView;
    }

    @NonNull
    public static MgForumTitleDetailLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.checkInFlag;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.checkInFlag);
            if (textView != null) {
                i4 = R.id.checkInImage;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.checkInImage);
                if (textView2 != null) {
                    i4 = R.id.copperTitleTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.copperTitleTv);
                    if (textView3 != null) {
                        i4 = R.id.forum_post;
                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post);
                        if (button != null) {
                            i4 = R.id.forum_post_host;
                            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_host);
                            if (button2 != null) {
                                i4 = R.id.forum_post_moderator;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_moderator);
                                if (imageView2 != null) {
                                    i4 = R.id.forum_post_nickname;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_nickname);
                                    if (textView4 != null) {
                                        i4 = R.id.forum_post_stickie;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_stickie);
                                        if (textView5 != null) {
                                            i4 = R.id.forum_title_center;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_title_center);
                                            if (textView6 != null) {
                                                i4 = R.id.iv_more;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more);
                                                if (imageView3 != null) {
                                                    i4 = R.id.layout_title;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.layout_title);
                                                    if (textView7 != null) {
                                                        i4 = R.id.layout_title_right;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.layout_title_right);
                                                        if (textView8 != null) {
                                                            i4 = R.id.member_honor;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.member_honor);
                                                            if (textView9 != null) {
                                                                i4 = R.id.moderator;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.moderator);
                                                                if (textView10 != null) {
                                                                    i4 = R.id.myProfileMessage;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.myProfileMessage);
                                                                    if (relativeLayout != null) {
                                                                        i4 = R.id.officialIcon;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.officialIcon);
                                                                        if (imageView4 != null) {
                                                                            i4 = R.id.postFuncHost;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.postFuncHost);
                                                                            if (textView11 != null) {
                                                                                i4 = R.id.postFuncMore;
                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.postFuncMore);
                                                                                if (linearLayout != null) {
                                                                                    i4 = R.id.postFunction;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.postFunction);
                                                                                    if (linearLayout2 != null) {
                                                                                        i4 = R.id.profileMessageFlag;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.profileMessageFlag);
                                                                                        if (textView12 != null) {
                                                                                            i4 = R.id.profileMessageFlagNoNum;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.profileMessageFlagNoNum);
                                                                                            if (textView13 != null) {
                                                                                                i4 = R.id.profileMessageImage;
                                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.profileMessageImage);
                                                                                                if (imageView5 != null) {
                                                                                                    i4 = R.id.release;
                                                                                                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.release);
                                                                                                    if (button3 != null) {
                                                                                                        i4 = R.id.sdv_head;
                                                                                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_head);
                                                                                                        if (simpleDraweeView != null) {
                                                                                                            i4 = R.id.search;
                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.search);
                                                                                                            if (relativeLayout2 != null) {
                                                                                                                i4 = R.id.sreach_image;
                                                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.sreach_image);
                                                                                                                if (imageView6 != null) {
                                                                                                                    i4 = R.id.vipFlag;
                                                                                                                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipFlag);
                                                                                                                    if (vipView != null) {
                                                                                                                        return new MgForumTitleDetailLayoutBinding((RelativeLayout) view, imageView, textView, textView2, textView3, button, button2, imageView2, textView4, textView5, textView6, imageView3, textView7, textView8, textView9, textView10, relativeLayout, imageView4, textView11, linearLayout, linearLayout2, textView12, textView13, imageView5, button3, simpleDraweeView, relativeLayout2, imageView6, vipView);
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
    public static MgForumTitleDetailLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24308b;
    }

    @NonNull
    public static MgForumTitleDetailLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_title_detail_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
