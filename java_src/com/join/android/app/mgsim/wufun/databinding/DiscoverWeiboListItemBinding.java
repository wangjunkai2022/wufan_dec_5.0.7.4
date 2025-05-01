package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DiscoverWeiboListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19098b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19099c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19100d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19101e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19102f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f19103g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19104h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19105i;

    private DiscoverWeiboListItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f19098b = linearLayout;
        this.f19099c = textView;
        this.f19100d = textView2;
        this.f19101e = linearLayout2;
        this.f19102f = textView3;
        this.f19103g = simpleDraweeView;
        this.f19104h = textView4;
        this.f19105i = textView5;
    }

    @NonNull
    public static DiscoverWeiboListItemBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.imagTip;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.imagTip);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i4 = R.id.time;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                if (textView3 != null) {
                    i4 = R.id.userImg;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userImg);
                    if (simpleDraweeView != null) {
                        i4 = R.id.userName;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                        if (textView4 != null) {
                            i4 = R.id.vidioTip;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.vidioTip);
                            if (textView5 != null) {
                                return new DiscoverWeiboListItemBinding(linearLayout, textView, textView2, linearLayout, textView3, simpleDraweeView, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DiscoverWeiboListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19098b;
    }

    @NonNull
    public static DiscoverWeiboListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.discover_weibo_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
