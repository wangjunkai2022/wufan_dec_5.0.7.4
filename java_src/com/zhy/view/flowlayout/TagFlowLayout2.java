package com.zhy.view.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zhy.view.flowlayout.TagFlowLayout;
import com.zhy.view.flowlayout.b;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes6.dex */
public class TagFlowLayout2 extends FlowLayout implements b.a {

    /* renamed from: r  reason: collision with root package name */
    private static final String f68617r = "TagFlowLayout";

    /* renamed from: s  reason: collision with root package name */
    private static final String f68618s = "key_choose_pos";

    /* renamed from: t  reason: collision with root package name */
    private static final String f68619t = "key_default";

    /* renamed from: k  reason: collision with root package name */
    private com.zhy.view.flowlayout.b f68620k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f68621l;

    /* renamed from: m  reason: collision with root package name */
    private int f68622m;

    /* renamed from: n  reason: collision with root package name */
    private MotionEvent f68623n;

    /* renamed from: o  reason: collision with root package name */
    private Set<Integer> f68624o;

    /* renamed from: p  reason: collision with root package name */
    private TagFlowLayout.a f68625p;

    /* renamed from: q  reason: collision with root package name */
    private TagFlowLayout.b f68626q;

    /* loaded from: classes6.dex */
    public interface a {
        void a(Set<Integer> set);
    }

    /* loaded from: classes6.dex */
    public interface b {
        boolean a(View view, int i4, FlowLayout flowLayout);
    }

    public TagFlowLayout2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f68621l = true;
        this.f68622m = -1;
        this.f68624o = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TagFlowLayout);
        this.f68621l = obtainStyledAttributes.getBoolean(0, true);
        this.f68622m = obtainStyledAttributes.getInt(2, -1);
        obtainStyledAttributes.recycle();
        if (this.f68621l) {
            setClickable(true);
        }
    }

    private void b() {
        removeAllViews();
        com.zhy.view.flowlayout.b bVar = this.f68620k;
        HashSet<Integer> c5 = bVar.c();
        for (int i4 = 0; i4 < bVar.a(); i4++) {
            View d5 = bVar.d(this, i4, bVar.b(i4));
            TagView tagView = new TagView(getContext());
            d5.setDuplicateParentStateEnabled(true);
            if (d5.getLayoutParams() != null) {
                tagView.setLayoutParams(d5.getLayoutParams());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(c(getContext(), 5.0f), c(getContext(), 5.0f), c(getContext(), 5.0f), c(getContext(), 5.0f));
                tagView.setLayoutParams(marginLayoutParams);
            }
            tagView.addView(d5);
            addView(tagView);
            if (c5.contains(Integer.valueOf(i4))) {
                tagView.setChecked(true);
            }
            if (this.f68620k.g(i4, bVar.b(i4))) {
                this.f68624o.add(Integer.valueOf(i4));
                tagView.setChecked(true);
            }
        }
        this.f68624o.addAll(c5);
    }

    public static int c(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void d(TagView tagView, int i4) {
        if (this.f68621l) {
            if (!tagView.isChecked()) {
                if (this.f68622m == 1 && this.f68624o.size() == 1) {
                    Integer next = this.f68624o.iterator().next();
                    ((TagView) getChildAt(next.intValue())).setChecked(false);
                    tagView.setChecked(true);
                    this.f68624o.remove(next);
                    this.f68624o.add(Integer.valueOf(i4));
                } else if (this.f68622m > 0 && this.f68624o.size() >= this.f68622m) {
                    return;
                } else {
                    tagView.setChecked(true);
                    this.f68624o.add(Integer.valueOf(i4));
                }
            }
            TagFlowLayout.a aVar = this.f68625p;
            if (aVar != null) {
                aVar.a(new HashSet(this.f68624o));
            }
        }
    }

    private TagView e(int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            TagView tagView = (TagView) getChildAt(i6);
            if (tagView.getVisibility() != 8) {
                Rect rect = new Rect();
                tagView.getHitRect(rect);
                if (rect.contains(i4, i5)) {
                    return tagView;
                }
            }
        }
        return null;
    }

    private int f(View view) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (getChildAt(i4) == view) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.zhy.view.flowlayout.b.a
    public void a() {
        this.f68624o.clear();
        b();
    }

    public com.zhy.view.flowlayout.b getAdapter() {
        return this.f68620k;
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.f68624o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.view.flowlayout.FlowLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            TagView tagView = (TagView) getChildAt(i6);
            if (tagView.getVisibility() != 8 && tagView.getTagView().getVisibility() == 8) {
                tagView.setVisibility(8);
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString(f68618s);
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("\\|")) {
                    int parseInt = Integer.parseInt(str);
                    this.f68624o.add(Integer.valueOf(parseInt));
                    TagView tagView = (TagView) getChildAt(parseInt);
                    if (tagView != null) {
                        tagView.setChecked(true);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable(f68619t));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f68619t, super.onSaveInstanceState());
        String str = "";
        if (this.f68624o.size() > 0) {
            for (Integer num : this.f68624o) {
                str = str + num.intValue() + "|";
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString(f68618s, str);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f68623n = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        MotionEvent motionEvent = this.f68623n;
        if (motionEvent == null) {
            return super.performClick();
        }
        this.f68623n = null;
        TagView e5 = e((int) motionEvent.getX(), (int) this.f68623n.getY());
        int f5 = f(e5);
        if (e5 != null) {
            d(e5, f5);
            TagFlowLayout.b bVar = this.f68626q;
            if (bVar != null) {
                return bVar.a(e5.getTagView(), f5, this);
            }
            return true;
        }
        return true;
    }

    public void setAdapter(com.zhy.view.flowlayout.b bVar) {
        this.f68620k = bVar;
        bVar.f(this);
        this.f68624o.clear();
        b();
    }

    public void setMaxSelectCount(int i4) {
        if (this.f68624o.size() > i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("you has already select more than ");
            sb.append(i4);
            sb.append(" views , so it will be clear .");
            this.f68624o.clear();
        }
        this.f68622m = i4;
    }

    public void setOnSelectListener(TagFlowLayout.a aVar) {
        this.f68625p = aVar;
        if (aVar != null) {
            setClickable(true);
        }
    }

    public void setOnTagClickListener(TagFlowLayout.b bVar) {
        this.f68626q = bVar;
        if (bVar != null) {
            setClickable(true);
        }
    }

    public TagFlowLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagFlowLayout2(Context context) {
        this(context, null);
    }
}
