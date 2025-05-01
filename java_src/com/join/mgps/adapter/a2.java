package com.join.mgps.adapter;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.DownloadSettingActivity_;
import com.join.mgps.activity.HandShankNoActivity_;
import com.join.mgps.activity.HandShankOverActivity_;
import com.join.mgps.activity.HandShankYesActivity_;
import com.join.mgps.activity.MGSettingActivity_;
import com.join.mgps.activity.MYAccountDetialActivity_;
import com.join.mgps.activity.PAPayCenterActivity_;
import com.join.mgps.activity.VoucherCodesBoxActivity_;
import com.join.mgps.db.tables.HandShankTable;
import java.util.List;
/* compiled from: ManageAdapter.java */
/* loaded from: classes4.dex */
public class a2 extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    private Context f44165c;

    /* renamed from: d  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f44166d;

    /* renamed from: e  reason: collision with root package name */
    private long f44167e;

    /* renamed from: b  reason: collision with root package name */
    String f44164b = getClass().getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    private String[] f44168f = {"存号箱", "下载设置", "建议与反馈", "更多", "饭票中心"};

    /* renamed from: g  reason: collision with root package name */
    private int[] f44169g = {R.drawable.save_code_icon, R.drawable.settingicon_blue, R.drawable.suggest_icon, R.drawable.more_icon, R.drawable.save_code_icon};

    /* renamed from: h  reason: collision with root package name */
    private boolean f44170h = false;

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.T0(a2.this.f44165c).start();
            com.papa.sim.statistic.pref.b.k(a2.this.f44165c).B(false);
        }
    }

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goLogin(a2.this.f44165c);
        }
    }

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Build.VERSION.SDK_INT < 15) {
                com.join.mgps.Util.l2.a(a2.this.f44165c).b("你的手机暂不支持");
            } else if (BluetoothAdapter.getDefaultAdapter() == null) {
                a2.this.f44165c.startActivity(new Intent(a2.this.f44165c, HandShankOverActivity_.class));
            } else {
                List<HandShankTable> o4 = b2.x.p().o();
                if (o4 == null || o4.size() == 0) {
                    a2.this.f44165c.startActivity(new Intent(a2.this.f44165c, HandShankNoActivity_.class));
                } else {
                    a2.this.f44165c.startActivity(new Intent(a2.this.f44165c, HandShankYesActivity_.class));
                }
            }
        }
    }

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44174b;

        d(int i4) {
            this.f44174b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = this.f44174b;
            if (i4 == 1) {
                if (IntentUtil.getInstance().goLogin(a2.this.f44165c)) {
                    return;
                }
                VoucherCodesBoxActivity_.i0(a2.this.f44165c).a(a2.this.f44166d.getUid()).b(0).start();
            } else if (i4 == 3) {
                DownloadSettingActivity_.B0(a2.this.f44165c).start();
            } else if (i4 != 4) {
                if (i4 == 5) {
                    MGSettingActivity_.q0(a2.this.f44165c).start();
                } else if (i4 != 6) {
                    return;
                }
                PAPayCenterActivity_.u0(a2.this.f44165c).start();
            } else {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val("http://bbs.5fun.com/forum.php?mod=viewthread&tid=56");
                IntentUtil.getInstance().intentActivity(a2.this.f44165c, intentDateBean);
            }
        }
    }

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class e {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f44176a;

        e() {
        }
    }

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class f {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f44178a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f44179b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f44180c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44181d;

        /* renamed from: e  reason: collision with root package name */
        TextView f44182e;

        f() {
        }
    }

    /* compiled from: ManageAdapter.java */
    /* loaded from: classes4.dex */
    class g {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f44184a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f44185b;

        /* renamed from: c  reason: collision with root package name */
        SimpleDraweeView f44186c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f44187d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f44188e;

        /* renamed from: f  reason: collision with root package name */
        TextView f44189f;

        /* renamed from: g  reason: collision with root package name */
        TextView f44190g;

        /* renamed from: h  reason: collision with root package name */
        TextView f44191h;

        /* renamed from: i  reason: collision with root package name */
        TextView f44192i;

        g() {
        }
    }

    public a2(Context context) {
        this.f44165c = context;
    }

    public com.wufan.user.service.protobuf.n0 c() {
        return this.f44166d;
    }

    public void d(com.wufan.user.service.protobuf.n0 n0Var) {
        this.f44166d = n0Var;
        notifyDataSetChanged();
    }

    public void e(boolean z4) {
        this.f44170h = z4;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44168f.length + 2;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        if (i4 == 0) {
            return 0;
        }
        return i4 == 2 ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.a2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
