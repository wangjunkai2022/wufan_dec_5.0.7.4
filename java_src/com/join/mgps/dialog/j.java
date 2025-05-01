package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioGroup;
import app.mgsim.arena.AreaInfo;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.y;
import com.join.mgps.dto.GameConfig;
import com.join.mgps.fragment.roomlist.StandardEliteRoomFragment;
import com.papa91.battle.protocol.BattleArea;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ArenaGameListSortDialog.java */
/* loaded from: classes4.dex */
public class j implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Dialog f49453b;

    /* renamed from: c  reason: collision with root package name */
    Activity f49454c;

    /* renamed from: d  reason: collision with root package name */
    int f49455d = 1;

    /* renamed from: e  reason: collision with root package name */
    int f49456e = 3;

    /* renamed from: f  reason: collision with root package name */
    RadioGroup f49457f;

    /* renamed from: g  reason: collision with root package name */
    RadioGroup f49458g;

    /* renamed from: h  reason: collision with root package name */
    private StandardEliteRoomFragment.m f49459h;

    /* renamed from: i  reason: collision with root package name */
    ConcurrentHashMap<Integer, AreaInfo> f49460i;

    /* renamed from: j  reason: collision with root package name */
    AreaInfo f49461j;

    /* renamed from: k  reason: collision with root package name */
    int f49462k;

    /* renamed from: l  reason: collision with root package name */
    ImageView f49463l;

    /* renamed from: m  reason: collision with root package name */
    ImageView f49464m;

    /* renamed from: n  reason: collision with root package name */
    ImageView f49465n;

    /* renamed from: o  reason: collision with root package name */
    View f49466o;

    /* renamed from: p  reason: collision with root package name */
    View f49467p;

    /* renamed from: q  reason: collision with root package name */
    View f49468q;

    /* renamed from: r  reason: collision with root package name */
    View f49469r;

    /* renamed from: s  reason: collision with root package name */
    View f49470s;

    /* renamed from: t  reason: collision with root package name */
    View f49471t;

    /* renamed from: u  reason: collision with root package name */
    y.e f49472u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaGameListSortDialog.java */
    /* loaded from: classes4.dex */
    public class a implements RadioGroup.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i4) {
            if (i4 == R.id.rb_phone) {
                j.this.f49455d = 2;
            } else if (i4 != R.id.rb_synthesize) {
            } else {
                j.this.f49455d = 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaGameListSortDialog.java */
    /* loaded from: classes4.dex */
    public class b implements RadioGroup.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i4) {
            switch (i4) {
                case R.id.rb_rank_asc /* 2131300538 */:
                    j.this.f49456e = 4;
                    return;
                case R.id.rb_rank_desc /* 2131300539 */:
                    j.this.f49456e = 3;
                    return;
                case R.id.rb_remoned /* 2131300540 */:
                case R.id.rb_synthesize /* 2131300542 */:
                default:
                    j.this.f49456e = 3;
                    return;
                case R.id.rb_seat_asc /* 2131300541 */:
                    j.this.f49456e = 6;
                    return;
                case R.id.rb_time_asc /* 2131300543 */:
                    j.this.f49456e = 5;
                    return;
            }
        }
    }

    public j(Activity activity, StandardEliteRoomFragment.m mVar, y.e eVar, ConcurrentHashMap<Integer, AreaInfo> concurrentHashMap, AreaInfo areaInfo, int i4) {
        this.f49454c = activity;
        this.f49472u = eVar;
        this.f49459h = mVar;
        b(activity);
        this.f49462k = i4;
        c(concurrentHashMap, areaInfo);
        this.f49460i = concurrentHashMap;
        this.f49461j = areaInfo;
    }

    private void e(View view, boolean z4, View view2, boolean z5) {
        view.setBackgroundResource(z4 ? R.drawable.bg_circle_eb3a25 : R.drawable.bg_circle_30d92d);
        view2.setVisibility(z5 ? 0 : 8);
    }

    public void a() {
        this.f49453b.dismiss();
    }

    void b(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.newtrans_floating_dialog);
        this.f49453b = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f49453b.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_room_sort, (ViewGroup) null);
        inflate.findViewById(R.id.iv_close).setOnClickListener(this);
        inflate.findViewById(R.id.tvSubmit).setOnClickListener(this);
        this.f49457f = (RadioGroup) inflate.findViewById(R.id.rgRoomType);
        this.f49458g = (RadioGroup) inflate.findViewById(R.id.rgRoomSort);
        this.f49466o = inflate.findViewById(R.id.view_bj);
        this.f49467p = inflate.findViewById(R.id.view_sh);
        this.f49468q = inflate.findViewById(R.id.view_gz);
        this.f49470s = inflate.findViewById(R.id.rl_sh);
        this.f49469r = inflate.findViewById(R.id.rl_bj);
        this.f49471t = inflate.findViewById(R.id.rl_gz);
        this.f49465n = (ImageView) inflate.findViewById(R.id.iv_gz_battle_area_rec);
        this.f49464m = (ImageView) inflate.findViewById(R.id.iv_sh_battle_area_rec);
        this.f49463l = (ImageView) inflate.findViewById(R.id.iv_bj_battle_area_rec);
        com.join.mgps.Util.t2.b(inflate, R.id.rl_bj).setOnClickListener(this);
        com.join.mgps.Util.t2.b(inflate, R.id.rl_sh).setOnClickListener(this);
        com.join.mgps.Util.t2.b(inflate, R.id.rl_gz).setOnClickListener(this);
        this.f49457f.setOnCheckedChangeListener(new a());
        this.f49458g.setOnCheckedChangeListener(new b());
        this.f49453b.setContentView(inflate);
        Window window = this.f49453b.getWindow();
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.width = -1;
        attributes2.height = -1;
        window.setGravity(17);
    }

    public void c(ConcurrentHashMap<Integer, AreaInfo> concurrentHashMap, AreaInfo areaInfo) {
        Enumeration<AreaInfo> elements = concurrentHashMap.elements();
        this.f49469r.setSelected(false);
        this.f49470s.setSelected(false);
        this.f49471t.setSelected(false);
        while (elements.hasMoreElements()) {
            AreaInfo nextElement = elements.nextElement();
            if (nextElement.getArea() == areaInfo.getArea()) {
                AreaInfo areaInfo2 = new AreaInfo();
                this.f49461j = areaInfo2;
                areaInfo2.setArea(nextElement.getArea());
                this.f49461j.setHost(nextElement.getHost());
                this.f49461j.setOnLinePeopleCounts(nextElement.getOnLinePeopleCounts());
                this.f49461j.setPingTime(nextElement.getPingTime());
                this.f49461j.setPort(nextElement.getPort());
            }
            if (nextElement.getArea() == 1) {
                e(this.f49466o, com.join.mgps.socket.fight.arena.c.m(nextElement.getPingTime()), this.f49463l, nextElement.getArea() == this.f49462k);
                if (nextElement.getArea() == areaInfo.getArea()) {
                    this.f49469r.setSelected(true);
                }
            } else if (nextElement.getArea() == 2) {
                e(this.f49467p, com.join.mgps.socket.fight.arena.c.m(nextElement.getPingTime()), this.f49464m, nextElement.getArea() == this.f49462k);
                if (nextElement.getArea() == areaInfo.getArea()) {
                    this.f49470s.setSelected(true);
                }
            } else if (nextElement.getArea() == 3) {
                e(this.f49468q, com.join.mgps.socket.fight.arena.c.m(nextElement.getPingTime()), this.f49465n, nextElement.getArea() == this.f49462k);
                if (nextElement.getArea() == areaInfo.getArea()) {
                    this.f49471t.setSelected(true);
                }
            }
        }
    }

    public void d(int i4, List<GameConfig> list, String str, int i5) {
        this.f49455d = i4;
        this.f49457f.check(i4 == 2 ? R.id.rb_phone : R.id.rb_synthesize);
        this.f49456e = i5;
        if (i5 == 3) {
            this.f49458g.check(R.id.rb_rank_desc);
        } else if (i5 == 4) {
            this.f49458g.check(R.id.rb_rank_asc);
        } else if (i5 == 5) {
            this.f49458g.check(R.id.rb_time_asc);
        } else if (i5 != 6) {
            this.f49458g.check(R.id.rb_rank_desc);
        } else {
            this.f49458g.check(R.id.rb_seat_asc);
        }
    }

    public void f() {
        if (this.f49453b.isShowing()) {
            return;
        }
        this.f49453b.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            StandardEliteRoomFragment.m mVar = this.f49459h;
            if (mVar != null) {
                mVar.b(this.f49456e, this.f49455d);
            }
            a();
        } else if (id != R.id.tvSubmit) {
            if (id == R.id.rl_bj) {
                this.f49472u.a(BattleArea.BJ);
                this.f49461j.setArea(1);
            } else if (id == R.id.rl_sh) {
                this.f49472u.a(BattleArea.SH);
                this.f49461j.setArea(2);
            } else if (id == R.id.rl_gz) {
                this.f49472u.a(BattleArea.GZ);
                this.f49461j.setArea(3);
            }
            c(this.f49460i, this.f49461j);
        } else {
            StandardEliteRoomFragment.m mVar2 = this.f49459h;
            if (mVar2 != null) {
                mVar2.b(this.f49456e, this.f49455d);
            }
            a();
        }
    }
}
