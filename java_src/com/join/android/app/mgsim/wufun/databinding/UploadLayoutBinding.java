package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class UploadLayoutBinding implements ViewBinding {
    @NonNull
    public final Button A;
    @NonNull
    public final RelativeLayout B;
    @NonNull
    public final Button C;
    @NonNull
    public final Button D;
    @NonNull
    public final TextView E;
    @NonNull
    public final Button F;
    @NonNull
    public final Button G;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26853b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26854c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26855d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26856e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26857f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26858g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f26859h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26860i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f26861j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26862k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final FrameLayout f26863l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26864m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final EditText f26865n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26866o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final FrameLayout f26867p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f26868q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final SimpleDraweeView f26869r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final SimpleDraweeView f26870s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final FrameLayout f26871t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ScrollView f26872u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f26873v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f26874w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f26875x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f26876y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f26877z;

    private UploadLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout, @NonNull TextView textView4, @NonNull EditText editText, @NonNull TextView textView5, @NonNull FrameLayout frameLayout2, @NonNull TextView textView6, @NonNull EditText editText2, @NonNull TextView textView7, @NonNull FrameLayout frameLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull FrameLayout frameLayout4, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView8, @NonNull FrameLayout frameLayout5, @NonNull Button button2, @NonNull RelativeLayout relativeLayout, @NonNull Button button3, @NonNull Button button4, @NonNull TextView textView9, @NonNull Button button5, @NonNull Button button6) {
        this.f26853b = linearLayout;
        this.f26854c = imageView;
        this.f26855d = button;
        this.f26856e = textView;
        this.f26857f = textView2;
        this.f26858g = textView3;
        this.f26859h = frameLayout;
        this.f26860i = textView4;
        this.f26861j = editText;
        this.f26862k = textView5;
        this.f26863l = frameLayout2;
        this.f26864m = textView6;
        this.f26865n = editText2;
        this.f26866o = textView7;
        this.f26867p = frameLayout3;
        this.f26868q = simpleDraweeView;
        this.f26869r = simpleDraweeView2;
        this.f26870s = simpleDraweeView3;
        this.f26871t = frameLayout4;
        this.f26872u = scrollView;
        this.f26873v = linearLayout2;
        this.f26874w = linearLayout3;
        this.f26875x = linearLayout4;
        this.f26876y = textView8;
        this.f26877z = frameLayout5;
        this.A = button2;
        this.B = relativeLayout;
        this.C = button3;
        this.D = button4;
        this.E = textView9;
        this.F = button5;
        this.G = button6;
    }

    @NonNull
    public static UploadLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.continue_upload;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.continue_upload);
            if (button != null) {
                i4 = R.id.dscFaildTxt;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dscFaildTxt);
                if (textView != null) {
                    i4 = R.id.dscIngTxt;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dscIngTxt);
                    if (textView2 != null) {
                        i4 = R.id.dscSuccessTxt;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.dscSuccessTxt);
                        if (textView3 != null) {
                            i4 = R.id.file_lay;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.file_lay);
                            if (frameLayout != null) {
                                i4 = R.id.fileName;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.fileName);
                                if (textView4 != null) {
                                    i4 = R.id.gameDsc;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.gameDsc);
                                    if (editText != null) {
                                        i4 = R.id.gameIcon;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                                        if (textView5 != null) {
                                            i4 = R.id.gameIcon_lay;
                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.gameIcon_lay);
                                            if (frameLayout2 != null) {
                                                i4 = R.id.gameImage;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.gameImage);
                                                if (textView6 != null) {
                                                    i4 = R.id.gameName;
                                                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.gameName);
                                                    if (editText2 != null) {
                                                        i4 = R.id.gameType;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.gameType);
                                                        if (textView7 != null) {
                                                            i4 = R.id.gameType_lay;
                                                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.gameType_lay);
                                                            if (frameLayout3 != null) {
                                                                i4 = R.id.img_1;
                                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_1);
                                                                if (simpleDraweeView != null) {
                                                                    i4 = R.id.img_2;
                                                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_2);
                                                                    if (simpleDraweeView2 != null) {
                                                                        i4 = R.id.img_3;
                                                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_3);
                                                                        if (simpleDraweeView3 != null) {
                                                                            i4 = R.id.img_lay;
                                                                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.img_lay);
                                                                            if (frameLayout4 != null) {
                                                                                i4 = R.id.lay_1;
                                                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.lay_1);
                                                                                if (scrollView != null) {
                                                                                    i4 = R.id.lay_2;
                                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_2);
                                                                                    if (linearLayout != null) {
                                                                                        i4 = R.id.lay_3;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_3);
                                                                                        if (linearLayout2 != null) {
                                                                                            i4 = R.id.lay_4;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_4);
                                                                                            if (linearLayout3 != null) {
                                                                                                i4 = R.id.platformType;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.platformType);
                                                                                                if (textView8 != null) {
                                                                                                    i4 = R.id.platformType_lay;
                                                                                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.platformType_lay);
                                                                                                    if (frameLayout5 != null) {
                                                                                                        i4 = R.id.re_continue_upload;
                                                                                                        Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.re_continue_upload);
                                                                                                        if (button2 != null) {
                                                                                                            i4 = R.id.relativeLayout;
                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
                                                                                                            if (relativeLayout != null) {
                                                                                                                i4 = R.id.reupload;
                                                                                                                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.reupload);
                                                                                                                if (button3 != null) {
                                                                                                                    i4 = R.id.stopupload;
                                                                                                                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.stopupload);
                                                                                                                    if (button4 != null) {
                                                                                                                        i4 = R.id.titleText;
                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i4 = R.id.uploadBtn;
                                                                                                                            Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.uploadBtn);
                                                                                                                            if (button5 != null) {
                                                                                                                                i4 = R.id.uploadDsc;
                                                                                                                                Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.uploadDsc);
                                                                                                                                if (button6 != null) {
                                                                                                                                    return new UploadLayoutBinding((LinearLayout) view, imageView, button, textView, textView2, textView3, frameLayout, textView4, editText, textView5, frameLayout2, textView6, editText2, textView7, frameLayout3, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, frameLayout4, scrollView, linearLayout, linearLayout2, linearLayout3, textView8, frameLayout5, button2, relativeLayout, button3, button4, textView9, button5, button6);
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
    public static UploadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26853b;
    }

    @NonNull
    public static UploadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.upload_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
