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
import com.join.mgps.customview.CubeRotateView;
/* loaded from: classes3.dex */
public final class CubeRoateViewLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18298b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18299c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CubeRotateView f18300d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18301e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f18302f;

    private CubeRoateViewLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull CubeRotateView cubeRotateView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f18298b = linearLayout;
        this.f18299c = simpleDraweeView;
        this.f18300d = cubeRotateView;
        this.f18301e = textView;
        this.f18302f = simpleDraweeView2;
    }

    @NonNull
    public static CubeRoateViewLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.background;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.background);
        if (simpleDraweeView != null) {
            i4 = R.id.cubeView;
            CubeRotateView cubeRotateView = (CubeRotateView) ViewBindings.findChildViewById(view, R.id.cubeView);
            if (cubeRotateView != null) {
                i4 = R.id.date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date);
                if (textView != null) {
                    i4 = R.id.foreground;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.foreground);
                    if (simpleDraweeView2 != null) {
                        return new CubeRoateViewLayoutBinding((LinearLayout) view, simpleDraweeView, cubeRotateView, textView, simpleDraweeView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CubeRoateViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18298b;
    }

    @NonNull
    public static CubeRoateViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cube_roate_view_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
