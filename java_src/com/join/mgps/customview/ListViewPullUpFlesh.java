package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes4.dex */
public class ListViewPullUpFlesh extends ListView {
    private static boolean A = false;

    /* renamed from: v  reason: collision with root package name */
    private static final int f47295v = 0;

    /* renamed from: w  reason: collision with root package name */
    private static final int f47296w = 1;

    /* renamed from: x  reason: collision with root package name */
    private static final int f47297x = 2;

    /* renamed from: y  reason: collision with root package name */
    private static final int f47298y = 3;

    /* renamed from: z  reason: collision with root package name */
    private static final float f47299z = 3.0f;

    /* renamed from: b  reason: collision with root package name */
    int f47300b;

    /* renamed from: c  reason: collision with root package name */
    int f47301c;

    /* renamed from: d  reason: collision with root package name */
    private View f47302d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f47303e;

    /* renamed from: f  reason: collision with root package name */
    private ProgressBar f47304f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f47305g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f47306h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f47307i;

    /* renamed from: j  reason: collision with root package name */
    private int f47308j;

    /* renamed from: k  reason: collision with root package name */
    private int f47309k;

    /* renamed from: l  reason: collision with root package name */
    private int f47310l;

    /* renamed from: m  reason: collision with root package name */
    private Animation f47311m;

    /* renamed from: n  reason: collision with root package name */
    private Animation f47312n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f47313o;

    /* renamed from: p  reason: collision with root package name */
    private int f47314p;

    /* renamed from: q  reason: collision with root package name */
    boolean f47315q;

    /* renamed from: r  reason: collision with root package name */
    float f47316r;

    /* renamed from: s  reason: collision with root package name */
    float f47317s;

    /* renamed from: t  reason: collision with root package name */
    float f47318t;

    /* renamed from: u  reason: collision with root package name */
    a f47319u;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public ListViewPullUpFlesh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47317s = 0.0f;
        this.f47318t = 0.0f;
        a(context);
    }

    private void a(Context context) {
        RotateAnimation rotateAnimation = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f47311m = rotateAnimation;
        rotateAnimation.setDuration(150L);
        this.f47311m.setFillAfter(true);
        this.f47311m.setInterpolator(new LinearInterpolator());
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f47312n = rotateAnimation2;
        rotateAnimation2.setDuration(150L);
        this.f47312n.setFillAfter(true);
        this.f47312n.setInterpolator(new LinearInterpolator());
        View inflate = LayoutInflater.from(context).inflate(R.layout.listviewpullheader, (ViewGroup) null);
        this.f47302d = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.arrow);
        this.f47303e = imageView;
        imageView.startAnimation(this.f47312n);
        this.f47304f = (ProgressBar) this.f47302d.findViewById(R.id.progerssbar);
        this.f47305g = (TextView) this.f47302d.findViewById(R.id.title);
        this.f47307i = (TextView) this.f47302d.findViewById(R.id.noMore);
        this.f47306h = (TextView) this.f47302d.findViewById(R.id.updated);
        this.f47305g.setText("上拉刷新");
        this.f47306h.setText("上拉刷新");
        this.f47303e.setMinimumWidth(70);
        this.f47303e.setMaxHeight(50);
        b(this.f47302d);
        int measuredHeight = this.f47302d.getMeasuredHeight();
        this.f47310l = measuredHeight;
        this.f47302d.setPadding(0, measuredHeight * (-1), 0, 0);
        this.f47302d.invalidate();
        addFooterView(this.f47302d);
        this.f47314p = 3;
        this.f47313o = false;
    }

    private void b(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i4 = layoutParams.height;
        if (i4 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
    }

    private void d() {
        int i4 = this.f47314p;
        if (i4 == 0) {
            this.f47304f.setVisibility(8);
            if (A) {
                A = false;
            }
        } else if (i4 == 1) {
            this.f47304f.setVisibility(8);
        } else if (i4 == 2) {
            this.f47304f.setVisibility(0);
            this.f47302d.setPadding(0, 0, 0, 0);
        } else if (i4 != 3) {
        } else {
            this.f47304f.setVisibility(8);
            this.f47302d.setPadding(0, this.f47310l * (-5), 0, 0);
        }
    }

    private void e() {
        a aVar = this.f47319u;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void f() {
        a aVar = this.f47319u;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        this.f47304f.setVisibility(8);
        this.f47307i.setVisibility(0);
    }

    public void g() {
        this.f47314p = 3;
        d();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        TextView textView = this.f47306h;
        textView.setText("最后刷新时间：" + simpleDateFormat.format(new Date()));
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f47301c = getLastVisiblePosition() - 1;
            getCount();
            if (this.f47313o) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f47317s = motionEvent.getY();
                    this.f47315q = false;
                    if (getFirstVisiblePosition() == 0 && !this.f47315q) {
                        this.f47316r = motionEvent.getY();
                        this.f47315q = true;
                    }
                } else if (action != 1) {
                    if (action == 2 && (getLastVisiblePosition() == getCount() - 2 || getLastVisiblePosition() == getCount() - 1)) {
                        this.f47317s = this.f47318t;
                        float y2 = motionEvent.getY();
                        this.f47318t = y2;
                        if (!this.f47315q) {
                            this.f47316r = y2;
                            this.f47315q = true;
                        }
                        int i4 = this.f47314p;
                        if (i4 != 2) {
                            if (i4 == 3 && this.f47316r - y2 > 0.0f) {
                                this.f47314p = 0;
                                d();
                            }
                            if (this.f47314p == 0) {
                                float f5 = this.f47316r;
                                float f6 = this.f47318t;
                                if ((f5 - f6) / 3.0f > this.f47310l && this.f47317s - f6 >= 9.0f) {
                                    this.f47314p = 1;
                                    d();
                                } else if (f5 - f6 <= 0.0f) {
                                    this.f47314p = 3;
                                    d();
                                }
                            }
                            if (this.f47314p == 1) {
                                float f7 = this.f47317s;
                                float f8 = this.f47318t;
                                if (f7 - f8 < -5.0f) {
                                    this.f47314p = 0;
                                    A = true;
                                    d();
                                } else if (f8 - this.f47316r >= 0.0f) {
                                    this.f47314p = 3;
                                    d();
                                }
                            }
                            int i5 = this.f47314p;
                            if (i5 == 0 || i5 == 1) {
                                float f9 = this.f47318t;
                                float f10 = this.f47316r;
                                if (f9 < f10) {
                                    this.f47302d.setPadding(0, 0, 0, (int) (((f10 - f9) / 3.0f) - this.f47310l));
                                }
                            }
                        }
                    }
                } else {
                    PrintStream printStream = System.out;
                    printStream.println("state=" + this.f47314p);
                    int i6 = this.f47314p;
                    if (i6 != 2) {
                        if (i6 == 0) {
                            this.f47314p = 3;
                            if (getLastVisiblePosition() == getCount() - 1 || getLastVisiblePosition() == getCount() - 1) {
                                d();
                            }
                        }
                        if (this.f47314p == 1) {
                            this.f47314p = 2;
                            if (getLastVisiblePosition() == getCount() - 1 || getLastVisiblePosition() == getCount() - 0) {
                                d();
                                f();
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRefreshListener(a aVar) {
        this.f47319u = aVar;
        this.f47313o = true;
    }

    public ListViewPullUpFlesh(Context context) {
        super(context);
        this.f47317s = 0.0f;
        this.f47318t = 0.0f;
        a(context);
    }
}
