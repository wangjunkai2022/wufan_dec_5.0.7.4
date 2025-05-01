package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: DialogExit.java */
/* loaded from: classes4.dex */
public class f0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private Context f49368b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f49369c;

    /* renamed from: d  reason: collision with root package name */
    private f f49370d;

    /* renamed from: e  reason: collision with root package name */
    private d f49371e;

    /* renamed from: f  reason: collision with root package name */
    private e f49372f;

    /* renamed from: g  reason: collision with root package name */
    private String f49373g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f49374h;

    /* renamed from: i  reason: collision with root package name */
    private String f49375i;

    /* compiled from: DialogExit.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0.this.f49372f.a();
        }
    }

    /* compiled from: DialogExit.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0.this.f49370d.a();
        }
    }

    /* compiled from: DialogExit.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0.this.f49371e.a();
        }
    }

    /* compiled from: DialogExit.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a();
    }

    /* compiled from: DialogExit.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a();
    }

    /* compiled from: DialogExit.java */
    /* loaded from: classes4.dex */
    public interface f {
        void a();
    }

    protected f0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49373g = "";
    }

    public void d(String str) {
        this.f49375i = str;
    }

    public void e(d dVar) {
        this.f49371e = dVar;
    }

    public void f(e eVar) {
        this.f49372f = eVar;
    }

    public void g(f fVar) {
        this.f49370d = fVar;
    }

    public void h(Bitmap bitmap) {
        this.f49374h = bitmap;
    }

    public void i(String str) {
        this.f49373g = str;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_exitlayout);
        ImageView imageView = (ImageView) findViewById(R.id.dialog_title_image);
        this.f49369c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = this.f49374h;
        if (bitmap != null) {
            this.f49369c.setImageBitmap(bitmap);
        }
        Button button = (Button) findViewById(R.id.dialog_button_keep);
        Button button2 = (Button) findViewById(R.id.dialog_button_close);
        String str = this.f49375i;
        if (str != null && !str.equals("")) {
            button.setText(this.f49375i);
        }
        this.f49369c.setOnClickListener(new a());
        button2.setOnClickListener(new b());
        button.setOnClickListener(new c());
    }

    public f0(Context context) {
        super(context);
        this.f49373g = "";
    }

    public f0(Context context, int i4) {
        super(context, i4);
        this.f49373g = "";
        this.f49368b = context;
    }
}
