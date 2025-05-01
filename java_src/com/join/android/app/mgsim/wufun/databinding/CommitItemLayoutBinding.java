package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CommitItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18232b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18233c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18234d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18235e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f18236f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f18237g;

    private CommitItemLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2) {
        this.f18232b = relativeLayout;
        this.f18233c = textView;
        this.f18234d = textView2;
        this.f18235e = textView3;
        this.f18236f = simpleDraweeView;
        this.f18237g = relativeLayout2;
    }

    @NonNull
    public static CommitItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.CommitItemContext;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.CommitItemContext);
        if (textView != null) {
            i4 = R.id.CommitItemName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.CommitItemName);
            if (textView2 != null) {
                i4 = R.id.CommitItemTime;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.CommitItemTime);
                if (textView3 != null) {
                    i4 = R.id.commitItemIv;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.commitItemIv);
                    if (simpleDraweeView != null) {
                        i4 = R.id.relateLayout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relateLayout);
                        if (relativeLayout != null) {
                            return new CommitItemLayoutBinding((RelativeLayout) view, textView, textView2, textView3, simpleDraweeView, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommitItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18232b;
    }

    @NonNull
    public static CommitItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.commit_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
