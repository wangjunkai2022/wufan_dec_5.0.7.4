package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.textview.MovementTextView;
/* loaded from: classes3.dex */
public final class ItemIntroductionCommontDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22416b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f22417c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MovementTextView f22418d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22419e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22420f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f22421g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f22422h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22423i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22424j;

    private ItemIntroductionCommontDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull MovementTextView movementTextView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22416b = relativeLayout;
        this.f22417c = relativeLayout2;
        this.f22418d = movementTextView;
        this.f22419e = imageView;
        this.f22420f = imageView2;
        this.f22421g = view;
        this.f22422h = simpleDraweeView;
        this.f22423i = textView;
        this.f22424j = textView2;
    }

    @NonNull
    public static ItemIntroductionCommontDetailBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.content;
        MovementTextView movementTextView = (MovementTextView) ViewBindings.findChildViewById(view, R.id.content);
        if (movementTextView != null) {
            i4 = R.id.iv_more;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more);
            if (imageView != null) {
                i4 = R.id.iv_praise;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_praise);
                if (imageView2 != null) {
                    i4 = R.id.layoutTop;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                    if (findChildViewById != null) {
                        i4 = R.id.siv_head;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.siv_head);
                        if (simpleDraweeView != null) {
                            i4 = R.id.tv_star_num;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_star_num);
                            if (textView != null) {
                                i4 = R.id.userName;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                if (textView2 != null) {
                                    return new ItemIntroductionCommontDetailBinding(relativeLayout, relativeLayout, movementTextView, imageView, imageView2, findChildViewById, simpleDraweeView, textView, textView2);
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
    public static ItemIntroductionCommontDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22416b;
    }

    @NonNull
    public static ItemIntroductionCommontDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_commont_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
