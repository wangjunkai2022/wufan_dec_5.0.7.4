package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivtyNewArenaBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17333b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f17334c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f17335d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f17336e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f17337f;

    private ActivtyNewArenaBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull FrameLayout frameLayout2) {
        this.f17333b = relativeLayout;
        this.f17334c = frameLayout;
        this.f17335d = relativeLayout2;
        this.f17336e = relativeLayout3;
        this.f17337f = frameLayout2;
    }

    @NonNull
    public static ActivtyNewArenaBinding bind(@NonNull View view) {
        int i4 = R.id.frameLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout);
        if (frameLayout != null) {
            i4 = R.id.layoutBack;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutBack);
            if (relativeLayout != null) {
                i4 = R.id.layout_others;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout_others);
                if (relativeLayout2 != null) {
                    i4 = R.id.mg_mian_fragmentlayout;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.mg_mian_fragmentlayout);
                    if (frameLayout2 != null) {
                        return new ActivtyNewArenaBinding((RelativeLayout) view, frameLayout, relativeLayout, relativeLayout2, frameLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivtyNewArenaBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17333b;
    }

    @NonNull
    public static ActivtyNewArenaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activty_new_arena, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
