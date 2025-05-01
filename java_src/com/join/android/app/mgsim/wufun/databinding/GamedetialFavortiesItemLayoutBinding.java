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
public final class GamedetialFavortiesItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20880b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20881c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f20882d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f20883e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20884f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20885g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20886h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20887i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f20888j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f20889k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f20890l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20891m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f20892n;

    private GamedetialFavortiesItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f20880b = linearLayout;
        this.f20881c = simpleDraweeView;
        this.f20882d = simpleDraweeView2;
        this.f20883e = simpleDraweeView3;
        this.f20884f = textView;
        this.f20885g = textView2;
        this.f20886h = textView3;
        this.f20887i = linearLayout2;
        this.f20888j = linearLayout3;
        this.f20889k = linearLayout4;
        this.f20890l = linearLayout5;
        this.f20891m = textView4;
        this.f20892n = textView5;
    }

    @NonNull
    public static GamedetialFavortiesItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon1;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon1);
        if (simpleDraweeView != null) {
            i4 = R.id.appIcon2;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon2);
            if (simpleDraweeView2 != null) {
                i4 = R.id.appIcon3;
                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon3);
                if (simpleDraweeView3 != null) {
                    i4 = R.id.appname1;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname1);
                    if (textView != null) {
                        i4 = R.id.appname2;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname2);
                        if (textView2 != null) {
                            i4 = R.id.appname3;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appname3);
                            if (textView3 != null) {
                                i4 = R.id.layout1;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout1);
                                if (linearLayout != null) {
                                    i4 = R.id.layout2;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout2);
                                    if (linearLayout2 != null) {
                                        i4 = R.id.layout3;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout3);
                                        if (linearLayout3 != null) {
                                            LinearLayout linearLayout4 = (LinearLayout) view;
                                            i4 = R.id.name;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                            if (textView4 != null) {
                                                i4 = R.id.number;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.number);
                                                if (textView5 != null) {
                                                    return new GamedetialFavortiesItemLayoutBinding(linearLayout4, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, textView, textView2, textView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView4, textView5);
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
    public static GamedetialFavortiesItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20880b;
    }

    @NonNull
    public static GamedetialFavortiesItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_favorties_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
