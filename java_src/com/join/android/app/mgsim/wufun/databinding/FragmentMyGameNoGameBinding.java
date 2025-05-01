package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentGridView;
/* loaded from: classes3.dex */
public final class FragmentMyGameNoGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19993b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19994c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19995d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final WrapContentGridView f19996e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19997f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19998g;

    private FragmentMyGameNoGameBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull WrapContentGridView wrapContentGridView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f19993b = linearLayout;
        this.f19994c = imageView;
        this.f19995d = linearLayout2;
        this.f19996e = wrapContentGridView;
        this.f19997f = textView;
        this.f19998g = textView2;
    }

    @NonNull
    public static FragmentMyGameNoGameBinding bind(@NonNull View view) {
        int i4 = R.id.imageView13;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView13);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.noGameList;
            WrapContentGridView wrapContentGridView = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.noGameList);
            if (wrapContentGridView != null) {
                i4 = R.id.textView42;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView42);
                if (textView != null) {
                    i4 = R.id.textView45;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView45);
                    if (textView2 != null) {
                        return new FragmentMyGameNoGameBinding(linearLayout, imageView, linearLayout, wrapContentGridView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMyGameNoGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19993b;
    }

    @NonNull
    public static FragmentMyGameNoGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_no_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
