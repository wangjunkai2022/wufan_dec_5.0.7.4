package com.join.mgps.socket.fight.arena;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.mgsim.arena.RoomSeatState;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.c0;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.t2;
import com.join.mgps.dto.ArchiveBean;
import com.join.mgps.dto.BattleChallengeConfig;
import com.papa91.battle.protocol.KickInfo;
import com.papa91.battle.protocol.RoomPosition;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
/* compiled from: ArenaDialogBuilder.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int f54749g = 256;

    /* renamed from: h  reason: collision with root package name */
    public static final int f54750h = 257;

    /* renamed from: i  reason: collision with root package name */
    public static final int f54751i = 258;

    /* renamed from: j  reason: collision with root package name */
    public static final String f54752j = "dialog_error_hint";

    /* renamed from: k  reason: collision with root package name */
    public static final String f54753k = "leave_room";

    /* renamed from: l  reason: collision with root package name */
    public static final String f54754l = "toast_move_in_spectator";

    /* renamed from: m  reason: collision with root package name */
    public static final String f54755m = "toast_kic_out_room";

    /* renamed from: n  reason: collision with root package name */
    public static final String f54756n = "net_archive";

    /* renamed from: o  reason: collision with root package name */
    public static final String f54757o = "kick_info";

    /* renamed from: p  reason: collision with root package name */
    public static final String f54758p = "kic_out_room_info";

    /* renamed from: q  reason: collision with root package name */
    public static final String f54759q = "seat_set";

    /* renamed from: r  reason: collision with root package name */
    public static final String f54760r = "set_challenge_gold";

    /* renamed from: s  reason: collision with root package name */
    public static final String f54761s = "share_friends_1";

    /* renamed from: t  reason: collision with root package name */
    public static final String f54762t = "share_friends_2";

    /* renamed from: u  reason: collision with root package name */
    public static final String f54763u = "svr_play_mode";

    /* renamed from: v  reason: collision with root package name */
    private static final int f54764v = Color.parseColor("#ffffff");

    /* renamed from: w  reason: collision with root package name */
    private static final int f54765w = Color.parseColor("#0989BA");

    /* renamed from: a  reason: collision with root package name */
    private Dialog f54766a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f54767b;

    /* renamed from: c  reason: collision with root package name */
    private y f54768c;

    /* renamed from: e  reason: collision with root package name */
    private a0 f54770e;

    /* renamed from: d  reason: collision with root package name */
    private int f54769d = 0;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnClickListener f54771f = new p();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* renamed from: com.join.mgps.socket.fight.arena.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC0383a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object[] f54772b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54773c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54774d;

        View$OnClickListenerC0383a(Object[] objArr, int i4, String str) {
            this.f54772b = objArr;
            this.f54773c = i4;
            this.f54774d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2 = "";
            try {
                str = this.f54772b[2].toString();
                try {
                    str2 = this.f54772b[3].toString();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str = "";
            }
            com.papa.sim.statistic.p.l(a.this.f54767b).k1(AccountUtil_.getInstance_(a.this.f54767b).getUid(), str, str2);
            a.this.f54768c.b0(this.f54773c, this.f54774d);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class a0 {
        private static final String A = "_v2_lob_2.";

        /* renamed from: z  reason: collision with root package name */
        private static final String f54776z = "_lob.";

        /* renamed from: a  reason: collision with root package name */
        private RelativeLayout f54777a;

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f54778b;

        /* renamed from: c  reason: collision with root package name */
        private RelativeLayout f54779c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f54780d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f54781e;

        /* renamed from: f  reason: collision with root package name */
        private ImageView f54782f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f54783g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f54784h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f54785i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f54786j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f54787k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f54788l;

        /* renamed from: m  reason: collision with root package name */
        private ImageView f54789m;

        /* renamed from: n  reason: collision with root package name */
        private ImageView f54790n;

        /* renamed from: o  reason: collision with root package name */
        private ImageView f54791o;

        /* renamed from: p  reason: collision with root package name */
        private ArchiveBean f54792p;

        /* renamed from: q  reason: collision with root package name */
        private Context f54793q;

        /* renamed from: r  reason: collision with root package name */
        private List<ArchiveBean> f54794r;

        /* renamed from: s  reason: collision with root package name */
        private String f54795s;

        /* renamed from: u  reason: collision with root package name */
        TextView f54797u;

        /* renamed from: v  reason: collision with root package name */
        LinearLayout f54798v;

        /* renamed from: w  reason: collision with root package name */
        RelativeLayout f54799w;

        /* renamed from: t  reason: collision with root package name */
        private boolean f54796t = false;

        /* renamed from: x  reason: collision with root package name */
        boolean f54800x = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ArenaDialogBuilder.java */
        /* renamed from: com.join.mgps.socket.fight.arena.a$a0$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class View$OnClickListenerC0384a implements View.OnClickListener {
            View$OnClickListenerC0384a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a0 a0Var = a0.this;
                a0Var.f54792p = (ArchiveBean) a0Var.f54794r.get(0);
                if (a0.this.f54789m.getVisibility() == 0) {
                    a.this.f54768c.F(null, "");
                } else {
                    a.this.f54768c.F(a0.this.f54792p, a0.this.f54795s + net.lingala.zip4j.util.e.F0 + a0.this.f54792p.getRecordFile());
                }
                a.this.w();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ArenaDialogBuilder.java */
        /* loaded from: classes5.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a0 a0Var = a0.this;
                a0Var.f54792p = (ArchiveBean) a0Var.f54794r.get(1);
                if (a0.this.f54790n.getVisibility() == 0) {
                    a.this.f54768c.F(null, "");
                } else {
                    a.this.f54768c.F(a0.this.f54792p, a0.this.f54795s + net.lingala.zip4j.util.e.F0 + a0.this.f54792p.getRecordFile());
                }
                a.this.w();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ArenaDialogBuilder.java */
        /* loaded from: classes5.dex */
        public class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a0 a0Var = a0.this;
                a0Var.f54792p = (ArchiveBean) a0Var.f54794r.get(2);
                if (a0.this.f54791o.getVisibility() == 0) {
                    a.this.f54768c.F(null, "");
                } else {
                    a.this.f54768c.F(a0.this.f54792p, a0.this.f54795s + net.lingala.zip4j.util.e.F0 + a0.this.f54792p.getRecordFile());
                }
                a.this.w();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ArenaDialogBuilder.java */
        /* loaded from: classes5.dex */
        public class d implements Comparator<ArchiveBean> {
            d() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(ArchiveBean archiveBean, ArchiveBean archiveBean2) {
                if (archiveBean.getFileTime() > archiveBean2.getFileTime()) {
                    return -1;
                }
                return archiveBean.getFileTime() == archiveBean2.getFileTime() ? 0 : 1;
            }
        }

        public a0(Context context, Object... objArr) {
            this.f54792p = null;
            this.f54793q = context;
            l(context);
            this.f54792p = (ArchiveBean) objArr[1];
            i("" + objArr[0]);
        }

        private boolean h(File[] fileArr, File file) {
            boolean z4;
            String name = file.getName();
            for (File file2 : fileArr) {
                String name2 = file2.getName();
                if (!name2.equals(name + A + "1")) {
                    if (!name2.equals(name + A + "2")) {
                        if (!name2.equals(name + A + "3")) {
                        }
                    }
                }
                z4 = false;
            }
            z4 = true;
            if (z4) {
                for (File file3 : fileArr) {
                    String name3 = file3.getName();
                    if (!name3.equals(name + f54776z + "1")) {
                        if (!name3.equals(name + f54776z + "2")) {
                            if (!name3.equals(name + f54776z + "3")) {
                            }
                        }
                    }
                    this.f54800x = true;
                    break;
                }
            }
            return z4;
        }

        private String k(long j4) {
            return new SimpleDateFormat("HH:mm MM-dd").format(new Date(j4));
        }

        private void l(Context context) {
            a.this.f54766a = new Dialog(context, R.style.newtrans_floating_dialog);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = a.this.f54766a.getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                a.this.f54766a.getWindow().setAttributes(attributes);
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_net_archive, (ViewGroup) null);
            this.f54799w = (RelativeLayout) inflate.findViewById(R.id.rl_main);
            this.f54797u = (TextView) inflate.findViewById(R.id.tv_oldArchive);
            this.f54798v = (LinearLayout) inflate.findViewById(R.id.ll_archive);
            this.f54797u.setVisibility(8);
            this.f54798v.setVisibility(0);
            this.f54780d = (ImageView) inflate.findViewById(R.id.iv_archive_1);
            this.f54781e = (ImageView) inflate.findViewById(R.id.iv_archive_2);
            this.f54782f = (ImageView) inflate.findViewById(R.id.iv_archive_3);
            this.f54783g = (TextView) inflate.findViewById(R.id.tv_archive_1);
            this.f54784h = (TextView) inflate.findViewById(R.id.tv_archive_2);
            this.f54785i = (TextView) inflate.findViewById(R.id.tv_archive_3);
            this.f54786j = (TextView) inflate.findViewById(R.id.tv_name_1);
            this.f54787k = (TextView) inflate.findViewById(R.id.tv_name_2);
            this.f54788l = (TextView) inflate.findViewById(R.id.tv_name_3);
            this.f54789m = (ImageView) inflate.findViewById(R.id.iv_choice_1);
            this.f54790n = (ImageView) inflate.findViewById(R.id.iv_choice_2);
            this.f54791o = (ImageView) inflate.findViewById(R.id.iv_choice_3);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.rl_archive_1);
            this.f54777a = relativeLayout;
            relativeLayout.setOnClickListener(new View$OnClickListenerC0384a());
            RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(R.id.rl_archive_2);
            this.f54778b = relativeLayout2;
            relativeLayout2.setOnClickListener(new b());
            RelativeLayout relativeLayout3 = (RelativeLayout) inflate.findViewById(R.id.rl_archive_3);
            this.f54779c = relativeLayout3;
            relativeLayout3.setOnClickListener(new c());
            a.this.k(inflate);
            a.this.B(inflate, 17, 0, 0);
        }

        private void m() {
            boolean z4;
            boolean z5;
            int size = this.f54794r.size();
            if (size >= 3) {
                z4 = true;
                z5 = true;
            } else {
                z4 = size == 2;
                z5 = false;
            }
            this.f54777a.setVisibility(0);
            this.f54786j.setText(this.f54794r.get(0).getShowName());
            this.f54780d.setImageBitmap(BitmapFactory.decodeFile(this.f54794r.get(0).getIconFile()));
            this.f54783g.setText(this.f54794r.get(0).getUpdate_time());
            if (z4) {
                this.f54778b.setVisibility(0);
                this.f54787k.setText(this.f54794r.get(1).getShowName());
                this.f54781e.setImageBitmap(BitmapFactory.decodeFile(this.f54794r.get(1).getIconFile()));
                this.f54784h.setText(this.f54794r.get(1).getUpdate_time());
            }
            if (z5) {
                this.f54779c.setVisibility(0);
                this.f54788l.setText(this.f54794r.get(2).getShowName());
                this.f54782f.setImageBitmap(BitmapFactory.decodeFile(this.f54794r.get(2).getIconFile()));
                this.f54785i.setText(this.f54794r.get(2).getUpdate_time());
            }
            if (this.f54792p != null) {
                for (int i4 = 0; i4 < this.f54794r.size(); i4++) {
                    if (this.f54792p.getShowName().equals(this.f54794r.get(i4).getShowName())) {
                        p(i4);
                        return;
                    }
                }
            }
        }

        private void o(File file, File[] fileArr, String str) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (name.equals(file.getName() + str + "1")) {
                    ArchiveBean archiveBean = new ArchiveBean();
                    archiveBean.setRecordFile(name);
                    archiveBean.setIconFile(this.f54795s + net.lingala.zip4j.util.e.F0 + name + ".png");
                    archiveBean.setFileTime(file2.lastModified());
                    archiveBean.setUpdate_time(k(file2.lastModified()));
                    this.f54794r.add(archiveBean);
                }
                if (name.equals(file.getName() + str + "2")) {
                    ArchiveBean archiveBean2 = new ArchiveBean();
                    archiveBean2.setRecordFile(name);
                    archiveBean2.setIconFile(this.f54795s + net.lingala.zip4j.util.e.F0 + name + ".png");
                    archiveBean2.setUpdate_time(k(file2.lastModified()));
                    archiveBean2.setFileTime(file2.lastModified());
                    this.f54794r.add(archiveBean2);
                }
                if (name.equals(file.getName() + str + "3")) {
                    ArchiveBean archiveBean3 = new ArchiveBean();
                    archiveBean3.setRecordFile(name);
                    archiveBean3.setIconFile(this.f54795s + net.lingala.zip4j.util.e.F0 + name + ".png");
                    archiveBean3.setUpdate_time(k(file2.lastModified()));
                    archiveBean3.setFileTime(file2.lastModified());
                    this.f54794r.add(archiveBean3);
                }
            }
            Collections.sort(this.f54794r, new d());
            for (int i4 = 0; i4 < this.f54794r.size(); i4++) {
                this.f54794r.get(i4).setShowName("存档" + (this.f54794r.size() - i4));
            }
        }

        private void p(int i4) {
            if (i4 == 0) {
                this.f54777a.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
                this.f54778b.setBackgroundResource(R.drawable.bg_btn_border_gray_four);
                this.f54779c.setBackgroundResource(R.drawable.bg_btn_border_gray_four);
                this.f54786j.setTextColor(a.f54764v);
                this.f54787k.setTextColor(a.f54765w);
                this.f54788l.setTextColor(a.f54765w);
                this.f54783g.setTextColor(a.f54764v);
                this.f54784h.setTextColor(a.f54765w);
                this.f54785i.setTextColor(a.f54765w);
                this.f54789m.setVisibility(0);
                this.f54790n.setVisibility(8);
                this.f54791o.setVisibility(8);
            } else if (i4 == 1) {
                this.f54777a.setBackgroundResource(R.drawable.bg_btn_border_gray_four);
                this.f54778b.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
                this.f54779c.setBackgroundResource(R.drawable.bg_btn_border_gray_four);
                this.f54786j.setTextColor(a.f54765w);
                this.f54787k.setTextColor(a.f54764v);
                this.f54788l.setTextColor(a.f54765w);
                this.f54783g.setTextColor(a.f54765w);
                this.f54784h.setTextColor(a.f54764v);
                this.f54785i.setTextColor(a.f54765w);
                this.f54789m.setVisibility(8);
                this.f54790n.setVisibility(0);
                this.f54791o.setVisibility(8);
            } else if (i4 != 2) {
            } else {
                this.f54777a.setBackgroundResource(R.drawable.bg_btn_border_gray_four);
                this.f54778b.setBackgroundResource(R.drawable.bg_btn_border_gray_four);
                this.f54779c.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
                this.f54786j.setTextColor(a.f54765w);
                this.f54787k.setTextColor(a.f54765w);
                this.f54788l.setTextColor(a.f54764v);
                this.f54783g.setTextColor(a.f54765w);
                this.f54784h.setTextColor(a.f54765w);
                this.f54785i.setTextColor(a.f54764v);
                this.f54789m.setVisibility(8);
                this.f54790n.setVisibility(8);
                this.f54791o.setVisibility(0);
            }
        }

        boolean i(String str) {
            DownloadTask F = p1.f.K().F(str);
            if (F == null) {
                return false;
            }
            j(F);
            if (this.f54794r.size() <= 0) {
                this.f54796t = false;
                return false;
            }
            this.f54796t = true;
            m();
            return true;
        }

        void j(DownloadTask downloadTask) {
            File[] listFiles;
            this.f54794r = new ArrayList();
            this.f54795s = g0.s(downloadTask.getGameZipPath(), Integer.parseInt(downloadTask.getRomType()));
            File file = new File(this.f54795s);
            if (!file.exists()) {
                file = new File(downloadTask.getGameZipPath()).getParentFile();
                this.f54795s = file.getAbsolutePath();
            }
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                o(file, listFiles, f54776z);
            }
        }

        public boolean n() {
            return this.f54796t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54769d = 1;
            a.this.f54768c.E(a.this.f54769d);
            a.this.w();
        }
    }

    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public static class b0 implements y {
        @Override // com.join.mgps.socket.fight.arena.a.y
        public void C() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void E(int i4) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void F(ArchiveBean archiveBean, String str) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void L(RoomSeatState roomSeatState, int i4) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void P(RoomPosition roomPosition, int i4) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void Q(RoomPosition roomPosition) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void b0(int i4, String str) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void q() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void t(int i4) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void v(int i4) {
        }

        @Override // com.join.mgps.socket.fight.arena.a.y
        public void z(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54769d = 2;
            a.this.f54768c.E(a.this.f54769d);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class d implements DialogInterface.OnDismissListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (a.this.f54769d != 0) {
                a.this.f54768c.E(a.this.f54769d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BattleChallengeConfig f54809b;

        e(BattleChallengeConfig battleChallengeConfig) {
            this.f54809b = battleChallengeConfig;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.t(this.f54809b.getBattleChallengeCopper()[0]);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BattleChallengeConfig f54811b;

        f(BattleChallengeConfig battleChallengeConfig) {
            this.f54811b = battleChallengeConfig;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.t(this.f54811b.getBattleChallengeCopper()[1]);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BattleChallengeConfig f54813b;

        g(BattleChallengeConfig battleChallengeConfig) {
            this.f54813b = battleChallengeConfig;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.t(this.f54813b.getBattleChallengeCopper()[2]);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BattleChallengeConfig f54815b;

        h(BattleChallengeConfig battleChallengeConfig) {
            this.f54815b = battleChallengeConfig;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.t(this.f54815b.getBattleChallengeCopper()[3]);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomPosition f54817b;

        i(RoomPosition roomPosition) {
            this.f54817b = roomPosition;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.Q(this.f54817b);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomPosition f54819b;

        j(RoomPosition roomPosition) {
            this.f54819b = roomPosition;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.Q(this.f54819b);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomPosition f54822b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54823c;

        l(RoomPosition roomPosition, int i4) {
            this.f54822b = roomPosition;
            this.f54823c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.P(this.f54822b, this.f54823c);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomSeatState f54825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54826c;

        m(RoomSeatState roomSeatState, int i4) {
            this.f54825b = roomSeatState;
            this.f54826c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.L(this.f54825b, this.f54826c);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class n implements DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54828b;

        n(String str) {
            this.f54828b = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.f54768c.z(this.f54828b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.C();
        }
    }

    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54832b;

        q(int i4) {
            this.f54832b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f54768c != null) {
                a.this.f54768c.v(this.f54832b);
            }
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f54768c != null) {
                a.this.f54768c.q();
            }
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f54768c != null) {
                a.this.f54768c.q();
            }
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class u implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54837b;

        u(int i4) {
            this.f54837b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.W(100, this.f54837b, null);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54839b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f54840c;

        v(int i4, Object obj) {
            this.f54839b = i4;
            this.f54840c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.W(101, this.f54839b, this.f54840c);
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public class x implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54843b;

        x(int i4) {
            this.f54843b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f54768c.L(RoomSeatState.REMOVE, this.f54843b);
            a.this.w();
        }
    }

    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public interface y {

        /* renamed from: b1  reason: collision with root package name */
        public static final int f54845b1 = 1;

        /* renamed from: c1  reason: collision with root package name */
        public static final int f54846c1 = 2;

        /* renamed from: d1  reason: collision with root package name */
        public static final int f54847d1 = 100;

        /* renamed from: e1  reason: collision with root package name */
        public static final int f54848e1 = 101;

        void C();

        void E(int i4);

        void F(ArchiveBean archiveBean, String str);

        void L(RoomSeatState roomSeatState, int i4);

        void P(RoomPosition roomPosition, int i4);

        void Q(RoomPosition roomPosition);

        void W(int i4, int i5, Object obj);

        void b0(int i4, String str);

        void q();

        void t(int i4);

        void v(int i4);

        void z(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ArenaDialogBuilder.java */
    /* loaded from: classes5.dex */
    public final class z implements DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private String f54849b;

        public z(String str) {
            this.f54849b = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.f54768c.z(this.f54849b);
        }
    }

    public a(Activity activity, y yVar) {
        this.f54767b = activity;
        this.f54768c = yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(View view, int i4, int i5, int i6) {
        this.f54766a.setContentView(view);
        Window window = this.f54766a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (i5 == 0) {
            i5 = -1;
        }
        attributes.width = i5;
        if (i6 == 0) {
            i6 = -1;
        }
        attributes.height = i6;
        window.setGravity(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(View view) {
        view.findViewById(R.id.iv_close).setOnClickListener(this.f54771f);
    }

    private void l(Object... objArr) {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_area_error_hint, (ViewGroup) null);
        int intValue = ((Integer) objArr[0]).intValue();
        int intValue2 = ((Integer) objArr[1]).intValue();
        Button button = (Button) inflate.findViewById(R.id.dialog_button_sure);
        Button button2 = (Button) inflate.findViewById(R.id.dialog_button_cancle);
        Button button3 = (Button) inflate.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_content);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tip_title);
        View findViewById = inflate.findViewById(R.id.iv_close);
        String str = (String) objArr[2];
        if (g2.i(str)) {
            textView.setText(str);
        }
        if (intValue == 257) {
            button.setText((String) objArr[3]);
            button.setVisibility(0);
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setOnClickListener(new r());
        } else if (intValue == 258) {
            textView2.setText("系统提示");
            findViewById.setVisibility(0);
            button.setText((String) objArr[3]);
            button.setVisibility(0);
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setOnClickListener(new s());
            this.f54766a.setCancelable(false);
            findViewById.setOnClickListener(new t());
        } else {
            button.setVisibility(8);
            button2.setVisibility(0);
            button3.setVisibility(0);
            button2.setText((String) objArr[3]);
            button2.setOnClickListener(new u(intValue2));
            Object obj = objArr[5];
            button3.setText((String) objArr[4]);
            button3.setOnClickListener(new v(intValue2, obj));
        }
        B(inflate, 17, 0, 0);
    }

    private void m(Object... objArr) {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_gameroom_kick, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.tv_kickinfo)).setText((String) objArr[0]);
        this.f54766a.setOnDismissListener(new z(f54757o));
        k(inflate);
        B(inflate, 17, 0, 0);
    }

    private void n(Object... objArr) {
        KickInfo kickInfo = (KickInfo) objArr[0];
        int intValue = ((Integer) objArr[1]).intValue();
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_kickout_room_info, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title);
        if (!kickInfo.getIsVIP()) {
            textView.setText("把\"" + kickInfo.getNickname() + "\"踢出房间\n需要消耗" + kickInfo.getCopper() + "铜板,您确定要踢出嘛？");
        } else {
            textView.setText("把\"" + kickInfo.getNickname() + "\"踢出房间\n由于对方是VIP用户\n需要消耗" + kickInfo.getCopper() + "铜板 您确定要踢出嘛？");
        }
        inflate.findViewById(R.id.btn_cancel).setOnClickListener(new w());
        inflate.findViewById(R.id.btn_ok).setOnClickListener(new x(intValue));
        k(inflate);
        B(inflate, 17, 0, 0);
    }

    private void o() {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_leave_room, (ViewGroup) null);
        inflate.findViewById(R.id.btnLeave).setOnClickListener(new o());
        k(inflate);
        B(inflate, 17, 0, 0);
    }

    private void p(Object... objArr) {
        this.f54770e = new a0(this.f54767b, objArr);
    }

    private void q(Object... objArr) {
        String str = (String) objArr[0];
        RoomSeatState roomSeatState = (RoomSeatState) objArr[1];
        int intValue = ((Integer) objArr[2]).intValue();
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_game_room_seat, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(R.id.btn_position);
        ((TextView) inflate.findViewById(R.id.tv_position)).setText(str);
        if (roomSeatState == RoomSeatState.OPEN) {
            button.setText("开启位置");
        } else if (roomSeatState == RoomSeatState.CLOSE) {
            button.setText("关闭位置");
        } else if (roomSeatState == RoomSeatState.SEAT) {
            button.setText("坐下");
        } else if (roomSeatState == RoomSeatState.REPORT) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c0.a(this.f54767b, 286.0f), c0.a(this.f54767b, 134.0f));
            layoutParams.addRule(13);
            ((RelativeLayout) inflate.findViewById(R.id.rl_main)).setLayoutParams(layoutParams);
            Button button2 = (Button) inflate.findViewById(R.id.btn_report);
            button2.setVisibility(0);
            button2.setOnClickListener(new i((RoomPosition) objArr[3]));
            button.setVisibility(8);
        } else if (roomSeatState == RoomSeatState.REMOVE_AND_REPORT) {
            RoomPosition roomPosition = (RoomPosition) objArr[3];
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(c0.a(this.f54767b, 286.0f), c0.a(this.f54767b, 180.0f));
            layoutParams2.addRule(13);
            ((RelativeLayout) inflate.findViewById(R.id.rl_main)).setLayoutParams(layoutParams2);
            Button button3 = (Button) inflate.findViewById(R.id.btn_report);
            button3.setVisibility(0);
            button3.setOnClickListener(new j(roomPosition));
            button.setOnClickListener(new l(roomPosition, intValue));
            button.setTextColor(Color.parseColor("#FF4235"));
            button.setText("踢出房间");
            button.setBackgroundResource(R.drawable.bg_btn_border_red_four);
        }
        if (roomSeatState != RoomSeatState.REMOVE_AND_REPORT && roomSeatState != RoomSeatState.REPORT) {
            button.setOnClickListener(new m(roomSeatState, intValue));
        }
        k(inflate);
        B(inflate, 17, 0, 0);
    }

    private void r(Object... objArr) {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_set_challenge_gold, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_set_challenge_gold);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.ll_info);
        BattleChallengeConfig battleChallengeConfig = (BattleChallengeConfig) objArr[0];
        if (battleChallengeConfig.getIsBattle()) {
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(8);
            int intValue = ((Integer) objArr[1]).intValue();
            ((TextView) inflate.findViewById(R.id.tv_current_copper)).setText(Html.fromHtml("你的账号铜板数:  <font color=#000000>" + battleChallengeConfig.getUserCopper() + "</font>"));
            Button button = (Button) inflate.findViewById(R.id.btn_1);
            button.setText(battleChallengeConfig.getBattleChallengeCopper()[0] + "\n铜板");
            button.setOnClickListener(new e(battleChallengeConfig));
            Button button2 = (Button) inflate.findViewById(R.id.btn_2);
            button2.setText(battleChallengeConfig.getBattleChallengeCopper()[1] + "\n铜板");
            button2.setOnClickListener(new f(battleChallengeConfig));
            Button button3 = (Button) inflate.findViewById(R.id.btn_3);
            button3.setText(battleChallengeConfig.getBattleChallengeCopper()[2] + "\n铜板");
            button3.setOnClickListener(new g(battleChallengeConfig));
            Button button4 = (Button) inflate.findViewById(R.id.btn_4);
            button4.setText(battleChallengeConfig.getBattleChallengeCopper()[3] + "\n铜板");
            button4.setOnClickListener(new h(battleChallengeConfig));
            if (intValue == battleChallengeConfig.getBattleChallengeCopper()[0]) {
                button.setTextColor(-1);
                button.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
            } else if (intValue == battleChallengeConfig.getBattleChallengeCopper()[1]) {
                button2.setTextColor(-1);
                button2.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
            } else if (intValue == battleChallengeConfig.getBattleChallengeCopper()[2]) {
                button3.setTextColor(-1);
                button3.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
            } else if (intValue == battleChallengeConfig.getBattleChallengeCopper()[3]) {
                button4.setTextColor(-1);
                button4.setBackgroundResource(R.drawable.bg_btn_border_blue_four);
            }
        } else {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
            ((TextView) inflate.findViewById(R.id.tv_info_title_1)).setText("【" + ((String) objArr[1]) + "】");
            ((TextView) inflate.findViewById(R.id.tv_info_title_2)).setText(Html.fromHtml("挑战金<font color=#3CA4FD>" + battleChallengeConfig.getFixChallengeCopper() + "铜板</font>"));
            ((TextView) inflate.findViewById(R.id.tv_info_detail)).setText("1、进入游戏后扣除挑战金\n2、每次投币都扣除挑战金\n3、达到" + battleChallengeConfig.getChallengeScore() + " 分返还挑战金\n4、完整通关后有随机铜板奖励");
        }
        k(inflate);
        B(inflate, 17, 0, 0);
    }

    private void s(Object... objArr) {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_invite_pwd, (ViewGroup) null);
        String str = (String) objArr[0];
        ((TextView) inflate.findViewById(R.id.tv_pwd_info)).setText(str);
        inflate.findViewById(R.id.btn_copy).setOnClickListener(new View$OnClickListenerC0383a(objArr, ((Integer) objArr[1]).intValue(), str));
        k(inflate);
        B(inflate, 17, 0, 0);
    }

    private void t() {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.layout_invite_battle, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.qq);
        View findViewById2 = inflate.findViewById(R.id.wechat);
        this.f54769d = 0;
        findViewById.setOnClickListener(new b());
        findViewById2.setOnClickListener(new c());
        this.f54766a.setOnDismissListener(new d());
        k(inflate);
        B(inflate, 17, this.f54767b.getResources().getDimensionPixelOffset(R.dimen.wdp526), this.f54767b.getResources().getDimensionPixelOffset(R.dimen.wdp352));
    }

    private void u(Object... objArr) {
        int intValue = ((Integer) objArr[0]).intValue();
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_room_srv_play_mode_tip, (ViewGroup) null);
        t2.b(inflate, R.id.iv_close).setOnClickListener(new k());
        TextView textView = (TextView) t2.b(inflate, R.id.tv_top);
        Button button = (Button) t2.b(inflate, R.id.btnOk);
        if (intValue == 1) {
            textView.setText("即将关闭流畅模式");
            button.setText("确定关闭");
        } else {
            textView.setText("即将开启流畅模式");
            button.setText("确定开启");
        }
        button.setOnClickListener(new q(intValue == 1 ? 0 : 1));
        B(inflate, 17, 0, 0);
    }

    private void v(String str, Object... objArr) {
        Dialog dialog = new Dialog(this.f54767b, R.style.newtrans_no_floating_dialog);
        this.f54766a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f54766a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(this.f54767b).inflate(R.layout.dialog_game_room_toast, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.tv_toast_info)).setText((String) objArr[0]);
        this.f54766a.setOnDismissListener(new n(str));
        B(inflate, 17, c0.a(this.f54767b, 273.0f), c0.a(this.f54767b, 54.0f));
    }

    public boolean A() {
        a0 a0Var = this.f54770e;
        if (a0Var != null) {
            return a0Var.f54800x;
        }
        return false;
    }

    public synchronized void C() {
        this.f54766a.show();
    }

    public synchronized void D(String str, Object... objArr) {
        w();
        if (str.equals(f54752j)) {
            l(objArr);
            this.f54766a.show();
        } else if (str.equals(f54758p)) {
            n(objArr);
            this.f54766a.show();
        } else if (str.equals(f54753k)) {
            o();
            this.f54766a.show();
        } else {
            if (!str.equals(f54754l) && !str.equals(f54755m)) {
                if (str.equals(f54756n)) {
                    p(objArr);
                    return;
                } else if (str.equals(f54757o)) {
                    m(objArr);
                    this.f54766a.show();
                    return;
                } else if (str.equals(f54759q)) {
                    q(objArr);
                    this.f54766a.show();
                    return;
                } else if (str.equals(f54760r)) {
                    r(objArr);
                    this.f54766a.show();
                    return;
                } else if (str.equals(f54761s)) {
                    t();
                    this.f54766a.show();
                    return;
                } else if (str.equals(f54762t)) {
                    s(objArr);
                    this.f54766a.show();
                    return;
                } else if (str.equals(f54763u)) {
                    u(objArr);
                    this.f54766a.show();
                    return;
                } else {
                    return;
                }
            }
            v(str, objArr);
            this.f54766a.show();
        }
    }

    public synchronized void w() {
        Dialog dialog = this.f54766a;
        if (dialog != null && dialog.isShowing()) {
            this.f54766a.dismiss();
        }
    }

    public Dialog x() {
        return this.f54766a;
    }

    public synchronized boolean y() {
        Dialog dialog = this.f54766a;
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    public boolean z() {
        a0 a0Var = this.f54770e;
        if (a0Var != null) {
            return a0Var.n();
        }
        return false;
    }
}
