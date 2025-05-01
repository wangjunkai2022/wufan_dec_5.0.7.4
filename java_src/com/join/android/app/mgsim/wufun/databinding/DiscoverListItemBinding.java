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
public final class DiscoverListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19091b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19092c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19093d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19094e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f19095f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19096g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19097h;

    private DiscoverListItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4) {
        this.f19091b = linearLayout;
        this.f19092c = textView;
        this.f19093d = textView2;
        this.f19094e = textView3;
        this.f19095f = simpleDraweeView;
        this.f19096g = linearLayout2;
        this.f19097h = textView4;
    }

    @NonNull
    public static DiscoverListItemBinding bind(@NonNull View view) {
        int i4 = R.id.commentNumber;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.commentNumber);
        if (textView != null) {
            i4 = R.id.content;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.content);
            if (textView2 != null) {
                i4 = R.id.gameType;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameType);
                if (textView3 != null) {
                    i4 = R.id.image;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
                    if (simpleDraweeView != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i4 = R.id.seeNumber;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.seeNumber);
                        if (textView4 != null) {
                            return new DiscoverListItemBinding(linearLayout, textView, textView2, textView3, simpleDraweeView, linearLayout, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DiscoverListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19091b;
    }

    @NonNull
    public static DiscoverListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.discover_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
