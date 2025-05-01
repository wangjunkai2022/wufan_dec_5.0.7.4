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
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LuckPrizeBaseFilterBottomOperateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23608b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23609c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23610d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23611e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XRecyclerView f23612f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23613g;

    private LuckPrizeBaseFilterBottomOperateBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull XRecyclerView xRecyclerView, @NonNull TextView textView) {
        this.f23608b = linearLayout;
        this.f23609c = imageView;
        this.f23610d = linearLayout2;
        this.f23611e = linearLayout3;
        this.f23612f = xRecyclerView;
        this.f23613g = textView;
    }

    @NonNull
    public static LuckPrizeBaseFilterBottomOperateBinding bind(@NonNull View view) {
        int i4 = R.id.closed;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
        if (imageView != null) {
            i4 = R.id.historyTitle;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.historyTitle);
            if (linearLayout != null) {
                i4 = R.id.nullHistory;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nullHistory);
                if (linearLayout2 != null) {
                    i4 = R.id.recyclerView;
                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                    if (xRecyclerView != null) {
                        i4 = R.id.title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView != null) {
                            return new LuckPrizeBaseFilterBottomOperateBinding((LinearLayout) view, imageView, linearLayout, linearLayout2, xRecyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LuckPrizeBaseFilterBottomOperateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23608b;
    }

    @NonNull
    public static LuckPrizeBaseFilterBottomOperateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luck_prize_base_filter_bottom_operate, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
