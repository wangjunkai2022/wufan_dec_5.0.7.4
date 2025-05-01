package com.join.mgps.activity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.customview.HandShankAdView;
import com.join.mgps.db.tables.HandShankTable;
import com.join.mgps.dto.HandShankAdBean;
import com.join.mgps.dto.ResultMainBean;
import com.papa.controller.core.ControllerManager;
import com.papa.sim.statistic.JoyStickConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.handshank_layout_yes)
/* loaded from: classes4.dex */
public class HandShankYesActivity extends HandShankBaseActivity {
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ListView f33857d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f33858e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33859f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f33860g;

    /* renamed from: h  reason: collision with root package name */
    private d f33861h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<ControllerManager.c> f33862i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<HandShankTable> f33863j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private List<HandShankTable> f33864k;

    /* renamed from: l  reason: collision with root package name */
    private LinkedList<HandShankTable> f33865l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    HandShankAdView f33866m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.e f33867n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HandShankYesActivity.this.B0()) {
                HandShankMapKeyActivity_.j0(HandShankYesActivity.this).start();
            } else {
                com.join.mgps.Util.l2.a(HandShankYesActivity.this).b("请先连接手柄！");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.z0 f33869b;

        b(com.join.mgps.dialog.z0 z0Var) {
            this.f33869b = z0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f33869b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.z0 f33871b;

        c(com.join.mgps.dialog.z0 z0Var) {
            this.f33871b = z0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankYesActivity.this.startActivity(new Intent(HandShankYesActivity.this, HandShankCheckKeyActivity_.class));
            this.f33871b.dismiss();
        }
    }

    private void A0(List<ControllerManager.c> list) {
        try {
            if (this.f33862i == null) {
                this.f33862i = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(i0(list));
            }
            this.f33863j.clear();
            if (arrayList.size() != 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ControllerManager.c cVar = (ControllerManager.c) arrayList.get(i4);
                    HandShankTable handShankTable = new HandShankTable();
                    handShankTable.setName(cVar.d());
                    handShankTable.setAddress(cVar.a());
                    handShankTable.setTime(Long.valueOf(System.currentTimeMillis()));
                    Boolean bool = Boolean.TRUE;
                    handShankTable.setIsConnect(bool);
                    if (!this.f33863j.contains(handShankTable)) {
                        this.f33863j.add(handShankTable);
                        this.f33865l.remove(handShankTable);
                        this.f33865l.addFirst(handShankTable);
                        G0(bool);
                    }
                }
                this.f33858e.setVisibility(8);
                this.f33861h.notifyDataSetChanged();
            } else {
                G0(Boolean.FALSE);
            }
            this.f33862i.clear();
            if (list != null) {
                this.f33862i.addAll(arrayList);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B0() {
        LinkedList<HandShankTable> linkedList = this.f33865l;
        boolean z4 = false;
        if (linkedList != null && linkedList.size() > 0) {
            synchronized (this.f33865l) {
                Iterator<HandShankTable> it2 = this.f33865l.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next().getIsConnect().booleanValue()) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return z4;
    }

    private void D0() {
        FrameLayout frameLayout = this.f33858e;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        this.f33864k = b2.x.p().o();
        this.f33865l.clear();
        this.f33865l.addAll(this.f33864k);
        this.f33861h.notifyDataSetChanged();
    }

    private void F0() {
        this.f33858e.setVisibility(8);
        Iterator<HandShankTable> it2 = this.f33863j.iterator();
        HandShankTable handShankTable = null;
        while (it2.hasNext()) {
            HandShankTable next = it2.next();
            if (!this.f33864k.contains(next)) {
                J0(next);
                handShankTable = next;
            }
        }
        if (handShankTable != null) {
            K0(handShankTable.getName());
        }
        this.f33864k = b2.x.p().o();
        this.f33865l.clear();
        this.f33865l.addAll(this.f33863j);
        this.f33864k.removeAll(this.f33863j);
        this.f33865l.addAll(this.f33864k);
        this.f33861h.notifyDataSetChanged();
        this.f33864k.clear();
        this.f33864k.addAll(this.f33865l);
        I0(this.f33865l);
    }

    private void K0(String str) {
        com.join.mgps.dialog.z0 z0Var = new com.join.mgps.dialog.z0(this);
        z0Var.c(str);
        z0Var.a(new b(z0Var));
        z0Var.b(new c(z0Var));
        z0Var.show();
    }

    private void initView() {
        this.f33859f.setVisibility(0);
        View inflate = LayoutInflater.from(this).inflate(R.layout.handshank_list_foot, (ViewGroup) null);
        this.f33864k = new ArrayList();
        this.f33865l = new LinkedList<>();
        this.f33864k.addAll(b2.x.p().o());
        this.f33865l.addAll(this.f33864k);
        this.f33861h = new d(this, null);
        this.f33857d.addFooterView(inflate);
        this.f33857d.setAdapter((ListAdapter) this.f33861h);
        inflate.findViewById(R.id.lay_2).setOnClickListener(new a());
        if (l0()) {
            this.f33858e.setVisibility(8);
        } else if (B0()) {
            this.f33858e.setVisibility(8);
        } else {
            this.f33858e.setVisibility(0);
        }
    }

    public void C0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            z0();
        } else {
            this.f33866m.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val("http://h5.5fun.com/wf_shoubing.html");
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    protected synchronized void G0(Boolean bool) {
        if (bool.booleanValue()) {
            F0();
        } else {
            D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void H0() {
        startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I0(List<HandShankTable> list) {
        try {
            synchronized (b2.x.p()) {
                for (HandShankTable handShankTable : list) {
                    if (!com.join.mgps.joystick.map.a.b().f(handShankTable.getName())) {
                        b2.x.p().n(handShankTable);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J0(HandShankTable handShankTable) {
        if (b2.x.p().q(handShankTable.getAddress())) {
            return;
        }
        JoyStickConfig joyStickConfig = new JoyStickConfig();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData == null) {
            joyStickConfig.setUid(0);
        } else {
            joyStickConfig.setUid(accountData.getUid());
        }
        joyStickConfig.setGamepad_name(handShankTable.getName());
        joyStickConfig.setGamepad_mac(handShankTable.getAddress().replace(":", "_"));
        joyStickConfig.setUpdate_time(handShankTable.getTime().longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f33867n = com.join.mgps.rpc.impl.d.P1();
        C0();
        com.papa.sim.statistic.p.l(this).c0(AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).isTourist(), "", "", 0);
        initView();
    }

    @Override // com.join.mgps.activity.HandShankBaseActivity
    public void m0(int i4, List<ControllerManager.c> list) {
        A0(list);
    }

    @Override // com.join.mgps.activity.HandShankBaseActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        r0(true);
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0() {
        try {
            ResultMainBean<HandShankAdBean> r02 = this.f33867n.r0(RequestBeanUtil.getInstance(this).getHandShankAdList());
            if (r02.getCode() == 600) {
                this.f33866m.m(r02.getMessages().getData());
            } else {
                this.f33866m.i();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f33866m.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class d extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private String f33873b;

        private d() {
            this.f33873b = getClass().getSimpleName();
        }

        private boolean a(String str) {
            return Pattern.compile("^[A-F0-9]{2}(:[A-F0-9]{2}){5}$").matcher(str.toUpperCase()).find();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HandShankYesActivity.this.f33865l.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return HandShankYesActivity.this.f33865l.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                try {
                    view = LayoutInflater.from(HandShankYesActivity.this).inflate(R.layout.handshank_item, (ViewGroup) null);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (((HandShankTable) HandShankYesActivity.this.f33865l.get(i4)).getIsConnect().booleanValue()) {
                ((ImageView) view.findViewById(R.id.img)).setImageResource(R.drawable.handshank_on_icon);
                ((ImageView) view.findViewById(R.id.handshank_blue_arrow_img)).setImageResource(R.drawable.handshank_blue_open_icon);
                ((TextView) view.findViewById(R.id.dsc)).setTextColor(HandShankYesActivity.this.getResources().getColor(R.color.handshank_connected_txt));
                ((TextView) view.findViewById(R.id.dsc)).setText("已连接");
            } else {
                ((ImageView) view.findViewById(R.id.img)).setImageResource(R.drawable.handshank_off_icon);
                ((TextView) view.findViewById(R.id.dsc)).setTextColor(HandShankYesActivity.this.getResources().getColor(R.color.handshank_disconnected_txt));
                ((TextView) view.findViewById(R.id.dsc)).setText("未连接");
                ((ImageView) view.findViewById(R.id.handshank_blue_arrow_img)).setImageResource(R.drawable.handshank_blue_close_icon);
            }
            ((TextView) view.findViewById(R.id.handshank_name)).setText(((HandShankTable) HandShankYesActivity.this.f33865l.get(i4)).getName());
            String address = ((HandShankTable) HandShankYesActivity.this.f33865l.get(i4)).getAddress();
            com.join.mgps.Util.w0.e(this.f33873b, "device address=" + address);
            if (a(address)) {
                view.findViewById(R.id.handshank_blue_arrow_img).setVisibility(0);
            } else {
                view.findViewById(R.id.handshank_blue_arrow_img).setVisibility(4);
            }
            return view;
        }

        /* synthetic */ d(HandShankYesActivity handShankYesActivity, a aVar) {
            this();
        }
    }
}
