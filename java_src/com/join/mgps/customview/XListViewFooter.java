package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class XListViewFooter extends LinearLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final int f48250h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f48251i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f48252j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f48253k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f48254l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f48255m = 5;

    /* renamed from: n  reason: collision with root package name */
    public static final int f48256n = 6;

    /* renamed from: o  reason: collision with root package name */
    public static final int f48257o = 7;

    /* renamed from: b  reason: collision with root package name */
    private Context f48258b;

    /* renamed from: c  reason: collision with root package name */
    private View f48259c;

    /* renamed from: d  reason: collision with root package name */
    private View f48260d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48261e;

    /* renamed from: f  reason: collision with root package name */
    private int f48262f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f48263g;

    public XListViewFooter(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        this.f48258b = context;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.xlistview_footer, (ViewGroup) null);
        addView(linearLayout);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f48259c = linearLayout.findViewById(R.id.xlistview_footer_content);
        this.f48260d = linearLayout.findViewById(R.id.xlistview_footer_progressbar);
        this.f48261e = (TextView) linearLayout.findViewById(R.id.xlistview_footer_hint_textview);
        this.f48263g = (TextView) linearLayout.findViewById(R.id.xlistview_footer_refresh_textview);
    }

    public void a() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48259c.getLayoutParams();
        layoutParams.height = 0;
        this.f48259c.setLayoutParams(layoutParams);
    }

    public void b() {
        this.f48261e.setVisibility(8);
    }

    public void d() {
        this.f48261e.setVisibility(8);
        this.f48260d.setVisibility(0);
    }

    public void e() {
        this.f48261e.setVisibility(0);
        this.f48260d.setVisibility(8);
    }

    public void f() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48259c.getLayoutParams();
        layoutParams.height = -2;
        this.f48259c.setLayoutParams(layoutParams);
    }

    public int getBottomMargin() {
        return ((LinearLayout.LayoutParams) this.f48259c.getLayoutParams()).bottomMargin;
    }

    public int getState() {
        return this.f48262f;
    }

    public void setBottomMargin(int i4) {
        if (i4 < 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48259c.getLayoutParams();
        layoutParams.bottomMargin = i4;
        this.f48259c.setLayoutParams(layoutParams);
    }

    public void setState(int i4) {
        this.f48261e.setVisibility(4);
        this.f48260d.setVisibility(4);
        this.f48261e.setVisibility(4);
        this.f48263g.setVisibility(8);
        if (i4 == 3) {
            this.f48261e.setVisibility(0);
            this.f48261e.setText(R.string.xlistview_header_nomore);
        } else if (i4 == 7) {
            this.f48261e.setVisibility(0);
            this.f48261e.setText("请继续探索更多游戏以获得精准推荐");
            this.f48263g.setVisibility(0);
        } else if (i4 == 1) {
            this.f48261e.setVisibility(0);
            this.f48261e.setText(R.string.xlistview_footer_hint_ready);
        } else if (i4 == 2) {
            this.f48260d.setVisibility(0);
        } else if (i4 == 4) {
            this.f48261e.setVisibility(4);
            this.f48261e.setText(R.string.xlistview_footer_hint_normal);
        } else if (i4 == 5) {
            this.f48261e.setVisibility(0);
            this.f48261e.setText(R.string.xlistview_footer_hint_normal);
        } else {
            this.f48261e.setVisibility(0);
            this.f48261e.setText(R.string.xlistview_footer_hint_normal);
        }
        if (i4 == 6) {
            this.f48261e.setVisibility(8);
        }
    }

    public XListViewFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }
}
