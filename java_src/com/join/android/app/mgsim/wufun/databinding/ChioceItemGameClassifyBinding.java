package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChioceItemGameClassifyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17750b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ChoiceItemGameClassifyItemBinding f17751c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ChoiceItemGameClassifyItemBinding f17752d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ChoiceItemGameClassifyItemBinding f17753e;

    private ChioceItemGameClassifyBinding(@NonNull LinearLayout linearLayout, @NonNull ChoiceItemGameClassifyItemBinding choiceItemGameClassifyItemBinding, @NonNull ChoiceItemGameClassifyItemBinding choiceItemGameClassifyItemBinding2, @NonNull ChoiceItemGameClassifyItemBinding choiceItemGameClassifyItemBinding3) {
        this.f17750b = linearLayout;
        this.f17751c = choiceItemGameClassifyItemBinding;
        this.f17752d = choiceItemGameClassifyItemBinding2;
        this.f17753e = choiceItemGameClassifyItemBinding3;
    }

    @NonNull
    public static ChioceItemGameClassifyBinding bind(@NonNull View view) {
        int i4 = R.id.item1;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.item1);
        if (findChildViewById != null) {
            ChoiceItemGameClassifyItemBinding bind = ChoiceItemGameClassifyItemBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.item2);
            if (findChildViewById2 != null) {
                ChoiceItemGameClassifyItemBinding bind2 = ChoiceItemGameClassifyItemBinding.bind(findChildViewById2);
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.item3);
                if (findChildViewById3 != null) {
                    return new ChioceItemGameClassifyBinding((LinearLayout) view, bind, bind2, ChoiceItemGameClassifyItemBinding.bind(findChildViewById3));
                }
                i4 = R.id.item3;
            } else {
                i4 = R.id.item2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChioceItemGameClassifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17750b;
    }

    @NonNull
    public static ChioceItemGameClassifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_game_classify, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
