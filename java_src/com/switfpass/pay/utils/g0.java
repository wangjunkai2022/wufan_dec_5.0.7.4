package com.switfpass.pay.utils;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.switfpass.pay.lib.Resourcemap;
/* loaded from: classes5.dex */
public class g0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f61881b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f61882c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f61883d;

    public g0(Activity activity, String str, f0 f0Var) {
        super(activity, Resourcemap.getStyle_dialog());
        this.f61882c = activity;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(Resourcemap.getById_clor());
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(Resourcemap.getLayout_dialog(), (ViewGroup) null);
        this.f61881b = viewGroup;
        setContentView(viewGroup);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCanceledOnTouchOutside(false);
        ImageView imageView = (ImageView) findViewById(Resourcemap.getById_pay_stop());
        this.f61883d = imageView;
        if (f0Var == null) {
            imageView.setVisibility(8);
        }
        this.f61883d.setOnClickListener(new z0(f0Var));
        TextView textView = (TextView) this.f61881b.findViewById(Resourcemap.getById_tv_dialog());
        if (str != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            this.f61882c.moveTaskToBack(false);
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }
}
