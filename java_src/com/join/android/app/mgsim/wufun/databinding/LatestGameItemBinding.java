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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LatestGameItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22942b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22943c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22944d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22945e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22946f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22947g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22948h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22949i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22950j;

    private LatestGameItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f22942b = linearLayout;
        this.f22943c = imageView;
        this.f22944d = imageView2;
        this.f22945e = linearLayout2;
        this.f22946f = linearLayout3;
        this.f22947g = textView;
        this.f22948h = textView2;
        this.f22949i = textView3;
        this.f22950j = textView4;
    }

    @NonNull
    public static LatestGameItemBinding bind(@NonNull View view) {
        int i4 = R.id.latestImgLeft;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.latestImgLeft);
        if (imageView != null) {
            i4 = R.id.latestImgRight;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.latestImgRight);
            if (imageView2 != null) {
                i4 = R.id.latestLayoutLeft;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.latestLayoutLeft);
                if (linearLayout != null) {
                    i4 = R.id.latestLayoutRight;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.latestLayoutRight);
                    if (linearLayout2 != null) {
                        i4 = R.id.latestNameLeft;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.latestNameLeft);
                        if (textView != null) {
                            i4 = R.id.latestNameRight;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.latestNameRight);
                            if (textView2 != null) {
                                i4 = R.id.latestTimeLeft;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.latestTimeLeft);
                                if (textView3 != null) {
                                    i4 = R.id.latestTimeRight;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.latestTimeRight);
                                    if (textView4 != null) {
                                        return new LatestGameItemBinding((LinearLayout) view, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
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
    public static LatestGameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22942b;
    }

    @NonNull
    public static LatestGameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.latest_game_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
