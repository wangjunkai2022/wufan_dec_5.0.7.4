package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public final class LayoutClassifyPopwindowBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22956b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f22957c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FlowLayout f22958d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FlowLayout f22959e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22960f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22961g;

    private LayoutClassifyPopwindowBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull FlowLayout flowLayout, @NonNull FlowLayout flowLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f22956b = linearLayout;
        this.f22957c = button;
        this.f22958d = flowLayout;
        this.f22959e = flowLayout2;
        this.f22960f = textView;
        this.f22961g = linearLayout2;
    }

    @NonNull
    public static LayoutClassifyPopwindowBinding bind(@NonNull View view) {
        int i4 = R.id.classifySortBt;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.classifySortBt);
        if (button != null) {
            i4 = R.id.layout_game_classify;
            FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.layout_game_classify);
            if (flowLayout != null) {
                i4 = R.id.layout_game_classify_sort;
                FlowLayout flowLayout2 = (FlowLayout) ViewBindings.findChildViewById(view, R.id.layout_game_classify_sort);
                if (flowLayout2 != null) {
                    i4 = R.id.popwindClassifyTv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.popwindClassifyTv);
                    if (textView != null) {
                        i4 = R.id.rootLl;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rootLl);
                        if (linearLayout != null) {
                            return new LayoutClassifyPopwindowBinding((LinearLayout) view, button, flowLayout, flowLayout2, textView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutClassifyPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22956b;
    }

    @NonNull
    public static LayoutClassifyPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_classify_popwindow, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
