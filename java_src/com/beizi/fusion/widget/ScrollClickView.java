package com.beizi.fusion.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.beizi.fusion.R;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
/* loaded from: classes2.dex */
public class ScrollClickView extends LinearLayout {
    public static final String DIR_DOWN = "down";
    public static final String DIR_LEFT = "left";
    public static final String DIR_RIGHT = "right";
    public static final String DIR_UP = "up";

    /* renamed from: a  reason: collision with root package name */
    ImageView f7228a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f7229b;

    /* renamed from: c  reason: collision with root package name */
    TextView f7230c;

    /* renamed from: d  reason: collision with root package name */
    TextView f7231d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7232e;

    /* renamed from: f  reason: collision with root package name */
    private String f7233f;

    /* renamed from: g  reason: collision with root package name */
    private String f7234g;

    /* renamed from: h  reason: collision with root package name */
    private int f7235h;

    /* renamed from: i  reason: collision with root package name */
    private int f7236i;

    /* renamed from: j  reason: collision with root package name */
    private String f7237j;

    /* renamed from: k  reason: collision with root package name */
    private int f7238k;

    /* renamed from: l  reason: collision with root package name */
    private int f7239l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f7240m;

    /* renamed from: n  reason: collision with root package name */
    private Context f7241n;

    /* renamed from: o  reason: collision with root package name */
    private FrameLayout f7242o;

    /* renamed from: p  reason: collision with root package name */
    private FrameLayout f7243p;

    /* renamed from: q  reason: collision with root package name */
    private LinearLayout f7244q;

