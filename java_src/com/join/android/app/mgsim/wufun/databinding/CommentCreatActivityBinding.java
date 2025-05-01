package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class CommentCreatActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18105b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18106c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f18107d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MStarBar f18108e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18109f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f18110g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f18111h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18112i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18113j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18114k;

    private CommentCreatActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull MStarBar mStarBar, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18105b = linearLayout;
        this.f18106c = imageView;
        this.f18107d = editText;
        this.f18108e = mStarBar;
        this.f18109f = textView;
        this.f18110g = checkBox;
        this.f18111h = linearLayout2;
        this.f18112i = textView2;
        this.f18113j = textView3;
        this.f18114k = textView4;
    }

    @NonNull
    public static CommentCreatActivityBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.commentcreat_et;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.commentcreat_et);
            if (editText != null) {
                i4 = R.id.mstarBar;
                MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.mstarBar);
                if (mStarBar != null) {
                    i4 = R.id.mstarBarTx;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.mstarBarTx);
                    if (textView != null) {
                        i4 = R.id.phoneModleCB;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.phoneModleCB);
                        if (checkBox != null) {
                            i4 = R.id.starLl;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.starLl);
                            if (linearLayout != null) {
                                i4 = R.id.textTopRight;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textTopRight);
                                if (textView2 != null) {
                                    i4 = R.id.title_textview;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                    if (textView3 != null) {
                                        i4 = R.id.tvTips;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTips);
                                        if (textView4 != null) {
                                            return new CommentCreatActivityBinding((LinearLayout) view, imageView, editText, mStarBar, textView, checkBox, linearLayout, textView2, textView3, textView4);
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
    public static CommentCreatActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18105b;
    }

    @NonNull
    public static CommentCreatActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_creat_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
