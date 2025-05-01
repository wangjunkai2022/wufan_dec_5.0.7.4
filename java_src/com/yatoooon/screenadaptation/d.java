package com.yatoooon.screenadaptation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kuaishou.weapon.p0.t;
/* compiled from: LoadViewHelper.java */
/* loaded from: classes6.dex */
public class d extends a {
    public d(Context context, int i4, int i5, float f5, String str) {
        super(context, i4, i5, f5, str);
    }

    private float k(float f5) {
        if ("px".equals(this.f68474h)) {
            return f5 * (this.f68469c / this.f68471e);
        }
        if (t.f55698q.equals(this.f68474h)) {
            return (this.f68472f / 160.0f) * l3.b.c(this.f68467a, f5) * (this.f68469c / this.f68471e);
        }
        return 0.0f;
    }

    private void l(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextSize(0, m(textView));
        }
    }

    private float m(TextView textView) {
        return k(textView.getTextSize() * this.f68473g);
    }

    private int n(int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (i4 == 1) {
            return 1;
        }
        return (int) k(i4);
    }

    @Override // com.yatoooon.screenadaptation.a
    public int a(int i4) {
        return n(i4);
    }

    @Override // com.yatoooon.screenadaptation.a
    public void b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = n(marginLayoutParams.leftMargin);
            marginLayoutParams.topMargin = n(marginLayoutParams.topMargin);
            marginLayoutParams.rightMargin = n(marginLayoutParams.rightMargin);
            marginLayoutParams.bottomMargin = n(marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.yatoooon.screenadaptation.a
    public void c(View view) {
        l3.a.g(view, n(l3.a.b(view)));
        l3.a.f(view, n(l3.a.a(view)));
    }

    @Override // com.yatoooon.screenadaptation.a
    public void d(View view) {
        l3.a.i(view, n(l3.a.d(view)));
        l3.a.h(view, n(l3.a.c(view)));
    }

    @Override // com.yatoooon.screenadaptation.a
    public void e(View view) {
        view.setPadding(n(view.getPaddingLeft()), n(view.getPaddingTop()), n(view.getPaddingRight()), n(view.getPaddingBottom()));
    }

    @Override // com.yatoooon.screenadaptation.a
    public void h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i4 = layoutParams.width;
        if (i4 > 0) {
            layoutParams.width = n(i4);
        }
        int i5 = layoutParams.height;
        if (i5 > 0) {
            layoutParams.height = n(i5);
        }
        l(view);
    }
}
