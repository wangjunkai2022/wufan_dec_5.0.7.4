package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityTest2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17103b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17104c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f17105d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f17106e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f17107f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f17108g;

    private ActivityTest2Binding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull Button button5) {
        this.f17103b = linearLayout;
        this.f17104c = button;
        this.f17105d = button2;
        this.f17106e = button3;
        this.f17107f = button4;
        this.f17108g = button5;
    }

    @NonNull
    public static ActivityTest2Binding bind(@NonNull View view) {
        int i4 = R.id.butn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.butn);
        if (button != null) {
            i4 = R.id.butn2;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.butn2);
            if (button2 != null) {
                i4 = R.id.butn3;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.butn3);
                if (button3 != null) {
                    i4 = R.id.butn4;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.butn4);
                    if (button4 != null) {
                        i4 = R.id.butn5;
                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.butn5);
                        if (button5 != null) {
                            return new ActivityTest2Binding((LinearLayout) view, button, button2, button3, button4, button5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityTest2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17103b;
    }

    @NonNull
    public static ActivityTest2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_test2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
