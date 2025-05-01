package com.beizi.fusion.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.beizi.fusion.R;
import com.beizi.fusion.g.as;
import com.beizi.fusion.g.i;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.update.ShakeArcView;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class EulerAngleView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7181a;

    /* renamed from: b  reason: collision with root package name */
    private Context f7182b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f7183c;

    /* renamed from: d  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleRenderBean f7184d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f7185e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f7186f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f7187g;

    /* renamed from: h  reason: collision with root package name */
    private ShakeArcView f7188h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f7189i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7190j;

    /* renamed from: k  reason: collision with root package name */
    private float f7191k;

    /* renamed from: l  reason: collision with root package name */
    private float f7192l;

    /* renamed from: m  reason: collision with root package name */
    private float f7193m;

    /* renamed from: n  reason: collision with root package name */
    private int f7194n;

    /* renamed from: o  reason: collision with root package name */
    private int f7195o;

    /* renamed from: p  reason: collision with root package name */
    private int f7196p;

    /* renamed from: q  reason: collision with root package name */
    private double f7197q;

    /* renamed from: r  reason: collision with root package name */
    private double f7198r;

    /* renamed from: s  reason: collision with root package name */
    private double f7199s;

    /* renamed from: t  reason: collision with root package name */
    private String f7200t;

    /* renamed from: u  reason: collision with root package name */
    private String f7201u;

    /* renamed from: v  reason: collision with root package name */
    private String f7202v;

    /* renamed from: w  reason: collision with root package name */
    private AnimatorSet f7203w;

    public EulerAngleView(Context context) {
        super(context);
        this.f7181a = false;
        this.f7191k = 60.0f;
        this.f7192l = 60.0f;
        this.f7193m = 30.0f;
        this.f7194n = 350;
        this.f7197q = 0.0d;
        this.f7198r = 0.0d;
        this.f7199s = 0.0d;
        init(context);
    }

    public void buildEulerAngleView() {
        String str;
        TextView textView;
        TextView textView2;
        List<String> imgs;
        try {
            if (this.f7183c == null) {
                return;
            }
            RelativeLayout.inflate(getContext(), R.layout.beizi_interaction_euler_angle_view, this);
            this.f7185e = (LinearLayout) findViewById(R.id.bz_eav_container_ll);
            this.f7186f = (RelativeLayout) findViewById(R.id.bz_eav_img_container_rl);
            this.f7187g = (ImageView) findViewById(R.id.bz_eav_img_iv);
            this.f7188h = (ShakeArcView) findViewById(R.id.bz_eav_sav_iv);
            this.f7189i = (TextView) findViewById(R.id.bz_eav_title_tv);
            this.f7190j = (TextView) findViewById(R.id.bz_eav_subtitle_tv);
            RelativeLayout relativeLayout = this.f7186f;
            if (relativeLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.width = this.f7195o;
                layoutParams.height = this.f7196p;
                this.f7186f.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f7187g;
            if (imageView != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                double d5 = this.f7195o;
                Double.isNaN(d5);
                layoutParams2.width = (int) (d5 * 0.35d);
                int i4 = this.f7196p;
                double d6 = i4;
                Double.isNaN(d6);
                layoutParams2.height = (int) (d6 * 0.5d);
                double d7 = i4;
                Double.isNaN(d7);
                layoutParams2.setMargins(0, 0, 0, (int) (d7 * 0.2d));
                this.f7187g.setLayoutParams(layoutParams2);
            }
            ShakeArcView shakeArcView = this.f7188h;
            if (shakeArcView != null) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) shakeArcView.getLayoutParams();
                double min = Math.min(this.f7195o, this.f7196p);
                Double.isNaN(min);
                layoutParams3.width = (int) (min * 0.7d);
                double min2 = Math.min(this.f7195o, this.f7196p);
                Double.isNaN(min2);
                layoutParams3.height = (int) (min2 * 0.7d);
                this.f7188h.setLayoutParams(layoutParams3);
                if (!TextUtils.isEmpty(this.f7200t)) {
                    this.f7188h.setArrowDirection(0);
                } else if (("1".equals(this.f7201u) && "1".equals(this.f7202v)) || ((TextUtils.isEmpty(this.f7201u) && "1".equals(this.f7202v)) || (TextUtils.isEmpty(this.f7202v) && "1".equals(this.f7201u)))) {
                    this.f7188h.setArrowDirection(1);
                } else if (("2".equals(this.f7201u) && "2".equals(this.f7202v)) || ((TextUtils.isEmpty(this.f7201u) && "2".equals(this.f7202v)) || (TextUtils.isEmpty(this.f7202v) && "2".equals(this.f7201u)))) {
                    this.f7188h.setArrowDirection(2);
                }
                try {
                    this.f7188h.setLineWidth(Math.min(this.f7195o, this.f7196p) / 30);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            AdSpacesBean.BuyerBean.EulerAngleRenderBean eulerAngleRenderBean = this.f7184d;
            String color = eulerAngleRenderBean != null ? eulerAngleRenderBean.getColor() : "#66333333";
            String str2 = null;
            if (!TextUtils.isEmpty(color) && color.startsWith("#")) {
                as.a(this.f7186f, color, 0, null, this.f7195o / 2);
            }
            AdSpacesBean.BuyerBean.EulerAngleStyleBean style = this.f7183c.getStyle();
            String str3 = (style == null || (imgs = style.getImgs()) == null || imgs.size() <= 0) ? null : imgs.get(0);
            if (!TextUtils.isEmpty(str3)) {
                i.a(this.f7182b).b(str3, new i.a() { // from class: com.beizi.fusion.widget.EulerAngleView.1
                    @Override // com.beizi.fusion.g.i.a
                    public void a() {
                    }

                    @Override // com.beizi.fusion.g.i.a
                    public void a(Bitmap bitmap) {
                        try {
                            if (EulerAngleView.this.f7187g == null || bitmap == null) {
                                return;
                            }
                            EulerAngleView.this.f7187g.setImageBitmap(bitmap);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                });
            }
            ShakeArcView shakeArcView2 = this.f7188h;
            if (shakeArcView2 != null) {
                shakeArcView2.setMaxProgress(100.0d);
            }
            if (style != null) {
                str2 = style.getTitle();
                str = style.getSubTitle();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str2) && (textView2 = this.f7189i) != null) {
                textView2.setText(str2);
                this.f7189i.setTextColor(Color.parseColor("#FFFFFFFF"));
                this.f7189i.setShadowLayer(5.0f, 4.0f, 4.0f, Color.parseColor("#8C000000"));
            }
            if (TextUtils.isEmpty(str) || (textView = this.f7190j) == null) {
                return;
            }
            textView.setText(str);
            this.f7190j.setTextColor(Color.parseColor("#FFFFFFFF"));
            this.f7190j.setShadowLayer(5.0f, 4.0f, 4.0f, Color.parseColor("#8C000000"));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void init(Context context) {
        if (this.f7181a) {
            return;
        }
        this.f7182b = context;
        this.f7181a = true;
    }

    public void onDestroy() {
        try {
            this.f7182b = null;
            AnimatorSet animatorSet = this.f7203w;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            this.f7203w = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setAngle(double d5, double d6, double d7) {
        this.f7197q = d5;
        this.f7198r = d6;
        this.f7199s = d7;
    }

    public void setAnimationViewWidthAndHeight(int i4, int i5) {
        this.f7195o = i4;
        this.f7196p = i5;
    }

    public void setCurrentProgress(double d5, double d6, double d7) {
        try {
            if (this.f7188h != null) {
                double d8 = 0.0d;
                double abs = (this.f7197q <= 0.0d || ((!"2".equals(this.f7200t) || d5 <= 0.0d) && ((!"1".equals(this.f7200t) || d5 >= 0.0d) && !"0".equals(this.f7200t)))) ? 0.0d : (Math.abs(d5) * 100.0d) / this.f7197q;
                double abs2 = (this.f7198r <= 0.0d || ((!"2".equals(this.f7201u) || d6 >= 0.0d) && ((!"1".equals(this.f7201u) || d6 <= 0.0d) && !"0".equals(this.f7201u)))) ? 0.0d : (Math.abs(d6) * 100.0d) / this.f7198r;
                if (this.f7199s > 0.0d && (("2".equals(this.f7202v) && d7 > 0.0d) || (("1".equals(this.f7202v) && d7 < 0.0d) || "0".equals(this.f7202v)))) {
                    d8 = (Math.abs(d7) * 100.0d) / this.f7199s;
                }
                this.f7188h.setCurrentProgress(Math.max(Math.max(abs, abs2), d8));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setEulerAngleRenderBean(AdSpacesBean.BuyerBean.EulerAngleRenderBean eulerAngleRenderBean) {
        List<AdSpacesBean.BuyerBean.EulerAngleRuleBean> rules;
        try {
            this.f7184d = eulerAngleRenderBean;
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f7183c;
            if (eulerAngleViewRuleBean != null && (rules = eulerAngleViewRuleBean.getRules()) != null && rules.size() != 0) {
                for (AdSpacesBean.BuyerBean.EulerAngleRuleBean eulerAngleRuleBean : rules) {
                    if (eulerAngleRuleBean != null) {
                        String direction = eulerAngleRuleBean.getDirection();
                        if ("x".equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            this.f7200t = direction;
                        } else if ("y".equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            this.f7201u = direction;
                        } else if (bm.aH.equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            this.f7202v = direction;
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setEulerAngleViewRuleBean(AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean) {
        this.f7183c = eulerAngleViewRuleBean;
    }

    public void startContinuousRotations() {
        List<AdSpacesBean.BuyerBean.EulerAngleRuleBean> rules;
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f7183c;
            if (eulerAngleViewRuleBean != null && (rules = eulerAngleViewRuleBean.getRules()) != null && rules.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (AdSpacesBean.BuyerBean.EulerAngleRuleBean eulerAngleRuleBean : rules) {
                    if (eulerAngleRuleBean != null && eulerAngleRuleBean.getAngle() != 0.0d) {
                        if ("x".equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if ("2".equals(eulerAngleRuleBean.getDirection())) {
                                a(arrayList, "rotationX", 0.0f, -this.f7191k);
                                a(arrayList, "rotationX", -this.f7191k, 0.0f);
                            } else if ("1".equals(eulerAngleRuleBean.getDirection())) {
                                a(arrayList, "rotationX", 0.0f, this.f7191k);
                                a(arrayList, "rotationX", this.f7191k, 0.0f);
                            } else {
                                a(arrayList, "rotationX", 0.0f, this.f7191k);
                                a(arrayList, "rotationX", this.f7191k, 0.0f);
                                a(arrayList, "rotationX", 0.0f, -this.f7191k);
                                a(arrayList, "rotationX", -this.f7191k, 0.0f);
                            }
                        } else if ("y".equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if ("2".equals(eulerAngleRuleBean.getDirection())) {
                                a(arrayList, "rotationY", 0.0f, -this.f7192l);
                                a(arrayList, "rotationY", -this.f7192l, 0.0f);
                            } else if ("1".equals(eulerAngleRuleBean.getDirection())) {
                                a(arrayList, "rotationY", 0.0f, this.f7192l);
                                a(arrayList, "rotationY", this.f7192l, 0.0f);
                            } else {
                                a(arrayList, "rotationY", 0.0f, this.f7192l);
                                a(arrayList, "rotationY", this.f7192l, 0.0f);
                                a(arrayList, "rotationY", 0.0f, -this.f7192l);
                                a(arrayList, "rotationY", -this.f7192l, 0.0f);
                            }
                        } else if (bm.aH.equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if ("2".equals(eulerAngleRuleBean.getDirection())) {
                                a(arrayList, Key.ROTATION, 0.0f, -this.f7193m);
                                a(arrayList, Key.ROTATION, -this.f7193m, 0.0f);
                            } else if ("1".equals(eulerAngleRuleBean.getDirection())) {
                                a(arrayList, Key.ROTATION, 0.0f, this.f7193m);
                                a(arrayList, Key.ROTATION, this.f7193m, 0.0f);
                            } else {
                                a(arrayList, Key.ROTATION, 0.0f, this.f7193m);
                                a(arrayList, Key.ROTATION, this.f7193m, 0.0f);
                                a(arrayList, Key.ROTATION, 0.0f, -this.f7193m);
                                a(arrayList, Key.ROTATION, -this.f7193m, 0.0f);
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f7203w = animatorSet;
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.beizi.fusion.widget.EulerAngleView.2
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            try {
                                if (EulerAngleView.this.f7203w != null) {
                                    EulerAngleView.this.f7203w.start();
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                    this.f7203w.playSequentially(arrayList);
                    this.f7203w.start();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(List<Animator> list, String str, float f5, float f6) {
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7187g, str, f5, f6);
            ofFloat.setDuration(this.f7194n);
            list.add(ofFloat);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public EulerAngleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7181a = false;
        this.f7191k = 60.0f;
        this.f7192l = 60.0f;
        this.f7193m = 30.0f;
        this.f7194n = 350;
        this.f7197q = 0.0d;
        this.f7198r = 0.0d;
        this.f7199s = 0.0d;
        init(context);
    }

    public EulerAngleView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7181a = false;
        this.f7191k = 60.0f;
        this.f7192l = 60.0f;
        this.f7193m = 30.0f;
        this.f7194n = 350;
        this.f7197q = 0.0d;
        this.f7198r = 0.0d;
        this.f7199s = 0.0d;
        init(context);
    }
}
