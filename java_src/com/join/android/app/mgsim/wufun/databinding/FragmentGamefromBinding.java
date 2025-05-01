package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentGamefromBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19860b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f19861c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19862d;

    private FragmentGamefromBinding(@NonNull LinearLayout linearLayout, @NonNull XRecyclerView xRecyclerView, @NonNull LinearLayout linearLayout2) {
        this.f19860b = linearLayout;
        this.f19861c = xRecyclerView;
        this.f19862d = linearLayout2;
    }

    @NonNull
    public static FragmentGamefromBinding bind(@NonNull View view) {
        int i4 = R.id.comment_all_list;
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.comment_all_list);
        if (xRecyclerView != null) {
            i4 = R.id.iv_nome;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_nome);
            if (linearLayout != null) {
                return new FragmentGamefromBinding((LinearLayout) view, xRecyclerView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentGamefromBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19860b;
    }

    @NonNull
    public static FragmentGamefromBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gamefrom, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
