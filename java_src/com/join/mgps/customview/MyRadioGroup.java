package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
/* loaded from: classes4.dex */
public class MyRadioGroup extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f47416b;

    /* renamed from: c  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f47417c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47418d;

    /* renamed from: e  reason: collision with root package name */
    private d f47419e;

    /* renamed from: f  reason: collision with root package name */
    private e f47420f;

    /* loaded from: classes4.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i4, int i5) {
            if (typedArray.hasValue(i4)) {
                ((LinearLayout.LayoutParams) this).width = typedArray.getLayoutDimension(i4, "layout_width");
            } else {
                ((LinearLayout.LayoutParams) this).width = -2;
            }
            if (typedArray.hasValue(i5)) {
                ((LinearLayout.LayoutParams) this).height = typedArray.getLayoutDimension(i5, "layout_height");
            } else {
                ((LinearLayout.LayoutParams) this).height = -2;
            }
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(int i4, int i5, float f5) {
            super(i4, i5, f5);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f47421b;

        a(View view) {
            this.f47421b = view;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ((RadioButton) this.f47421b).setChecked(true);
            MyRadioGroup.this.j((RadioButton) this.f47421b);
            if (MyRadioGroup.this.f47419e != null) {
                MyRadioGroup.this.f47419e.a(MyRadioGroup.this, this.f47421b.getId());
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RadioButton f47423b;

        b(RadioButton radioButton) {
            this.f47423b = radioButton;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f47423b.setChecked(true);
            MyRadioGroup.this.j(this.f47423b);
            if (MyRadioGroup.this.f47419e != null) {
                MyRadioGroup.this.f47419e.a(MyRadioGroup.this, this.f47423b.getId());
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        private c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (MyRadioGroup.this.f47418d) {
                return;
            }
            MyRadioGroup.this.f47418d = true;
            if (MyRadioGroup.this.f47416b != -1) {
                MyRadioGroup myRadioGroup = MyRadioGroup.this;
                myRadioGroup.n(myRadioGroup.f47416b, false);
            }
            MyRadioGroup.this.f47418d = false;
            MyRadioGroup.this.setCheckedId(compoundButton.getId());
        }

        /* synthetic */ c(MyRadioGroup myRadioGroup, a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(MyRadioGroup myRadioGroup, int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f47426b;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == MyRadioGroup.this && (view2 instanceof RadioButton)) {
                if (view2.getId() == -1) {
                    view2.setId(view2.hashCode());
                }
                ((RadioButton) view2).setOnCheckedChangeListener(MyRadioGroup.this.f47417c);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f47426b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == MyRadioGroup.this && (view2 instanceof RadioButton)) {
                ((RadioButton) view2).setOnCheckedChangeListener(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f47426b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ e(MyRadioGroup myRadioGroup, a aVar) {
            this();
        }
    }

    public MyRadioGroup(Context context) {
        super(context);
        this.f47416b = -1;
        this.f47418d = false;
        setOrientation(1);
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(RadioButton radioButton) {
        RadioButton radioButton2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof RadioButton) {
                if (childAt != radioButton) {
                    ((RadioButton) childAt).setChecked(false);
                }
            } else if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int childCount2 = linearLayout.getChildCount();
                for (int i5 = 0; i5 < childCount2; i5++) {
                    View childAt2 = linearLayout.getChildAt(i5);
                    if ((childAt2 instanceof RadioButton) && (radioButton2 = (RadioButton) childAt2) != radioButton) {
                        radioButton2.setChecked(false);
                    }
                }
            }
        }
    }

    private void m() {
        this.f47417c = new c(this, null);
        e eVar = new e(this, null);
        this.f47420f = eVar;
        super.setOnHierarchyChangeListener(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i4, boolean z4) {
        View findViewById = findViewById(i4);
        if (findViewById == null || !(findViewById instanceof RadioButton)) {
            return;
        }
        ((RadioButton) findViewById).setChecked(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i4) {
        this.f47416b = i4;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof RadioButton) {
            view.setOnTouchListener(new a(view));
        } else if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            int childCount = linearLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = linearLayout.getChildAt(i5);
                if (childAt instanceof RadioButton) {
                    RadioButton radioButton = (RadioButton) childAt;
                    radioButton.setOnTouchListener(new b(radioButton));
                }
            }
        }
        super.addView(view, i4, layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public int getCheckedRadioButtonId() {
        return this.f47416b;
    }

    public void i(int i4) {
        if (i4 == -1 || i4 != this.f47416b) {
            int i5 = this.f47416b;
            if (i5 != -1) {
                n(i5, false);
            }
            if (i4 != -1) {
                n(i4, true);
            }
            setCheckedId(i4);
        }
    }

    public void k() {
        i(-1);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: l */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f47416b;
        if (i4 != -1) {
            this.f47418d = true;
            n(i4, true);
            this.f47418d = false;
            setCheckedId(this.f47416b);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MyRadioGroup.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MyRadioGroup.class.getName());
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f47419e = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f47420f.f47426b = onHierarchyChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public MyRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47416b = -1;
        this.f47418d = false;
        this.f47416b = -1;
        setOrientation(1);
        m();
    }
}