    public ScrollClickView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7232e = false;
        this.f7237j = "up";
        this.f7238k = 45;
        this.f7239l = 180;
        this.f7244q = null;
        init(context);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:49:0x0073). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005d -> B:49:0x0073). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:49:0x0073). Please submit an issue!!! */
    public void buildRealView() {
        try {
            if ("up".equalsIgnoreCase(this.f7237j)) {
                this.f7244q = (LinearLayout) LayoutInflater.from(this.f7241n).inflate(R.layout.layout_scrollview_up, this);
            } else if (DIR_DOWN.equalsIgnoreCase(this.f7237j)) {
                this.f7244q = (LinearLayout) LayoutInflater.from(this.f7241n).inflate(R.layout.layout_scrollview_down, this);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if ("up".equalsIgnoreCase(this.f7237j)) {
                this.f7244q = (LinearLayout) LayoutInflater.from(this.f7241n.getApplicationContext()).inflate(R.layout.layout_scrollview_up, this);
            } else if (DIR_DOWN.equalsIgnoreCase(this.f7237j)) {
                this.f7244q = (LinearLayout) LayoutInflater.from(this.f7241n.getApplicationContext()).inflate(R.layout.layout_scrollview_down, this);
            }
        }
        try {
            LinearLayout linearLayout = this.f7244q;
            if (linearLayout == null) {
                return;
            }
            this.f7228a = (ImageView) linearLayout.findViewById(R.id.hand);
            this.f7229b = (ImageView) this.f7244q.findViewById(R.id.scrollbar);
            this.f7230c = (TextView) this.f7244q.findViewById(R.id.title);
            this.f7231d = (TextView) this.f7244q.findViewById(R.id.details);
            this.f7242o = (FrameLayout) this.f7244q.findViewById(R.id.scroll_container);
            this.f7243p = (FrameLayout) this.f7244q.findViewById(R.id.scrollbar_container);
            this.f7238k = av.a(this.f7241n, this.f7238k);
            this.f7239l = av.a(this.f7241n, this.f7239l) + this.f7238k;
            TextView textView = this.f7230c;
            if (textView != null) {
                textView.setText(this.f7233f);
                this.f7230c.setTextSize(2, this.f7235h);
            }
            TextView textView2 = this.f7231d;
            if (textView2 != null) {
                textView2.setText(this.f7234g);
                this.f7231d.setTextSize(2, this.f7236i);
            }
            ImageView imageView = this.f7228a;
            if (imageView == null || this.f7229b == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.f7229b.getLayoutParams();
            if (layoutParams != null) {
                int i4 = this.f7238k;
                layoutParams.width = i4;
                layoutParams.height = i4;
                if (layoutParams2 != null) {
                    layoutParams2.height = this.f7239l;
                    layoutParams2.width = (int) (i4 * 0.55f);
                }
            }
            if (DIR_DOWN.equalsIgnoreCase(this.f7237j)) {
                b();
            } else if ("up".equalsIgnoreCase(this.f7237j)) {
                a();
            } else if (DIR_LEFT.equalsIgnoreCase(this.f7237j)) {
            } else {
                DIR_RIGHT.equalsIgnoreCase(this.f7237j);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void init(Context context) {
        if (this.f7232e) {
            return;
        }
        this.f7241n = context;
        this.f7232e = true;
    }

    public void setDetailText(String str) {
        this.f7234g = str;
    }

    public void setDetailsFont(int i4) {
        this.f7236i = i4;
    }

    public void setHandWidth(int i4) {
        this.f7238k = i4;
    }

    public void setScrollDirection(String str) {
        this.f7237j = str;
    }

    public void setScrollbarHeight(int i4) {
        this.f7239l = i4;
    }

    public void setTitleFont(int i4) {
        this.f7235h = i4;
    }

    public void setTitleText(String str) {
        this.f7233f = str;
    }

    public void startAnim() {
        StringBuilder sb = new StringBuilder();
        sb.append("startAnim animator != null ? ");
        sb.append(this.f7240m != null);
        af.b("ScrollClickUtil", sb.toString());
        try {
            ValueAnimator valueAnimator = this.f7240m;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void stopAnim() {
        try {
            ValueAnimator valueAnimator = this.f7240m;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.f7240m.cancel();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void b() {
        try {
            this.f7228a.post(new Runnable() { // from class: com.beizi.fusion.widget.ScrollClickView.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ScrollClickView.this.f7242o != null && ScrollClickView.this.f7243p != null) {
                            if (ScrollClickView.this.f7228a.getLayoutParams() == null) {
                                return;
                            }
                            final int i4 = ScrollClickView.this.f7228a.getLayoutParams().height;
                            ScrollClickView scrollClickView = ScrollClickView.this;
                            scrollClickView.f7240m = ValueAnimator.ofInt(i4, scrollClickView.f7239l);
                            ViewGroup.LayoutParams layoutParams = ScrollClickView.this.f7229b.getLayoutParams();
                            af.b("ScrollClickUtil", "handHeight = " + i4);
                            if (layoutParams != null) {
                                layoutParams.height = ScrollClickView.this.f7239l;
                            }
                            ScrollClickView.this.f7240m.setDuration(1000L);
                            ScrollClickView.this.f7240m.setRepeatCount(-1);
                            ScrollClickView.this.f7240m.setRepeatMode(1);
                            ScrollClickView.this.f7240m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.beizi.fusion.widget.ScrollClickView.2.1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    try {
                                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                        ViewGroup.LayoutParams layoutParams2 = ScrollClickView.this.f7242o.getLayoutParams();
                                        if (layoutParams2 != null) {
                                            layoutParams2.height = intValue;
                                        }
                                        ViewGroup.LayoutParams layoutParams3 = ScrollClickView.this.f7243p.getLayoutParams();
                                        if (layoutParams3 != null) {
                                            layoutParams3.height = intValue - (i4 / 3);
                                        }
                                        ScrollClickView.this.f7242o.requestLayout();
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                }
                            });
                            return;
                        }
                        af.b("ScrollClickUtil", "scrollContainer or scrollBarContainer is null , please check !");
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a() {
        try {
            this.f7228a.post(new Runnable() { // from class: com.beizi.fusion.widget.ScrollClickView.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ScrollClickView.this.f7242o != null && ScrollClickView.this.f7243p != null) {
                            if (ScrollClickView.this.f7228a.getLayoutParams() == null) {
                                return;
                            }
                            final int i4 = ScrollClickView.this.f7228a.getLayoutParams().height;
                            ScrollClickView scrollClickView = ScrollClickView.this;
                            scrollClickView.f7240m = ValueAnimator.ofInt(i4, scrollClickView.f7239l);
                            af.b("ScrollClickUtil", "handHeight = " + i4 + ",scrollbarHeight = " + ScrollClickView.this.f7239l);
                            ViewGroup.LayoutParams layoutParams = ScrollClickView.this.f7229b.getLayoutParams();
                            StringBuilder sb = new StringBuilder();
                            sb.append("handHeight = ");
                            sb.append(i4);
                            af.b("ScrollClickUtil", sb.toString());
                            if (layoutParams != null) {
                                layoutParams.height = ScrollClickView.this.f7239l;
                            }
                            ScrollClickView.this.f7240m.setDuration(1000L);
                            ScrollClickView.this.f7240m.setRepeatCount(-1);
                            ScrollClickView.this.f7240m.setRepeatMode(1);
                            ScrollClickView.this.f7240m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.beizi.fusion.widget.ScrollClickView.1.1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    try {
                                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                        ViewGroup.LayoutParams layoutParams2 = ScrollClickView.this.f7228a.getLayoutParams();
                                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) layoutParams2).topMargin = ScrollClickView.this.f7239l - intValue;
                                        }
                                        ViewGroup.LayoutParams layoutParams3 = ScrollClickView.this.f7243p.getLayoutParams();
                                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                                            layoutParams3.height = intValue - (i4 / 3);
                                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                            layoutParams4.topMargin = ScrollClickView.this.f7239l - layoutParams4.height;
                                        }
                                        ScrollClickView.this.f7242o.requestLayout();
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                }
                            });
                            return;
                        }
                        af.b("ScrollClickUtil", "scrollContainer or scrollBarContainer is null , please check !");
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public ScrollClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7232e = false;
        this.f7237j = "up";
        this.f7238k = 45;
        this.f7239l = 180;
        this.f7244q = null;
        init(context);
    }

    public ScrollClickView(Context context) {
        super(context);
        this.f7232e = false;
        this.f7237j = "up";
        this.f7238k = 45;
        this.f7239l = 180;
        this.f7244q = null;
        init(context);
    }
}
