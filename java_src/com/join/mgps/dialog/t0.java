package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FightServerChoseDialog.java */
/* loaded from: classes4.dex */
public class t0 extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49670b;

    /* renamed from: c  reason: collision with root package name */
    ListView f49671c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.adapter.q f49672d;

    /* compiled from: FightServerChoseDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t0.this.dismiss();
        }
    }

    public t0(Context context, int i4) {
        super(context, i4);
        this.f49670b = context;
    }

    public void a(List<String> list) {
        ArrayList arrayList = new ArrayList(0);
        for (String str : list) {
            com.join.mgps.data.a aVar = new com.join.mgps.data.a();
            aVar.c(str.substring(0, str.lastIndexOf("_")));
            aVar.d(str.substring(str.lastIndexOf("_") + 1));
            arrayList.add(aVar);
        }
        this.f49672d.b(arrayList);
        this.f49672d.notifyDataSetChanged();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49670b).inflate(R.layout.dialog_fight_server_chose, (ViewGroup) null);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        inflate.findViewById(R.id.cancel).setOnClickListener(new a());
        this.f49671c = (ListView) inflate.findViewById(R.id.listView);
        com.join.mgps.adapter.q qVar = new com.join.mgps.adapter.q(this.f49670b);
        this.f49672d = qVar;
        this.f49671c.setAdapter((ListAdapter) qVar);
        setContentView(inflate);
    }

    public t0(Context context) {
        super(context);
        this.f49670b = context;
    }
}
