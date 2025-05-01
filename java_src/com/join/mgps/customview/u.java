package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MyGameFilterPopupWindow.java */
/* loaded from: classes4.dex */
public class u extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private Context f48790a;

    /* renamed from: b  reason: collision with root package name */
    private View f48791b;

    /* renamed from: c  reason: collision with root package name */
    public View f48792c;

    /* renamed from: d  reason: collision with root package name */
    View f48793d;

    /* renamed from: e  reason: collision with root package name */
    ListView f48794e;

    /* renamed from: f  reason: collision with root package name */
    BaseAdapter f48795f;

    /* renamed from: g  reason: collision with root package name */
    List<String> f48796g;

    /* renamed from: h  reason: collision with root package name */
    String f48797h;

    /* renamed from: i  reason: collision with root package name */
    d f48798i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                u.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return u.this.f48796g.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            if (i4 < u.this.f48796g.size()) {
                return u.this.f48796g.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            e eVar;
            if (view != null) {
                eVar = (e) view.getTag();
            } else {
                eVar = new e();
                view = LayoutInflater.from(u.this.f48790a).inflate(R.layout.pop_my_game_filter_item, (ViewGroup) null);
                eVar.f48802a = (TextView) view.findViewById(R.id.title);
                eVar.f48803b = view.findViewById(R.id.f15613r);
                eVar.f48804c = view.findViewById(R.id.rRect);
                eVar.f48805d = view.findViewById(R.id.line);
                view.setTag(eVar);
            }
            String str = (String) getItem(i4);
            eVar.f48802a.setText(str);
            if (!TextUtils.isEmpty(u.this.f48797h) && u.this.f48797h.equals(str)) {
                eVar.f48802a.setSelected(true);
                eVar.f48803b.setVisibility(0);
            } else {
                eVar.f48802a.setSelected(false);
                eVar.f48803b.setVisibility(4);
            }
            if (i4 == getCount() - 1) {
                eVar.f48805d.setVisibility(4);
            } else {
                eVar.f48805d.setVisibility(0);
            }
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            u.super.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: MyGameFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a(String str);
    }

    /* compiled from: MyGameFilterPopupWindow.java */
    /* loaded from: classes4.dex */
    class e {

        /* renamed from: a  reason: collision with root package name */
        public TextView f48802a;

        /* renamed from: b  reason: collision with root package name */
        public View f48803b;

        /* renamed from: c  reason: collision with root package name */
        public View f48804c;

        /* renamed from: d  reason: collision with root package name */
        public View f48805d;

        e() {
        }
    }

    public u(Context context) {
        super(context);
        this.f48796g = new ArrayList();
        this.f48790a = context;
        l();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(android.widget.AdapterView adapterView, View view, int i4, long j4) {
        String str = this.f48796g.get(i4);
        dismiss();
        d dVar = this.f48798i;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    private void l() {
        setAnimationStyle(R.style.animationNone);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new a());
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f48790a, R.anim.scale_out);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        loadAnimation.setDuration(100L);
        alphaAnimation.setDuration(100L);
        this.f48794e.startAnimation(loadAnimation);
        this.f48793d.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new c());
    }

    void e() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f48790a, R.anim.scale_in);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        loadAnimation.setDuration(150L);
        alphaAnimation.setDuration(150L);
        this.f48794e.startAnimation(loadAnimation);
        this.f48793d.startAnimation(alphaAnimation);
    }

    void f() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f48790a, R.anim.scale_out);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        loadAnimation.setDuration(150L);
        alphaAnimation.setDuration(150L);
        this.f48794e.startAnimation(loadAnimation);
        this.f48793d.startAnimation(alphaAnimation);
    }

    public d g() {
        return this.f48798i;
    }

    void h() {
        View inflate = LayoutInflater.from(this.f48790a).inflate(R.layout.pop_my_game_filter, (ViewGroup) null);
        this.f48791b = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        update();
        this.f48794e = (ListView) this.f48791b.findViewById(R.id.list);
        View findViewById = this.f48791b.findViewById(R.id.bg);
        this.f48793d = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.customview.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.this.i(view);
            }
        });
        b bVar = new b();
        this.f48795f = bVar;
        this.f48794e.setAdapter((ListAdapter) bVar);
        this.f48794e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.join.mgps.customview.t
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, View view, int i4, long j4) {
                u.this.j(adapterView, view, i4, j4);
            }
        });
    }

    public void k(d dVar) {
        this.f48798i = dVar;
    }

    public void m(View view, List<String> list, String str) {
        showAsDropDown(view);
        this.f48796g.clear();
        if (list != null && list.size() > 0) {
            this.f48796g.addAll(list);
        }
        this.f48795f.notifyDataSetChanged();
        this.f48797h = str;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        this.f48792c = view;
        if (Build.VERSION.SDK_INT == 24) {
            try {
                Rect rect = new Rect();
                this.f48792c.getGlobalVisibleRect(rect);
                setHeight(this.f48792c.getResources().getDisplayMetrics().heightPixels - rect.bottom);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        super.showAsDropDown(view);
        e();
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i4, int i5, int i6) {
        this.f48792c = view;
        super.showAtLocation(view, i4, i5, i6);
    }

    public u(Context context, View view, int i4, int i5) {
        super(view, i4, i5, true);
        this.f48796g = new ArrayList();
        this.f48790a = context;
        this.f48791b = view;
        l();
    }
}
