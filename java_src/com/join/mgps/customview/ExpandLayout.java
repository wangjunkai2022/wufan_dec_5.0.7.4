package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class ExpandLayout extends RelativeLayout implements View.OnClickListener {
    private static final String D = ExpandLayout.class.getSimpleName();
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    private boolean A;
    private b B;
    private boolean C;

    /* renamed from: b  reason: collision with root package name */
    private Context f46971b;

    /* renamed from: c  reason: collision with root package name */
    private View f46972c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f46973d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f46974e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f46975f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f46976g;

    /* renamed from: h  reason: collision with root package name */
    private int f46977h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f46978i;

    /* renamed from: j  reason: collision with root package name */
    private int f46979j;

    /* renamed from: k  reason: collision with root package name */
    private int f46980k;

    /* renamed from: l  reason: collision with root package name */
    private String f46981l;

    /* renamed from: m  reason: collision with root package name */
    private String f46982m;

    /* renamed from: n  reason: collision with root package name */
    private int f46983n;

    /* renamed from: o  reason: collision with root package name */
    private int f46984o;

    /* renamed from: p  reason: collision with root package name */
    private int f46985p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f46986q;

    /* renamed from: r  reason: collision with root package name */
    private String f46987r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f46988s;

    /* renamed from: t  reason: collision with root package name */
    private int f46989t;

    /* renamed from: u  reason: collision with root package name */
    private int f46990u;

    /* renamed from: v  reason: collision with root package name */
    private int f46991v;

    /* renamed from: w  reason: collision with root package name */
    private int f46992w;

    /* renamed from: x  reason: collision with root package name */
    private int f46993x;

    /* renamed from: y  reason: collision with root package name */
    private float f46994y;

    /* renamed from: z  reason: collision with root package name */
    private float f46995z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT >= 16) {
                ExpandLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                ExpandLayout.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            ExpandLayout expandLayout = ExpandLayout.this;
            expandLayout.f46977h = expandLayout.getMeasuredWidth();
            String unused = ExpandLayout.D;
            StringBuilder sb = new StringBuilder();
            sb.append("onGlobalLayout,控件宽度 = ");
            sb.append(ExpandLayout.this.f46977h);
            ExpandLayout expandLayout2 = ExpandLayout.this;
            expandLayout2.n(expandLayout2.f46977h);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    public ExpandLayout(Context context) {
        this(context, null);
    }

    private int f(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private float getExpandLayoutReservedWidth() {
        int i4 = this.f46991v;
        int i5 = (i4 == 0 || i4 == 1) ? this.f46992w : 0;
        float f5 = 0.0f;
        if (i4 == 0 || i4 == 2) {
            f5 = this.f46976g.getPaint().measureText(this.f46981l);
        }
        return i5 + f5;
    }

    private void h(StaticLayout staticLayout, int i4) {
        if (staticLayout == null) {
            return;
        }
        TextPaint paint = this.f46973d.getPaint();
        int lineStart = staticLayout.getLineStart(this.f46983n - 1);
        int lineEnd = staticLayout.getLineEnd(this.f46983n - 1);
        StringBuilder sb = new StringBuilder();
        sb.append("startPos = ");
        sb.append(lineStart);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("endPos = ");
        sb2.append(lineEnd);
        if (lineStart < 0) {
            lineStart = 0;
        }
        if (lineEnd < 0) {
            lineEnd = 0;
        }
        if (lineEnd > this.f46987r.length()) {
            lineEnd = this.f46987r.length();
        }
        if (lineStart > lineEnd) {
            lineStart = lineEnd;
        }
        String substring = this.f46987r.substring(lineStart, lineEnd);
        float measureText = substring != null ? paint.measureText(substring) : 0.0f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("第");
        sb3.append(this.f46983n);
        sb3.append("行 = ");
        sb3.append(substring);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("第");
        sb4.append(this.f46983n);
        sb4.append("行 文本长度 = ");
        sb4.append(measureText);
        float measureText2 = this.f46993x + paint.measureText("...") + getExpandLayoutReservedWidth();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("需要预留的长度 = ");
        sb5.append(measureText2);
        float f5 = measureText2 + measureText;
        float f6 = i4;
        if (f5 > f6) {
            float f7 = f5 - f6;
            if (measureText != 0.0f) {
                lineEnd -= (int) (((f7 / measureText) * 1.0f) * (lineEnd - lineStart));
            }
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("correctEndPos = ");
        sb6.append(lineEnd);
        String substring2 = this.f46987r.substring(0, lineEnd);
        this.f46988s = o(substring2) + "...";
    }

    private void i(StaticLayout staticLayout, int i4) {
        int lineCount;
        if (staticLayout != null && (lineCount = staticLayout.getLineCount()) >= 1) {
            int i5 = lineCount - 1;
            int lineStart = staticLayout.getLineStart(i5);
            int lineEnd = staticLayout.getLineEnd(i5) - 2;
            StringBuilder sb = new StringBuilder();
            sb.append("最后一行 startPos = ");
            sb.append(lineStart);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("最后一行 endPos = ");
            sb2.append(lineEnd);
            if (lineStart < 0) {
                lineStart = 0;
            }
            if (lineEnd < 0) {
                lineEnd = 0;
            }
            if (lineEnd > this.f46987r.length()) {
                lineEnd = this.f46987r.length();
            }
            if (lineStart > lineEnd) {
                lineStart = lineEnd;
            }
            String substring = this.f46987r.substring(lineStart, lineEnd);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("最后一行 内容 = ");
            sb3.append(substring);
            float measureText = substring != null ? this.f46973d.getPaint().measureText(substring) : 0.0f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("最后一行 文本长度 = ");
            sb4.append(measureText);
            if (measureText + getExpandLayoutReservedWidth() > i4) {
                this.f46987r += "\n";
            }
        }
    }

    private void j(int i4) {
        StaticLayout staticLayout = new StaticLayout(this.f46987r, this.f46973d.getPaint(), i4, Layout.Alignment.ALIGN_NORMAL, this.f46995z, this.f46994y, false);
        int lineCount = staticLayout.getLineCount();
        if (lineCount <= this.f46983n) {
            this.f46988s = this.f46987r;
            this.f46974e.setVisibility(8);
            this.f46973d.setMaxLines(Integer.MAX_VALUE);
            this.f46973d.setText(this.f46987r);
            if (this.C) {
                this.f46974e.setVisibility(0);
                this.f46975f.setOnClickListener(this);
                this.f46976g.setOnClickListener(this);
                this.f46983n = lineCount;
                e();
                return;
            }
            return;
        }
        if (this.A) {
            this.f46972c.setOnClickListener(this);
        } else {
            this.f46975f.setOnClickListener(this);
            this.f46976g.setOnClickListener(this);
        }
        this.f46974e.setVisibility(0);
        h(staticLayout, i4);
        i(staticLayout, i4);
        if (this.f46986q) {
            g();
        } else {
            e();
        }
    }

    private void k(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExpandLayout);
        if (obtainStyledAttributes != null) {
            this.f46983n = obtainStyledAttributes.getInt(12, 2);
            this.f46979j = obtainStyledAttributes.getResourceId(4, 0);
            this.f46980k = obtainStyledAttributes.getResourceId(0, 0);
            this.f46981l = obtainStyledAttributes.getString(6);
            this.f46982m = obtainStyledAttributes.getString(1);
            this.f46984o = obtainStyledAttributes.getDimensionPixelSize(3, p(context, 14.0f));
            this.f46989t = obtainStyledAttributes.getColor(2, 0);
            this.f46985p = obtainStyledAttributes.getDimensionPixelSize(9, p(context, 14.0f));
            this.f46990u = obtainStyledAttributes.getColor(8, 0);
            this.f46991v = obtainStyledAttributes.getInt(7, 0);
            this.f46992w = obtainStyledAttributes.getDimensionPixelSize(5, f(context, 15.0f));
            this.f46993x = obtainStyledAttributes.getDimensionPixelSize(13, f(context, 20.0f));
            this.f46994y = obtainStyledAttributes.getDimensionPixelSize(10, 0);
            this.f46995z = obtainStyledAttributes.getFloat(11, 1.0f);
            obtainStyledAttributes.recycle();
        }
        if (this.f46983n < 1) {
            this.f46983n = 1;
        }
    }

    private void l() {
        this.f46972c = RelativeLayout.inflate(this.f46971b, R.layout.layout_expand, this);
        this.f46973d = (TextView) findViewById(R.id.expand_content_tv);
        this.f46974e = (LinearLayout) findViewById(R.id.expand_ll);
        this.f46975f = (ImageView) findViewById(R.id.expand_iv);
        this.f46976g = (TextView) findViewById(R.id.expand_tv);
        this.f46978i = (TextView) findViewById(R.id.expand_helper_tv);
        this.f46976g.setText(this.f46981l);
        this.f46973d.setTextSize(0, this.f46984o);
        this.f46978i.setTextSize(0, this.f46984o);
        this.f46976g.setTextSize(0, this.f46985p);
        this.f46973d.setLineSpacing(this.f46994y, this.f46995z);
        this.f46978i.setLineSpacing(this.f46994y, this.f46995z);
        this.f46976g.setLineSpacing(this.f46994y, this.f46995z);
        setExpandMoreIcon(this.f46979j);
        setContentTextColor(this.f46989t);
        setExpandTextColor(this.f46990u);
        r(this.f46991v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i4) {
        if (TextUtils.isEmpty(this.f46987r)) {
            return;
        }
        j(i4);
    }

    private String o(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        return charSequence2.endsWith("\n") ? charSequence2.substring(0, charSequence2.length() - 1) : charSequence2;
    }

    private void q() {
        if (this.f46986q) {
            this.f46976g.setText(this.f46982m);
        } else {
            this.f46976g.setText(this.f46981l);
        }
    }

    private void r(int i4) {
        if (i4 == 1) {
            this.f46975f.setVisibility(0);
            this.f46976g.setVisibility(8);
        } else if (i4 != 2) {
            this.f46975f.setVisibility(0);
            this.f46976g.setVisibility(0);
        } else {
            this.f46975f.setVisibility(8);
            this.f46976g.setVisibility(0);
        }
    }

    public void e() {
        setIsExpand(false);
        this.f46973d.setMaxLines(Integer.MAX_VALUE);
        this.f46973d.setText(this.f46988s);
        this.f46976g.setText(this.f46981l);
        int i4 = this.f46979j;
        if (i4 != 0) {
            this.f46975f.setImageResource(i4);
        }
    }

    public void g() {
        setIsExpand(true);
        this.f46973d.setMaxLines(Integer.MAX_VALUE);
        this.f46973d.setText(this.f46987r);
        this.f46976g.setText(this.f46982m);
        int i4 = this.f46980k;
        if (i4 != 0) {
            this.f46975f.setImageResource(i4);
        }
    }

    public int getLineCount() {
        TextView textView = this.f46973d;
        if (textView == null) {
            return 0;
        }
        return textView.getLineCount();
    }

    public boolean m() {
        return this.f46986q;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.A) {
            if (!this.f46986q) {
                g();
                b bVar = this.B;
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                return;
            }
            e();
            b bVar2 = this.B;
            if (bVar2 != null) {
                bVar2.a();
            }
        } else if (view == this.f46976g || view == this.f46975f) {
            this.B.b();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure,measureWidth = ");
        sb.append(getMeasuredWidth());
        if (this.f46977h > 0 || getMeasuredWidth() <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        this.f46977h = measuredWidth;
        n(measuredWidth);
    }

    public int p(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void setAlwaysShowMore(boolean z4) {
        this.C = z4;
    }

    public void setCollapseLessIcon(int i4) {
        if (i4 != 0) {
            this.f46980k = i4;
            if (this.f46986q) {
                this.f46975f.setImageResource(i4);
            }
        }
    }

    public void setCollapseLessText(String str) {
        this.f46982m = str;
        q();
    }

    public void setContent(String str) {
        setContent(str, null);
    }

    public void setContentTextColor(int i4) {
        if (i4 != 0) {
            this.f46989t = i4;
            this.f46973d.setTextColor(i4);
        }
    }

    public void setExpandMoreIcon(int i4) {
        if (i4 != 0) {
            this.f46979j = i4;
            if (this.f46986q) {
                return;
            }
            this.f46975f.setImageResource(i4);
        }
    }

    public void setExpandMoreText(String str) {
        this.f46981l = str;
        q();
    }

    public void setExpandStyle(int i4) {
        this.f46991v = i4;
        r(i4);
    }

    public void setExpandTextColor(int i4) {
        if (i4 != 0) {
            this.f46990u = i4;
            this.f46976g.setTextColor(i4);
        }
    }

    public void setExpandable(boolean z4) {
        this.A = z4;
    }

    public void setIsExpand(boolean z4) {
        this.f46986q = z4;
    }

    public void setShrinkLines(int i4) {
        this.f46983n = i4;
    }

    public ExpandLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setContent(String str, b bVar) {
        if (TextUtils.isEmpty(str) || this.f46972c == null) {
            return;
        }
        this.f46987r = str;
        this.B = bVar;
        this.f46973d.setMaxLines(this.f46983n);
        this.f46973d.setText(this.f46987r);
        if (this.f46977h <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new a());
        } else {
            n(this.f46977h);
        }
    }

    public ExpandLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46983n = 2;
        this.f46986q = false;
        this.f46991v = 0;
        this.f46992w = 15;
        this.f46993x = 20;
        this.f46994y = 0.0f;
        this.f46995z = 1.0f;
        this.A = true;
        this.f46971b = context;
        k(context, attributeSet);
        l();
    }
}
