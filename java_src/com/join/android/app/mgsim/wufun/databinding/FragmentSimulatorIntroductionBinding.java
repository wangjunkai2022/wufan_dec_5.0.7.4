package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class FragmentSimulatorIntroductionBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20099b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f20100c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20101d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20102e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f20103f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f20104g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20105h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f20106i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f20107j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20108k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ViewPager f20109l;

    private FragmentSimulatorIntroductionBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull ViewPager viewPager) {
        this.f20099b = relativeLayout;
        this.f20100c = imageView;
        this.f20101d = imageView2;
        this.f20102e = view;
        this.f20103f = imageView3;
        this.f20104g = linearLayout;
        this.f20105h = linearLayout2;
        this.f20106i = relativeLayout2;
        this.f20107j = recyclerView;
        this.f20108k = textView;
        this.f20109l = viewPager;
    }

    @NonNull
    public static FragmentSimulatorIntroductionBinding bind(@NonNull View view) {
        int i4 = R.id.bgExpand;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.bgExpand);
        if (imageView != null) {
            i4 = R.id.btnShrinkIntroduction;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.btnShrinkIntroduction);
            if (imageView2 != null) {
                i4 = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                if (findChildViewById != null) {
                    i4 = R.id.ivExpand;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivExpand);
                    if (imageView3 != null) {
                        i4 = R.id.llExpand;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llExpand);
                        if (linearLayout != null) {
                            i4 = R.id.ll_head;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_head);
                            if (linearLayout2 != null) {
                                i4 = R.id.rlContent;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlContent);
                                if (relativeLayout != null) {
                                    i4 = R.id.rv_list_type;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_type);
                                    if (recyclerView != null) {
                                        i4 = R.id.tv_draft;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_draft);
                                        if (textView != null) {
                                            i4 = R.id.view_pager;
                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.view_pager);
                                            if (viewPager != null) {
                                                return new FragmentSimulatorIntroductionBinding((RelativeLayout) view, imageView, imageView2, findChildViewById, imageView3, linearLayout, linearLayout2, relativeLayout, recyclerView, textView, viewPager);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentSimulatorIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20099b;
    }

    @NonNull
    public static FragmentSimulatorIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_simulator_introduction, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
