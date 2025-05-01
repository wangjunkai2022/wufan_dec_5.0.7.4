package com.beizi.fusion.work.h;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.beizi.fusion.R;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ap;
import com.beizi.fusion.g.ar;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.i;
import com.beizi.fusion.g.s;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.CoordinateBean;
import com.beizi.fusion.widget.ScrollClickView;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: BaseUnifiedCustomWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {
    protected ImageView A;
    protected ImageView B;
    protected TextView C;
    protected TextView D;
    protected TextView E;
    protected TextView F;
    protected TextView G;
    protected long H;
    protected float I;
    protected float J;
    protected boolean K = false;
    protected boolean L = false;
    protected boolean M = false;
    protected Context N;
    protected Activity O;
    protected ar P;
    protected ap Q;
    protected CountDownTimer R;
    protected AdSpacesBean.RenderViewBean S;
    protected AdSpacesBean.BuyerBean.RenderAds T;
    protected List<AdSpacesBean.RenderViewBean> U;
    protected List<Pair<String, Integer>> V;

    /* renamed from: n  reason: collision with root package name */
    protected View f7634n;

    /* renamed from: o  reason: collision with root package name */
    protected View f7635o;

    /* renamed from: p  reason: collision with root package name */
    protected View f7636p;

    /* renamed from: q  reason: collision with root package name */
    protected ViewGroup f7637q;

    /* renamed from: r  reason: collision with root package name */
    protected ViewGroup f7638r;

    /* renamed from: s  reason: collision with root package name */
    protected ViewGroup f7639s;

    /* renamed from: t  reason: collision with root package name */
    protected ViewGroup f7640t;

    /* renamed from: u  reason: collision with root package name */
    protected ViewGroup f7641u;

    /* renamed from: v  reason: collision with root package name */
    protected ViewGroup f7642v;

    /* renamed from: w  reason: collision with root package name */
    protected ViewGroup f7643w;

    /* renamed from: x  reason: collision with root package name */
    protected ViewGroup f7644x;

    /* renamed from: y  reason: collision with root package name */
    protected ImageView f7645y;

    /* renamed from: z  reason: collision with root package name */
    protected ImageView f7646z;

    public a(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        this.N = context;
        this.H = j4;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7379k = i4;
        this.f7374f = forwardBean;
        this.I = av.l(context);
        this.J = av.m(context);
        aH();
        r();
    }

    private void aZ() {
        List<String> clickView = this.T.getClickView();
        ArrayList arrayList = new ArrayList();
        if (clickView != null && clickView.size() > 0) {
            if (clickView.contains("bg")) {
                arrayList.add(this.f7637q);
                arrayList.add(this.f7639s);
                arrayList.add(this.f7643w);
            } else if (clickView.contains(bm.aA)) {
                arrayList.add(this.f7639s);
            } else {
                if (clickView.contains("image")) {
                    arrayList.add(this.f7640t);
                }
                if (clickView.contains("title")) {
                    arrayList.add(this.D);
                }
                if (clickView.contains("desc")) {
                    arrayList.add(this.E);
                }
                if (clickView.contains("icon")) {
                    arrayList.add(this.A);
                }
                if (clickView.contains(TypedValues.AttributesType.S_TARGET)) {
                    arrayList.add(this.f7642v);
                }
            }
        }
        a(arrayList);
    }

    private void b(Activity activity) {
        if (activity == null || this.f7636p == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        this.f7634n = decorView;
        if (decorView instanceof FrameLayout) {
            av.a(this.f7636p);
            ((FrameLayout) this.f7634n).addView(this.f7636p);
            b(this.f7638r);
        }
    }

    private void ba() {
        ((FrameLayout) this.f7634n).removeView(this.f7636p);
    }

    private void c(int i4, int i5) {
        a(this.f7640t, this.T.getImageCoordinate(), i4, i5);
        aR();
    }

    private void e(int i4, int i5) {
        a(this.E, this.T.getDescCoordinate(), i4, i5);
        if (TextUtils.isEmpty(aT())) {
            return;
        }
        this.E.setText(aT());
    }

    private void f(int i4, int i5) {
        a(this.A, this.T.getIconCoordinate(), i4, i5);
        if (this.A.getVisibility() != 0 || TextUtils.isEmpty(aU())) {
            return;
        }
        i.a(this.N).a(aU(), new i.a() { // from class: com.beizi.fusion.work.h.a.2
            @Override // com.beizi.fusion.g.i.a
            public void a() {
            }

            @Override // com.beizi.fusion.g.i.a
            public void a(Bitmap bitmap) {
                a.this.A.setImageBitmap(bitmap);
            }
        });
    }

    private void g(int i4, int i5) {
        a(this.f7642v, this.T.getActionCoordinate(), i4, i5);
        if (TextUtils.isEmpty(aV())) {
            return;
        }
        this.F.setText(aV());
    }

    private void h(int i4, int i5) {
        a(this.f7641u, this.T.getCloseCoordinate(), i4, i5);
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        try {
            if (this.M) {
                return;
            }
            this.M = true;
            this.O = activity;
            b(activity);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(List<View> list) {
    }

    public int aG() {
        return -1;
    }

    public void aH() {
        if (aG() == -1) {
            return;
        }
        View inflate = LayoutInflater.from(this.N).inflate(aG(), (ViewGroup) null);
        this.f7635o = inflate;
        this.f7637q = (ViewGroup) inflate.findViewById(R.id.rl_bg_container);
        this.f7638r = (ViewGroup) this.f7635o.findViewById(R.id.rl_anim_container);
        this.f7639s = (ViewGroup) this.f7635o.findViewById(R.id.rl_container);
        this.f7640t = (ViewGroup) this.f7635o.findViewById(R.id.fl_img_container);
        this.f7645y = (ImageView) this.f7635o.findViewById(R.id.iv_imageview);
        this.f7641u = (ViewGroup) this.f7635o.findViewById(R.id.rl_close);
        this.C = (TextView) this.f7635o.findViewById(R.id.tv_close);
        this.f7646z = (ImageView) this.f7635o.findViewById(R.id.iv_close);
        this.D = (TextView) this.f7635o.findViewById(R.id.tv_title);
        this.E = (TextView) this.f7635o.findViewById(R.id.tv_desc);
        this.A = (ImageView) this.f7635o.findViewById(R.id.iv_icon);
        this.f7642v = (ViewGroup) this.f7635o.findViewById(R.id.rl_action);
        this.F = (TextView) this.f7635o.findViewById(R.id.tv_action);
        this.f7643w = (ViewGroup) this.f7635o.findViewById(R.id.rl_slide_down_container);
        this.G = (TextView) this.f7635o.findViewById(R.id.tv_slide_down_title);
        this.B = (ImageView) this.f7635o.findViewById(R.id.iv_slide_down_arrow);
        this.f7644x = (ViewGroup) this.f7635o.findViewById(R.id.fl_event_container);
    }

    public void aI() {
    }

    public void aJ() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aK() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null && eVar.r() != 2) {
            this.f7372d.d(g());
        }
        if (this.L) {
            return;
        }
        this.L = true;
        E();
        ai();
        if (this.f7379k != 2) {
            aY();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aL() {
        this.f7378j = com.beizi.fusion.f.a.ADSHOW;
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null && eVar.r() != 2) {
            this.f7372d.b(g());
        }
        if (this.K) {
            return;
        }
        this.K = true;
        az();
        aW();
        C();
        D();
        ah();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aM() {
        try {
            if (Y()) {
                b();
            } else {
                O();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aN() {
        if (this.T != null) {
            a((int) this.I, (int) this.J);
            this.f7646z.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.h.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.aO();
                }
            });
        }
        this.f7636p = this.f7635o;
        aP();
    }

    public void aO() {
    }

    public void aP() {
    }

    public void aQ() {
    }

    public void aR() {
    }

    public String aS() {
        return "";
    }

    public String aT() {
        return "";
    }

    public String aU() {
        return "";
    }

    public String aV() {
        return "";
    }

    protected void aW() {
        AdSpacesBean.BuyerBean.RenderAds renderAds;
        if (this.C == null || this.f7646z == null || (renderAds = this.T) == null) {
            return;
        }
        if (renderAds.getAutoClose() == 0 && this.T.getMinTime() == 0) {
            this.C.setVisibility(8);
            this.f7646z.setVisibility(0);
        } else {
            this.f7646z.setVisibility(8);
            this.C.setVisibility(0);
            a(this.T.getAutoClose(), this.T.getMinTime(), this.T.getMaxTime());
        }
        this.f7641u.setVisibility(0);
    }

    public void aX() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aY() {
        ar arVar = this.P;
        if (arVar != null) {
            arVar.c();
        }
        ap apVar = this.Q;
        if (apVar != null) {
            apVar.b();
        }
        ac();
        G();
        c(this.O);
    }

    public void b(boolean z4) {
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null || aG() == -1) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        List<AdSpacesBean.RenderViewBean> renderView = this.f7373e.getRenderView();
        this.U = renderView;
        if (renderView != null && renderView.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean = this.U.get(0);
            this.S = renderViewBean;
            this.V = s.a(renderViewBean.getDpLinkUrlList());
        }
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                aI();
            }
        }
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "";
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void l() {
        w();
        ag();
        this.T = this.f7373e.getRenderAds();
        aJ();
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7636p;
    }

    private void i(int i4, int i5) {
        b(this.f7643w, this.T.getScrollCoordinate(), i4, i5);
    }

    private void c(Activity activity) {
        if (activity != null) {
            if (this.f7634n == null) {
                this.f7634n = activity.getWindow().getDecorView();
            }
            if (this.f7634n instanceof FrameLayout) {
                ba();
            }
        }
        m();
    }

    private void a(int i4, int i5) {
        a(this.f7637q, this.T.getBgCoordinate(), i4, i5);
        int i6 = this.f7637q.getLayoutParams().width;
        int i7 = this.f7637q.getLayoutParams().height;
        b(i6, i7);
        i(i6, i7);
    }

    private void b(View view) {
        if (view != null) {
            view.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(500L);
            view.setVisibility(0);
            view.startAnimation(translateAnimation);
        }
    }

    private void a(final int i4, final int i5, final int i6) {
        CountDownTimer countDownTimer = this.R;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(600 + (i6 * 1000), 1000L) { // from class: com.beizi.fusion.work.h.a.3
            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (i4 == 1) {
                    a.this.aY();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                a aVar = a.this;
                TextView textView = aVar.C;
                if (textView == null || aVar.f7646z == null) {
                    return;
                }
                int i7 = (int) (((float) j4) / 1000.0f);
                if (i6 - i7 >= i5) {
                    textView.setVisibility(8);
                    a.this.f7646z.setVisibility(0);
                    return;
                }
                textView.setText(String.valueOf(i7));
            }
        };
        this.R = countDownTimer2;
        countDownTimer2.start();
    }

    private void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" NativeAdWorker:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            aX();
            if (this.f7636p != null) {
                this.f7372d.a(g(), this.f7636p);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    private void d(int i4, int i5) {
        a(this.D, this.T.getTitleCoordinate(), i4, i5);
        if (TextUtils.isEmpty(aS())) {
            return;
        }
        this.D.setText(aS());
    }

    private void a(View view, String str, int i4, int i5) {
        RelativeLayout.LayoutParams layoutParams;
        boolean z4;
        if (view == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
        } else if (str.equals("-1:-1:-1:-1:-1:-1:-1:-1:-1")) {
            view.setVisibility(8);
        } else {
            CoordinateBean coordinate = CoordinateBean.getCoordinate(str);
            if (coordinate == null) {
                view.setVisibility(8);
                return;
            }
            int[] a5 = a(coordinate, i4, i5);
            int[] a6 = a(coordinate, i4, i5, a5);
            boolean z5 = view instanceof TextView;
            if (z5) {
                layoutParams = new RelativeLayout.LayoutParams(a6[0], -2);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(a6[0], a6[1]);
            }
            layoutParams.setMargins(a5[0], a5[1], a5[2], a5[3]);
            if (!coordinate.getTop().equals("-1") || coordinate.getBottom().equals("-1")) {
                z4 = false;
            } else {
                layoutParams.addRule(12, -1);
                z4 = true;
            }
            if (coordinate.getLeft().equals("-1") && !coordinate.getRight().equals("-1")) {
                layoutParams.addRule(11, -1);
            }
            view.setLayoutParams(layoutParams);
            if (!coordinate.getFontOrCorner().equals("-1")) {
                if (z5) {
                    ((TextView) view).setTextSize(Float.parseFloat(coordinate.getFontOrCorner()));
                } else if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    if (view != this.f7641u && view != this.f7642v) {
                        int a7 = av.a(this.N, Float.parseFloat(coordinate.getFontOrCorner()));
                        if (z4) {
                            float f5 = a7;
                            gradientDrawable.setCornerRadii(new float[]{f5, f5, f5, f5, 0.0f, 0.0f, 0.0f, 0.0f});
                        } else {
                            gradientDrawable.setCornerRadius(a7);
                        }
                    } else {
                        gradientDrawable.setCornerRadius(a6[1]);
                    }
                }
            }
            if (coordinate.getColor().equals("-1")) {
                return;
            }
            if (z5) {
                ((TextView) view).setTextColor(Color.parseColor(coordinate.getColor()));
            } else if (view != this.f7644x) {
                if (view.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) view.getBackground()).setColor(Color.parseColor(coordinate.getColor()));
                } else {
                    view.setBackgroundColor(Color.parseColor(coordinate.getColor()));
                }
            }
        }
    }

    private void b(int i4, int i5) {
        String adCoordinate = this.T.getAdCoordinate();
        a(this.f7639s, adCoordinate, i4, i5);
        a(this.f7644x, adCoordinate, i4, i5);
        int i6 = this.f7639s.getLayoutParams().width;
        int i7 = this.f7639s.getLayoutParams().height;
        c(i6, i7);
        d(i6, i7);
        e(i6, i7);
        f(i6, i7);
        g(i6, i7);
        h(i6, i7);
        aQ();
        aZ();
    }

    private int b(String str, int i4) {
        if (str.contains("%")) {
            return (i4 * ((int) Float.parseFloat(str.substring(0, str.indexOf("%"))))) / 100;
        }
        return av.a(this.N, Float.parseFloat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
        if (r2 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0170, code lost:
        if (r3 <= 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(android.view.View r18, java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.work.h.a.b(android.view.View, java.lang.String, int, int):void");
    }

    private int[] a(CoordinateBean coordinateBean, int i4, int i5, int[] iArr) {
        int b5;
        int b6;
        int[] iArr2 = new int[2];
        if (coordinateBean.getWidth().equals("-1")) {
            b5 = (i4 - iArr[0]) - iArr[2];
        } else {
            b5 = b(coordinateBean.getWidth(), i4);
        }
        if (!coordinateBean.getScale().equals("-1") && !coordinateBean.getScale().equals("0")) {
            b6 = (int) (b5 / Float.parseFloat(coordinateBean.getScale()));
        } else if (coordinateBean.getHeight().equals("-1")) {
            b6 = (i5 - iArr[1]) - iArr[3];
        } else {
            b6 = b(coordinateBean.getHeight(), i5);
        }
        iArr2[0] = b5;
        iArr2[1] = b6;
        return iArr2;
    }

    private int[] a(CoordinateBean coordinateBean, int i4, int i5) {
        int[] iArr = new int[4];
        String left = coordinateBean.getLeft();
        int b5 = (left.equals("0%") || left.equals("0") || left.equals("-1")) ? 0 : b(left, i4);
        String top = coordinateBean.getTop();
        int b6 = (top.equals("0%") || top.equals("0") || top.equals("-1")) ? 0 : b(top, i5);
        String right = coordinateBean.getRight();
        int b7 = (right.equals("0%") || right.equals("0") || right.equals("-1")) ? 0 : b(right, i4);
        String bottom = coordinateBean.getBottom();
        int b8 = (bottom.equals("0%") || bottom.equals("0") || bottom.equals("-1")) ? 0 : b(bottom, i5);
        iArr[0] = b5;
        iArr[1] = b6;
        iArr[2] = b7;
        iArr[3] = b8;
        return iArr;
    }

    protected void a(View view) {
        a(view, "", 30, (ap.a) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    public void a(View view, final String str, int i4, final ap.a aVar) {
        final int a5 = av.a(this.N, i4);
        final boolean z4 = view == this.f7637q;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.fusion.work.h.a.4

            /* renamed from: a  reason: collision with root package name */
            float f7653a;

            /* renamed from: b  reason: collision with root package name */
            float f7654b;

            /* renamed from: c  reason: collision with root package name */
            float f7655c;

            /* renamed from: d  reason: collision with root package name */
            float f7656d;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                ap.a aVar2;
                ap.a aVar3;
                ap.a aVar4;
                ap.a aVar5;
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f7653a = motionEvent.getX();
                    this.f7654b = motionEvent.getY();
                    this.f7655c = motionEvent.getX();
                    this.f7656d = motionEvent.getY();
                    if (z4) {
                        a.this.f7637q.onTouchEvent(motionEvent);
                    } else {
                        a.this.f7639s.dispatchTouchEvent(motionEvent);
                    }
                } else if (action == 1) {
                    af.b("SlideClickUtil", "mCurPosX = " + this.f7655c + ",mCurPosY = " + this.f7656d + ",mPosX = " + this.f7653a + ",mPosY = " + this.f7654b);
                    float f5 = this.f7656d;
                    float f6 = this.f7654b;
                    int i5 = a5;
                    if (f5 - f6 > i5) {
                        if (!TextUtils.isEmpty(a.this.T.getScrollCoordinate()) && !a.this.T.getScrollCoordinate().equals("-1:-1:-1:-1:-1:-1:-1:-1:-1")) {
                            a.this.b(z4);
                        } else if (ScrollClickView.DIR_DOWN.equalsIgnoreCase(str) && (aVar5 = aVar) != null) {
                            aVar5.c_();
                        }
                    } else if (f6 - f5 > i5) {
                        if ("up".equalsIgnoreCase(str) && (aVar4 = aVar) != null) {
                            aVar4.c_();
                        }
                    } else {
                        float f7 = this.f7653a;
                        float f8 = this.f7655c;
                        if (f7 - f8 > i5) {
                            if (ScrollClickView.DIR_LEFT.equalsIgnoreCase(str) && (aVar3 = aVar) != null) {
                                aVar3.c_();
                            }
                        } else if (f8 - f7 > i5) {
                            if (ScrollClickView.DIR_RIGHT.equalsIgnoreCase(str) && (aVar2 = aVar) != null) {
                                aVar2.c_();
                            }
                        } else if (z4) {
                            a.this.f7637q.onTouchEvent(motionEvent);
                        } else {
                            a.this.f7639s.dispatchTouchEvent(motionEvent);
                        }
                    }
                } else if (action == 2) {
                    this.f7655c = motionEvent.getX();
                    this.f7656d = motionEvent.getY();
                }
                return true;
            }
        });
    }
}
