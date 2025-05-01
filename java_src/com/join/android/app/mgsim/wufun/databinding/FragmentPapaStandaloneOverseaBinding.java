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
import com.join.mgps.customview.InterceptEventViewPager;
/* loaded from: classes3.dex */
public final class FragmentPapaStandaloneOverseaBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20059b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f20060c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final InterceptEventViewPager f20061d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20062e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20063f;

    private FragmentPapaStandaloneOverseaBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull InterceptEventViewPager interceptEventViewPager, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f20059b = linearLayout;
        this.f20060c = view;
        this.f20061d = interceptEventViewPager;
        this.f20062e = textView;
        this.f20063f = textView2;
    }

    @NonNull
    public static FragmentPapaStandaloneOverseaBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.mViewPager;
            InterceptEventViewPager interceptEventViewPager = (InterceptEventViewPager) ViewBindings.findChildViewById(view, R.id.mViewPager);
            if (interceptEventViewPager != null) {
                i4 = R.id.tv_free;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_free);
                if (textView != null) {
                    i4 = R.id.tv_new;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_new);
                    if (textView2 != null) {
                        return new FragmentPapaStandaloneOverseaBinding((LinearLayout) view, findChildViewById, interceptEventViewPager, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentPapaStandaloneOverseaBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20059b;
    }

    @NonNull
    public static FragmentPapaStandaloneOverseaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_papa_standalone_oversea, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
