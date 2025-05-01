package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NetWholeInviteDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25391b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f25392c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f25393d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25394e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25395f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25396g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25397h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25398i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f25399j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f25400k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f25401l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f25402m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25403n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25404o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f25405p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f25406q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f25407r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25408s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25409t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final Button f25410u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f25411v;

    private NetWholeInviteDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout5, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout6, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull Button button3, @NonNull TextView textView8) {
        this.f25391b = linearLayout;
        this.f25392c = button;
        this.f25393d = button2;
        this.f25394e = textView;
        this.f25395f = textView2;
        this.f25396g = textView3;
        this.f25397h = linearLayout2;
        this.f25398i = linearLayout3;
        this.f25399j = imageView;
        this.f25400k = linearLayout4;
        this.f25401l = simpleDraweeView;
        this.f25402m = linearLayout5;
        this.f25403n = textView4;
        this.f25404o = textView5;
        this.f25405p = imageView2;
        this.f25406q = simpleDraweeView2;
        this.f25407r = linearLayout6;
        this.f25408s = textView6;
        this.f25409t = textView7;
        this.f25410u = button3;
        this.f25411v = textView8;
    }

    @NonNull
    public static NetWholeInviteDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.dialog_content_2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content_2);
                    if (textView2 != null) {
                        i4 = R.id.failedMessage;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
                        if (textView3 != null) {
                            i4 = R.id.game_lay;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.game_lay);
                            if (linearLayout != null) {
                                i4 = R.id.loading_lay;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loading_lay);
                                if (linearLayout2 != null) {
                                    i4 = R.id.lodingBackImage;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
                                    if (imageView != null) {
                                        i4 = R.id.loding_faile;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_faile);
                                        if (linearLayout3 != null) {
                                            i4 = R.id.plugImgIv;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.plugImgIv);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.plug_lay;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.plug_lay);
                                                if (linearLayout4 != null) {
                                                    i4 = R.id.plugNameTv;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.plugNameTv);
                                                    if (textView4 != null) {
                                                        i4 = R.id.plugSizeTv;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.plugSizeTv);
                                                        if (textView5 != null) {
                                                            i4 = R.id.relodingimag;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                                                            if (imageView2 != null) {
                                                                i4 = R.id.romImgIv;
                                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.romImgIv);
                                                                if (simpleDraweeView2 != null) {
                                                                    i4 = R.id.rom_lay;
                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rom_lay);
                                                                    if (linearLayout5 != null) {
                                                                        i4 = R.id.romNameTv;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.romNameTv);
                                                                        if (textView6 != null) {
                                                                            i4 = R.id.romSizeTv;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.romSizeTv);
                                                                            if (textView7 != null) {
                                                                                i4 = R.id.setNetwork;
                                                                                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                                                                                if (button3 != null) {
                                                                                    i4 = R.id.tip_title;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                                                                                    if (textView8 != null) {
                                                                                        return new NetWholeInviteDialogBinding((LinearLayout) view, button, button2, textView, textView2, textView3, linearLayout, linearLayout2, imageView, linearLayout3, simpleDraweeView, linearLayout4, textView4, textView5, imageView2, simpleDraweeView2, linearLayout5, textView6, textView7, button3, textView8);
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
    public static NetWholeInviteDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25391b;
    }

    @NonNull
    public static NetWholeInviteDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.net_whole_invite_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
