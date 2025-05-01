package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.internal.nativead.NativeAdUtil;
import com.beizi.ad.internal.utilities.ImageManager;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.fusion.R;
import com.beizi.fusion.g.ac;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.p;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.CustomRoundImageView;
/* compiled from: BeiZiNativeTPBTWorker.java */
/* loaded from: classes2.dex */
public class d extends b {
    private LinearLayout R;
    private LinearLayout S;
    private FrameLayout T;
    private CustomRoundImageView U;
    private TextView V;
    private TextView W;
    private TextView X;
    private ImageView Y;

    public d(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        super(context, str, j4, j5, buyerBean, forwardBean, eVar, f5, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aN() {
        try {
            AdSpacesBean.ComplainBean complainBean = this.N;
            if (complainBean != null && complainBean.getOpen() == 1) {
                p pVar = new p();
                pVar.a(((b) this).f7796n, ((b) this).f7802t, "2");
                pVar.a(new p.a() { // from class: com.beizi.fusion.work.nativead.d.1
                    @Override // com.beizi.fusion.g.p.a
                    public void a(String str) {
                        try {
                            d dVar = d.this;
                            at.a(((b) dVar).f7796n, dVar.O, Long.valueOf(System.currentTimeMillis()));
                            ((com.beizi.fusion.work.a) d.this).f7370b.S(str);
                            d.this.au();
                            d.this.I();
                            d.this.aO();
                            if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                                ((com.beizi.fusion.work.a) d.this).f7372d.b(d.this.g(), ((b) d.this).f7803u);
                            }
                            d.this.G();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aO() {
        try {
            LinearLayout linearLayout = new LinearLayout(((b) this).f7796n);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
            ImageView imageView = new ImageView(((b) this).f7796n);
            imageView.setImageResource(R.drawable.beizi_icon_checkbox);
            imageView.setColorFilter(Color.parseColor("#000000"));
            linearLayout.addView(imageView);
            TextView textView = new TextView(((b) this).f7796n);
            textView.setText("投诉成功，我们将重视您的反馈。");
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setTextSize(2, 13.0f);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 30, 0, 0);
            linearLayout.addView(textView, layoutParams);
            ((b) this).f7803u.measure(0, 0);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((b) this).f7803u.getMeasuredWidth(), ((b) this).f7803u.getMeasuredHeight());
            layoutParams2.gravity = 17;
            ((b) this).f7802t.addView(linearLayout, layoutParams2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aP() {
        View downloadTextView;
        try {
            NativeAdResponse nativeAdResponse = this.K;
            if (nativeAdResponse == null || nativeAdResponse.getApkInfo() == null || (downloadTextView = NativeAdUtil.getDownloadTextView(((b) this).f7796n, this.K)) == null) {
                return;
            }
            this.T.measure(0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((this.T.getMeasuredWidth() * 2) / 3, -2);
            layoutParams.gravity = 83;
            this.T.addView(downloadTextView, layoutParams);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void aQ() {
        try {
            NativeAdResponse nativeAdResponse = this.K;
            if (nativeAdResponse == null) {
                return;
            }
            ImageManager.with(null).getBitmap(nativeAdResponse.getImageUrl(), new ImageManager.BitmapLoadedListener() { // from class: com.beizi.fusion.work.nativead.d.2
                @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoadFailed() {
                    d.this.a("sdk custom error ".concat("onBitmapLoadFailed"), 99991);
                }

                @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoaded(Bitmap bitmap) {
                    ViewGroup.LayoutParams layoutParams;
                    if (bitmap != null) {
                        try {
                            if (((b) d.this).f7796n == null) {
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("showBeiZiNativeAd onBitmapLoaded width:");
                            sb.append(bitmap.getWidth());
                            sb.append(";height:");
                            sb.append(bitmap.getHeight());
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            double d5 = width;
                            Double.isNaN(d5);
                            double d6 = height;
                            Double.isNaN(d6);
                            float f5 = (float) ((d5 * 1.0d) / d6);
                            d dVar = d.this;
                            int a5 = av.a(((b) dVar).f7796n, ((b) dVar).f7800r - 16.0f);
                            int i4 = (int) (a5 / f5);
                            d dVar2 = d.this;
                            if (((b) dVar2).f7801s > 0.0f) {
                                int i5 = 0;
                                if (dVar2.S != null) {
                                    d.this.S.measure(0, 0);
                                    i5 = d.this.S.getMeasuredHeight();
                                }
                                d dVar3 = d.this;
                                int a6 = av.a(((b) dVar3).f7796n, ((b) dVar3).f7801s - 16.0f);
                                if (a6 > i5) {
                                    i4 = a6 - i5;
                                }
                            }
                            if (d.this.U != null && (layoutParams = d.this.U.getLayoutParams()) != null) {
                                layoutParams.width = a5;
                                layoutParams.height = i4;
                                d.this.U.setLayoutParams(layoutParams);
                            }
                            if (d.this.U != null) {
                                d.this.U.setRectRadius(av.a(((b) d.this).f7796n, 4.0f));
                                if (Build.VERSION.SDK_INT >= 16) {
                                    d.this.U.setBackground(new BitmapDrawable(ac.a(((b) d.this).f7796n, bitmap, 20.0f)));
                                }
                                d.this.U.setImageBitmap(bitmap);
                            }
                            d dVar4 = d.this;
                            dVar4.a(dVar4.U);
                            d.this.aN();
                            d.this.aP();
                            d.this.aR();
                            d.this.aG();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            d.this.a("sdk custom error ".concat("onBitmapLoadFailed"), 99991);
                        }
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aR() {
        try {
            if (this.K == null) {
                return;
            }
            LinearLayout linearLayout = new LinearLayout(((b) this).f7796n);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            FrameLayout createLogoImageView = ViewUtil.createLogoImageView(((b) this).f7796n, this.K.getlogoUrl());
            createLogoImageView.setVisibility(0);
            linearLayout.addView(createLogoImageView, new LinearLayout.LayoutParams(-2, -2, 17.0f));
            FrameLayout createAdImageView = ViewUtil.createAdImageView(((b) this).f7796n, this.K.getAdUrl());
            createAdImageView.setVisibility(0);
            linearLayout.addView(createAdImageView, new LinearLayout.LayoutParams(-2, -2, 17.0f));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) createAdImageView.getLayoutParams();
            layoutParams.setMargins(5, 0, 0, 0);
            layoutParams.gravity = 17;
            createAdImageView.setLayoutParams(layoutParams);
            ((b) this).f7802t.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 53));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            if (aJ()) {
                layoutParams2.setMargins(0, av.a(((b) this).f7796n, 16.0f), av.a(((b) this).f7796n, 40.0f), 0);
            } else {
                layoutParams2.setMargins(0, av.a(((b) this).f7796n, 16.0f), av.a(((b) this).f7796n, 16.0f), 0);
            }
            linearLayout.setLayoutParams(layoutParams2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.work.nativead.b
    public void a(final NativeAdResponse nativeAdResponse) {
        try {
            ImageView imageView = new ImageView(((b) this).f7796n);
            int a5 = av.a(((b) this).f7796n, 24.0f) + 42;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a5, a5);
            int a6 = av.a(((b) this).f7796n, 16.0f);
            int a7 = av.a(((b) this).f7796n, 8.0f);
            imageView.setPadding(a7, a6, a6, a7);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.beizi_close_two);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a5, a5);
            layoutParams2.gravity = 5;
            ((b) this).f7802t.addView(imageView, layoutParams2);
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.fusion.work.nativead.d.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        ((b) d.this).F = motionEvent.getX();
                        ((b) d.this).G = motionEvent.getY();
                        ((b) d.this).H = motionEvent.getRawX();
                        d.this.I = motionEvent.getRawY();
                        return false;
                    }
                    return false;
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.nativead.d.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (d.this.aK()) {
                            if (d.this.aL()) {
                                d dVar = d.this;
                                at.a(((b) dVar).f7796n, dVar.J, Long.valueOf(System.currentTimeMillis()));
                                NativeAdResponse nativeAdResponse2 = nativeAdResponse;
                                d dVar2 = d.this;
                                NativeAdUtil.handleClick(nativeAdResponse2, ((b) dVar2).f7803u, String.valueOf(((b) dVar2).F), String.valueOf(((b) d.this).G), String.valueOf(((b) d.this).H), String.valueOf(d.this.I), 0);
                            } else {
                                d.this.aM();
                            }
                        } else {
                            d.this.aM();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.work.nativead.b
    public void b() {
        TextView textView;
        try {
            if (this.K == null) {
                c(-991);
                return;
            }
            View inflate = LayoutInflater.from(((b) this).f7796n).inflate(R.layout.beizi_layout_native_top_picture_bottom_text_view, (ViewGroup) null);
            this.M = inflate;
            this.R = (LinearLayout) inflate.findViewById(R.id.native_ad_tpbt_container_ll);
            this.T = (FrameLayout) this.M.findViewById(R.id.native_ad_tpbt_img_container_fl);
            this.U = (CustomRoundImageView) this.M.findViewById(R.id.native_ad_tpbt_image_iv);
            this.S = (LinearLayout) this.M.findViewById(R.id.native_ad_tpbt_content_ll);
            this.V = (TextView) this.M.findViewById(R.id.native_ad_tpbt_title_tv);
            this.W = (TextView) this.M.findViewById(R.id.native_ad_tpbt_subtitle_tv);
            this.X = (TextView) this.M.findViewById(R.id.native_ad_tpbt_go_tv);
            this.Y = (ImageView) this.M.findViewById(R.id.native_ad_tpbt_go_iv);
            int a5 = av.a(((b) this).f7796n, ((b) this).f7800r);
            float f5 = ((b) this).f7801s;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a5, f5 > 0.0f ? av.a(((b) this).f7796n, f5) : -2);
            int a6 = av.a(((b) this).f7796n, 8.0f);
            LinearLayout linearLayout = this.R;
            if (linearLayout != null) {
                linearLayout.setPadding(a6, a6, a6, a6);
                this.R.setLayoutParams(layoutParams);
            }
            LinearLayout linearLayout2 = this.S;
            if (linearLayout2 != null) {
                linearLayout2.setPadding(0, av.a(((b) this).f7796n, 8.0f), 0, av.a(((b) this).f7796n, 8.0f));
            }
            String headline = this.K.getHeadline();
            if (this.V != null && !TextUtils.isEmpty(headline)) {
                this.V.setText(headline);
            }
            String body = this.K.getBody();
            if (this.W != null && !TextUtils.isEmpty(body)) {
                this.W.setText(body);
            }
            if (Build.VERSION.SDK_INT >= 21 && (textView = this.X) != null) {
                textView.setBackground(((b) this).f7796n.getDrawable(R.drawable.beizi_bg_operate_button));
            }
            if (this.Y != null) {
                this.Y.setLayoutParams(new RelativeLayout.LayoutParams(av.a(((b) this).f7796n, 63.0f), av.a(((b) this).f7796n, 24.0f)));
                this.Y.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            a(this.X, this.Y);
            aQ();
            aH();
            aI();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
