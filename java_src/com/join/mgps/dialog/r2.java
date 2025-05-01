package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.FightWifiInputDialogActivity_;
/* compiled from: WifiFightEnteringRoomFailedDialog.java */
/* loaded from: classes4.dex */
public class r2 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49635b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f49636c;

    /* renamed from: d  reason: collision with root package name */
    Button f49637d;

    /* renamed from: e  reason: collision with root package name */
    String f49638e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49639f;

    /* compiled from: WifiFightEnteringRoomFailedDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r2.this.dismiss();
        }
    }

    /* compiled from: WifiFightEnteringRoomFailedDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FightWifiInputDialogActivity_.i0(r2.this.f49635b).startForResult(9001);
            r2.this.dismiss();
        }
    }

    public r2(Context context, int i4, String str) {
        super(context, i4);
        this.f49635b = context;
        this.f49638e = str;
    }

    public void a(int i4) {
        this.f49636c.setVisibility(i4);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49635b).inflate(R.layout.dialog_fight_enteringroom_failed, (ViewGroup) null);
        this.f49639f = (TextView) inflate.findViewById(R.id.title);
        this.f49636c = (ImageView) inflate.findViewById(R.id.cancel);
        this.f49637d = (Button) inflate.findViewById(R.id.reJoin);
        TextView textView = this.f49639f;
        textView.setText(textView.getText().toString().replace("$1", this.f49638e));
        this.f49636c.setOnClickListener(new a());
        this.f49637d.setOnClickListener(new b());
        setContentView(inflate);
    }

    public r2(Context context) {
        super(context);
        this.f49635b = context;
    }
}
