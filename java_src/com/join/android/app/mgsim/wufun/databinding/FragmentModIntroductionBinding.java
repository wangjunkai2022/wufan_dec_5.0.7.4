package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentModIntroductionBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19888b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19889c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f19890d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19891e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f19892f;

    private FragmentModIntroductionBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull ViewPager viewPager) {
        this.f19888b = relativeLayout;
        this.f19889c = linearLayout;
        this.f19890d = recyclerView;
        this.f19891e = textView;
        this.f19892f = viewPager;
    }

    @NonNull
    public static FragmentModIntroductionBinding bind(@NonNull View view) {
        int i4 = R.id.ll_head;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_head);
        if (linearLayout != null) {
            i4 = R.id.rv_list_type;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_type);
            if (recyclerView != null) {
                i4 = R.id.tv_draft;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_draft);
                if (textView != null) {
                    i4 = R.id.view_pager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.view_pager);
                    if (viewPager != null) {
                        return new FragmentModIntroductionBinding((RelativeLayout) view, linearLayout, recyclerView, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentModIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19888b;
    }

    @NonNull
    public static FragmentModIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mod_introduction, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
