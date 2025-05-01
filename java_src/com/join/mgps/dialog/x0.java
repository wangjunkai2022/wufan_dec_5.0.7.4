package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: GenderCheckDialog.java */
/* loaded from: classes4.dex */
public class x0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private Context f49782b;

    /* renamed from: c  reason: collision with root package name */
    private c f49783c;

    /* renamed from: d  reason: collision with root package name */
    private int f49784d;

    /* compiled from: GenderCheckDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CheckBox f49785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CheckBox f49786c;

        a(CheckBox checkBox, CheckBox checkBox2) {
            this.f49785b = checkBox;
            this.f49786c = checkBox2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0.this.f49783c.R(1);
            this.f49785b.setChecked(true);
            this.f49786c.setChecked(false);
            x0.this.dismiss();
        }
    }

    /* compiled from: GenderCheckDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CheckBox f49788b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CheckBox f49789c;

        b(CheckBox checkBox, CheckBox checkBox2) {
            this.f49788b = checkBox;
            this.f49789c = checkBox2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0.this.f49783c.R(2);
            this.f49788b.setChecked(false);
            this.f49789c.setChecked(true);
            x0.this.dismiss();
        }
    }

    /* compiled from: GenderCheckDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void R(int i4);
    }

    public x0(Context context) {
        super(context);
        this.f49784d = 1;
        this.f49782b = context;
    }

    public void b(c cVar) {
        this.f49783c = cVar;
    }

    public void c(int i4) {
        this.f49784d = i4;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gender_check_dialog_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.manLayout);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.girlLayout);
        CheckBox checkBox = (CheckBox) findViewById(R.id.manCheckbox);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.girlCheckbox);
        if (this.f49784d == 1) {
            checkBox.setChecked(true);
            checkBox2.setChecked(false);
        } else {
            checkBox.setChecked(false);
            checkBox2.setChecked(true);
        }
        linearLayout.setOnClickListener(new a(checkBox, checkBox2));
        linearLayout2.setOnClickListener(new b(checkBox, checkBox2));
    }

    public x0(Context context, int i4) {
        super(context, i4);
        this.f49784d = 1;
        this.f49782b = context;
    }

    protected x0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49784d = 1;
        this.f49782b = context;
    }
}
