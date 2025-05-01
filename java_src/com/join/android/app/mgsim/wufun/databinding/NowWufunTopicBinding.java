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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NowWufunTopicBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25607b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25608c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25609d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f25610e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25611f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25612g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25613h;

    private NowWufunTopicBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25607b = linearLayout;
        this.f25608c = textView;
        this.f25609d = textView2;
        this.f25610e = simpleDraweeView;
        this.f25611f = linearLayout2;
        this.f25612g = textView3;
        this.f25613h = textView4;
    }

    @NonNull
    public static NowWufunTopicBinding bind(@NonNull View view) {
        int i4 = R.id.appDescribe;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appDescribe);
        if (textView != null) {
            i4 = R.id.appName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView2 != null) {
                i4 = R.id.image;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
                if (simpleDraweeView != null) {
                    i4 = R.id.main;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                    if (linearLayout != null) {
                        i4 = R.id.tip;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tip);
                        if (textView3 != null) {
                            i4 = R.id.titleText;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                            if (textView4 != null) {
                                return new NowWufunTopicBinding((LinearLayout) view, textView, textView2, simpleDraweeView, linearLayout, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NowWufunTopicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25607b;
    }

    @NonNull
    public static NowWufunTopicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.now_wufun_topic, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
