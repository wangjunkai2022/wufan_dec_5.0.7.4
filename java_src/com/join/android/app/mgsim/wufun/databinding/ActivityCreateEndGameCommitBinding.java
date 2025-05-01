package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityCreateEndGameCommitBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15857b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f15858c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f15859d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f15860e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f15861f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f15862g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f15863h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f15864i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final StandardVideoView f15865j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f15866k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f15867l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f15868m;

    private ActivityCreateEndGameCommitBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull EditText editText2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull StandardVideoView standardVideoView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f15857b = linearLayout;
        this.f15858c = editText;
        this.f15859d = editText2;
        this.f15860e = imageView;
        this.f15861f = imageView2;
        this.f15862g = imageView3;
        this.f15863h = linearLayout2;
        this.f15864i = relativeLayout;
        this.f15865j = standardVideoView;
        this.f15866k = textView;
        this.f15867l = textView2;
        this.f15868m = textView3;
    }

    @NonNull
    public static ActivityCreateEndGameCommitBinding bind(@NonNull View view) {
        int i4 = R.id.et_desc;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_desc);
        if (editText != null) {
            i4 = R.id.et_title;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_title);
            if (editText2 != null) {
                i4 = R.id.iv_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView != null) {
                    i4 = R.id.iv_delete_video;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_delete_video);
                    if (imageView2 != null) {
                        i4 = R.id.iv_thumb;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_thumb);
                        if (imageView3 != null) {
                            i4 = R.id.ll_choose_video;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_choose_video);
                            if (linearLayout != null) {
                                i4 = R.id.rl_video;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_video);
                                if (relativeLayout != null) {
                                    i4 = R.id.svv_view;
                                    StandardVideoView standardVideoView = (StandardVideoView) ViewBindings.findChildViewById(view, R.id.svv_view);
                                    if (standardVideoView != null) {
                                        i4 = R.id.tv_commit;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_commit);
                                        if (textView != null) {
                                            i4 = R.id.tv_customer;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customer);
                                            if (textView2 != null) {
                                                i4 = R.id.tv_title;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                if (textView3 != null) {
                                                    return new ActivityCreateEndGameCommitBinding((LinearLayout) view, editText, editText2, imageView, imageView2, imageView3, linearLayout, relativeLayout, standardVideoView, textView, textView2, textView3);
                                                }
                                            }
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
    public static ActivityCreateEndGameCommitBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15857b;
    }

    @NonNull
    public static ActivityCreateEndGameCommitBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_create_end_game_commit, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
