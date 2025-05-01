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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModPromptBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18893b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18894c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18895d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18896e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18897f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18898g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18899h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18900i;

    private DialogModPromptBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18893b = linearLayout;
        this.f18894c = imageView;
        this.f18895d = linearLayout2;
        this.f18896e = textView;
        this.f18897f = textView2;
        this.f18898g = textView3;
        this.f18899h = textView4;
        this.f18900i = textView5;
    }

    @NonNull
    public static DialogModPromptBinding bind(@NonNull View view) {
        int i4 = R.id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
        if (imageView != null) {
            i4 = R.id.ll_mod_download;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_mod_download);
            if (linearLayout != null) {
                i4 = R.id.tv_desc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc);
                if (textView != null) {
                    i4 = R.id.tv_mod_opt_left;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_left);
                    if (textView2 != null) {
                        i4 = R.id.tv_mod_opt_right;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_right);
                        if (textView3 != null) {
                            i4 = R.id.tv_mod_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_title);
                            if (textView4 != null) {
                                i4 = R.id.tv_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                if (textView5 != null) {
                                    return new DialogModPromptBinding((LinearLayout) view, imageView, linearLayout, textView, textView2, textView3, textView4, textView5);
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
    public static DialogModPromptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18893b;
    }

    @NonNull
    public static DialogModPromptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_prompt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
