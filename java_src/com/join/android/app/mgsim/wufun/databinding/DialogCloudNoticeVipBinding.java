package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogCloudNoticeVipBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18624b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18625c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f18626d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18627e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18628f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18629g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18630h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18631i;

    private DialogCloudNoticeVipBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18624b = relativeLayout;
        this.f18625c = textView;
        this.f18626d = checkBox;
        this.f18627e = imageView;
        this.f18628f = textView2;
        this.f18629g = textView3;
        this.f18630h = textView4;
        this.f18631i = textView5;
    }

    @NonNull
    public static DialogCloudNoticeVipBinding bind(@NonNull View view) {
        int i4 = R.id.cancle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancle);
        if (textView != null) {
            i4 = R.id.checkBox;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBox);
            if (checkBox != null) {
                i4 = R.id.close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
                if (imageView != null) {
                    i4 = R.id.content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.content);
                    if (textView2 != null) {
                        i4 = R.id.ok;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                        if (textView3 != null) {
                            i4 = R.id.title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView4 != null) {
                                i4 = R.id.tv_vip;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_vip);
                                if (textView5 != null) {
                                    return new DialogCloudNoticeVipBinding((RelativeLayout) view, textView, checkBox, imageView, textView2, textView3, textView4, textView5);
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
    public static DialogCloudNoticeVipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18624b;
    }

    @NonNull
    public static DialogCloudNoticeVipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_cloud_notice_vip, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
