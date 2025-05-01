package com.join.mgps.customview;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.join.android.app.mgsim.wufun.R;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
public class GamelistExpandableTextView extends AppCompatTextView {
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
    public static final int f47118z = 0;

    /* renamed from: b  reason: collision with root package name */
    private String f47119b;

    /* renamed from: c  reason: collision with root package name */
    private String f47120c;

    /* renamed from: d  reason: collision with root package name */
    private String f47121d;

    /* renamed from: e  reason: collision with root package name */
    private String f47122e;

    /* renamed from: f  reason: collision with root package name */
    private String f47123f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47124g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47125h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47126i;

    /* renamed from: j  reason: collision with root package name */
    private int f47127j;

    /* renamed from: k  reason: collision with root package name */
    private int f47128k;

    /* renamed from: l  reason: collision with root package name */
    private int f47129l;

    /* renamed from: m  reason: collision with root package name */
    private int f47130m;

    /* renamed from: n  reason: collision with root package name */
    private int f47131n;

    /* renamed from: o  reason: collision with root package name */
    private int f47132o;

    /* renamed from: p  reason: collision with root package name */
    private e f47133p;

    /* renamed from: q  reason: collision with root package name */
    private TextView.BufferType f47134q;

    /* renamed from: r  reason: collision with root package name */
    private TextPaint f47135r;

    /* renamed from: s  reason: collision with root package name */
    private Layout f47136s;

    /* renamed from: t  reason: collision with root package name */
    private int f47137t;

    /* renamed from: u  reason: collision with root package name */
    private int f47138u;

    /* renamed from: v  reason: collision with root package name */
    private int f47139v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f47140w;

    /* renamed from: x  reason: collision with root package name */
    private b f47141x;

    /* renamed from: y  reason: collision with root package name */
    private d f47142y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = GamelistExpandableTextView.this.getViewTreeObserver();
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            GamelistExpandableTextView gamelistExpandableTextView = GamelistExpandableTextView.this;
            gamelistExpandableTextView.r(gamelistExpandableTextView.getNewTextByConfig(), GamelistExpandableTextView.this.f47134q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamelistExpandableTextView.this.s();
        }

