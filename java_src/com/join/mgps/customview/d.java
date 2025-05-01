package com.join.mgps.customview;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.ForumActivity;
/* compiled from: ForumGroupOrderbyPopWindow.java */
/* loaded from: classes4.dex */
public class d extends PopupWindow implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    View f48435b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f48436c;

    /* renamed from: d  reason: collision with root package name */
    private b f48437d;

    /* renamed from: e  reason: collision with root package name */
    RadioButton f48438e;

    /* renamed from: f  reason: collision with root package name */
    RadioButton f48439f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForumGroupOrderbyPopWindow.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                d.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* compiled from: ForumGroupOrderbyPopWindow.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i4);
    }

    public d(Context context) {
        super(context);
        this.f48436c = context;
        a();
    }

    private void a() {
        this.f48435b = LayoutInflater.from(this.f48436c).inflate(R.layout.mg_forum_group_oderby_popwindow, (ViewGroup) null);
        this.f48435b.setLayoutParams(new ViewGroup.LayoutParams((int) TypedValue.applyDimension(1, 126.0f, this.f48436c.getResources().getDisplayMetrics()), -2));
        setContentView(this.f48435b);
        setWidth((int) TypedValue.applyDimension(1, 126.0f, this.f48436c.getResources().getDisplayMetrics()));
        setHeight(-2);
        e();
        b();
    }

    private void b() {
        this.f48438e = (RadioButton) this.f48435b.findViewById(R.id.latestPost);
        this.f48439f = (RadioButton) this.f48435b.findViewById(R.id.latestComment);
        this.f48438e.setOnClickListener(this);
        this.f48439f.setOnClickListener(this);
        c(ForumActivity.E);
    }

    private void e() {
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new a());
    }

    public void c(int i4) {
        RadioButton radioButton;
        if (this.f48438e == null || (radioButton = this.f48439f) == null) {
            return;
        }
        boolean z4 = i4 == 1;
        radioButton.setSelected(z4);
        this.f48439f.setChecked(z4);
        this.f48438e.setSelected(!z4);
        this.f48438e.setChecked(!z4);
    }

    public void d(b bVar) {
        this.f48437d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.latestPost) {
            this.f48437d.a(2);
            dismiss();
        } else if (id == R.id.latestComment) {
            this.f48437d.a(1);
            dismiss();
        }
    }

    public d(Context context, int i4, int i5) {
        super(i4, i5);
        this.f48436c = context;
        a();
    }
}
