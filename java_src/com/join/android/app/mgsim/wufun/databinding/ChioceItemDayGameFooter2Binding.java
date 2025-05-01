package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChioceItemDayGameFooter2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17733b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17734c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17735d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17736e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f17737f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17738g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17739h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17740i;

    private ChioceItemDayGameFooter2Binding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f17733b = relativeLayout;
        this.f17734c = textView;
        this.f17735d = textView2;
        this.f17736e = textView3;
        this.f17737f = simpleDraweeView;
        this.f17738g = linearLayout;
        this.f17739h = textView4;
        this.f17740i = textView5;
    }

    @NonNull
    public static ChioceItemDayGameFooter2Binding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.from;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.from);
            if (textView2 != null) {
                i4 = R.id.fromFlag;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.fromFlag);
                if (textView3 != null) {
                    i4 = R.id.icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.ll;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll);
                        if (linearLayout != null) {
                            i4 = R.id.name;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                            if (textView4 != null) {
                                i4 = R.id.rank;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.rank);
                                if (textView5 != null) {
                                    return new ChioceItemDayGameFooter2Binding((RelativeLayout) view, textView, textView2, textView3, simpleDraweeView, linearLayout, textView4, textView5);
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
    public static ChioceItemDayGameFooter2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17733b;
    }

    @NonNull
    public static ChioceItemDayGameFooter2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_day_game_footer2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
