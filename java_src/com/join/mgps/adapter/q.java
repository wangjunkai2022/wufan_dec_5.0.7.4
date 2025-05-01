package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.BuildQRCodeActivity_;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FightServerChoseAdapter.java */
/* loaded from: classes4.dex */
public class q extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45708b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.join.mgps.data.a> f45709c = new ArrayList(0);

    /* compiled from: FightServerChoseAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.data.a f45710b;

        a(com.join.mgps.data.a aVar) {
            this.f45710b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra(BuildQRCodeActivity_.E, this.f45710b.a() + "_" + this.f45710b.b());
            intent.setAction(com.join.mgps.broadcast.b.f46274a);
            q.this.f45708b.sendBroadcast(intent);
        }
    }

    /* compiled from: FightServerChoseAdapter.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        public Button f45712a;

        b() {
        }
    }

    public q(Context context) {
        this.f45708b = context;
    }

    public void b(List<com.join.mgps.data.a> list) {
        this.f45709c.clear();
        this.f45709c.addAll(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45709c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        com.join.mgps.data.a aVar = this.f45709c.get(i4);
        if (view == null) {
            bVar = new b();
            view2 = LayoutInflater.from(this.f45708b).inflate(R.layout.listview_dialog_fight_server_chose, (ViewGroup) null);
            bVar.f45712a = (Button) view2.findViewById(R.id.room);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        Button button = bVar.f45712a;
        button.setText(aVar.a() + "-" + aVar.b());
        bVar.f45712a.setOnClickListener(new a(aVar));
        return view2;
    }
}
