package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemCollectionSevenHorizontalItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21731b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21732c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f21733d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21734e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f21735f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21736g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21737h;

    private ItemCollectionSevenHorizontalItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f21731b = linearLayout;
        this.f21732c = textView;
        this.f21733d = frameLayout;
        this.f21734e = simpleDraweeView;
        this.f21735f = progressBar;
        this.f21736g = linearLayout2;
        this.f21737h = textView2;
    }

    @NonNull
    public static ItemCollectionSevenHorizontalItemBinding bind(@NonNull View view) {
        int i4 = R.id.appname1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname1);
        if (textView != null) {
            i4 = R.id.downloadView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.downloadView);
            if (frameLayout != null) {
                i4 = R.id.image1;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image1);
                if (simpleDraweeView != null) {
                    i4 = R.id.loading_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                    if (progressBar != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i4 = R.id.tvBtn;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                        if (textView2 != null) {
                            return new ItemCollectionSevenHorizontalItemBinding(linearLayout, textView, frameLayout, simpleDraweeView, progressBar, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemCollectionSevenHorizontalItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21731b;
    }

    @NonNull
    public static ItemCollectionSevenHorizontalItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_collection_seven_horizontal_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