        /* synthetic */ b(GamelistExpandableTextView gamelistExpandableTextView, a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public class c extends LinkMovementMethod {

        /* renamed from: a  reason: collision with root package name */
        private e f47145a;

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
                this.f47145a = a5;
                if (a5 != null) {
                    a5.a(true);
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f47145a), spannable.getSpanEnd(this.f47145a));
                }
            } else if (motionEvent.getAction() == 2) {
                e a6 = a(textView, spannable, motionEvent);
                e eVar = this.f47145a;
                if (eVar != null && a6 != eVar) {
                    eVar.a(false);
                    this.f47145a = null;
                    Selection.removeSelection(spannable);
                }
            } else {
                e eVar2 = this.f47145a;
                if (eVar2 != null) {
                    eVar2.a(false);
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
                this.f47145a = null;
                Selection.removeSelection(spannable);
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(GamelistExpandableTextView gamelistExpandableTextView);

        void b(GamelistExpandableTextView gamelistExpandableTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class e extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private boolean f47147b;

        private e() {
        }

        public void a(boolean z4) {
            this.f47147b = z4;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            int i4 = GamelistExpandableTextView.this.f47132o;
            if (i4 == 0) {
                textPaint.setColor(GamelistExpandableTextView.this.f47128k);
                textPaint.bgColor = this.f47147b ? GamelistExpandableTextView.this.f47130m : 0;
            } else if (i4 == 1) {
                textPaint.setColor(GamelistExpandableTextView.this.f47129l);
                textPaint.bgColor = this.f47147b ? GamelistExpandableTextView.this.f47131n : 0;
            }
            textPaint.setUnderlineText(false);
        }

        /* synthetic */ e(GamelistExpandableTextView gamelistExpandableTextView, a aVar) {
            this();
        }
    }

    public GamelistExpandableTextView(Context context) {
        super(context);
        this.f47122e = " ";
        this.f47123f = " ";
        this.f47124g = true;
        this.f47125h = true;
        this.f47126i = true;
        this.f47127j = 2;
        this.f47128k = H;
        this.f47129l = I;
        this.f47130m = 1436129689;
        this.f47131n = 1436129689;
        this.f47132o = 0;
        this.f47134q = TextView.BufferType.NORMAL;
        this.f47137t = -1;
        this.f47138u = 0;
        this.f47139v = 0;
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getNewTextByConfig() {
        String str;
        int i4;
        int i5;
        int i6;
        if (TextUtils.isEmpty(this.f47140w)) {
            return this.f47140w;
        }
        Layout layout = getLayout();
        this.f47136s = layout;
        if (layout != null) {
            this.f47138u = layout.getWidth();
        }
        if (this.f47138u <= 0) {
            if (getWidth() == 0) {
                int i7 = this.f47139v;
                if (i7 == 0) {
                    return this.f47140w;
                }
                this.f47138u = (i7 - getPaddingLeft()) - getPaddingRight();
            } else {
                this.f47138u = (getWidth() - getPaddingLeft()) - getPaddingRight();
            }
        }
        this.f47135r = getPaint();
        this.f47137t = -1;
        int i8 = this.f47132o;
        if (i8 != 0) {
            if (i8 != 1) {
                return this.f47140w;
            }
            if (!this.f47126i) {
                return this.f47140w;
            }
            DynamicLayout dynamicLayout = new DynamicLayout(this.f47140w, this.f47135r, this.f47138u, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f47136s = dynamicLayout;
            int lineCount = dynamicLayout.getLineCount();
            this.f47137t = lineCount;
            if (lineCount <= this.f47127j) {
                return this.f47140w;
            }
            SpannableStringBuilder append = new SpannableStringBuilder(this.f47140w).append((CharSequence) this.f47123f).append((CharSequence) this.f47121d);
            append.setSpan(this.f47133p, append.length() - k(this.f47121d), append.length(), 33);
            return append;
        }
        DynamicLayout dynamicLayout2 = new DynamicLayout(this.f47140w, this.f47135r, this.f47138u, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f47136s = dynamicLayout2;
        int lineCount2 = dynamicLayout2.getLineCount();
        this.f47137t = lineCount2;
        if (lineCount2 <= this.f47127j) {
            return this.f47140w;
        }
        int lineEnd = getValidLayout().getLineEnd(this.f47127j - 1);
        int lineStart = getValidLayout().getLineStart(this.f47127j - 1);
        int k4 = (lineEnd - k(this.f47119b)) - (this.f47125h ? k(this.f47120c) + k(this.f47122e) : 0);
        if (k4 > lineStart) {
            lineEnd = k4;
        }
        int width = getValidLayout().getWidth();
        double measureText = this.f47135r.measureText(this.f47140w.subSequence(lineStart, lineEnd).toString());
        Double.isNaN(measureText);
        int i9 = width - ((int) (measureText + 0.5d));
        TextPaint textPaint = this.f47135r;
        StringBuilder sb = new StringBuilder();
        sb.append(j(this.f47119b));
        if (this.f47125h) {
            str = j(this.f47120c) + j(this.f47122e);
        } else {
            str = "";
        }
        sb.append(str);
        float measureText2 = textPaint.measureText(sb.toString());
        float f5 = i9;
        if (f5 > measureText2) {
            int i10 = 0;
            int i11 = 0;
            while (f5 > i10 + measureText2 && (i6 = lineEnd + (i11 = i11 + 1)) <= this.f47140w.length()) {
                double measureText3 = this.f47135r.measureText(this.f47140w.subSequence(lineEnd, i6).toString());
                Double.isNaN(measureText3);
                i10 = (int) (measureText3 + 0.5d);
            }
            i4 = lineEnd + (i11 - 1);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 + i9 < measureText2 && (i5 = lineEnd + (i13 - 1)) > lineStart) {
                double measureText4 = this.f47135r.measureText(this.f47140w.subSequence(i5, lineEnd).toString());
                Double.isNaN(measureText4);
                i12 = (int) (measureText4 + 0.5d);
            }
            i4 = lineEnd + i13;
        }
        SpannableStringBuilder append2 = new SpannableStringBuilder(q(this.f47140w.subSequence(0, i4))).append((CharSequence) this.f47119b);
        if (this.f47125h) {
            append2.append((CharSequence) (j(this.f47122e) + j(this.f47120c)));
            append2.setSpan(this.f47133p, append2.length() - k(this.f47120c), append2.length(), 33);
        }
        return append2;
    }

    private Layout getValidLayout() {
        Layout layout = this.f47136s;
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
        this.f47133p = new e(this, null);
        setMovementMethod(new c());
        if (TextUtils.isEmpty(this.f47119b)) {
            this.f47119b = D;
        }
        if (TextUtils.isEmpty(this.f47120c)) {
            this.f47120c = getResources().getString(R.string.to_expand_hint);
        }
        if (TextUtils.isEmpty(this.f47121d)) {
            this.f47121d = getResources().getString(R.string.to_shrink_hint);
        }
        if (this.f47124g) {
            b bVar = new b(this, null);
            this.f47141x = bVar;
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
            if (index == 5) {
                this.f47127j = obtainStyledAttributes.getInteger(index, 2);
            } else if (index == 0) {
                this.f47119b = obtainStyledAttributes.getString(index);
            } else if (index == 6) {
                this.f47120c = obtainStyledAttributes.getString(index);
            } else if (index == 10) {
                this.f47121d = obtainStyledAttributes.getString(index);
            } else if (index == 1) {
                this.f47124g = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 9) {
                this.f47125h = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 13) {
                this.f47126i = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 7) {
                this.f47128k = obtainStyledAttributes.getInteger(index, H);
            } else if (index == 11) {
                this.f47129l = obtainStyledAttributes.getInteger(index, I);
            } else if (index == 8) {
                this.f47130m = obtainStyledAttributes.getInteger(index, 1436129689);
            } else if (index == 12) {
                this.f47131n = obtainStyledAttributes.getInteger(index, 1436129689);
            } else if (index == 4) {
                this.f47132o = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 2) {
                this.f47122e = obtainStyledAttributes.getString(index);
            } else if (index == 3) {
                this.f47123f = obtainStyledAttributes.getString(index);
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
        int i4 = this.f47132o;
        if (i4 == 0) {
            this.f47132o = 1;
            d dVar = this.f47142y;
            if (dVar != null) {
                dVar.a(this);
            }
        } else if (i4 == 1) {
            this.f47132o = 0;
            d dVar2 = this.f47142y;
            if (dVar2 != null) {
                dVar2.b(this);
            }
        }
        r(getNewTextByConfig(), this.f47134q);
    }

    public int getExpandState() {
        return this.f47132o;
    }

    public View.OnClickListener l(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return n(view);
        }
        return m(view);
    }

    public void setExpandListener(d dVar) {
        this.f47142y = dVar;
    }

    public void setMaxLinesOnShrink(int i4) {
        if (i4 > 2) {
            this.f47127j = i4;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f47140w = charSequence;
        this.f47134q = bufferType;
        r(getNewTextByConfig(), bufferType);
    }

    public void t(CharSequence charSequence, int i4) {
        this.f47139v = i4;
        setText(charSequence);
    }

    public void u(CharSequence charSequence, int i4, int i5) {
        this.f47139v = i4;
        this.f47132o = i5;
        setText(charSequence);
    }

    public void v(CharSequence charSequence, TextView.BufferType bufferType, int i4) {
        this.f47139v = i4;
        setText(charSequence, bufferType);
    }

    public GamelistExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47122e = " ";
        this.f47123f = " ";
        this.f47124g = true;
        this.f47125h = true;
        this.f47126i = true;
        this.f47127j = 2;
        this.f47128k = H;
        this.f47129l = I;
        this.f47130m = 1436129689;
        this.f47131n = 1436129689;
        this.f47132o = 0;
        this.f47134q = TextView.BufferType.NORMAL;
        this.f47137t = -1;
        this.f47138u = 0;
        this.f47139v = 0;
        p(context, attributeSet);
        o();
    }

    public GamelistExpandableTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47122e = " ";
        this.f47123f = " ";
        this.f47124g = true;
        this.f47125h = true;
        this.f47126i = true;
        this.f47127j = 2;
        this.f47128k = H;
        this.f47129l = I;
        this.f47130m = 1436129689;
        this.f47131n = 1436129689;
        this.f47132o = 0;
        this.f47134q = TextView.BufferType.NORMAL;
        this.f47137t = -1;
        this.f47138u = 0;
        this.f47139v = 0;
        p(context, attributeSet);
        o();
    }
}
