package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class ChoiceFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17803b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ForumLoadingView f17804c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f17805d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XRecyclerView f17806e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17807f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f17808g;

    private ChoiceFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull XRecyclerView xRecyclerView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout) {
        this.f17803b = linearLayout;
        this.f17804c = forumLoadingView;
        this.f17805d = ptrClassicFrameLayout;
        this.f17806e = xRecyclerView;
        this.f17807f = textView;
        this.f17808g = relativeLayout;
    }

    @NonNull
    public static ChoiceFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.loadingView;
        ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
        if (forumLoadingView != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.recyclerView;
                XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                if (xRecyclerView != null) {
                    i4 = R.id.searchBack;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.searchBack);
                    if (textView != null) {
                        i4 = R.id.title;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title);
                        if (relativeLayout != null) {
                            return new ChoiceFragmentBinding((LinearLayout) view, forumLoadingView, ptrClassicFrameLayout, xRecyclerView, textView, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChoiceFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17803b;
    }

    @NonNull
    public static ChoiceFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choice_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
