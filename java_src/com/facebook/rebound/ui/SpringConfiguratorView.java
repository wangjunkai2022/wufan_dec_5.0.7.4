package com.facebook.rebound.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import com.facebook.rebound.g;
import com.facebook.rebound.i;
import com.facebook.rebound.k;
import com.facebook.rebound.l;
import com.facebook.rebound.m;
import com.facebook.rebound.o;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class SpringConfiguratorView extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    private static final int f12636o = 100000;

    /* renamed from: p  reason: collision with root package name */
    private static final float f12637p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    private static final float f12638q = 200.0f;

    /* renamed from: r  reason: collision with root package name */
    private static final float f12639r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    private static final float f12640s = 50.0f;

    /* renamed from: t  reason: collision with root package name */
    private static final DecimalFormat f12641t = new DecimalFormat("#.#");

    /* renamed from: b  reason: collision with root package name */
    private final e f12642b;

    /* renamed from: c  reason: collision with root package name */
    private final List<k> f12643c;

    /* renamed from: d  reason: collision with root package name */
    private final i f12644d;

    /* renamed from: e  reason: collision with root package name */
    private final float f12645e;

    /* renamed from: f  reason: collision with root package name */
    private final float f12646f;

    /* renamed from: g  reason: collision with root package name */
    private final l f12647g;

    /* renamed from: h  reason: collision with root package name */
    private final int f12648h;

    /* renamed from: i  reason: collision with root package name */
    private SeekBar f12649i;

    /* renamed from: j  reason: collision with root package name */
    private SeekBar f12650j;

    /* renamed from: k  reason: collision with root package name */
    private Spinner f12651k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f12652l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f12653m;

    /* renamed from: n  reason: collision with root package name */
    private k f12654n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements View.OnTouchListener {
        private b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                SpringConfiguratorView.this.q();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    private class c implements m {
        private c() {
        }

        @Override // com.facebook.rebound.m
        public void a(i iVar) {
            float f5 = (float) iVar.f();
            float f6 = SpringConfiguratorView.this.f12646f;
            SpringConfiguratorView.this.setTranslationY((f5 * (SpringConfiguratorView.this.f12645e - f6)) + f6);
        }

        @Override // com.facebook.rebound.m
        public void b(i iVar) {
        }

        @Override // com.facebook.rebound.m
        public void c(i iVar) {
        }

        @Override // com.facebook.rebound.m
        public void d(i iVar) {
        }
    }

    /* loaded from: classes2.dex */
    private class d implements SeekBar.OnSeekBarChangeListener {
        private d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
            if (seekBar == SpringConfiguratorView.this.f12649i) {
                double d5 = ((i4 * 200.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.f12654n.f12627b = g.d(d5);
                String format = SpringConfiguratorView.f12641t.format(d5);
                SpringConfiguratorView.this.f12653m.setText("T:" + format);
            }
            if (seekBar == SpringConfiguratorView.this.f12650j) {
                double d6 = ((i4 * 50.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.f12654n.f12626a = g.a(d6);
                String format2 = SpringConfiguratorView.f12641t.format(d6);
                SpringConfiguratorView.this.f12652l.setText("F:" + format2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private final Context f12658b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f12659c = new ArrayList();

        public e(Context context) {
            this.f12658b = context;
        }

        public void a(String str) {
            this.f12659c.add(str);
            notifyDataSetChanged();
        }

        public void b() {
            this.f12659c.clear();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f12659c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return this.f12659c.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.f12658b);
                textView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
                int f5 = com.facebook.rebound.ui.a.f(12.0f, SpringConfiguratorView.this.getResources());
                textView.setPadding(f5, f5, f5, f5);
                textView.setTextColor(SpringConfiguratorView.this.f12648h);
            } else {
                textView = (TextView) view;
            }
            textView.setText(this.f12659c.get(i4));
            return textView;
        }
    }

    /* loaded from: classes2.dex */
    private class f implements AdapterView.OnItemSelectedListener {
        private f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            SpringConfiguratorView springConfiguratorView = SpringConfiguratorView.this;
            springConfiguratorView.f12654n = (k) springConfiguratorView.f12643c.get(i4);
            SpringConfiguratorView springConfiguratorView2 = SpringConfiguratorView.this;
            springConfiguratorView2.r(springConfiguratorView2.f12654n);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }

    private View o(Context context) {
        Resources resources = getResources();
        int f5 = com.facebook.rebound.ui.a.f(5.0f, resources);
        int f6 = com.facebook.rebound.ui.a.f(10.0f, resources);
        int f7 = com.facebook.rebound.ui.a.f(20.0f, resources);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, f5, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(com.facebook.rebound.ui.a.a(-1, com.facebook.rebound.ui.a.f(300.0f, resources)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams b5 = com.facebook.rebound.ui.a.b();
        b5.setMargins(0, f7, 0, 0);
        frameLayout2.setLayoutParams(b5);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.f12651k = new Spinner(context, 0);
        FrameLayout.LayoutParams c5 = com.facebook.rebound.ui.a.c();
        c5.gravity = 48;
        c5.setMargins(f6, f6, f6, 0);
        this.f12651k.setLayoutParams(c5);
        frameLayout2.addView(this.f12651k);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams c6 = com.facebook.rebound.ui.a.c();
        c6.setMargins(0, 0, 0, com.facebook.rebound.ui.a.f(80.0f, resources));
        c6.gravity = 80;
        linearLayout.setLayoutParams(c6);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams c7 = com.facebook.rebound.ui.a.c();
        c7.setMargins(f6, f6, f6, f7);
        linearLayout2.setPadding(f6, f6, f6, f6);
        linearLayout2.setLayoutParams(c7);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        SeekBar seekBar = new SeekBar(context);
        this.f12649i = seekBar;
        seekBar.setLayoutParams(layoutParams);
        linearLayout2.addView(this.f12649i);
        TextView textView = new TextView(getContext());
        this.f12653m = textView;
        textView.setTextColor(this.f12648h);
        FrameLayout.LayoutParams a5 = com.facebook.rebound.ui.a.a(com.facebook.rebound.ui.a.f(50.0f, resources), -1);
        this.f12653m.setGravity(19);
        this.f12653m.setLayoutParams(a5);
        this.f12653m.setMaxLines(1);
        linearLayout2.addView(this.f12653m);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams c8 = com.facebook.rebound.ui.a.c();
        c8.setMargins(f6, f6, f6, f7);
        linearLayout3.setPadding(f6, f6, f6, f6);
        linearLayout3.setLayoutParams(c8);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3);
        SeekBar seekBar2 = new SeekBar(context);
        this.f12650j = seekBar2;
        seekBar2.setLayoutParams(layoutParams);
        linearLayout3.addView(this.f12650j);
        TextView textView2 = new TextView(getContext());
        this.f12652l = textView2;
        textView2.setTextColor(this.f12648h);
        FrameLayout.LayoutParams a6 = com.facebook.rebound.ui.a.a(com.facebook.rebound.ui.a.f(50.0f, resources), -1);
        this.f12652l.setGravity(19);
        this.f12652l.setLayoutParams(a6);
        this.f12652l.setMaxLines(1);
        linearLayout3.addView(this.f12652l);
        View view = new View(context);
        FrameLayout.LayoutParams a7 = com.facebook.rebound.ui.a.a(com.facebook.rebound.ui.a.f(60.0f, resources), com.facebook.rebound.ui.a.f(40.0f, resources));
        a7.gravity = 49;
        view.setLayoutParams(a7);
        view.setOnTouchListener(new b());
        view.setBackgroundColor(Color.argb(255, 0, 164, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f12644d.x(this.f12644d.h() == 1.0d ? 0.0d : 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(k kVar) {
        int round = Math.round(((((float) g.c(kVar.f12627b)) - 0.0f) * 100000.0f) / 200.0f);
        int round2 = Math.round(((((float) g.b(kVar.f12626a)) - 0.0f) * 100000.0f) / 50.0f);
        this.f12649i.setProgress(round);
        this.f12650j.setProgress(round2);
    }

    public void n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.f12644d.d();
    }

    public void p() {
        Map<k, String> b5 = this.f12647g.b();
        this.f12642b.b();
        this.f12643c.clear();
        for (Map.Entry<k, String> entry : b5.entrySet()) {
            if (entry.getKey() != k.f12625c) {
                this.f12643c.add(entry.getKey());
                this.f12642b.a(entry.getValue());
            }
        }
        this.f12643c.add(k.f12625c);
        this.f12642b.a(b5.get(k.f12625c));
        this.f12642b.notifyDataSetChanged();
        if (this.f12643c.size() > 0) {
            this.f12651k.setSelection(0);
        }
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12643c = new ArrayList();
        this.f12648h = Color.argb(255, 225, 225, 225);
        o m4 = o.m();
        this.f12647g = l.c();
        e eVar = new e(context);
        this.f12642b = eVar;
        Resources resources = getResources();
        this.f12646f = com.facebook.rebound.ui.a.f(40.0f, resources);
        float f5 = com.facebook.rebound.ui.a.f(280.0f, resources);
        this.f12645e = f5;
        i d5 = m4.d();
        this.f12644d = d5;
        d5.v(1.0d).x(1.0d).a(new c());
        addView(o(context));
        d dVar = new d();
        this.f12649i.setMax(100000);
        this.f12649i.setOnSeekBarChangeListener(dVar);
        this.f12650j.setMax(100000);
        this.f12650j.setOnSeekBarChangeListener(dVar);
        this.f12651k.setAdapter((SpinnerAdapter) eVar);
        this.f12651k.setOnItemSelectedListener(new f());
        p();
        setTranslationY(f5);
    }
}
