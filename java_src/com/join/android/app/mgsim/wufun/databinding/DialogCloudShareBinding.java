package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogCloudShareBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18644b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18645c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18646d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f18647e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18648f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18649g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18650h;

    private DialogCloudShareBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EditText editText, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18644b = linearLayout;
        this.f18645c = textView;
        this.f18646d = textView2;
        this.f18647e = editText;
        this.f18648f = textView3;
        this.f18649g = textView4;
        this.f18650h = textView5;
    }

    @NonNull
    public static DialogCloudShareBinding bind(@NonNull View view) {
        int i4 = R.id.cancle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancle);
        if (textView != null) {
            i4 = R.id.content;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.content);
            if (textView2 != null) {
                i4 = R.id.name;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.name);
                if (editText != null) {
                    i4 = R.id.number;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.number);
                    if (textView3 != null) {
                        i4 = R.id.ok;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                        if (textView4 != null) {
                            i4 = R.id.tip;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tip);
                            if (textView5 != null) {
                                return new DialogCloudShareBinding((LinearLayout) view, textView, textView2, editText, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogCloudShareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18644b;
    }

    @NonNull
    public static DialogCloudShareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_cloud_share, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
