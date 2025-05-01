package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.control.RhythmLayout;
import com.join.mgps.pulltorefresh.extras.viewpager.PullToRefreshViewPager;
/* loaded from: classes3.dex */
public final class FragmentDiscoverappBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19722b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RhythmLayout f19723c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f19724d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f19725e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final PullToRefreshViewPager f19726f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19727g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19728h;

    private FragmentDiscoverappBinding(@NonNull RelativeLayout relativeLayout, @NonNull RhythmLayout rhythmLayout, @NonNull ImageButton imageButton, @NonNull RelativeLayout relativeLayout2, @NonNull PullToRefreshViewPager pullToRefreshViewPager, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f19722b = relativeLayout;
        this.f19723c = rhythmLayout;
        this.f19724d = imageButton;
        this.f19725e = relativeLayout2;
        this.f19726f = pullToRefreshViewPager;
        this.f19727g = textView;
        this.f19728h = textView2;
    }

    @NonNull
    public static FragmentDiscoverappBinding bind(@NonNull View view) {
        int i4 = R.id.box_rhythm;
        RhythmLayout rhythmLayout = (RhythmLayout) ViewBindings.findChildViewById(view, R.id.box_rhythm);
        if (rhythmLayout != null) {
            i4 = R.id.btn_rocket_to_head;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.btn_rocket_to_head);
            if (imageButton != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.pager;
                PullToRefreshViewPager pullToRefreshViewPager = (PullToRefreshViewPager) ViewBindings.findChildViewById(view, R.id.pager);
                if (pullToRefreshViewPager != null) {
                    i4 = R.id.text_time_first;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_time_first);
                    if (textView != null) {
                        i4 = R.id.text_time_second;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_time_second);
                        if (textView2 != null) {
                            return new FragmentDiscoverappBinding(relativeLayout, rhythmLayout, imageButton, relativeLayout, pullToRefreshViewPager, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentDiscoverappBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19722b;
    }

    @NonNull
    public static FragmentDiscoverappBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_discoverapp, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
