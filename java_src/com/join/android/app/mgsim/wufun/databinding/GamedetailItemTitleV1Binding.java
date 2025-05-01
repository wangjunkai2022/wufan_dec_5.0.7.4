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
public final class GamedetailItemTitleV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20737b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20738c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20739d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20740e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f20741f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f20742g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20743h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20744i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20745j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20746k;

    private GamedetailItemTitleV1Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f20737b = linearLayout;
        this.f20738c = linearLayout2;
        this.f20739d = imageView;
        this.f20740e = imageView2;
        this.f20741f = view;
        this.f20742g = view2;
        this.f20743h = linearLayout3;
        this.f20744i = textView;
        this.f20745j = textView2;
        this.f20746k = textView3;
    }

    @NonNull
    public static GamedetailItemTitleV1Binding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            i4 = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
            if (imageView != null) {
                i4 = R.id.imageView5;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
                if (imageView2 != null) {
                    i4 = R.id.layoutTop;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                    if (findChildViewById != null) {
                        i4 = R.id.line_h;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line_h);
                        if (findChildViewById2 != null) {
                            i4 = R.id.look_other;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
                            if (linearLayout2 != null) {
                                i4 = R.id.moreText;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.moreText);
                                if (textView != null) {
                                    i4 = R.id.textView9;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                                    if (textView2 != null) {
                                        i4 = R.id.titleText;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                        if (textView3 != null) {
                                            return new GamedetailItemTitleV1Binding((LinearLayout) view, linearLayout, imageView, imageView2, findChildViewById, findChildViewById2, linearLayout2, textView, textView2, textView3);
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
    public static GamedetailItemTitleV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20737b;
    }

    @NonNull
    public static GamedetailItemTitleV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_title_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
