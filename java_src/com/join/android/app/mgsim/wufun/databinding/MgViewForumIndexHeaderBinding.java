package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyFlowLayout;
import com.join.mgps.customview.ViewPagerWithADs;
import com.join.mgps.customview.WrapContentListView;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgViewForumIndexHeaderBinding implements ViewBinding {
    @NonNull
    public final WrapContentListView A;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f24690b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ViewPagerWithADs f24691c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MyFlowLayout f24692d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f24693e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24694f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24695g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24696h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24697i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f24698j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f24699k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f24700l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f24701m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f24702n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24703o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f24704p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f24705q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f24706r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f24707s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final RelativeLayout f24708t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f24709u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f24710v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f24711w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f24712x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f24713y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f24714z;

    private MgViewForumIndexHeaderBinding(@NonNull View view, @NonNull ViewPagerWithADs viewPagerWithADs, @NonNull MyFlowLayout myFlowLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull WrapContentListView wrapContentListView) {
        this.f24690b = view;
        this.f24691c = viewPagerWithADs;
        this.f24692d = myFlowLayout;
        this.f24693e = relativeLayout;
        this.f24694f = textView;
        this.f24695g = textView2;
        this.f24696h = imageView;
        this.f24697i = imageView2;
        this.f24698j = linearLayout;
        this.f24699k = linearLayout2;
        this.f24700l = linearLayout3;
        this.f24701m = linearLayout4;
        this.f24702n = imageView3;
        this.f24703o = textView3;
        this.f24704p = relativeLayout2;
        this.f24705q = linearLayout5;
        this.f24706r = linearLayout6;
        this.f24707s = relativeLayout3;
        this.f24708t = relativeLayout4;
        this.f24709u = textView4;
        this.f24710v = textView5;
        this.f24711w = textView6;
        this.f24712x = textView7;
        this.f24713y = textView8;
        this.f24714z = textView9;
        this.A = wrapContentListView;
    }

    @NonNull
    public static MgViewForumIndexHeaderBinding a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.mg_view_forum_index_header, viewGroup);
        return bind(viewGroup);
    }

    @NonNull
    public static MgViewForumIndexHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.ad_viewpager;
        ViewPagerWithADs viewPagerWithADs = (ViewPagerWithADs) ViewBindings.findChildViewById(view, R.id.ad_viewpager);
        if (viewPagerWithADs != null) {
            i4 = R.id.flowLayout;
            MyFlowLayout myFlowLayout = (MyFlowLayout) ViewBindings.findChildViewById(view, R.id.flowLayout);
            if (myFlowLayout != null) {
                i4 = R.id.forumExtFunc;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.forumExtFunc);
                if (relativeLayout != null) {
                    i4 = R.id.forum_more;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_more);
                    if (textView != null) {
                        i4 = R.id.forumRecomm;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forumRecomm);
                        if (textView2 != null) {
                            i4 = R.id.imageView5;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
                            if (imageView != null) {
                                i4 = R.id.ivRefresh;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivRefresh);
                                if (imageView2 != null) {
                                    i4 = R.id.llForumMore;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llForumMore);
                                    if (linearLayout != null) {
                                        i4 = R.id.llGroupAll;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llGroupAll);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.llMyForum;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMyForum);
                                            if (linearLayout3 != null) {
                                                i4 = R.id.more;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.more);
                                                if (linearLayout4 != null) {
                                                    i4 = R.id.moreFunc;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.moreFunc);
                                                    if (imageView3 != null) {
                                                        i4 = R.id.moreTv;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.moreTv);
                                                        if (textView3 != null) {
                                                            i4 = R.id.refreshTag;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.refreshTag);
                                                            if (relativeLayout2 != null) {
                                                                i4 = R.id.rlTagFollow;
                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rlTagFollow);
                                                                if (linearLayout5 != null) {
                                                                    i4 = R.id.rlTagFollowB;
                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rlTagFollowB);
                                                                    if (linearLayout6 != null) {
                                                                        i4 = R.id.rlTagTip;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlTagTip);
                                                                        if (relativeLayout3 != null) {
                                                                            i4 = R.id.section_follow;
                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.section_follow);
                                                                            if (relativeLayout4 != null) {
                                                                                i4 = R.id.textView;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                                                                if (textView4 != null) {
                                                                                    i4 = R.id.textView64;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView64);
                                                                                    if (textView5 != null) {
                                                                                        i4 = R.id.textView66;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView66);
                                                                                        if (textView6 != null) {
                                                                                            i4 = R.id.textView67;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView67);
                                                                                            if (textView7 != null) {
                                                                                                i4 = R.id.textView68;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView68);
                                                                                                if (textView8 != null) {
                                                                                                    i4 = R.id.title;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                                                    if (textView9 != null) {
                                                                                                        i4 = R.id.wrapListView;
                                                                                                        WrapContentListView wrapContentListView = (WrapContentListView) ViewBindings.findChildViewById(view, R.id.wrapListView);
                                                                                                        if (wrapContentListView != null) {
                                                                                                            return new MgViewForumIndexHeaderBinding(view, viewPagerWithADs, myFlowLayout, relativeLayout, textView, textView2, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, imageView3, textView3, relativeLayout2, linearLayout5, linearLayout6, relativeLayout3, relativeLayout4, textView4, textView5, textView6, textView7, textView8, textView9, wrapContentListView);
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f24690b;
    }
}
