package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgFItemPostFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23735b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23736c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23737d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23738e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f23739f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f23740g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f23741h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23742i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23743j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23744k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f23745l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f23746m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f23747n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f23748o;

    private MgFItemPostFooterBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView5) {
        this.f23735b = linearLayout;
        this.f23736c = simpleDraweeView;
        this.f23737d = textView;
        this.f23738e = view;
        this.f23739f = linearLayout2;
        this.f23740g = imageView;
        this.f23741h = linearLayout3;
        this.f23742i = textView2;
        this.f23743j = textView3;
        this.f23744k = textView4;
        this.f23745l = imageView2;
        this.f23746m = imageView3;
        this.f23747n = imageView4;
        this.f23748o = textView5;
    }

    @NonNull
    public static MgFItemPostFooterBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.commentCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.commentCount);
            if (textView != null) {
                i4 = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                if (findChildViewById != null) {
                    i4 = R.id.forum_name_parent;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_name_parent);
                    if (linearLayout != null) {
                        i4 = R.id.forum_post_praise_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_praise_icon);
                        if (imageView != null) {
                            i4 = R.id.forum_post_praise_parent;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_post_praise_parent);
                            if (linearLayout2 != null) {
                                i4 = R.id.forum_post_view;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_view);
                                if (textView2 != null) {
                                    i4 = R.id.groupName;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.groupName);
                                    if (textView3 != null) {
                                        i4 = R.id.hostName;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.hostName);
                                        if (textView4 != null) {
                                            i4 = R.id.imageView10;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView10);
                                            if (imageView2 != null) {
                                                i4 = R.id.imageView9;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView9);
                                                if (imageView3 != null) {
                                                    i4 = R.id.indicator;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.indicator);
                                                    if (imageView4 != null) {
                                                        i4 = R.id.likeCount;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.likeCount);
                                                        if (textView5 != null) {
                                                            return new MgFItemPostFooterBinding((LinearLayout) view, simpleDraweeView, textView, findChildViewById, linearLayout, imageView, linearLayout2, textView2, textView3, textView4, imageView2, imageView3, imageView4, textView5);
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
    public static MgFItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23735b;
    }

    @NonNull
    public static MgFItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_f_item_post_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
