package com.join.mgps.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import app.mgsim.arena.UserType;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.v0;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.RoomPosition;
/* loaded from: classes4.dex */
public class PlayerInfoContainerView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private b[] f47545b;

    /* renamed from: c  reason: collision with root package name */
    Activity f47546c;

    /* renamed from: d  reason: collision with root package name */
    int f47547d;

    /* renamed from: e  reason: collision with root package name */
    UserType f47548e;

    /* renamed from: f  reason: collision with root package name */
    private a f47549f;

    /* loaded from: classes4.dex */
    public interface a {
        void a(RoomPosition roomPosition, int i4);

        void b(int i4);

        boolean c();

        void d();

        void e(RoomPosition roomPosition, boolean z4, int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f47550a;

        /* renamed from: b  reason: collision with root package name */
        private View f47551b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f47552c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f47553d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f47554e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f47555f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f47556g;

        /* renamed from: h  reason: collision with root package name */
        private LinearLayout f47557h;

        /* renamed from: i  reason: collision with root package name */
        private ImageView f47558i;

        /* renamed from: j  reason: collision with root package name */
        private ImageView f47559j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f47560k;

        /* renamed from: l  reason: collision with root package name */
        private ViewGroup f47561l;

        /* renamed from: m  reason: collision with root package name */
        private int f47562m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f47563n = false;

        /* renamed from: o  reason: collision with root package name */
        private RoomPosition f47564o;

        /* renamed from: p  reason: collision with root package name */
        private View f47565p;

        /* renamed from: q  reason: collision with root package name */
        private LinearLayout f47566q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f47567r;

        /* renamed from: s  reason: collision with root package name */
        private TextView f47568s;

        /* renamed from: t  reason: collision with root package name */
        private ImageView f47569t;

        /* renamed from: u  reason: collision with root package name */
        private View f47570u;

        /* renamed from: v  reason: collision with root package name */
        private View f47571v;

        /* renamed from: w  reason: collision with root package name */
        private VipView f47572w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.f47564o != null) {
                    if (b.this.f47564o.getUid() == 0) {
                        if (b.this.f47564o.getClosed()) {
                            PlayerInfoContainerView.this.f47549f.e(b.this.f47564o, false, b.this.f47562m);
                            return;
                        } else if (PlayerInfoContainerView.this.f47549f.c()) {
                            PlayerInfoContainerView.this.f47549f.b(b.this.f47562m);
                            return;
                        } else {
                            PlayerInfoContainerView.this.f47549f.e(b.this.f47564o, true, b.this.f47562m);
                            return;
                        }
                    }
                    PlayerInfoContainerView.this.f47549f.a(b.this.f47564o, b.this.f47562m);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.join.mgps.customview.PlayerInfoContainerView$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class View$OnClickListenerC0354b implements View.OnClickListener {
            View$OnClickListenerC0354b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlayerInfoContainerView.this.f47549f.d();
            }
        }

        public b(Context context, ViewGroup viewGroup, int i4) {
            this.f47550a = context;
            this.f47561l = viewGroup;
            this.f47562m = i4;
            c();
        }

        private void d() {
            if (PlayerInfoContainerView.this.f47546c == null) {
                return;
            }
            float j4 = (com.join.android.app.common.utils.n.n(this.f47550a).j(PlayerInfoContainerView.this.f47546c) * 9.0f) / 16.0f;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f47571v.getLayoutParams();
            layoutParams.width = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp180) * j4);
            layoutParams.height = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp239) * j4);
            this.f47571v.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f47565p.getLayoutParams();
            layoutParams2.width = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp100) * j4);
            layoutParams2.height = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp100) * j4);
            layoutParams2.topMargin = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp28) * j4);
            this.f47565p.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f47553d.getLayoutParams();
            layoutParams3.width = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp96) * j4);
            layoutParams3.height = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp96) * j4);
            layoutParams3.topMargin = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp30) * j4);
            this.f47553d.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f47569t.getLayoutParams();
            layoutParams4.width = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp30) * j4);
            layoutParams4.height = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp30) * j4);
            layoutParams4.bottomMargin = -((int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp15) * j4));
            this.f47569t.setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f47555f.getLayoutParams();
            layoutParams5.topMargin = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp14) * j4);
            this.f47555f.setLayoutParams(layoutParams5);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f47566q.getLayoutParams();
            layoutParams6.topMargin = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp11) * j4);
            this.f47566q.setLayoutParams(layoutParams6);
            this.f47572w.setSize((int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp30) * j4), (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp30) * j4));
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f47552c.getLayoutParams();
            layoutParams7.width = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp37) * j4);
            layoutParams7.height = (int) (PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp37) * j4);
            this.f47552c.setLayoutParams(layoutParams7);
            this.f47552c.setTextSize(0, PlayerInfoContainerView.this.getResources().getDimensionPixelSize(R.dimen.wdp22) * j4);
            this.f47554e.setTextSize(0, PlayerInfoContainerView.this.getResources().getDimensionPixelSize(R.dimen.wdp24) * j4);
            this.f47555f.setTextSize(0, PlayerInfoContainerView.this.getResources().getDimensionPixelSize(R.dimen.wdp24) * j4);
            this.f47556g.setTextSize(0, PlayerInfoContainerView.this.getResources().getDimensionPixelSize(R.dimen.wdp18) * j4);
        }

        private void e() {
            int i4 = PlayerInfoContainerView.this.f47547d;
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f47571v.getLayoutParams();
                    int i5 = this.f47562m;
                    if (i5 == 1) {
                        layoutParams.leftMargin = 0;
                    } else if (i5 == 2) {
                        layoutParams.rightMargin = 0;
                    }
                    layoutParams.width = PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp224);
                    this.f47571v.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f47571v.getLayoutParams();
            int width = this.f47561l.getWidth();
            if (width > 0) {
                int dimensionPixelOffset = (((width / 2) - PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp228)) / 2) / 2;
                if (PlayerInfoContainerView.this.f47547d == 2) {
                    int i6 = this.f47562m;
                    if (i6 == 1) {
                        layoutParams2.leftMargin = dimensionPixelOffset;
                    } else if (i6 == 2) {
                        layoutParams2.rightMargin = dimensionPixelOffset;
                    }
                }
            }
            layoutParams2.width = PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp228);
            this.f47571v.setLayoutParams(layoutParams2);
        }

        void c() {
            View inflate = LayoutInflater.from(this.f47550a).inflate(R.layout.item_game_room_player_info, (ViewGroup) null);
            this.f47551b = inflate;
            this.f47559j = (ImageView) inflate.findViewById(R.id.iv_haveReady);
            this.f47570u = this.f47551b.findViewById(R.id.mDefaultBg);
            this.f47565p = this.f47551b.findViewById(R.id.borderView);
            this.f47552c = (TextView) this.f47551b.findViewById(R.id.tv_p);
            this.f47553d = (SimpleDraweeView) this.f47551b.findViewById(R.id.iv_bg);
            this.f47554e = (TextView) this.f47551b.findViewById(R.id.tv_name);
            this.f47555f = (TextView) this.f47551b.findViewById(R.id.tv_nick_name);
            this.f47556g = (TextView) this.f47551b.findViewById(R.id.tv_delay_time);
            this.f47558i = (ImageView) this.f47551b.findViewById(R.id.iv_state);
            this.f47560k = (TextView) this.f47551b.findViewById(R.id.tv_state);
            this.f47566q = (LinearLayout) this.f47551b.findViewById(R.id.ll_out_device);
            this.f47567r = (TextView) this.f47551b.findViewById(R.id.iv_out_device);
            this.f47568s = (TextView) this.f47551b.findViewById(R.id.iv_pc_device);
            this.f47572w = (VipView) this.f47551b.findViewById(R.id.vipView);
            this.f47557h = (LinearLayout) this.f47551b.findViewById(R.id.ll_state);
            this.f47571v = this.f47551b.findViewById(R.id.rl_top);
            this.f47569t = (ImageView) this.f47551b.findViewById(R.id.ivProficiencyLevel);
            int i4 = this.f47562m;
            if (i4 == 1) {
                this.f47552c.setText("1P");
            } else if (i4 == 2) {
                this.f47552c.setText("2P");
            } else if (i4 == 3) {
                this.f47552c.setText("3P");
            } else if (i4 == 4) {
                this.f47552c.setText("4P");
            }
            this.f47551b.findViewById(R.id.rl_top).setOnClickListener(new a());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            if (this.f47562m > 1) {
                layoutParams.leftMargin = PlayerInfoContainerView.this.getResources().getDimensionPixelOffset(R.dimen.wdp20);
            }
            this.f47561l.addView(this.f47551b, layoutParams);
        }

        public void f(RoomPosition roomPosition, boolean z4, boolean z5) {
            e();
            this.f47564o = roomPosition;
            this.f47563n = z4;
            if (roomPosition.getUid() == 0) {
                this.f47559j.setVisibility(8);
                this.f47555f.setVisibility(4);
                this.f47566q.setVisibility(4);
                this.f47554e.setVisibility(8);
                this.f47558i.setVisibility(0);
                this.f47560k.setVisibility(0);
                this.f47557h.setVisibility(0);
                this.f47553d.setVisibility(8);
                if (roomPosition.getClosed()) {
                    this.f47558i.setImageDrawable(PlayerInfoContainerView.this.getContext().getResources().getDrawable(R.drawable.new_arena_locked));
                    this.f47560k.setVisibility(4);
                } else {
                    this.f47558i.setImageDrawable(PlayerInfoContainerView.this.getContext().getResources().getDrawable(R.drawable.new_arena_empty));
                    if (PlayerInfoContainerView.this.f47548e == UserType.OWNER) {
                        this.f47560k.setVisibility(0);
                    } else {
                        this.f47560k.setVisibility(8);
                    }
                }
                this.f47570u.setBackgroundResource(R.drawable.newarena_room_positionback);
                this.f47572w.setVipData(0, 0);
                this.f47553d.setVisibility(4);
                this.f47555f.setVisibility(4);
                this.f47566q.setVisibility(4);
                this.f47568s.setVisibility(4);
                this.f47569t.setVisibility(4);
                this.f47565p.setVisibility(4);
                this.f47560k.setOnClickListener(new View$OnClickListenerC0354b());
                return;
            }
            this.f47553d.setVisibility(0);
            this.f47558i.setVisibility(8);
            this.f47555f.setVisibility(0);
            this.f47566q.setVisibility(0);
            this.f47554e.setVisibility(0);
            this.f47560k.setVisibility(8);
            if (roomPosition.getState() == RoomPosition.State.READY && !z4) {
                this.f47559j.setVisibility(0);
            } else {
                this.f47559j.setVisibility(8);
            }
            v0.b("GameRoomActivity", "RoomPosition player Avatar:" + roomPosition.getAvatar());
            MyImageLoader.l(this.f47553d, roomPosition.getAvatar());
            this.f47555f.setText(roomPosition.getNickname());
            TextView textView = this.f47556g;
            textView.setText(roomPosition.getPingVal() + "ms");
            if (this.f47564o.getPeripheral()) {
                this.f47567r.setVisibility(0);
            } else {
                this.f47567r.setVisibility(8);
            }
            if (this.f47564o.getPlatform().getNumber() == 1) {
                this.f47568s.setVisibility(0);
            } else {
                this.f47568s.setVisibility(8);
            }
            if (this.f47564o.getVip()) {
                this.f47572w.setVipData(1, 0);
            } else {
                this.f47572w.setVipData(0, 0);
            }
            this.f47554e.setTextColor(Color.parseColor(this.f47564o.getBattleTitleColor()));
            this.f47554e.setText(this.f47564o.getBattleTitle());
            this.f47565p.setVisibility(0);
            switch (roomPosition.getProficiencyLevel()) {
                case 1:
                    this.f47569t.setVisibility(0);
                    this.f47569t.setBackgroundResource(R.drawable.mg_proficiency_level_trainee);
                    this.f47565p.setBackgroundResource(R.drawable.bg_border_yellow);
                    break;
                case 2:
                    this.f47569t.setVisibility(0);
                    this.f47569t.setBackgroundResource(R.drawable.mg_proficiency_level_senior);
                    this.f47565p.setBackgroundResource(R.drawable.mg_proficiency_level_senior_bg);
                    break;
                case 3:
                    this.f47569t.setVisibility(0);
                    this.f47569t.setBackgroundResource(R.drawable.mg_proficiency_level_elite);
                    this.f47565p.setBackgroundResource(R.drawable.mg_proficiency_level_elite_bg);
                    break;
                case 4:
                    this.f47569t.setVisibility(0);
                    this.f47569t.setBackgroundResource(R.drawable.mg_proficiency_level_master);
                    this.f47565p.setBackgroundResource(R.drawable.mg_proficiency_level_master_bg);
                    break;
                case 5:
                    this.f47569t.setVisibility(0);
                    this.f47569t.setBackgroundResource(R.drawable.mg_proficiency_level_legend);
                    this.f47565p.setBackgroundResource(R.drawable.mg_proficiency_level_legend_bg);
                    break;
                case 6:
                    this.f47569t.setVisibility(0);
                    this.f47569t.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest);
                    this.f47565p.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest_bg);
                    break;
                default:
                    this.f47569t.setVisibility(8);
                    this.f47565p.setBackgroundResource(R.drawable.mg_proficiency_level_0_bg);
                    break;
            }
            if (z4) {
                this.f47570u.setBackgroundResource(R.drawable.new_arena_isouner);
            } else if (z5) {
                this.f47570u.setBackgroundResource(R.drawable.newarena_room_positionback_my);
            } else {
                this.f47570u.setBackgroundResource(R.drawable.newarena_room_positionback);
            }
        }
    }

    public PlayerInfoContainerView(Context context) {
        super(context);
        this.f47545b = new b[4];
        this.f47547d = 4;
        b(context);
    }

    private void b(Context context) {
        setOrientation(0);
        this.f47545b[0] = new b(context, this, 1);
        this.f47545b[1] = new b(context, this, 2);
        this.f47545b[2] = new b(context, this, 3);
        this.f47545b[3] = new b(context, this, 4);
    }

    public void c(GameRoom gameRoom, int i4, Activity activity) {
        this.f47546c = activity;
        this.f47547d = gameRoom.getSeatsNumber();
        this.f47548e = com.join.mgps.socket.fight.arena.c.f(gameRoom, AccountUtil_.getInstance_(activity));
        int leader = gameRoom.getLeader();
        int i5 = this.f47547d;
        if (i5 == 1) {
            getChildAt(0).setVisibility(0);
            getChildAt(1).setVisibility(8);
            getChildAt(2).setVisibility(8);
            getChildAt(3).setVisibility(8);
            this.f47545b[0].f(gameRoom.getP1(), gameRoom.getP1().getUid() == leader, gameRoom.getP1().getUid() == i4);
        } else if (i5 == 2) {
            getChildAt(0).setVisibility(0);
            getChildAt(1).setVisibility(0);
            getChildAt(2).setVisibility(8);
            getChildAt(3).setVisibility(8);
            this.f47545b[0].f(gameRoom.getP1(), gameRoom.getP1().getUid() == leader, gameRoom.getP1().getUid() == i4);
            this.f47545b[1].f(gameRoom.getP2(), gameRoom.getP2().getUid() == leader, gameRoom.getP2().getUid() == i4);
        } else if (i5 == 3) {
            getChildAt(0).setVisibility(0);
            getChildAt(1).setVisibility(0);
            getChildAt(2).setVisibility(0);
            getChildAt(3).setVisibility(8);
            this.f47545b[0].f(gameRoom.getP1(), gameRoom.getP1().getUid() == leader, gameRoom.getP1().getUid() == i4);
            this.f47545b[1].f(gameRoom.getP2(), gameRoom.getP2().getUid() == leader, gameRoom.getP2().getUid() == i4);
            this.f47545b[2].f(gameRoom.getP3(), gameRoom.getP3().getUid() == leader, gameRoom.getP3().getUid() == i4);
        } else if (i5 != 4) {
        } else {
            getChildAt(0).setVisibility(0);
            getChildAt(1).setVisibility(0);
            getChildAt(2).setVisibility(0);
            getChildAt(3).setVisibility(0);
            this.f47545b[0].f(gameRoom.getP1(), gameRoom.getP1().getUid() == leader, gameRoom.getP1().getUid() == i4);
            this.f47545b[1].f(gameRoom.getP2(), gameRoom.getP2().getUid() == leader, gameRoom.getP2().getUid() == i4);
            this.f47545b[2].f(gameRoom.getP3(), gameRoom.getP3().getUid() == leader, gameRoom.getP3().getUid() == i4);
            this.f47545b[3].f(gameRoom.getP4(), gameRoom.getP4().getUid() == leader, gameRoom.getP4().getUid() == i4);
        }
    }

    public void setPlayerInfoCallback(a aVar) {
        this.f47549f = aVar;
    }

    public PlayerInfoContainerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47545b = new b[4];
        this.f47547d = 4;
        b(context);
    }
}
