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
public final class WufunMainGamesItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27149b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f27150c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f27151d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f27152e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f27153f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27154g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27155h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27156i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27157j;

    private WufunMainGamesItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f27149b = linearLayout;
        this.f27150c = simpleDraweeView;
        this.f27151d = simpleDraweeView2;
        this.f27152e = simpleDraweeView3;
        this.f27153f = simpleDraweeView4;
        this.f27154g = textView;
        this.f27155h = textView2;
        this.f27156i = textView3;
        this.f27157j = textView4;
    }

    @NonNull
    public static WufunMainGamesItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon1;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon1);
        if (simpleDraweeView != null) {
            i4 = R.id.appIcon2;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon2);
            if (simpleDraweeView2 != null) {
                i4 = R.id.appIcon3;
                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon3);
                if (simpleDraweeView3 != null) {
                    i4 = R.id.appIcon4;
                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon4);
                    if (simpleDraweeView4 != null) {
                        i4 = R.id.appname1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname1);
                        if (textView != null) {
                            i4 = R.id.appname2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname2);
                            if (textView2 != null) {
                                i4 = R.id.appname3;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appname3);
                                if (textView3 != null) {
                                    i4 = R.id.appname4;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.appname4);
                                    if (textView4 != null) {
                                        return new WufunMainGamesItemLayoutBinding((LinearLayout) view, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, textView, textView2, textView3, textView4);
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
    public static WufunMainGamesItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27149b;
    }

    @NonNull
    public static WufunMainGamesItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufun_main_games_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
