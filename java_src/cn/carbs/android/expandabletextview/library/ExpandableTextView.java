package cn.carbs.android.expandabletextview.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
public class ExpandableTextView extends TextView {
    public static final int A = 1;
    private static final String B = "android.view.View";
    private static final String C = "android.view.View$ListenerInfo";
    private static final String D = "..";
    private static final String E = " ";
    private static final String F = " ";
    private static final int G = 2;
    private static final int H = -13330213;
    private static final int I = -1618884;
    private static final int J = 1436129689;
    private static final int K = 1436129689;
    private static final boolean L = true;
    private static final boolean M = true;
    private static final boolean N = true;

    /* renamed from: z  reason: collision with root package name */
    public static final int f482z = 0;

    /* renamed from: b  reason: collision with root package name */
    private String f483b;

    /* renamed from: c  reason: collision with root package name */
    private String f484c;

    /* renamed from: d  reason: collision with root package name */
    private String f485d;

    /* renamed from: e  reason: collision with root package name */
    private String f486e;

    /* renamed from: f  reason: collision with root package name */
    private String f487f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f488g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f489h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f490i;

    /* renamed from: j  reason: collision with root package name */
    private int f491j;

    /* renamed from: k  reason: collision with root package name */
    private int f492k;

    /* renamed from: l  reason: collision with root package name */
    private int f493l;

    /* renamed from: m  reason: collision with root package name */
    private int f494m;

    /* renamed from: n  reason: collision with root package name */
    private int f495n;

    /* renamed from: o  reason: collision with root package name */
    private int f496o;

    /* renamed from: p  reason: collision with root package name */
    private e f497p;

    /* renamed from: q  reason: collision with root package name */
    private TextView.BufferType f498q;

    /* renamed from: r  reason: collision with root package name */
    private TextPaint f499r;

    /* renamed from: s  reason: collision with root package name */
    private Layout f500s;

    /* renamed from: t  reason: collision with root package name */
    private int f501t;

    /* renamed from: u  reason: collision with root package name */
    private int f502u;

    /* renamed from: v  reason: collision with root package name */
    private int f503v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f504w;

    /* renamed from: x  reason: collision with root package name */
    private b f505x;

    /* renamed from: y  reason: collision with root package name */
    private d f506y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = ExpandableTextView.this.getViewTreeObserver();
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.r(expandableTextView.getNewTextByConfig(), ExpandableTextView.this.f498q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExpandableTextView.this.s();
        }

