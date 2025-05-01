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
public final class DialogPicChooseBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18956b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18957c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18958d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18959e;

    private DialogPicChooseBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18956b = linearLayout;
        this.f18957c = textView;
        this.f18958d = textView2;
        this.f18959e = textView3;
    }

    @NonNull
    public static DialogPicChooseBinding bind(@NonNull View view) {
        int i4 = R.id.btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (textView != null) {
            i4 = R.id.chos_camera;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.chos_camera);
            if (textView2 != null) {
                i4 = R.id.pic_lib;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.pic_lib);
                if (textView3 != null) {
                    return new DialogPicChooseBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogPicChooseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18956b;
    }

    @NonNull
    public static DialogPicChooseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_pic_choose, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
