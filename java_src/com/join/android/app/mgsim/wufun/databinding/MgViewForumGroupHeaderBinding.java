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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentListView;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgViewForumGroupHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f24675b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24676c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f24677d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24678e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24679f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24680g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f24681h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f24682i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f24683j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f24684k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f24685l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f24686m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f24687n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24688o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final WrapContentListView f24689p;

    private MgViewForumGroupHeaderBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull SimpleDraweeView simpleDraweeView5, @NonNull SimpleDraweeView simpleDraweeView6, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull WrapContentListView wrapContentListView) {
        this.f24675b = view;
        this.f24676c = imageView;
        this.f24677d = relativeLayout;
        this.f24678e = textView;
        this.f24679f = textView2;
        this.f24680g = textView3;
        this.f24681h = simpleDraweeView;
        this.f24682i = simpleDraweeView2;
        this.f24683j = simpleDraweeView3;
        this.f24684k = simpleDraweeView4;
        this.f24685l = simpleDraweeView5;
        this.f24686m = simpleDraweeView6;
        this.f24687n = linearLayout;
        this.f24688o = textView4;
        this.f24689p = wrapContentListView;
    }

    @NonNull
    public static MgViewForumGroupHeaderBinding a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.mg_view_forum_group_header, viewGroup);
        return bind(viewGroup);
    }

    @NonNull
    public static MgViewForumGroupHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
        if (imageView != null) {
            i4 = R.id.arrowParent;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.arrowParent);
            if (relativeLayout != null) {
                i4 = R.id.count;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
                if (textView != null) {
                    i4 = R.id.desc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
                    if (textView2 != null) {
                        i4 = R.id.follow;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.follow);
                        if (textView3 != null) {
                            i4 = R.id.icon;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                            if (simpleDraweeView != null) {
                                i4 = R.id.img1;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img1);
                                if (simpleDraweeView2 != null) {
                                    i4 = R.id.img2;
                                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img2);
                                    if (simpleDraweeView3 != null) {
                                        i4 = R.id.img3;
                                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img3);
                                        if (simpleDraweeView4 != null) {
                                            i4 = R.id.img4;
                                            SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img4);
                                            if (simpleDraweeView5 != null) {
                                                i4 = R.id.img5;
                                                SimpleDraweeView simpleDraweeView6 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img5);
                                                if (simpleDraweeView6 != null) {
                                                    i4 = R.id.memberLL;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.memberLL);
                                                    if (linearLayout != null) {
                                                        i4 = R.id.name;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                        if (textView4 != null) {
                                                            i4 = R.id.wrapListView;
                                                            WrapContentListView wrapContentListView = (WrapContentListView) ViewBindings.findChildViewById(view, R.id.wrapListView);
                                                            if (wrapContentListView != null) {
                                                                return new MgViewForumGroupHeaderBinding(view, imageView, relativeLayout, textView, textView2, textView3, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, simpleDraweeView5, simpleDraweeView6, linearLayout, textView4, wrapContentListView);
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
        return this.f24675b;
    }
}
