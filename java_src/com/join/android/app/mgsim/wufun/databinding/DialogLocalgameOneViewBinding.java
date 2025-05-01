package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogLocalgameOneViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18810b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18811c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18812d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18813e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18814f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18815g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f18816h;

    private DialogLocalgameOneViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView2) {
        this.f18810b = relativeLayout;
        this.f18811c = button;
        this.f18812d = imageView;
        this.f18813e = textView;
        this.f18814f = textView2;
        this.f18815g = textView3;
        this.f18816h = imageView2;
    }

    @NonNull
    public static DialogLocalgameOneViewBinding bind(@NonNull View view) {
        int i4 = R.id.localGameOneBt;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.localGameOneBt);
        if (button != null) {
            i4 = R.id.localGameOneCloseTv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.localGameOneCloseTv);
            if (imageView != null) {
                i4 = R.id.localGameOneContentTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.localGameOneContentTv);
                if (textView != null) {
                    i4 = R.id.localGameOneNotTv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameOneNotTv);
                    if (textView2 != null) {
                        i4 = R.id.localGameOneTitleTv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameOneTitleTv);
                        if (textView3 != null) {
                            i4 = R.id.localGameOneTopIv;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.localGameOneTopIv);
                            if (imageView2 != null) {
                                return new DialogLocalgameOneViewBinding((RelativeLayout) view, button, imageView, textView, textView2, textView3, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogLocalgameOneViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18810b;
    }

    @NonNull
    public static DialogLocalgameOneViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_localgame_one_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
