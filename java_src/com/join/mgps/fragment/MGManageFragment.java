package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.x1;
import com.join.mgps.adapter.a2;
import com.join.mgps.customview.XListView;
import com.join.mgps.receiver.BootReceiver_;
import com.wufan.user.service.protobuf.b0;
import java.util.HashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.mg_manage_fragment)
/* loaded from: classes3.dex */
public class MGManageFragment extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private Context f52209b;

    /* renamed from: c  reason: collision with root package name */
    private a2 f52210c;

    /* renamed from: d  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f52211d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView f52212e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.b f52213f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.c f52214g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72016o})
    public void V(Intent intent) {
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra("actionFrom");
        if (stringExtra2.equals(BootReceiver_.f53984a)) {
            if ("com.papa91.vba".equals(stringExtra) || "com.papa91.gba".equals(stringExtra)) {
                boolean d5 = com.join.android.app.common.utils.e.l0(this.f52209b).d(this.f52209b, "com.papa91.vba");
                boolean d6 = com.join.android.app.common.utils.e.l0(this.f52209b).d(this.f52209b, "com.papa91.gba");
                if (d5 && d6) {
                    this.f52210c.e(true);
                }
            }
        } else if (stringExtra2.equals(BootReceiver_.f53985b)) {
            boolean d7 = com.join.android.app.common.utils.e.l0(this.f52209b).d(this.f52209b, "com.papa91.vba");
            boolean d8 = com.join.android.app.common.utils.e.l0(this.f52209b).d(this.f52209b, "com.papa91.gba");
            if (d7 || d8) {
                this.f52210c.e(false);
            }
        } else {
            stringExtra2.equals(BootReceiver_.f53987d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void W() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f52209b).getAccountData();
        this.f52211d = accountData;
        if (accountData == null) {
            a0();
        } else if (com.join.android.app.common.utils.j.j(this.f52209b)) {
            try {
                b0.b k32 = com.wufan.user.service.protobuf.b0.k3();
                k32.e3(this.f52211d.getUid());
                k32.c3(this.f52211d.getToken());
                k32.Y2(b3.b.a(getContext()));
                HashMap hashMap = new HashMap();
                hashMap.put("uid", k32.getUid() + "");
                hashMap.put("token", k32.getToken());
                hashMap.put("appVersion", k32.getAppVersion());
                k32.a3(x1.d(hashMap));
                com.wufan.user.service.protobuf.d0 e5 = this.f52214g.e(k32.build());
                if (e5 != null) {
                    if (e5.getError() == 200) {
                        Z(e5.getData());
                    } else if (e5.getError() == 701) {
                        X(701);
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X(int i4) {
        AccountUtil_.getInstance_(this.f52209b).accountLoginOut(this.f52209b);
        l2.a(this.f52209b).b("验证登录失败，请重新登录.");
        this.f52210c.d(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z(com.wufan.user.service.protobuf.n0 n0Var) {
        com.wufan.user.service.protobuf.n0 n0Var2;
        if (n0Var == null || (n0Var2 = this.f52211d) == null) {
            return;
        }
        this.f52211d = n0Var2.toBuilder().F3(n0Var.getAccount()).K3(n0Var.d0()).e4(n0Var.O1()).a4(n0Var.z()).P3(n0Var.v1()).p4(n0Var.getUid()).V3(n0Var.i()).F3(n0Var.getAccount()).c4(n0Var.getNickname()).k4(n0Var.G()).M3(n0Var.Y0()).h4(n0Var.z0()).build();
        AccountUtil_.getInstance_(this.f52209b).saveAccountData(this.f52211d, this.f52209b);
        this.f52210c.d(this.f52211d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0() {
        this.f52210c.d(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52213f = com.join.mgps.rpc.impl.a.c0();
        this.f52214g = com.join.mgps.rpc.impl.b.k();
        FragmentActivity activity = getActivity();
        this.f52209b = activity;
        this.f52211d = AccountUtil_.getInstance_(activity).getAccountData();
        a2 a2Var = new a2(this.f52209b);
        this.f52210c = a2Var;
        a2Var.d(this.f52211d);
        this.f52212e.setAdapter((ListAdapter) this.f52210c);
        boolean d5 = com.join.android.app.common.utils.e.l0(this.f52209b).d(this.f52209b, "com.papa91.vba");
        boolean d6 = com.join.android.app.common.utils.e.l0(this.f52209b).d(this.f52209b, "com.papa91.gba");
        if (d5 && d6) {
            this.f52210c.e(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        W();
    }
}
