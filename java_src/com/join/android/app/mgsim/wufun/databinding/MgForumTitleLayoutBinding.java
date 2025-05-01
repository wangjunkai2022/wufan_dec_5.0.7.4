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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24333b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24334c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24335d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24336e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f24337f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24338g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24339h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24340i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f24341j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24342k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f24343l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f24344m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f24345n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24346o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f24347p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final Button f24348q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24349r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f24350s;

    private MgForumTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView6, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull ImageView imageView2, @NonNull Button button2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView3) {
        this.f24333b = relativeLayout;
        this.f24334c = imageView;
        this.f24335d = textView;
        this.f24336e = textView2;
        this.f24337f = button;
        this.f24338g = textView3;
        this.f24339h = textView4;
        this.f24340i = textView5;
        this.f24341j = relativeLayout2;
        this.f24342k = textView6;
        this.f24343l = linearLayout;
        this.f24344m = linearLayout2;
        this.f24345n = textView7;
        this.f24346o = textView8;
        this.f24347p = imageView2;
        this.f24348q = button2;
        this.f24349r = relativeLayout3;
        this.f24350s = imageView3;
    }

    @NonNull
    public static MgForumTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.checkInFlag;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.checkInFlag);
            if (textView != null) {
                i4 = R.id.checkInImage;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.checkInImage);
                if (textView2 != null) {
                    i4 = R.id.forum_post;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post);
                    if (button != null) {
                        i4 = R.id.forum_title_center;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_title_center);
                        if (textView3 != null) {
                            i4 = R.id.layout_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.layout_title);
                            if (textView4 != null) {
                                i4 = R.id.layout_title_right;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.layout_title_right);
                                if (textView5 != null) {
                                    i4 = R.id.myProfileMessage;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.myProfileMessage);
                                    if (relativeLayout != null) {
                                        i4 = R.id.postFuncHost;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.postFuncHost);
                                        if (textView6 != null) {
                                            i4 = R.id.postFuncMore;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.postFuncMore);
                                            if (linearLayout != null) {
                                                i4 = R.id.postFunction;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.postFunction);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.profileMessageFlag;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.profileMessageFlag);
                                                    if (textView7 != null) {
                                                        i4 = R.id.profileMessageFlagNoNum;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.profileMessageFlagNoNum);
                                                        if (textView8 != null) {
                                                            i4 = R.id.profileMessageImage;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.profileMessageImage);
                                                            if (imageView2 != null) {
                                                                i4 = R.id.release;
                                                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.release);
                                                                if (button2 != null) {
                                                                    i4 = R.id.search;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.search);
                                                                    if (relativeLayout2 != null) {
                                                                        i4 = R.id.sreach_image;
                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.sreach_image);
                                                                        if (imageView3 != null) {
                                                                            return new MgForumTitleLayoutBinding((RelativeLayout) view, imageView, textView, textView2, button, textView3, textView4, textView5, relativeLayout, textView6, linearLayout, linearLayout2, textView7, textView8, imageView2, button2, relativeLayout2, imageView3);
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
    public static MgForumTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24333b;
    }

    @NonNull
    public static MgForumTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
