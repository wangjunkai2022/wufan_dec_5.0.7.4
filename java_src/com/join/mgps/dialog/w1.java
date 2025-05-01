package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.posting.PostingActivity;
import java.util.ArrayList;
/* compiled from: PostingSelectCoinsDialog.java */
/* loaded from: classes4.dex */
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f49750a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f49751b;

    /* renamed from: c  reason: collision with root package name */
    private GridView f49752c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<c> f49753d;

    /* renamed from: e  reason: collision with root package name */
    private d f49754e;

    /* renamed from: f  reason: collision with root package name */
    private PostingActivity.m f49755f;

    /* renamed from: g  reason: collision with root package name */
    private int f49756g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostingSelectCoinsDialog.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostingSelectCoinsDialog.java */
    /* loaded from: classes4.dex */
    public class b implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49758b;

        b(Activity activity) {
            this.f49758b = activity;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int i5 = ((c) w1.this.f49753d.get(i4)).f49760a;
            if (i5 * 2 > w1.this.f49756g) {
                return;
            }
            Activity activity = this.f49758b;
            com.join.mgps.Util.b0.f0(activity).E(activity, i5);
            w1.this.f49755f.d(i5);
            w1.this.f49753d.clear();
            w1.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostingSelectCoinsDialog.java */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        int f49760a;

        /* renamed from: b  reason: collision with root package name */
        boolean f49761b;

        public c(int i4) {
            this.f49760a = i4;
        }

        public boolean a() {
            return this.f49761b;
        }

        public void b(boolean z4) {
            this.f49761b = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostingSelectCoinsDialog.java */
    /* loaded from: classes4.dex */
    public class d extends BaseAdapter {

        /* compiled from: PostingSelectCoinsDialog.java */
        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            TextView f49764a;

            a() {
            }
        }

        private d() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return w1.this.f49753d.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return w1.this.f49753d.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_posting_slecte_coins, (ViewGroup) null);
                aVar = new a();
                aVar.f49764a = (TextView) view.findViewById(R.id.tv_value);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            c cVar = (c) w1.this.f49753d.get(i4);
            TextView textView = aVar.f49764a;
            textView.setText(cVar.f49760a + "\n铜板");
            if (cVar.f49760a * 2 > w1.this.f49756g) {
                aVar.f49764a.setTextColor(Color.parseColor("#a8a8a8"));
                aVar.f49764a.setBackgroundResource(R.drawable.bg_frame_a8a8a8);
            } else if (cVar.a()) {
                aVar.f49764a.setTextColor(-1);
                aVar.f49764a.setBackgroundResource(R.drawable.bg_border_3ca4fd);
            } else {
                aVar.f49764a.setTextColor(Color.parseColor("#3CA4FD"));
                aVar.f49764a.setBackgroundResource(R.drawable.bg_frame_3ca4fd);
            }
            return view;
        }

        /* synthetic */ d(w1 w1Var, a aVar) {
            this();
        }
    }

    public w1(Activity activity, PostingActivity.m mVar) {
        e();
        this.f49755f = mVar;
        f(activity);
    }

    private void e() {
        ArrayList<c> arrayList = new ArrayList<>();
        this.f49753d = arrayList;
        arrayList.add(new c(0));
        this.f49753d.add(new c(5));
        this.f49753d.add(new c(10));
        this.f49753d.add(new c(30));
        this.f49753d.add(new c(50));
        this.f49753d.add(new c(60));
        this.f49753d.add(new c(80));
        this.f49753d.add(new c(100));
    }

    public void d() {
        this.f49750a.dismiss();
    }

    void f(Activity activity) {
        this.f49750a = new Dialog(activity, R.style.newtrans_no_floating_dialog);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_posting_select_coins, (ViewGroup) null);
        inflate.findViewById(R.id.iv_close).setOnClickListener(new a());
        this.f49751b = (TextView) inflate.findViewById(R.id.tv_current_copper);
        this.f49752c = (GridView) inflate.findViewById(R.id.mGridView);
        d dVar = new d(this, null);
        this.f49754e = dVar;
        this.f49752c.setAdapter((ListAdapter) dVar);
        this.f49752c.setOnItemClickListener(new b(activity));
        this.f49750a.setContentView(inflate);
        Window window = this.f49750a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setGravity(17);
    }

    public void g(String str, int i4) {
        try {
            this.f49756g = Integer.parseInt(str);
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        TextView textView = this.f49751b;
        textView.setText(Html.fromHtml("当前可用铜板数：<font color=#000000>" + str + "</font>"));
        int i5 = -1;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f49753d.size()) {
                break;
            } else if (this.f49753d.get(i6).f49760a == i4) {
                i5 = i6;
                break;
            } else {
                i6++;
            }
        }
        if (i5 >= 0) {
            this.f49753d.get(i5).b(true);
            this.f49754e.notifyDataSetChanged();
        }
    }

    public void h() {
        if (this.f49750a.isShowing()) {
            return;
        }
        this.f49750a.show();
    }
}
