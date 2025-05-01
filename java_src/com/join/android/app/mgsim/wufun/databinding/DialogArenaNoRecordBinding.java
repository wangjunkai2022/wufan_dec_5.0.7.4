package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogArenaNoRecordBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18583b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18584c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18585d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f18586e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f18587f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18588g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18589h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18590i;

    private DialogArenaNoRecordBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18583b = relativeLayout;
        this.f18584c = imageView;
        this.f18585d = linearLayout;
        this.f18586e = constraintLayout;
        this.f18587f = relativeLayout2;
        this.f18588g = textView;
        this.f18589h = textView2;
        this.f18590i = textView3;
    }

    @NonNull
    public static DialogArenaNoRecordBinding bind(@NonNull View view) {
        int i4 = R.id.iv1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
        if (imageView != null) {
            i4 = R.id.iv_close;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (linearLayout != null) {
                i4 = R.id.noRecord;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.noRecord);
                if (constraintLayout != null) {
                    i4 = R.id.rl_top;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top);
                    if (relativeLayout != null) {
                        i4 = R.id.tv1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                        if (textView != null) {
                            i4 = R.id.tv2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv2);
                            if (textView2 != null) {
                                i4 = R.id.tv_top;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                                if (textView3 != null) {
                                    return new DialogArenaNoRecordBinding((RelativeLayout) view, imageView, linearLayout, constraintLayout, relativeLayout, textView, textView2, textView3);
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
    public static DialogArenaNoRecordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18583b;
    }

    @NonNull
    public static DialogArenaNoRecordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_arena_no_record, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
