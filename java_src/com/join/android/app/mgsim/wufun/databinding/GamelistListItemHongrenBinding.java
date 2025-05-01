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
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class GamelistListItemHongrenBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21183b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f21184c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21185d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21186e;

    private GamelistListItemHongrenBinding(@NonNull LinearLayout linearLayout, @NonNull HListView hListView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f21183b = linearLayout;
        this.f21184c = hListView;
        this.f21185d = linearLayout2;
        this.f21186e = textView;
    }

    @NonNull
    public static GamelistListItemHongrenBinding bind(@NonNull View view) {
        int i4 = R.id.hongrenlist;
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.hongrenlist);
        if (hListView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
            if (textView != null) {
                return new GamelistListItemHongrenBinding(linearLayout, hListView, linearLayout, textView);
            }
            i4 = R.id.title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamelistListItemHongrenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21183b;
    }

    @NonNull
    public static GamelistListItemHongrenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamelist_list_item_hongren, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
