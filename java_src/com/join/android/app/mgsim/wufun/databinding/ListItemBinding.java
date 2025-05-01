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
/* loaded from: classes3.dex */
public final class ListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23449b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23450c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23451d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f23452e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f23453f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23454g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23455h;

    private ListItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23449b = relativeLayout;
        this.f23450c = imageView;
        this.f23451d = simpleDraweeView;
        this.f23452e = relativeLayout2;
        this.f23453f = relativeLayout3;
        this.f23454g = textView;
        this.f23455h = textView2;
    }

    @NonNull
    public static ListItemBinding bind(@NonNull View view) {
        int i4 = R.id.iv_coll;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_coll);
        if (imageView != null) {
            i4 = R.id.iv_img;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_img);
            if (simpleDraweeView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.rl_content;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_content);
                if (relativeLayout2 != null) {
                    i4 = R.id.tv_size;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size);
                    if (textView != null) {
                        i4 = R.id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView2 != null) {
                            return new ListItemBinding(relativeLayout, imageView, simpleDraweeView, relativeLayout, relativeLayout2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23449b;
    }

    @NonNull
    public static ListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
