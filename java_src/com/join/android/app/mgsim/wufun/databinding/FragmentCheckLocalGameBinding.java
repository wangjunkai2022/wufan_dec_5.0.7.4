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
public final class FragmentCheckLocalGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19623b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19624c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f19625d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19626e;

    private FragmentCheckLocalGameBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2) {
        this.f19623b = linearLayout;
        this.f19624c = textView;
        this.f19625d = simpleDraweeView;
        this.f19626e = textView2;
    }

    @NonNull
    public static FragmentCheckLocalGameBinding bind(@NonNull View view) {
        int i4 = R.id.afterNameTx;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.afterNameTx);
        if (textView != null) {
            i4 = R.id.appIcon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
            if (simpleDraweeView != null) {
                i4 = R.id.beforNameTx;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.beforNameTx);
                if (textView2 != null) {
                    return new FragmentCheckLocalGameBinding((LinearLayout) view, textView, simpleDraweeView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCheckLocalGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19623b;
    }

    @NonNull
    public static FragmentCheckLocalGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_check_local_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
