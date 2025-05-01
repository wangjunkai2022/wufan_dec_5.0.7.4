package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import app.mgsim.arena.AreaInfo;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.t2;
import com.join.mgps.dto.GameConfig;
import com.papa91.battle.protocol.BattleArea;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PopBattleArea.java */
/* loaded from: classes4.dex */
public class y extends PopupWindow implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    View f48957b;

    /* renamed from: c  reason: collision with root package name */
    View f48958c;

    /* renamed from: d  reason: collision with root package name */
    View f48959d;

    /* renamed from: e  reason: collision with root package name */
    TextView f48960e;

    /* renamed from: f  reason: collision with root package name */
    TextView f48961f;

    /* renamed from: g  reason: collision with root package name */
    TextView f48962g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f48963h;

    /* renamed from: i  reason: collision with root package name */
    ImageView f48964i;

    /* renamed from: j  reason: collision with root package name */
    ImageView f48965j;

    /* renamed from: k  reason: collision with root package name */
    View f48966k;

    /* renamed from: l  reason: collision with root package name */
    View f48967l;

    /* renamed from: m  reason: collision with root package name */
    View f48968m;

    /* renamed from: n  reason: collision with root package name */
    TextView f48969n;

    /* renamed from: o  reason: collision with root package name */
    View f48970o;

    /* renamed from: p  reason: collision with root package name */
    ListView f48971p;

    /* renamed from: q  reason: collision with root package name */
    e f48972q;

    /* renamed from: r  reason: collision with root package name */
    f f48973r;

    /* renamed from: s  reason: collision with root package name */
    Handler f48974s = new a();

    /* renamed from: t  reason: collision with root package name */
    Context f48975t;

    /* renamed from: u  reason: collision with root package name */
    public View f48976u;

    /* compiled from: PopBattleArea.java */
    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        void a() {
            removeMessages(3);
            removeMessages(4);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Animation loadAnimation = AnimationUtils.loadAnimation(y.this.f48975t, R.anim.scale_in);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(y.this.f48975t, R.anim.scale_out);
            int i4 = message.what;
            if (i4 == 0) {
                a();
                y.this.f48968m.startAnimation(loadAnimation2);
                sendEmptyMessageDelayed(4, 200L);
            } else if (i4 == 1) {
                a();
                y.this.f48967l.startAnimation(loadAnimation2);
                sendEmptyMessageDelayed(3, 200L);
            } else if (i4 == 3) {
                y.this.f48967l.setVisibility(8);
                y.this.f48968m.setVisibility(0);
                y.this.f48968m.startAnimation(loadAnimation);
            } else if (i4 != 4) {
            } else {
                y.this.f48968m.setVisibility(8);
                y.this.f48967l.setVisibility(0);
                y.this.f48967l.startAnimation(loadAnimation);
            }
        }
    }

    /* compiled from: PopBattleArea.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.this.dismiss();
        }
    }

    /* compiled from: PopBattleArea.java */
    /* loaded from: classes4.dex */
    class c implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f48979b;

        c(e eVar) {
            this.f48979b = eVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, View view, int i4, long j4) {
            f fVar = y.this.f48973r;
            if (fVar == null) {
                return;
            }
            GameConfig gameConfig = fVar.a().size() > i4 ? y.this.f48973r.a().get(i4) : null;
            e eVar = this.f48979b;
            if (eVar != null) {
                eVar.b(gameConfig);
            }
            y.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PopBattleArea.java */
    /* loaded from: classes4.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                y.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* compiled from: PopBattleArea.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a(BattleArea battleArea);

        void b(GameConfig gameConfig);
    }

    /* compiled from: PopBattleArea.java */
    /* loaded from: classes4.dex */
    public class f extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<GameConfig> f48982b;

        /* compiled from: PopBattleArea.java */
        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f48984a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f48985b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f48986c;

            a() {
            }
        }

        public f() {
        }

        public List<GameConfig> a() {
            if (this.f48982b == null) {
                this.f48982b = new ArrayList();
            }
            return this.f48982b;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public GameConfig getItem(int i4) {
            List<GameConfig> list = this.f48982b;
            if (list == null) {
                return null;
            }
            return list.get(i4);
        }

        public void c(List<GameConfig> list) {
            if (this.f48982b == null) {
                this.f48982b = new ArrayList();
            }
            this.f48982b.clear();
            this.f48982b.addAll(list);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<GameConfig> list = this.f48982b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            if (view != null) {
                aVar = (a) view.getTag();
            } else {
                view = LayoutInflater.from(y.this.f48975t).inflate(R.layout.arena_game_list_item, (ViewGroup) null);
                aVar = new a();
                aVar.f48984a = (SimpleDraweeView) view.findViewById(R.id.icon);
                aVar.f48985b = (TextView) view.findViewById(R.id.room_count);
                aVar.f48986c = (TextView) view.findViewById(R.id.title);
                view.setTag(aVar);
            }
            GameConfig item = getItem(i4);
            MyImageLoader.h(aVar.f48984a, item.getGame_ico());
            aVar.f48986c.setText(item.getGame_name());
            int room_count = item.getRoom_count();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(room_count + "");
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFF47500")), 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) "房");
            aVar.f48985b.setText(spannableStringBuilder);
            return view;
        }
    }

    public y(Context context, e eVar) {
        this.f48975t = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pop_battle_area, (ViewGroup) null);
        this.f48957b = inflate.findViewById(R.id.view_bj);
        this.f48958c = inflate.findViewById(R.id.view_sh);
        this.f48959d = inflate.findViewById(R.id.view_gz);
        this.f48960e = (TextView) inflate.findViewById(R.id.tv_bj);
        this.f48961f = (TextView) inflate.findViewById(R.id.tv_sh);
        this.f48962g = (TextView) inflate.findViewById(R.id.tv_gz);
        this.f48965j = (ImageView) inflate.findViewById(R.id.iv_gz_battle_area_rec);
        this.f48964i = (ImageView) inflate.findViewById(R.id.iv_sh_battle_area_rec);
        this.f48963h = (ImageView) inflate.findViewById(R.id.iv_bj_battle_area_rec);
        this.f48966k = t2.b(inflate, R.id.rl_sel);
        this.f48967l = t2.b(inflate, R.id.rl_areas);
        this.f48968m = t2.b(inflate, R.id.rl_games);
        this.f48969n = (TextView) t2.b(inflate, R.id.area_title);
        this.f48970o = t2.b(inflate, R.id.iv_arrow);
        this.f48971p = (ListView) t2.b(inflate, R.id.listview);
        this.f48966k.setOnClickListener(this);
        this.f48972q = eVar;
        t2.b(inflate, R.id.rl_bj).setOnClickListener(this);
        t2.b(inflate, R.id.rl_sh).setOnClickListener(this);
        t2.b(inflate, R.id.rl_gz).setOnClickListener(this);
        inflate.findViewById(R.id.emptyView).setOnClickListener(new b());
        setContentView(inflate);
        setWidth(context.getResources().getDisplayMetrics().widthPixels);
        setHeight(-2);
        update();
        e();
        f fVar = new f();
        this.f48973r = fVar;
        this.f48971p.setAdapter((ListAdapter) fVar);
        this.f48971p.setOnItemClickListener(new c(eVar));
    }

    private void d(View view, boolean z4, View view2, boolean z5) {
        view.setBackgroundResource(z4 ? R.drawable.bg_circle_eb3a25 : R.drawable.bg_circle_30d92d);
        view2.setVisibility(z5 ? 0 : 8);
    }

    private void e() {
        setBackgroundDrawable(new BitmapDrawable());
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setTouchInterceptor(new d());
    }

    public void a(BattleArea battleArea, boolean z4) {
        if (z4) {
            this.f48966k.setVisibility(8);
        } else {
            this.f48966k.setVisibility(0);
        }
        this.f48969n.setText(com.join.mgps.socket.fight.arena.c.d(battleArea));
    }

    public void b(ConcurrentHashMap<Integer, AreaInfo> concurrentHashMap, AreaInfo areaInfo) {
        Enumeration<AreaInfo> elements = concurrentHashMap.elements();
        while (elements.hasMoreElements()) {
            AreaInfo nextElement = elements.nextElement();
            if (nextElement.getArea() == 1) {
                TextView textView = this.f48960e;
                textView.setText("在线：" + nextElement.getOnLinePeopleCounts() + "人");
                d(this.f48957b, com.join.mgps.socket.fight.arena.c.m(nextElement.getPingTime()), this.f48963h, nextElement.getArea() == areaInfo.getArea());
                if (nextElement.getArea() == areaInfo.getArea()) {
                    this.f48969n.setText("北京区");
                }
            } else if (nextElement.getArea() == 2) {
                TextView textView2 = this.f48961f;
                textView2.setText("在线：" + nextElement.getOnLinePeopleCounts() + "人");
                d(this.f48958c, com.join.mgps.socket.fight.arena.c.m(nextElement.getPingTime()), this.f48964i, nextElement.getArea() == areaInfo.getArea());
                if (nextElement.getArea() == areaInfo.getArea()) {
                    this.f48969n.setText("上海区");
                }
            } else if (nextElement.getArea() == 3) {
                TextView textView3 = this.f48962g;
                textView3.setText("在线：" + nextElement.getOnLinePeopleCounts() + "人");
                d(this.f48959d, com.join.mgps.socket.fight.arena.c.m(nextElement.getPingTime()), this.f48965j, nextElement.getArea() == areaInfo.getArea());
                if (nextElement.getArea() == areaInfo.getArea()) {
                    this.f48969n.setText("广东区");
                }
            }
        }
    }

    public void c(List<GameConfig> list) {
        if (this.f48973r == null) {
            f fVar = new f();
            this.f48973r = fVar;
            this.f48971p.setAdapter((ListAdapter) fVar);
        }
        this.f48973r.c(list);
        this.f48973r.notifyDataSetChanged();
    }

    void f() {
        this.f48970o.setSelected(true);
        this.f48974s.sendEmptyMessage(0);
    }

    void g() {
        this.f48970o.setSelected(false);
        this.f48974s.sendEmptyMessage(1);
    }

    void h() {
        if (!this.f48970o.isSelected()) {
            f();
        } else {
            g();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rl_sel) {
            h();
        } else if (id == R.id.rl_bj) {
            this.f48972q.a(BattleArea.BJ);
            dismiss();
        } else if (id == R.id.rl_sh) {
            this.f48972q.a(BattleArea.SH);
            dismiss();
        } else if (id == R.id.rl_gz) {
            this.f48972q.a(BattleArea.GZ);
            dismiss();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        this.f48976u = view;
        if (Build.VERSION.SDK_INT == 24) {
            try {
                Rect rect = new Rect();
                this.f48976u.getGlobalVisibleRect(rect);
                setHeight(this.f48976u.getResources().getDisplayMetrics().heightPixels - rect.bottom);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        super.showAsDropDown(view);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i4, int i5, int i6) {
        this.f48976u = view;
        super.showAtLocation(view, i4, i5, i6);
    }
}
