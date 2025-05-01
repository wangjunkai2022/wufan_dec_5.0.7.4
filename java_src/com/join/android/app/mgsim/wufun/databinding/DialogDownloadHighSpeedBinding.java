package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogDownloadHighSpeedBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18671b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f18672c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f18673d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f18674e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f18675f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f18676g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f18677h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18678i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18679j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18680k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f18681l;

    private DialogDownloadHighSpeedBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18671b = constraintLayout;
        this.f18672c = view;
        this.f18673d = constraintLayout2;
        this.f18674e = constraintLayout3;
        this.f18675f = constraintLayout4;
        this.f18676g = constraintLayout5;
        this.f18677h = imageView;
        this.f18678i = textView;
        this.f18679j = textView2;
        this.f18680k = textView3;
        this.f18681l = textView4;
    }

    @NonNull
    public static DialogDownloadHighSpeedBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.close);
        if (findChildViewById != null) {
            i4 = R.id.confirm;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.confirm);
            if (constraintLayout != null) {
                i4 = R.id.constraintLayout17;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout17);
                if (constraintLayout2 != null) {
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                    i4 = R.id.content;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.content);
                    if (constraintLayout4 != null) {
                        i4 = R.id.iv1;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
                        if (imageView != null) {
                            i4 = R.id.textView74;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView74);
                            if (textView != null) {
                                i4 = R.id.textView78;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView78);
                                if (textView2 != null) {
                                    i4 = R.id.textView79;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView79);
                                    if (textView3 != null) {
                                        i4 = R.id.tip;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tip);
                                        if (textView4 != null) {
                                            return new DialogDownloadHighSpeedBinding(constraintLayout3, findChildViewById, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, imageView, textView, textView2, textView3, textView4);
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
    public static DialogDownloadHighSpeedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18671b;
    }

    @NonNull
    public static DialogDownloadHighSpeedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_download_high_speed, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
