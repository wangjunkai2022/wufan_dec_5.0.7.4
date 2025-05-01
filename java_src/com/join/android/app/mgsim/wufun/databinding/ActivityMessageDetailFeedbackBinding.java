package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityMessageDetailFeedbackBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16592b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f16593c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f16594d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16595e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f16596f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16597g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16598h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16599i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16600j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16601k;

    private ActivityMessageDetailFeedbackBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull EditText editText, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f16592b = linearLayout;
        this.f16593c = mgForumTitleLayoutBinding;
        this.f16594d = editText;
        this.f16595e = linearLayout2;
        this.f16596f = recyclerView;
        this.f16597g = textView;
        this.f16598h = textView2;
        this.f16599i = textView3;
        this.f16600j = textView4;
        this.f16601k = textView5;
    }

    @NonNull
    public static ActivityMessageDetailFeedbackBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionBar);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.etComment;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.etComment);
            if (editText != null) {
                i4 = R.id.llMain;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMain);
                if (linearLayout != null) {
                    i4 = R.id.rvComment;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvComment);
                    if (recyclerView != null) {
                        i4 = R.id.tvFeedBackDesc;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFeedBackDesc);
                        if (textView != null) {
                            i4 = R.id.tvFeedBackGameName;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFeedBackGameName);
                            if (textView2 != null) {
                                i4 = R.id.tvFeedBackReason;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFeedBackReason);
                                if (textView3 != null) {
                                    i4 = R.id.tvSend;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSend);
                                    if (textView4 != null) {
                                        i4 = R.id.tvTime;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTime);
                                        if (textView5 != null) {
                                            return new ActivityMessageDetailFeedbackBinding((LinearLayout) view, bind, editText, linearLayout, recyclerView, textView, textView2, textView3, textView4, textView5);
                                        }
                                    }
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
    public static ActivityMessageDetailFeedbackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16592b;
    }

    @NonNull
    public static ActivityMessageDetailFeedbackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_message_detail_feedback, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
