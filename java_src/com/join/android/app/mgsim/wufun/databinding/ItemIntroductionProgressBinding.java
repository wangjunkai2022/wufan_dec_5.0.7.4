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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemIntroductionProgressBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22439b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22440c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22441d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22442e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22443f;

    private ItemIntroductionProgressBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22439b = linearLayout;
        this.f22440c = linearLayout2;
        this.f22441d = textView;
        this.f22442e = textView2;
        this.f22443f = textView3;
    }

    @NonNull
    public static ItemIntroductionProgressBinding bind(@NonNull View view) {
        int i4 = R.id.ll_root;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_root);
        if (linearLayout != null) {
            i4 = R.id.tv_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
            if (textView != null) {
                i4 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    i4 = R.id.tv_type;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_type);
                    if (textView3 != null) {
                        return new ItemIntroductionProgressBinding((LinearLayout) view, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemIntroductionProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22439b;
    }

    @NonNull
    public static ItemIntroductionProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_progress, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
