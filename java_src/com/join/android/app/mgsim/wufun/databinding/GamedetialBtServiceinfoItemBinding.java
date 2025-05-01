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
/* loaded from: classes3.dex */
public final class GamedetialBtServiceinfoItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20865b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20866c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20867d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20868e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20869f;

    private GamedetialBtServiceinfoItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f20865b = linearLayout;
        this.f20866c = textView;
        this.f20867d = textView2;
        this.f20868e = textView3;
        this.f20869f = textView4;
    }

    @NonNull
    public static GamedetialBtServiceinfoItemBinding bind(@NonNull View view) {
        int i4 = R.id.day;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.day);
        if (textView != null) {
            i4 = R.id.serverName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.serverName);
            if (textView2 != null) {
                i4 = R.id.tag;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tag);
                if (textView3 != null) {
                    i4 = R.id.time;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                    if (textView4 != null) {
                        return new GamedetialBtServiceinfoItemBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialBtServiceinfoItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20865b;
    }

    @NonNull
    public static GamedetialBtServiceinfoItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_bt_serviceinfo_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
