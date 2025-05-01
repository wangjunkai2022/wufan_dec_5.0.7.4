package com.join.mgps.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.WxProgram;
/* compiled from: ModLaunchDomainDialog.java */
/* loaded from: classes4.dex */
public class l1 extends p implements DialogInterface.OnShowListener {

    /* renamed from: k  reason: collision with root package name */
    private DomainInfoBean f49493k;

    /* renamed from: l  reason: collision with root package name */
    private a f49494l;

    /* compiled from: ModLaunchDomainDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public l1(@NonNull Context context) {
        super(context, R.style.Dialog);
        this.f49494l = null;
    }

    private void p() {
        WxProgram wxProgram;
        try {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.ivPic);
            TextView textView = (TextView) findViewById(R.id.btnPositive);
            TextView textView2 = (TextView) findViewById(R.id.btnNegative);
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) findViewById(R.id.imgPositive);
            DomainInfoBean domainInfoBean = this.f49493k;
            if (domainInfoBean != null) {
                MyImageLoader.n(simpleDraweeView, domainInfoBean.getPic());
                String info = this.f49493k.getInfo();
                if (!TextUtils.isEmpty(info) && (wxProgram = (WxProgram) JsonMapper.getInstance().fromJson(com.join.mgps.Util.a.b(info), WxProgram.class)) != null) {
                    if (!TextUtils.isEmpty(wxProgram.getButton_pic())) {
                        textView.setVisibility(8);
                        simpleDraweeView2.setVisibility(0);
                        MyImageLoader.p(simpleDraweeView2, wxProgram.getButton_pic(), r.c.f11296c);
                    } else if (!TextUtils.isEmpty(wxProgram.getButton_text())) {
                        textView.setVisibility(0);
                        simpleDraweeView2.setVisibility(8);
                        textView.setText(wxProgram.getButton_text());
                    } else {
                        textView.setVisibility(0);
                        simpleDraweeView2.setVisibility(8);
                        textView.setText("领取攻略");
                    }
                }
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l1.this.q(view);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l1.this.r(view);
                }
            });
            simpleDraweeView2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l1.this.s(view);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        a aVar = this.f49494l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        a aVar = this.f49494l;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        a aVar = this.f49494l;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.dialog.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_mod_launch_domain);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnShowListener(this);
        p();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
    }

    @Override // com.join.mgps.dialog.p, android.app.Dialog
    public void show() {
        if (getWindow() == null) {
            return;
        }
        super.show();
    }

    public void t(a aVar) {
        this.f49494l = aVar;
    }

    public l1(@NonNull Context context, DomainInfoBean domainInfoBean) {
        super(context, R.style.Dialog);
        this.f49494l = null;
        this.f49493k = domainInfoBean;
    }
}
