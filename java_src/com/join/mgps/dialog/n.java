package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa91.battle.protocol.GameRoom;
/* compiled from: ArenaRoomTypeDialog.java */
/* loaded from: classes4.dex */
public class n extends Dialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f49518b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f49519c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f49520d;

    /* renamed from: e  reason: collision with root package name */
    private int f49521e;

    /* renamed from: f  reason: collision with root package name */
    private d f49522f;

    /* renamed from: g  reason: collision with root package name */
    private View f49523g;

    /* renamed from: h  reason: collision with root package name */
    View f49524h;

    /* renamed from: i  reason: collision with root package name */
    TextView f49525i;

    /* renamed from: j  reason: collision with root package name */
    TextView f49526j;

    /* renamed from: k  reason: collision with root package name */
    TextView f49527k;

    /* renamed from: l  reason: collision with root package name */
    TextView f49528l;

    /* renamed from: m  reason: collision with root package name */
    TextView f49529m;

    /* renamed from: n  reason: collision with root package name */
    RadioButton f49530n;

    /* renamed from: o  reason: collision with root package name */
    RadioButton f49531o;

    /* renamed from: p  reason: collision with root package name */
    RadioButton f49532p;

    /* renamed from: q  reason: collision with root package name */
    RadioButton f49533q;

    /* renamed from: r  reason: collision with root package name */
    String f49534r;

    /* renamed from: s  reason: collision with root package name */
    String f49535s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f49536t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f49537u;

    /* renamed from: v  reason: collision with root package name */
    private GameRoom f49538v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaRoomTypeDialog.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f49539b;

        a(Context context) {
            this.f49539b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.M(this.f49539b, n.this.f49525i.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaRoomTypeDialog.java */
    /* loaded from: classes4.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (!z4) {
                if (com.join.mgps.Util.g2.h(n.this.f49534r)) {
                    if (com.join.mgps.Util.g2.i(n.this.f49535s)) {
                        n nVar = n.this;
                        nVar.f49534r = nVar.f49535s;
                    } else {
                        n nVar2 = n.this;
                        nVar2.f49534r = ((int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d)) + "";
                    }
                }
            } else {
                n.this.f49534r = "";
            }
            if (com.join.mgps.Util.g2.i(n.this.f49534r)) {
                TextView textView = n.this.f49528l;
                textView.setText("房间性质（密码" + n.this.f49534r + ")");
                return;
            }
            n.this.f49528l.setText("房间性质");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaRoomTypeDialog.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n.this.f49522f.b();
        }
    }

    /* compiled from: ArenaRoomTypeDialog.java */
    /* loaded from: classes4.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f49543a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f49544b = 2;

        void a(int i4, boolean z4, boolean z5, String str);

        void b();
    }

    public n(@NonNull Context context) {
        super(context, R.style.newtrans_floating_dialog);
        this.f49521e = 2;
        this.f49534r = "";
        this.f49535s = "";
        c(context);
    }

    private void b(int i4, boolean z4, boolean z5) {
        if (i4 == 2) {
            this.f49520d.setChecked(true);
        } else {
            this.f49520d.setChecked(false);
        }
        if (z4) {
            this.f49530n.setChecked(true);
            this.f49533q.setChecked(false);
            this.f49534r = "";
        } else {
            if (com.join.mgps.Util.g2.h(this.f49534r)) {
                if (com.join.mgps.Util.g2.i(this.f49535s)) {
                    this.f49534r = this.f49535s;
                } else {
                    this.f49534r = ((int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d)) + "";
                }
            }
            this.f49530n.setChecked(false);
            this.f49533q.setChecked(true);
        }
        if (com.join.mgps.Util.g2.i(this.f49534r)) {
            TextView textView = this.f49528l;
            textView.setText("房间性质（密码" + this.f49534r + ")");
        } else {
            this.f49528l.setText("房间性质");
        }
        if (z5) {
            this.f49531o.setChecked(true);
            this.f49532p.setChecked(false);
            return;
        }
        this.f49532p.setChecked(true);
        this.f49531o.setChecked(false);
    }

    private void c(Context context) {
        this.f49518b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_arena_room_type, (ViewGroup) null);
        setContentView(inflate);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        this.f49519c = (RadioButton) inflate.findViewById(R.id.roomTypePhoneLL);
        this.f49520d = (RadioButton) inflate.findViewById(R.id.roomTypeAllLL);
        this.f49523g = inflate.findViewById(R.id.iv_close);
        this.f49525i = (TextView) inflate.findViewById(R.id.tv_roomNum);
        this.f49526j = (TextView) inflate.findViewById(R.id.copyTv);
        this.f49530n = (RadioButton) inflate.findViewById(R.id.rl_setNo_pwd);
        this.f49533q = (RadioButton) inflate.findViewById(R.id.rl_set_pwd);
        this.f49531o = (RadioButton) inflate.findViewById(R.id.iv_switch_onlook);
        this.f49527k = (TextView) inflate.findViewById(R.id.finishButn);
        this.f49532p = (RadioButton) inflate.findViewById(R.id.iv_switch_onlook_n);
        this.f49524h = inflate.findViewById(R.id.rl_net_archive);
        this.f49529m = (TextView) inflate.findViewById(R.id.tv_archive_name);
        this.f49528l = (TextView) inflate.findViewById(R.id.roomxingzhiT);
        this.f49526j.setOnClickListener(new a(context));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f49530n.setOnCheckedChangeListener(new b());
        View view = this.f49524h;
        if (view != null) {
            view.setOnClickListener(new c());
        }
    }

    private void d(boolean z4, View... viewArr) {
        for (View view : viewArr) {
            view.setSelected(z4);
        }
    }

    public void e(String str) {
        this.f49529m.setText(str);
    }

    public void f(GameRoom gameRoom, d dVar) {
        int i4 = gameRoom.getAllowPCJoin() ? 2 : 1;
        boolean hasJoinPassword = true ^ gameRoom.getHasJoinPassword();
        boolean allowSpectatorJoin = gameRoom.getAllowSpectatorJoin();
        this.f49521e = i4;
        this.f49522f = dVar;
        this.f49537u = allowSpectatorJoin;
        this.f49536t = hasJoinPassword;
        this.f49538v = gameRoom;
        TextView textView = this.f49525i;
        textView.setText(gameRoom.getRoomId() + "");
        p1.f K = p1.f.K();
        DownloadTask F = K.F("" + gameRoom.getGameId());
        if (!gameRoom.getElite()) {
            String plugin_num = F.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.FC.value() + "")) {
                this.f49524h.setVisibility(0);
                this.f49519c.setOnClickListener(this);
                this.f49520d.setOnClickListener(this);
                this.f49523g.setOnClickListener(this);
                this.f49527k.setOnClickListener(this);
                if (!gameRoom.getHasJoinPassword() && com.join.mgps.Util.g2.i(gameRoom.getPassword())) {
                    this.f49535s = gameRoom.getPassword();
                    this.f49534r = gameRoom.getPassword();
                    TextView textView2 = this.f49528l;
                    textView2.setText("房间性质（密码" + gameRoom.getPassword() + ")");
                } else {
                    this.f49528l.setText("房间性质");
                }
                b(this.f49521e, hasJoinPassword, allowSpectatorJoin);
            }
        }
        this.f49524h.setVisibility(8);
        this.f49519c.setOnClickListener(this);
        this.f49520d.setOnClickListener(this);
        this.f49523g.setOnClickListener(this);
        this.f49527k.setOnClickListener(this);
        if (!gameRoom.getHasJoinPassword()) {
        }
        this.f49528l.setText("房间性质");
        b(this.f49521e, hasJoinPassword, allowSpectatorJoin);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.roomTypePhoneLL || id == R.id.roomTypeAllLL) {
            return;
        }
        if (id == R.id.iv_close) {
            dismiss();
        } else if (id == R.id.finishButn) {
            if (this.f49522f != null) {
                if (this.f49519c.isChecked()) {
                    this.f49521e = 1;
                } else {
                    this.f49521e = 2;
                }
                this.f49522f.a(this.f49521e, this.f49530n.isChecked(), this.f49531o.isChecked(), this.f49534r);
            }
            dismiss();
        }
    }

    public n(@NonNull Context context, int i4) {
        super(context, R.style.newtrans_floating_dialog);
        this.f49521e = 2;
        this.f49534r = "";
        this.f49535s = "";
        c(context);
    }
}