        /* synthetic */ b(ExpandableTextView expandableTextView, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends LinkMovementMethod {

        /* renamed from: a  reason: collision with root package name */
        private e f509a;

        public c() {
        }

        private e a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int x4 = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y2 = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x4 + textView.getScrollX();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y2 + textView.getScrollY()), scrollX);
            e[] eVarArr = (e[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, e.class);
            if (eVarArr.length > 0) {
                return eVarArr[0];
            }
            return null;
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                e a5 = a(textView, spannable, motionEvent);
                this.f509a = a5;
                if (a5 != null) {
                    a5.a(true);
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f509a), spannable.getSpanEnd(this.f509a));
                }
            } else if (motionEvent.getAction() == 2) {
                e a6 = a(textView, spannable, motionEvent);
                e eVar = this.f509a;
                if (eVar != null && a6 != eVar) {
                    eVar.a(false);
                    this.f509a = null;
                    Selection.removeSelection(spannable);
                }
            } else {
                e eVar2 = this.f509a;
                if (eVar2 != null) {
                    eVar2.a(false);
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
                this.f509a = null;
                Selection.removeSelection(spannable);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(ExpandableTextView expandableTextView);

        void b(ExpandableTextView expandableTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private boolean f511b;

        private e() {
        }

        public void a(boolean z4) {
            this.f511b = z4;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (ExpandableTextView.this.hasOnClickListeners()) {
                ExpandableTextView expandableTextView = ExpandableTextView.this;
                if (expandableTextView.l(expandableTextView) instanceof b) {
                    return;
                }
            }
            ExpandableTextView.this.s();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            int i4 = ExpandableTextView.this.f496o;
            if (i4 == 0) {
                textPaint.setColor(ExpandableTextView.this.f492k);
                textPaint.bgColor = this.f511b ? ExpandableTextView.this.f494m : 0;
            } else if (i4 == 1) {
                textPaint.setColor(ExpandableTextView.this.f493l);
                textPaint.bgColor = this.f511b ? ExpandableTextView.this.f495n : 0;
            }
            textPaint.setUnderlineText(false);
        }

        /* synthetic */ e(ExpandableTextView expandableTextView, a aVar) {
            this();
        }
    }

    public ExpandableTextView(Context context) {
        super(context);
        this.f486e = " ";
        this.f487f = " ";
        this.f488g = true;
        this.f489h = true;
        this.f490i = true;
        this.f491j = 2;
        this.f492k = H;
        this.f493l = I;
        this.f494m = 1436129689;
        this.f495n = 1436129689;
        this.f496o = 0;
        this.f498q = TextView.BufferType.NORMAL;
        this.f501t = -1;
        this.f502u = 0;
        this.f503v = 0;
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getNewTextByConfig() {
        String str;
        int i4;
        int i5;
        int i6;
        if (TextUtils.isEmpty(this.f504w)) {
            return this.f504w;
        }
        Layout layout = getLayout();
        this.f500s = layout;
        if (layout != null) {
            this.f502u = layout.getWidth();
        }
        if (this.f502u <= 0) {
            if (getWidth() == 0) {
                int i7 = this.f503v;
                if (i7 == 0) {
                    return this.f504w;
                }
                this.f502u = (i7 - getPaddingLeft()) - getPaddingRight();
            } else {
                this.f502u = (getWidth() - getPaddingLeft()) - getPaddingRight();
            }
        }
        this.f499r = getPaint();
        this.f501t = -1;
        int i8 = this.f496o;
        if (i8 != 0) {
            if (i8 != 1) {
                return this.f504w;
            }
            if (!this.f490i) {
                return this.f504w;
            }
            DynamicLayout dynamicLayout = new DynamicLayout(this.f504w, this.f499r, this.f502u, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f500s = dynamicLayout;
            int lineCount = dynamicLayout.getLineCount();
            this.f501t = lineCount;
            if (lineCount <= this.f491j) {
                return this.f504w;
            }
            SpannableStringBuilder append = new SpannableStringBuilder(this.f504w).append((CharSequence) this.f487f).append((CharSequence) this.f485d);
            append.setSpan(this.f497p, append.length() - k(this.f485d), append.length(), 33);
            return append;
        }
        DynamicLayout dynamicLayout2 = new DynamicLayout(this.f504w, this.f499r, this.f502u, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f500s = dynamicLayout2;
        int lineCount2 = dynamicLayout2.getLineCount();
        this.f501t = lineCount2;
        if (lineCount2 <= this.f491j) {
            return this.f504w;
        }
        int lineEnd = getValidLayout().getLineEnd(this.f491j - 1);
        int lineStart = getValidLayout().getLineStart(this.f491j - 1);
        int k4 = (lineEnd - k(this.f483b)) - (this.f489h ? k(this.f484c) + k(this.f486e) : 0);
        if (k4 > lineStart) {
            lineEnd = k4;
        }
        int width = getValidLayout().getWidth();
        double measureText = this.f499r.measureText(this.f504w.subSequence(lineStart, lineEnd).toString());
        Double.isNaN(measureText);
        int i9 = width - ((int) (measureText + 0.5d));
        TextPaint textPaint = this.f499r;
        StringBuilder sb = new StringBuilder();
        sb.append(j(this.f483b));
        if (this.f489h) {
            str = j(this.f484c) + j(this.f486e);
        } else {
            str = "";
        }
        sb.append(str);
        float measureText2 = textPaint.measureText(sb.toString());
        float f5 = i9;
        if (f5 > measureText2) {
            int i10 = 0;
            int i11 = 0;
            while (f5 > i10 + measureText2 && (i6 = lineEnd + (i11 = i11 + 1)) <= this.f504w.length()) {
                double measureText3 = this.f499r.measureText(this.f504w.subSequence(lineEnd, i6).toString());
                Double.isNaN(measureText3);
                i10 = (int) (measureText3 + 0.5d);
            }
            i4 = lineEnd + (i11 - 1);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 + i9 < measureText2 && (i5 = lineEnd + (i13 - 1)) > lineStart) {
                double measureText4 = this.f499r.measureText(this.f504w.subSequence(i5, lineEnd).toString());
                Double.isNaN(measureText4);
                i12 = (int) (measureText4 + 0.5d);
            }
            i4 = lineEnd + i13;
        }
        SpannableStringBuilder append2 = new SpannableStringBuilder(q(this.f504w.subSequence(0, i4))).append((CharSequence) this.f483b);
        if (this.f489h) {
            append2.append((CharSequence) (j(this.f486e) + j(this.f484c)));
            append2.setSpan(this.f497p, append2.length() - k(this.f484c), append2.length(), 33);
        }
        return append2;
    }

    private Layout getValidLayout() {
        Layout layout = this.f500s;
        return layout != null ? layout : getLayout();
    }

    private String j(String str) {
        return str == null ? "" : str;
    }

    private int k(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    private View.OnClickListener m(View view) {
        try {
            Field declaredField = Class.forName(B).getDeclaredField("mOnClickListener");
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(view);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private View.OnClickListener n(View view) {
        Object obj;
        try {
            Field declaredField = Class.forName(B).getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } else {
                obj = null;
            }
            Field declaredField2 = Class.forName(C).getDeclaredField("mOnClickListener");
            if (declaredField2 == null || obj == null) {
                return null;
            }
            declaredField2.setAccessible(true);
            return (View.OnClickListener) declaredField2.get(obj);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private void o() {
        this.f497p = new e(this, null);
        setMovementMethod(new c());
        if (TextUtils.isEmpty(this.f483b)) {
            this.f483b = D;
        }
        if (TextUtils.isEmpty(this.f484c)) {
            this.f484c = getResources().getString(R.string.to_expand_hint);
        }
        if (TextUtils.isEmpty(this.f485d)) {
            this.f485d = getResources().getString(R.string.to_shrink_hint);
        }
        if (this.f488g) {
            b bVar = new b(this, null);
            this.f505x = bVar;
            setOnClickListener(bVar);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    private void p(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExpandableTextView)) == null) {
            return;
        }
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == R.styleable.ExpandableTextView_etv_MaxLinesOnShrink) {
                this.f491j = obtainStyledAttributes.getInteger(index, 2);
            } else if (index == R.styleable.ExpandableTextView_etv_EllipsisHint) {
                this.f483b = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.ExpandableTextView_etv_ToExpandHint) {
                this.f484c = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.ExpandableTextView_etv_ToShrinkHint) {
                this.f485d = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.ExpandableTextView_etv_EnableToggle) {
                this.f488g = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.ExpandableTextView_etv_ToExpandHintShow) {
                this.f489h = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.ExpandableTextView_etv_ToShrinkHintShow) {
                this.f490i = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.ExpandableTextView_etv_ToExpandHintColor) {
                this.f492k = obtainStyledAttributes.getInteger(index, H);
            } else if (index == R.styleable.ExpandableTextView_etv_ToShrinkHintColor) {
                this.f493l = obtainStyledAttributes.getInteger(index, I);
            } else if (index == R.styleable.ExpandableTextView_etv_ToExpandHintColorBgPressed) {
                this.f494m = obtainStyledAttributes.getInteger(index, 1436129689);
            } else if (index == R.styleable.ExpandableTextView_etv_ToShrinkHintColorBgPressed) {
                this.f495n = obtainStyledAttributes.getInteger(index, 1436129689);
            } else if (index == R.styleable.ExpandableTextView_etv_InitState) {
                this.f496o = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == R.styleable.ExpandableTextView_etv_GapToExpandHint) {
                this.f486e = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.ExpandableTextView_etv_GapToShrinkHint) {
                this.f487f = obtainStyledAttributes.getString(index);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private String q(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        while (charSequence2.endsWith("\n")) {
            charSequence2 = charSequence2.substring(0, charSequence2.length() - 1);
        }
        return charSequence2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        int i4 = this.f496o;
        if (i4 == 0) {
            this.f496o = 1;
            d dVar = this.f506y;
            if (dVar != null) {
                dVar.b(this);
            }
        } else if (i4 == 1) {
            this.f496o = 0;
            d dVar2 = this.f506y;
            if (dVar2 != null) {
                dVar2.a(this);
            }
        }
        r(getNewTextByConfig(), this.f498q);
    }

    public int getExpandState() {
        return this.f496o;
    }

    public View.OnClickListener l(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return n(view);
        }
        return m(view);
    }

    public void setExpandListener(d dVar) {
        this.f506y = dVar;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f504w = charSequence;
        this.f498q = bufferType;
        r(getNewTextByConfig(), bufferType);
    }

    public void t(CharSequence charSequence, int i4) {
        this.f503v = i4;
        setText(charSequence);
    }

    public void u(CharSequence charSequence, int i4, int i5) {
        this.f503v = i4;
        this.f496o = i5;
        setText(charSequence);
    }

    public void v(CharSequence charSequence, TextView.BufferType bufferType, int i4) {
        this.f503v = i4;
        setText(charSequence, bufferType);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f486e = " ";
        this.f487f = " ";
        this.f488g = true;
        this.f489h = true;
        this.f490i = true;
        this.f491j = 2;
        this.f492k = H;
        this.f493l = I;
        this.f494m = 1436129689;
        this.f495n = 1436129689;
        this.f496o = 0;
        this.f498q = TextView.BufferType.NORMAL;
        this.f501t = -1;
        this.f502u = 0;
        this.f503v = 0;
        p(context, attributeSet);
        o();
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f486e = " ";
        this.f487f = " ";
        this.f488g = true;
        this.f489h = true;
        this.f490i = true;
        this.f491j = 2;
        this.f492k = H;
        this.f493l = I;
        this.f494m = 1436129689;
        this.f495n = 1436129689;
        this.f496o = 0;
        this.f498q = TextView.BufferType.NORMAL;
        this.f501t = -1;
        this.f502u = 0;
        this.f503v = 0;
        p(context, attributeSet);
        o();
    }
}
