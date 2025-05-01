package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView4NewGame;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentPapaStandaloneV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20064b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView4NewGame f20065c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f20066d;

    private FragmentPapaStandaloneV2Binding(@NonNull LinearLayout linearLayout, @NonNull XListView4NewGame xListView4NewGame, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f20064b = linearLayout;
        this.f20065c = xListView4NewGame;
        this.f20066d = ptrClassicFrameLayout;
    }

    @NonNull
    public static FragmentPapaStandaloneV2Binding bind(@NonNull View view) {
        int i4 = R.id.mListView;
        XListView4NewGame xListView4NewGame = (XListView4NewGame) ViewBindings.findChildViewById(view, R.id.mListView);
        if (xListView4NewGame != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                return new FragmentPapaStandaloneV2Binding((LinearLayout) view, xListView4NewGame, ptrClassicFrameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentPapaStandaloneV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20064b;
    }

    @NonNull
    public static FragmentPapaStandaloneV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_papa_standalone_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
