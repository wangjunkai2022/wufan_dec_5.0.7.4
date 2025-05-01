package com.join.android.app.component.album;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.join.android.app.component.album.lib.b;
import com.join.android.app.mgsim.wufun.R;
import java.util.List;
/* compiled from: AlbumPopupWindow.java */
/* loaded from: classes3.dex */
public class a extends PopupWindow {

    /* renamed from: f  reason: collision with root package name */
    public static e f15049f;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15050a;

    /* renamed from: b  reason: collision with root package name */
    private final View f15051b;

    /* renamed from: c  reason: collision with root package name */
    private ListView f15052c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.android.app.component.album.lib.b f15053d;

    /* renamed from: e  reason: collision with root package name */
    private int f15054e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlbumPopupWindow.java */
    /* renamed from: com.join.android.app.component.album.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC0315a implements View.OnClickListener {
        View$OnClickListenerC0315a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlbumPopupWindow.java */
    /* loaded from: classes3.dex */
    public class b implements b.g {

        /* compiled from: AlbumPopupWindow.java */
        /* renamed from: com.join.android.app.component.album.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0316a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f15057b;

            C0316a(Object obj) {
                this.f15057b = obj;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                e eVar = a.f15049f;
                if (eVar != null) {
                    eVar.a((com.join.android.app.component.album.lib.a) ((List) this.f15057b).get(i4));
                }
            }
        }

        b() {
        }

        @Override // com.join.android.app.component.album.lib.b.g
        public void a() {
        }

        @Override // com.join.android.app.component.album.lib.b.g
        public void b(Object obj) {
        }

        @Override // com.join.android.app.component.album.lib.b.g
        public void c(Object obj) {
            com.join.android.app.component.album.adapter.a aVar = new com.join.android.app.component.album.adapter.a(a.this.f15050a, (List) obj);
            a.this.f15052c.setAdapter((ListAdapter) aVar);
            aVar.notifyDataSetChanged();
            a.this.f15052c.setOnItemClickListener(new C0316a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlbumPopupWindow.java */
    /* loaded from: classes3.dex */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f15059b;

        c(List list) {
            this.f15059b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            e eVar = a.f15049f;
            if (eVar != null) {
                eVar.a((com.join.android.app.component.album.lib.a) this.f15059b.get(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlbumPopupWindow.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                a.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* compiled from: AlbumPopupWindow.java */
    /* loaded from: classes3.dex */
    public interface e {
        void a(com.join.android.app.component.album.lib.a aVar);
    }

    public a(Context context, View view, int i4, int i5, com.join.android.app.component.album.lib.b bVar) {
        super(view, i4, i5, true);
        this.f15050a = context;
        this.f15051b = view;
        this.f15053d = bVar;
        e();
        g();
        d();
    }

    private void d() {
        this.f15052c = (ListView) this.f15051b.findViewById(R.id.list);
        this.f15051b.findViewById(R.id.main).setOnClickListener(new View$OnClickListenerC0315a());
        double d5 = this.f15054e;
        Double.isNaN(d5);
        ((RelativeLayout.LayoutParams) this.f15052c.getLayoutParams()).height = (int) (d5 * 0.6d);
        com.join.android.app.component.album.lib.b bVar = this.f15053d;
        if (bVar == null) {
            com.join.android.app.component.album.lib.b bVar2 = new com.join.android.app.component.album.lib.b(this.f15050a);
            this.f15053d = bVar2;
            bVar2.l(new b());
        } else {
            List<com.join.android.app.component.album.lib.a> f5 = bVar.f();
            com.join.android.app.component.album.adapter.a aVar = new com.join.android.app.component.album.adapter.a(this.f15050a, f5);
            this.f15052c.setAdapter((ListAdapter) aVar);
            aVar.notifyDataSetChanged();
            this.f15052c.setOnItemClickListener(new c(f5));
        }
        c();
    }

    private void e() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f15050a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f15054e = displayMetrics.heightPixels;
    }

    private void g() {
        setBackgroundDrawable(new BitmapDrawable());
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new d());
    }

    public void c() {
    }

    public void f(e eVar) {
        f15049f = eVar;
    }

    public void h() {
        List<com.join.android.app.component.album.lib.a> f5 = this.f15053d.f();
        com.join.android.app.component.album.adapter.a aVar = (com.join.android.app.component.album.adapter.a) this.f15052c.getAdapter();
        aVar.c(f5);
        aVar.notifyDataSetChanged();
    }
}
