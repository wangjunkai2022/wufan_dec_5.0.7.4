package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SampleCommonListFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26259b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ViewStub f26260c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26261d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewStub f26262e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewStub f26263f;

    private SampleCommonListFooterBinding(@NonNull LinearLayout linearLayout, @NonNull ViewStub viewStub, @NonNull LinearLayout linearLayout2, @NonNull ViewStub viewStub2, @NonNull ViewStub viewStub3) {
        this.f26259b = linearLayout;
        this.f26260c = viewStub;
        this.f26261d = linearLayout2;
        this.f26262e = viewStub2;
        this.f26263f = viewStub3;
    }

    @NonNull
    public static SampleCommonListFooterBinding bind(@NonNull View view) {
        int i4 = R.id.end_viewstub;
        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, R.id.end_viewstub);
        if (viewStub != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.loading_viewstub;
            ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, R.id.loading_viewstub);
            if (viewStub2 != null) {
                i4 = R.id.normal_viewstub;
                ViewStub viewStub3 = (ViewStub) ViewBindings.findChildViewById(view, R.id.normal_viewstub);
                if (viewStub3 != null) {
                    return new SampleCommonListFooterBinding(linearLayout, viewStub, linearLayout, viewStub2, viewStub3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SampleCommonListFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26259b;
    }

    @NonNull
    public static SampleCommonListFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.sample_common_list_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
