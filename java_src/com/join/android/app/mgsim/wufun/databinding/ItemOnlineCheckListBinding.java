package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemOnlineCheckListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22493b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22494c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Group f22495d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22496e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22497f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f22498g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22499h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22500i;

    private ItemOnlineCheckListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Group group, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22493b = constraintLayout;
        this.f22494c = view;
        this.f22495d = group;
        this.f22496e = imageView;
        this.f22497f = imageView2;
        this.f22498g = imageView3;
        this.f22499h = textView;
        this.f22500i = textView2;
    }

    @NonNull
    public static ItemOnlineCheckListBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.groupChecked;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupChecked);
            if (group != null) {
                i4 = R.id.ivChecked;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivChecked);
                if (imageView != null) {
                    i4 = R.id.ivIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivIcon);
                    if (imageView2 != null) {
                        i4 = R.id.ivLoading;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivLoading);
                        if (imageView3 != null) {
                            i4 = R.id.tvCheckedInfo;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCheckedInfo);
                            if (textView != null) {
                                i4 = R.id.tvTitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                if (textView2 != null) {
                                    return new ItemOnlineCheckListBinding((ConstraintLayout) view, findChildViewById, group, imageView, imageView2, imageView3, textView, textView2);
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
    public static ItemOnlineCheckListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22493b;
    }

    @NonNull
    public static ItemOnlineCheckListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_online_check_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
