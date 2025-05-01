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
public final class GamedetailItemUpdateinfoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20772b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20773c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20774d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20775e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f20776f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f20777g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20778h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20779i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20780j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20781k;

    private GamedetailItemUpdateinfoBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f20772b = linearLayout;
        this.f20773c = linearLayout2;
        this.f20774d = imageView;
        this.f20775e = view;
        this.f20776f = view2;
        this.f20777g = linearLayout3;
        this.f20778h = textView;
        this.f20779i = textView2;
        this.f20780j = textView3;
        this.f20781k = textView4;
    }

    @NonNull
    public static GamedetailItemUpdateinfoBinding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            i4 = R.id.imageView5;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
            if (imageView != null) {
                i4 = R.id.layoutTop;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                if (findChildViewById != null) {
                    i4 = R.id.line_h;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line_h);
                    if (findChildViewById2 != null) {
                        i4 = R.id.look_other;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
                        if (linearLayout2 != null) {
                            i4 = R.id.message;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                            if (textView != null) {
                                i4 = R.id.moreText;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.moreText);
                                if (textView2 != null) {
                                    i4 = R.id.textView9;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                                    if (textView3 != null) {
                                        i4 = R.id.titleText;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                        if (textView4 != null) {
                                            return new GamedetailItemUpdateinfoBinding((LinearLayout) view, linearLayout, imageView, findChildViewById, findChildViewById2, linearLayout2, textView, textView2, textView3, textView4);
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
    public static GamedetailItemUpdateinfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20772b;
    }

    @NonNull
    public static GamedetailItemUpdateinfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_updateinfo, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
