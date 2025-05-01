package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
/* loaded from: classes3.dex */
public final class MgForumForumGiftDetailActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23857b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f23858c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23859d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23860e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23861f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f23862g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23863h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23864i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23865j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23866k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f23867l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f23868m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f23869n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f23870o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final Button f23871p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f23872q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ForumLoadingView f23873r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f23874s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f23875t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final Button f23876u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f23877v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f23878w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f23879x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final Button f23880y;

    private MgForumForumGiftDetailActivityBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayout linearLayout2, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull Button button, @NonNull ImageView imageView, @NonNull ForumLoadingView forumLoadingView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView11, @NonNull Button button2, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull Button button3) {
        this.f23857b = linearLayout;
        this.f23858c = mgForumTitleLayoutBinding;
        this.f23859d = textView;
        this.f23860e = textView2;
        this.f23861f = textView3;
        this.f23862g = simpleDraweeView;
        this.f23863h = textView4;
        this.f23864i = textView5;
        this.f23865j = linearLayout2;
        this.f23866k = textView6;
        this.f23867l = textView7;
        this.f23868m = textView8;
        this.f23869n = textView9;
        this.f23870o = textView10;
        this.f23871p = button;
        this.f23872q = imageView;
        this.f23873r = forumLoadingView;
        this.f23874s = linearLayout3;
        this.f23875t = textView11;
        this.f23876u = button2;
        this.f23877v = linearLayout4;
        this.f23878w = linearLayout5;
        this.f23879x = linearLayout6;
        this.f23880y = button3;
    }

    @NonNull
    public static MgForumForumGiftDetailActivityBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.cdkNum;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cdkNum);
            if (textView != null) {
                i4 = R.id.giftContent;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.giftContent);
                if (textView2 != null) {
                    i4 = R.id.giftExpireDate;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.giftExpireDate);
                    if (textView3 != null) {
                        i4 = R.id.giftIcon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.giftIcon);
                        if (simpleDraweeView != null) {
                            i4 = R.id.giftName;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.giftName);
                            if (textView4 != null) {
                                i4 = R.id.giftRetain;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.giftRetain);
                                if (textView5 != null) {
                                    i4 = R.id.giftRetainLayout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.giftRetainLayout);
                                    if (linearLayout != null) {
                                        i4 = R.id.giftRetainTop;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.giftRetainTop);
                                        if (textView6 != null) {
                                            i4 = R.id.giftTip;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.giftTip);
                                            if (textView7 != null) {
                                                i4 = R.id.giftTitle;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.giftTitle);
                                                if (textView8 != null) {
                                                    i4 = R.id.giftUseContent;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.giftUseContent);
                                                    if (textView9 != null) {
                                                        i4 = R.id.giftUseTitle;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.giftUseTitle);
                                                        if (textView10 != null) {
                                                            i4 = R.id.goToOem;
                                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.goToOem);
                                                            if (button != null) {
                                                                i4 = R.id.imageView2;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
                                                                if (imageView != null) {
                                                                    i4 = R.id.loadingView;
                                                                    ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                                                                    if (forumLoadingView != null) {
                                                                        i4 = R.id.myGiftPackage;
                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.myGiftPackage);
                                                                        if (linearLayout2 != null) {
                                                                            i4 = R.id.myGiftPackageCount;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.myGiftPackageCount);
                                                                            if (textView11 != null) {
                                                                                i4 = R.id.oemType3Tip;
                                                                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.oemType3Tip);
                                                                                if (button2 != null) {
                                                                                    i4 = R.id.oemTypeLayout1;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.oemTypeLayout1);
                                                                                    if (linearLayout3 != null) {
                                                                                        i4 = R.id.oemTypeLayout2;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.oemTypeLayout2);
                                                                                        if (linearLayout4 != null) {
                                                                                            i4 = R.id.oemTypeLayout3;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.oemTypeLayout3);
                                                                                            if (linearLayout5 != null) {
                                                                                                i4 = R.id.receiveButton;
                                                                                                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.receiveButton);
                                                                                                if (button3 != null) {
                                                                                                    return new MgForumForumGiftDetailActivityBinding((LinearLayout) view, bind, textView, textView2, textView3, simpleDraweeView, textView4, textView5, linearLayout, textView6, textView7, textView8, textView9, textView10, button, imageView, forumLoadingView, linearLayout2, textView11, button2, linearLayout3, linearLayout4, linearLayout5, button3);
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
    public static MgForumForumGiftDetailActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23857b;
    }

    @NonNull
    public static MgForumForumGiftDetailActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_gift_detail_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
