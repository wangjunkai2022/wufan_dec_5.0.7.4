package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
/* compiled from: CheckGBAPlugDialog.java */
/* loaded from: classes4.dex */
public class s extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private d f49642b;

    /* renamed from: c  reason: collision with root package name */
    private Context f49643c;

    /* renamed from: d  reason: collision with root package name */
    private String f49644d;

    /* compiled from: CheckGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s.this.f49642b.a(view.getId());
        }
    }

    /* compiled from: CheckGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s.this.f49642b.a(view.getId());
        }
    }

    /* compiled from: CheckGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(8);
            intentDateBean.setLink_type_val("79707");
            IntentUtil.getInstance().intentActivity(s.this.f49643c, intentDateBean);
        }
    }

    /* compiled from: CheckGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a(int i4);
    }

    public s(Context context) {
        super(context);
        this.f49644d = "请选择启动插件";
        this.f49643c = context;
    }

    public void c(d dVar) {
        this.f49642b = dVar;
    }

    public void d(String str) {
        this.f49644d = str;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gbaplug_choice_start_dialog_layout);
        ((LinearLayout) findViewById(R.id.newGBAOlug)).setOnClickListener(new a());
        ((LinearLayout) findViewById(R.id.oldGBAPlug)).setOnClickListener(new b());
        ((LinearLayout) findViewById(R.id.why)).setOnClickListener(new c());
        ((TextView) findViewById(R.id.titleText)).setText(this.f49644d);
    }

    public s(Context context, int i4) {
        super(context, i4);
        this.f49644d = "请选择启动插件";
        this.f49643c = context;
    }

    protected s(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49644d = "请选择启动插件";
        this.f49643c = context;
    }
}
