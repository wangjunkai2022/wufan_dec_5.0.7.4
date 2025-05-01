package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentEndGameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f19751b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19752c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19753d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19754e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XRecyclerView f19755f;

    private FragmentEndGameListBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull XRecyclerView xRecyclerView) {
        this.f19751b = frameLayout;
        this.f19752c = textView;
        this.f19753d = imageView;
        this.f19754e = linearLayout;
        this.f19755f = xRecyclerView;
    }

    @NonNull
    public static FragmentEndGameListBinding bind(@NonNull View view) {
        int i4 = R.id.editText5;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
        if (textView != null) {
            i4 = R.id.imageView44;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
            if (imageView != null) {
                i4 = R.id.ll_empty;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty);
                if (linearLayout != null) {
                    i4 = R.id.recyclerView;
                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                    if (xRecyclerView != null) {
                        return new FragmentEndGameListBinding((FrameLayout) view, textView, imageView, linearLayout, xRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentEndGameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f19751b;
    }

    @NonNull
    public static FragmentEndGameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_end_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
