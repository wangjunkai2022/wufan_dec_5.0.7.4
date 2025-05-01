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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModQuestionnaireBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18901b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f18902c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f18903d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18904e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f18905f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18906g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f18907h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18908i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18909j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18910k;

    private DialogModQuestionnaireBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18901b = constraintLayout;
        this.f18902c = constraintLayout2;
        this.f18903d = constraintLayout3;
        this.f18904e = imageView;
        this.f18905f = imageView2;
        this.f18906g = textView;
        this.f18907h = simpleDraweeView;
        this.f18908i = textView2;
        this.f18909j = textView3;
        this.f18910k = textView4;
    }

    @NonNull
    public static DialogModQuestionnaireBinding bind(@NonNull View view) {
        int i4 = R.id.cl_customer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_customer);
        if (constraintLayout != null) {
            i4 = R.id.cl_game_info;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_game_info);
            if (constraintLayout2 != null) {
                i4 = R.id.imageView631;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView631);
                if (imageView != null) {
                    i4 = R.id.iv_close;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (imageView2 != null) {
                        i4 = R.id.name;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView != null) {
                            i4 = R.id.sdv_image;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
                            if (simpleDraweeView != null) {
                                i4 = R.id.tv_customer;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customer);
                                if (textView2 != null) {
                                    i4 = R.id.tv_desc;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc);
                                    if (textView3 != null) {
                                        i4 = R.id.tv_not_ask;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_ask);
                                        if (textView4 != null) {
                                            return new DialogModQuestionnaireBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, imageView, imageView2, textView, simpleDraweeView, textView2, textView3, textView4);
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
    public static DialogModQuestionnaireBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18901b;
    }

    @NonNull
    public static DialogModQuestionnaireBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_questionnaire, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
