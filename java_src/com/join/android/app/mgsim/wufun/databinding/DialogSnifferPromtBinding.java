package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogSnifferPromtBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19033b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19034c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f19035d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f19036e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f19037f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f19038g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f19039h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ConstraintLayout f19040i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19041j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f19042k;

    private DialogSnifferPromtBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView, @NonNull View view) {
        this.f19033b = constraintLayout;
        this.f19034c = button;
        this.f19035d = button2;
        this.f19036e = button3;
        this.f19037f = linearLayout;
        this.f19038g = constraintLayout2;
        this.f19039h = constraintLayout3;
        this.f19040i = constraintLayout4;
        this.f19041j = textView;
        this.f19042k = view;
    }

    @NonNull
    public static DialogSnifferPromtBinding bind(@NonNull View view) {
        int i4 = R.id.btnDownload;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnDownload);
        if (button != null) {
            i4 = R.id.btnSearch;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnSearch);
            if (button2 != null) {
                i4 = R.id.btnSource;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btnSource);
                if (button3 != null) {
                    i4 = R.id.close;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.close);
                    if (linearLayout != null) {
                        i4 = R.id.constraintLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout);
                        if (constraintLayout != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                            i4 = R.id.outside;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.outside);
                            if (constraintLayout3 != null) {
                                i4 = R.id.textView37;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView37);
                                if (textView != null) {
                                    i4 = R.id.view3;
                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.view3);
                                    if (findChildViewById != null) {
                                        return new DialogSnifferPromtBinding(constraintLayout2, button, button2, button3, linearLayout, constraintLayout, constraintLayout2, constraintLayout3, textView, findChildViewById);
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
    public static DialogSnifferPromtBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19033b;
    }

    @NonNull
    public static DialogSnifferPromtBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_sniffer_promt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
