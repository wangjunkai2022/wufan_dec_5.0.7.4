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
public final class PapamainGuessyoulikeItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25731b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f25732c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f25733d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25734e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25735f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25736g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25737h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25738i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25739j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f25740k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25741l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25742m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25743n;

    private PapamainGuessyoulikeItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f25731b = linearLayout;
        this.f25732c = simpleDraweeView;
        this.f25733d = simpleDraweeView2;
        this.f25734e = textView;
        this.f25735f = textView2;
        this.f25736g = textView3;
        this.f25737h = textView4;
        this.f25738i = textView5;
        this.f25739j = textView6;
        this.f25740k = linearLayout2;
        this.f25741l = linearLayout3;
        this.f25742m = textView7;
        this.f25743n = textView8;
    }

    @NonNull
    public static PapamainGuessyoulikeItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appimage;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appimage);
        if (simpleDraweeView != null) {
            i4 = R.id.appimage2;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appimage2);
            if (simpleDraweeView2 != null) {
                i4 = R.id.appname;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
                if (textView != null) {
                    i4 = R.id.appname2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname2);
                    if (textView2 != null) {
                        i4 = R.id.appsize;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize);
                        if (textView3 != null) {
                            i4 = R.id.appsize2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize2);
                            if (textView4 != null) {
                                i4 = R.id.downloadapp;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadapp);
                                if (textView5 != null) {
                                    i4 = R.id.downloadapp2;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadapp2);
                                    if (textView6 != null) {
                                        i4 = R.id.itemLeft;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemLeft);
                                        if (linearLayout != null) {
                                            i4 = R.id.itemRight;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemRight);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.moneyText;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                if (textView7 != null) {
                                                    i4 = R.id.moneyText2;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText2);
                                                    if (textView8 != null) {
                                                        return new PapamainGuessyoulikeItemLayoutBinding((LinearLayout) view, simpleDraweeView, simpleDraweeView2, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, linearLayout2, textView7, textView8);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainGuessyoulikeItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25731b;
    }

    @NonNull
    public static PapamainGuessyoulikeItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_guessyoulike_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
