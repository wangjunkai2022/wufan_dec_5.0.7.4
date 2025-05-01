package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import app.mgsim.arena.ArenaResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DetailResultBean;
import com.papa91.battle.protocol.GameRoom;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CheckInviteDialogActivity_ extends CheckInviteDialogActivity implements y3.a, a4.a, a4.b {
    public static final String X = "data";
    private final a4.c V = new a4.c();
    private final Map<Class<?>, Object> W = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CheckInviteDialogActivity_.super.q0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f28560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, DetailResultBean detailResultBean) {
            super(str, j4, str2);
            this.f28560b = detailResultBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CheckInviteDialogActivity_.super.j0(this.f28560b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CheckInviteDialogActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CheckInviteDialogActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CheckInviteDialogActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CheckInviteDialogActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CheckInviteDialogActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f28567b;

        j(GameRoom gameRoom) {
            this.f28567b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.x0(this.f28567b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f28569b;

        k(ArenaResponse arenaResponse) {
            this.f28569b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.r0(this.f28569b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28571b;

        l(String str) {
            this.f28571b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.showToast(this.f28571b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28573b;

        m(int i4) {
            this.f28573b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.u0(this.f28573b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    public static class o extends org.androidannotations.api.builder.a<o> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28576a;

        public o(Context context) {
            super(context, CheckInviteDialogActivity_.class);
        }

        public o a(String str) {
            return (o) super.extra("data", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28576a;
            if (fragment != null) {
                fragment.startActivityForResult(this.intent, i4);
            } else {
                Context context = this.context;
                if (context instanceof Activity) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i4, this.lastOptions);
                } else {
                    context.startActivity(this.intent);
                }
            }
            return new org.androidannotations.api.builder.f(this.context);
        }

        public o(Fragment fragment) {
            super(fragment.getActivity(), CheckInviteDialogActivity_.class);
            this.f28576a = fragment;
        }
    }

    public static o K0(Context context) {
        return new o(context);
    }

    public static o L0(Fragment fragment) {
        return new o(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("data")) {
            return;
        }
        this.f28524b = extras.getString("data");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.W.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void getData() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void j0(DetailResultBean detailResultBean) {
        org.androidannotations.api.a.l(new d("", 0L, "", detailResultBean));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.V);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.net_whole_invite_dialog);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28525c = (TextView) aVar.internalFindViewById(R.id.dialog_content);
        this.f28526d = (Button) aVar.internalFindViewById(R.id.dialog_button_cancle);
        this.f28527e = (Button) aVar.internalFindViewById(R.id.dialog_button_ok);
        this.f28528f = (SimpleDraweeView) aVar.internalFindViewById(R.id.romImgIv);
        this.f28529g = (TextView) aVar.internalFindViewById(R.id.romNameTv);
        this.f28530h = (TextView) aVar.internalFindViewById(R.id.romSizeTv);
        this.f28531i = (SimpleDraweeView) aVar.internalFindViewById(R.id.plugImgIv);
        this.f28532j = (TextView) aVar.internalFindViewById(R.id.plugNameTv);
        this.f28533k = (TextView) aVar.internalFindViewById(R.id.plugSizeTv);
        this.f28543u = (LinearLayout) aVar.internalFindViewById(R.id.game_lay);
        this.f28544v = (LinearLayout) aVar.internalFindViewById(R.id.rom_lay);
        this.f28545w = (LinearLayout) aVar.internalFindViewById(R.id.plug_lay);
        this.f28546x = (LinearLayout) aVar.internalFindViewById(R.id.loading_lay);
        this.f28547y = (TextView) aVar.internalFindViewById(R.id.dialog_content_2);
        this.B = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        Button button = this.f28526d;
        if (button != null) {
            button.setOnClickListener(new f());
        }
        Button button2 = this.f28527e;
        if (button2 != null) {
            button2.setOnClickListener(new g());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void p0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.W.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void q0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void r0(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new k(arenaResponse), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.V.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new l(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void u0(int i4) {
        org.androidannotations.api.b.e("", new m(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void x0(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new j(gameRoom), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CheckInviteDialogActivity
    public void y0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.V.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.V.a(this);
    }
}
