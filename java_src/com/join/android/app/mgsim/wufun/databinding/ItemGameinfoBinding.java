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
public final class ItemGameinfoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22364b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22365c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22366d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f22367e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22368f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22369g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22370h;

    private ItemGameinfoBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22364b = relativeLayout;
        this.f22365c = view;
        this.f22366d = simpleDraweeView;
        this.f22367e = relativeLayout2;
        this.f22368f = textView;
        this.f22369g = textView2;
        this.f22370h = textView3;
    }

    @NonNull
    public static ItemGameinfoBinding bind(@NonNull View view) {
        int i4 = R.id.cover;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.cover);
        if (findChildViewById != null) {
            i4 = R.id.iv_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_icon);
            if (simpleDraweeView != null) {
                i4 = R.id.main;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.main);
                if (relativeLayout != null) {
                    i4 = R.id.romeName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.romeName);
                    if (textView != null) {
                        i4 = R.id.tv_gameName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gameName);
                        if (textView2 != null) {
                            i4 = R.id.tv_roomCounts;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_roomCounts);
                            if (textView3 != null) {
                                return new ItemGameinfoBinding((RelativeLayout) view, findChildViewById, simpleDraweeView, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameinfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22364b;
    }

    @NonNull
    public static ItemGameinfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_gameinfo, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
