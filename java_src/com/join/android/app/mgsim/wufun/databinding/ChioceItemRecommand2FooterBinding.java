package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChioceItemRecommand2FooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17778b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17779c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17780d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17781e;

    private ChioceItemRecommand2FooterBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f17778b = relativeLayout;
        this.f17779c = textView;
        this.f17780d = textView2;
        this.f17781e = textView3;
    }

    @NonNull
    public static ChioceItemRecommand2FooterBinding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
            if (textView2 != null) {
                i4 = R.id.rank;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.rank);
                if (textView3 != null) {
                    return new ChioceItemRecommand2FooterBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChioceItemRecommand2FooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17778b;
    }

    @NonNull
    public static ChioceItemRecommand2FooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_recommand_2_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
