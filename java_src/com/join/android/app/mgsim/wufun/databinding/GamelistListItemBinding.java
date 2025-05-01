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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamelistListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21176b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21177c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21178d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f21179e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21180f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21181g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21182h;

    private GamelistListItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f21176b = relativeLayout;
        this.f21177c = textView;
        this.f21178d = linearLayout;
        this.f21179e = relativeLayout2;
        this.f21180f = textView2;
        this.f21181g = textView3;
        this.f21182h = textView4;
    }

    @NonNull
    public static GamelistListItemBinding bind(@NonNull View view) {
        int i4 = R.id.follow;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.follow);
        if (textView != null) {
            i4 = R.id.iconLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iconLayout);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView2 != null) {
                    i4 = R.id.number;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.number);
                    if (textView3 != null) {
                        i4 = R.id.title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView4 != null) {
                            return new GamelistListItemBinding(relativeLayout, textView, linearLayout, relativeLayout, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamelistListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21176b;
    }

    @NonNull
    public static GamelistListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamelist_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
