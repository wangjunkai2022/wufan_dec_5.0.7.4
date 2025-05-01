package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class PapapayheadBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25864b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25865c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25866d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25867e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25868f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25869g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25870h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25871i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f25872j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25873k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f25874l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25875m;

    private PapapayheadBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull Button button, @NonNull TextView textView6) {
        this.f25864b = linearLayout;
        this.f25865c = imageView;
        this.f25866d = linearLayout2;
        this.f25867e = textView;
        this.f25868f = textView2;
        this.f25869g = imageView2;
        this.f25870h = textView3;
        this.f25871i = textView4;
        this.f25872j = simpleDraweeView;
        this.f25873k = textView5;
        this.f25874l = button;
        this.f25875m = textView6;
    }

    @NonNull
    public static PapapayheadBinding bind(@NonNull View view) {
        int i4 = R.id.hongbao;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.hongbao);
        if (imageView != null) {
            i4 = R.id.hongbaoLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.hongbaoLayout);
            if (linearLayout != null) {
                i4 = R.id.listHead;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.listHead);
                if (textView != null) {
                    i4 = R.id.message;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                    if (textView2 != null) {
                        i4 = R.id.more;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.more);
                        if (imageView2 != null) {
                            i4 = R.id.name;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                            if (textView3 != null) {
                                i4 = R.id.pabiNumber;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.pabiNumber);
                                if (textView4 != null) {
                                    i4 = R.id.papaPayIcon;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.papaPayIcon);
                                    if (simpleDraweeView != null) {
                                        i4 = R.id.payRedNumber;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.payRedNumber);
                                        if (textView5 != null) {
                                            i4 = R.id.payStart;
                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.payStart);
                                            if (button != null) {
                                                i4 = R.id.title_textview;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                                if (textView6 != null) {
                                                    return new PapapayheadBinding((LinearLayout) view, imageView, linearLayout, textView, textView2, imageView2, textView3, textView4, simpleDraweeView, textView5, button, textView6);
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
    public static PapapayheadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25864b;
    }

    @NonNull
    public static PapapayheadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papapayhead, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
