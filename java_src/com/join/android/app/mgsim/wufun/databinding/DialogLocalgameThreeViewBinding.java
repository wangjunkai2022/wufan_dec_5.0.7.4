package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.NoScrollViewPager;
/* loaded from: classes3.dex */
public final class DialogLocalgameThreeViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18817b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18818c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18819d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18820e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18821f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18822g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18823h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final NoScrollViewPager f18824i;

    private DialogLocalgameThreeViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull NoScrollViewPager noScrollViewPager) {
        this.f18817b = relativeLayout;
        this.f18818c = button;
        this.f18819d = textView;
        this.f18820e = textView2;
        this.f18821f = textView3;
        this.f18822g = textView4;
        this.f18823h = textView5;
        this.f18824i = noScrollViewPager;
    }

    @NonNull
    public static DialogLocalgameThreeViewBinding bind(@NonNull View view) {
        int i4 = R.id.localGameThreeBt;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.localGameThreeBt);
        if (button != null) {
            i4 = R.id.localGameThreeContentTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.localGameThreeContentTv);
            if (textView != null) {
                i4 = R.id.localGameThreeNotTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameThreeNotTv);
                if (textView2 != null) {
                    i4 = R.id.localGameThreeNumTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameThreeNumTv);
                    if (textView3 != null) {
                        i4 = R.id.localGameThreeStatuTv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameThreeStatuTv);
                        if (textView4 != null) {
                            i4 = R.id.localGameThreeTitleTv;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameThreeTitleTv);
                            if (textView5 != null) {
                                i4 = R.id.localGameThreeViewPager;
                                NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.localGameThreeViewPager);
                                if (noScrollViewPager != null) {
                                    return new DialogLocalgameThreeViewBinding((RelativeLayout) view, button, textView, textView2, textView3, textView4, textView5, noScrollViewPager);
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
    public static DialogLocalgameThreeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18817b;
    }

    @NonNull
    public static DialogLocalgameThreeViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_localgame_three_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
