package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.NewArenaMainActivty_;
import java.util.List;
/* compiled from: ArenaCreateDialog1.java */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f49436a;

    /* renamed from: b  reason: collision with root package name */
    Activity f49437b;

    /* renamed from: c  reason: collision with root package name */
    ListView f49438c;

    /* renamed from: d  reason: collision with root package name */
    View f49439d;

    /* renamed from: e  reason: collision with root package name */
    View f49440e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49441f;

    /* renamed from: g  reason: collision with root package name */
    c f49442g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaCreateDialog1.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ArenaCreateDialog1.java */
    /* loaded from: classes4.dex */
    public class b extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private List<DownloadTask> f49444b;

        /* compiled from: ArenaCreateDialog1.java */
        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            TextView f49446a;

            /* renamed from: b  reason: collision with root package name */
            View f49447b;

            a() {
            }
        }

        public b(List<DownloadTask> list) {
            this.f49444b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f49444b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return this.f49444b.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_arena_room_sort, (ViewGroup) null);
                aVar = new a();
                aVar.f49446a = (TextView) view.findViewById(R.id.tv_info);
                View findViewById = view.findViewById(R.id.emptyView);
                aVar.f49447b = findViewById;
                findViewById.setVisibility(0);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.f49446a.setText(this.f49444b.get(i4).getShowName());
            aVar.f49446a.setBackgroundResource(R.drawable.room_sort_gray_border);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* compiled from: ArenaCreateDialog1.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(DownloadTask downloadTask);
    }

    public i(Activity activity, c cVar) {
        this.f49442g = cVar;
        this.f49437b = activity;
        e(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        c();
        ((NewArenaMainActivty_.h) NewArenaMainActivty_.g1(view.getContext()).flags(TTAdConstant.KEY_CLICK_AREA)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(List list, AdapterView adapterView, View view, int i4, long j4) {
        c cVar = this.f49442g;
        if (cVar != null) {
            cVar.a((DownloadTask) list.get(i4));
        }
        c();
    }

    public void c() {
        this.f49436a.dismiss();
    }

    public c d() {
        return this.f49442g;
    }

    void e(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.newtrans_floating_dialog);
        this.f49436a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f49436a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_arena_create, (ViewGroup) null);
        inflate.findViewById(R.id.iv_close).setOnClickListener(new a());
        this.f49438c = (ListView) inflate.findViewById(R.id.list);
        this.f49439d = inflate.findViewById(R.id.noRecord);
        this.f49441f = (TextView) inflate.findViewById(R.id.tv_top);
        View findViewById = inflate.findViewById(R.id.tv2);
        this.f49440e = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.this.f(view);
            }
        });
        this.f49436a.setContentView(inflate);
        Window window = this.f49436a.getWindow();
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.width = -1;
        attributes2.height = -1;
        window.setGravity(17);
    }

    public void h(final List<DownloadTask> list, boolean z4) {
        if (list != null && list.size() != 0) {
            this.f49439d.setVisibility(8);
            this.f49438c.setVisibility(0);
            this.f49438c.setAdapter((ListAdapter) new b(list));
            this.f49438c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.join.mgps.dialog.h
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                    i.this.g(list, adapterView, view, i4, j4);
                }
            });
            return;
        }
        this.f49439d.setVisibility(0);
        this.f49438c.setVisibility(8);
        this.f49441f.setText("提示");
    }

    public void i(c cVar) {
        this.f49442g = cVar;
    }

    public void j() {
        if (this.f49436a.isShowing()) {
            return;
        }
        this.f49436a.show();
    }
}
