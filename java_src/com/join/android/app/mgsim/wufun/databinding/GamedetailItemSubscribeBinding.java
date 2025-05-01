package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetailItemSubscribeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20705b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f20706c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final HorizontalScrollView f20707d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f20708e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f20709f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20710g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20711h;

    private GamedetailItemSubscribeBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull HorizontalScrollView horizontalScrollView, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3) {
        this.f20705b = linearLayout;
        this.f20706c = imageView;
        this.f20707d = horizontalScrollView;
        this.f20708e = button;
        this.f20709f = linearLayout2;
        this.f20710g = textView;
        this.f20711h = linearLayout3;
    }

    @NonNull
    public static GamedetailItemSubscribeBinding bind(@NonNull View view) {
        int i4 = R.id.imageView18;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView18);
        if (imageView != null) {
            i4 = R.id.scrollView;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
            if (horizontalScrollView != null) {
                i4 = R.id.titleMoreBookButn;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.titleMoreBookButn);
                if (button != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i4 = R.id.titleMoreMessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleMoreMessage);
                    if (textView != null) {
                        i4 = R.id.titleMoreTip;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.titleMoreTip);
                        if (linearLayout2 != null) {
                            return new GamedetailItemSubscribeBinding(linearLayout, imageView, horizontalScrollView, button, linearLayout, textView, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20705b;
    }

    @NonNull
    public static GamedetailItemSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_subscribe, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
