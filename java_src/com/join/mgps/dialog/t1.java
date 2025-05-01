package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: NoticeDialog.java */
/* loaded from: classes4.dex */
public class t1 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private Context f49674b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f49675c;

    /* renamed from: d  reason: collision with root package name */
    private f f49676d;

    /* renamed from: e  reason: collision with root package name */
    private d f49677e;

    /* renamed from: f  reason: collision with root package name */
    private e f49678f;

    /* renamed from: g  reason: collision with root package name */
    private String f49679g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f49680h;

    /* renamed from: i  reason: collision with root package name */
    private String f49681i;

    /* renamed from: j  reason: collision with root package name */
    private String f49682j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f49683k;

    /* compiled from: NoticeDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1.this.f49678f.a();
        }
    }

    /* compiled from: NoticeDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1.this.f49676d.a();
        }
    }

    /* compiled from: NoticeDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1.this.f49677e.a();
        }
    }

    /* compiled from: NoticeDialog.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a();
    }

    /* compiled from: NoticeDialog.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a();
    }

    /* compiled from: NoticeDialog.java */
    /* loaded from: classes4.dex */
    public interface f {
        void a();
    }

    protected t1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49679g = "";
    }

    public void d(String str) {
        this.f49681i = str;
    }

    public void e(d dVar) {
        this.f49677e = dVar;
    }

    public void f(e eVar) {
        this.f49678f = eVar;
    }

    public void g(f fVar) {
        this.f49676d = fVar;
    }

    public void h(String str) {
        this.f49682j = str;
    }

    public void i(Bitmap bitmap) {
        this.f49680h = bitmap;
    }

    public void j(String str) {
        this.f49679g = str;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.notice_dialog);
        this.f49675c = (ImageView) findViewById(R.id.dialog_title_image);
        this.f49683k = (TextView) findViewById(R.id.dialog_content);
        this.f49675c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = this.f49680h;
        if (bitmap != null) {
            this.f49675c.setImageBitmap(bitmap);
        }
        this.f49683k.setText(this.f49682j);
        Button button = (Button) findViewById(R.id.dialog_button_keep);
        Button button2 = (Button) findViewById(R.id.dialog_button_close);
        String str = this.f49681i;
        if (str != null && !str.equals("")) {
            button.setText(this.f49681i);
        }
        this.f49675c.setOnClickListener(new a());
        button2.setOnClickListener(new b());
        button.setOnClickListener(new c());
    }

    public t1(Context context) {
        super(context);
        this.f49679g = "";
    }

    public t1(Context context, int i4) {
        super(context, i4);
        this.f49679g = "";
        this.f49674b = context;
    }
}
