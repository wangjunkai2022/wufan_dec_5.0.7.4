package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ScrollTextViewLayout;
/* loaded from: classes3.dex */
public final class ActivitySimulatorFastEntryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17011b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17012c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f17013d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f17014e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f17015f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f17016g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ScrollTextViewLayout f17017h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17018i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17019j;

    private ActivitySimulatorFastEntryBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull ScrollTextViewLayout scrollTextViewLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17011b = constraintLayout;
        this.f17012c = imageView;
        this.f17013d = frameLayout;
        this.f17014e = relativeLayout;
        this.f17015f = imageView2;
        this.f17016g = recyclerView;
        this.f17017h = scrollTextViewLayout;
        this.f17018i = textView;
        this.f17019j = textView2;
    }

    @NonNull
    public static ActivitySimulatorFastEntryBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.flSearch;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flSearch);
            if (frameLayout != null) {
                i4 = R.id.headview;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
                if (relativeLayout != null) {
                    i4 = R.id.ivSearchIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivSearchIcon);
                    if (imageView2 != null) {
                        i4 = R.id.recyclerview;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerview);
                        if (recyclerView != null) {
                            i4 = R.id.scroll_text_layout;
                            ScrollTextViewLayout scrollTextViewLayout = (ScrollTextViewLayout) ViewBindings.findChildViewById(view, R.id.scroll_text_layout);
                            if (scrollTextViewLayout != null) {
                                i4 = R.id.title_textview;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                if (textView != null) {
                                    i4 = R.id.tvSearch;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSearch);
                                    if (textView2 != null) {
                                        return new ActivitySimulatorFastEntryBinding((ConstraintLayout) view, imageView, frameLayout, relativeLayout, imageView2, recyclerView, scrollTextViewLayout, textView, textView2);
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
    public static ActivitySimulatorFastEntryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17011b;
    }

    @NonNull
    public static ActivitySimulatorFastEntryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_simulator_fast_entry, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
