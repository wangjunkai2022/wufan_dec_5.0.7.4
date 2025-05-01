package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityPlugManagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16764b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f16765c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f16766d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f16767e;

    private ActivityPlugManagerBinding(@NonNull RelativeLayout relativeLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull XListView2 xListView2, @NonNull RelativeLayout relativeLayout2) {
        this.f16764b = relativeLayout;
        this.f16765c = mgForumTitleLayoutBinding;
        this.f16766d = xListView2;
        this.f16767e = relativeLayout2;
    }

    @NonNull
    public static ActivityPlugManagerBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
            if (xListView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new ActivityPlugManagerBinding(relativeLayout, bind, xListView2, relativeLayout);
            }
            i4 = R.id.listView;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityPlugManagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16764b;
    }

    @NonNull
    public static ActivityPlugManagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_plug_manager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
