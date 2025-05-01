package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyGridView;
/* loaded from: classes3.dex */
public final class MyAccountReginfinishLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25282b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MyGridView f25283c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f25284d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ScrollView f25285e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25286f;

    private MyAccountReginfinishLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull MyGridView myGridView, @NonNull Button button, @NonNull ScrollView scrollView, @NonNull TextView textView) {
        this.f25282b = linearLayout;
        this.f25283c = myGridView;
        this.f25284d = button;
        this.f25285e = scrollView;
        this.f25286f = textView;
    }

    @NonNull
    public static MyAccountReginfinishLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.chooseGridView;
        MyGridView myGridView = (MyGridView) ViewBindings.findChildViewById(view, R.id.chooseGridView);
        if (myGridView != null) {
            i4 = R.id.reginFinish;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.reginFinish);
            if (button != null) {
                i4 = R.id.scrollView;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                if (scrollView != null) {
                    i4 = R.id.title_textview;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                    if (textView != null) {
                        return new MyAccountReginfinishLayoutBinding((LinearLayout) view, myGridView, button, scrollView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyAccountReginfinishLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25282b;
    }

    @NonNull
    public static MyAccountReginfinishLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_account_reginfinish_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
