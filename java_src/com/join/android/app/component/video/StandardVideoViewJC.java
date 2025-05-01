package com.join.android.app.component.video;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g1;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.w0;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.join.mgps.customview.EqualizerView;
import com.join.mgps.customview.o;
import com.papa.gsyvideoplayer.utils.l;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes3.dex */
public class StandardVideoViewJC extends JCVideoPlayer {
    protected static Timer C2 = null;
    public static boolean D2 = true;
    private static boolean E2 = true;
    private final int A2;
    public String B2;
    public ImageView N1;
    public ProgressBar O1;
    public ProgressBar P1;
    public TextView Q1;
    public SimpleDraweeView R1;
    public ImageView S1;
    public LinearLayout T1;
    public ImageView U1;
    public TextView V1;
    public TextView W1;
    public TextView X1;
    public PopupWindow Y1;
    protected f Z1;

    /* renamed from: a2  reason: collision with root package name */
    protected Dialog f15311a2;

    /* renamed from: b2  reason: collision with root package name */
    protected ProgressBar f15312b2;

    /* renamed from: c2  reason: collision with root package name */
    protected TextView f15313c2;

    /* renamed from: d2  reason: collision with root package name */
    protected TextView f15314d2;

    /* renamed from: e2  reason: collision with root package name */
    protected ImageView f15315e2;

    /* renamed from: f2  reason: collision with root package name */
    protected Dialog f15316f2;

    /* renamed from: g2  reason: collision with root package name */
    protected ProgressBar f15317g2;

    /* renamed from: h2  reason: collision with root package name */
    protected TextView f15318h2;

    /* renamed from: i2  reason: collision with root package name */
    protected ImageView f15319i2;

    /* renamed from: j2  reason: collision with root package name */
    protected Dialog f15320j2;

    /* renamed from: k2  reason: collision with root package name */
    protected ProgressBar f15321k2;

    /* renamed from: l2  reason: collision with root package name */
    protected TextView f15322l2;

    /* renamed from: m2  reason: collision with root package name */
    private boolean f15323m2;

    /* renamed from: n2  reason: collision with root package name */
    private BroadcastReceiver f15324n2;

    /* renamed from: o2  reason: collision with root package name */
    SimpleDraweeView f15325o2;

    /* renamed from: p2  reason: collision with root package name */
    View f15326p2;

    /* renamed from: q2  reason: collision with root package name */
    View f15327q2;

    /* renamed from: r2  reason: collision with root package name */
    TextView f15328r2;

    /* renamed from: s2  reason: collision with root package name */
    int f15329s2;

    /* renamed from: t2  reason: collision with root package name */
    long f15330t2;

    /* renamed from: u2  reason: collision with root package name */
    public ImageView f15331u2;
    protected ImageView v2;

    /* renamed from: w2  reason: collision with root package name */
    protected boolean f15332w2;

    /* renamed from: x2  reason: collision with root package name */
    private boolean f15333x2;
    private Handler y2;

    /* renamed from: z2  reason: collision with root package name */
    o f15334z2;

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    int intExtra = (intent.getIntExtra(SimulatorExitPlayActivity_.O, 0) * 100) / intent.getIntExtra("scale", 100);
                    if (intExtra < 15) {
                        StandardVideoViewJC.this.U1.setBackgroundResource(R.drawable.jc_battery_level_10);
                    } else if (intExtra >= 15 && intExtra < 40) {
                        StandardVideoViewJC.this.U1.setBackgroundResource(R.drawable.jc_battery_level_30);
                    } else if (intExtra >= 40 && intExtra < 60) {
                        StandardVideoViewJC.this.U1.setBackgroundResource(R.drawable.jc_battery_level_50);
                    } else if (intExtra >= 60 && intExtra < 80) {
                        StandardVideoViewJC.this.U1.setBackgroundResource(R.drawable.jc_battery_level_70);
                    } else if (intExtra >= 80 && intExtra < 95) {
                        StandardVideoViewJC.this.U1.setBackgroundResource(R.drawable.jc_battery_level_90);
                    } else if (intExtra >= 95 && intExtra <= 100) {
                        StandardVideoViewJC.this.U1.setBackgroundResource(R.drawable.jc_battery_level_100);
                    }
                    StandardVideoViewJC.this.getContext().unregisterReceiver(StandardVideoViewJC.this.f15324n2);
                    StandardVideoViewJC.this.f15323m2 = false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StandardVideoViewJC.this.f69018i.performClick();
            StandardVideoViewJC.this.f15327q2.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            StandardVideoViewJC.this.j0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15338b;

        d(int i4) {
            this.f15338b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f15338b == -1) {
                if (StandardVideoViewJC.this.getContext() instanceof Activity) {
                    StandardVideoViewJC standardVideoViewJC = StandardVideoViewJC.this;
                    if (standardVideoViewJC.f15332w2) {
                        ((Activity) standardVideoViewJC.getContext()).finish();
                    }
                }
            } else {
                StandardVideoViewJC.this.S();
            }
            StandardVideoViewJC.this.f15334z2.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15340b;

        e(int i4) {
            this.f15340b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f15340b == 0 && (StandardVideoViewJC.this.getContext() instanceof Activity)) {
                StandardVideoViewJC standardVideoViewJC = StandardVideoViewJC.this;
                if (standardVideoViewJC.f15332w2) {
                    ((Activity) standardVideoViewJC.getContext()).finish();
                }
            }
            StandardVideoViewJC.this.f15334z2.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends TimerTask {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                StandardVideoViewJC.this.f69025p.setVisibility(4);
                StandardVideoViewJC.this.f69024o.setVisibility(4);
                StandardVideoViewJC.this.f69018i.setVisibility(4);
                PopupWindow popupWindow = StandardVideoViewJC.this.Y1;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                StandardVideoViewJC standardVideoViewJC = StandardVideoViewJC.this;
                if (standardVideoViewJC.f69013d != 3) {
                    standardVideoViewJC.O1.setVisibility(0);
                }
                StandardVideoViewJC.this.q0(4);
            }
        }

        public f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            StandardVideoViewJC standardVideoViewJC = StandardVideoViewJC.this;
            int i4 = standardVideoViewJC.f69012c;
            if (i4 == 0 || i4 == 7 || i4 == 6 || standardVideoViewJC.getContext() == null || !(StandardVideoViewJC.this.getContext() instanceof Activity)) {
                return;
            }
            ((Activity) StandardVideoViewJC.this.getContext()).runOnUiThread(new a());
        }
    }

    public StandardVideoViewJC(Context context) {
        super(context);
        this.f15323m2 = false;
        this.f15324n2 = new a();
        this.f15332w2 = false;
        this.f15333x2 = false;
        this.y2 = new c();
        this.A2 = 13;
        this.B2 = "";
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void A() {
        super.A();
        j0();
        r0();
        if (this.f15333x2) {
            w0.e("JieCaoVideoPlayer,setUiWitStateAndScreen--> currentState=3");
            setMute(true);
            this.f15333x2 = false;
            return;
        }
        w0.e("JieCaoVideoPlayer,setUiWitStateAndScreen--> currentState=3, mute=" + D2);
        setMute(D2);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void B() {
        super.B();
        l0();
        r0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void C(int i4, int i5) {
        super.C(i4, i5);
        this.P1.setVisibility(0);
        this.f69018i.setVisibility(4);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void D() {
        super.D();
        setAllControlsVisible(0, 4, 4, 4, 4, 4, 0);
        r0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void J() {
        super.J();
        this.O1.setProgress(0);
        this.O1.setSecondaryProgress(0);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void K(int i4) {
        super.K(i4);
        if (this.f15320j2 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jc_dialog_brightness, (ViewGroup) null);
            this.f15322l2 = (TextView) inflate.findViewById(R.id.tv_brightness);
            this.f15321k2 = (ProgressBar) inflate.findViewById(R.id.brightness_progressbar);
            this.f15320j2 = m0(inflate);
        }
        if (!this.f15320j2.isShowing()) {
            this.f15320j2.show();
        }
        if (i4 > 100) {
            i4 = 100;
        } else if (i4 < 0) {
            i4 = 0;
        }
        TextView textView = this.f15322l2;
        textView.setText(i4 + "%");
        this.f15321k2.setProgress(i4);
        o0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void L(float f5, String str, int i4, String str2, int i5) {
        super.L(f5, str, i4, str2, i5);
        if (this.f15311a2 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jc_dialog_progress, (ViewGroup) null);
            this.f15312b2 = (ProgressBar) inflate.findViewById(R.id.duration_progressbar);
            this.f15313c2 = (TextView) inflate.findViewById(R.id.tv_current);
            this.f15314d2 = (TextView) inflate.findViewById(R.id.tv_duration);
            this.f15315e2 = (ImageView) inflate.findViewById(R.id.duration_image_tip);
            this.f15311a2 = m0(inflate);
        }
        if (!this.f15311a2.isShowing()) {
            this.f15311a2.show();
        }
        this.f15313c2.setText(str);
        TextView textView = this.f15314d2;
        textView.setText(" / " + str2);
        this.f15312b2.setProgress(i5 <= 0 ? 0 : (i4 * 100) / i5);
        if (f5 > 0.0f) {
            this.f15315e2.setBackgroundResource(R.drawable.jc_forward_icon);
        } else {
            this.f15315e2.setBackgroundResource(R.drawable.jc_backward_icon);
        }
        o0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void N(float f5, int i4) {
        super.N(f5, i4);
        if (this.f15316f2 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jc_dialog_volume, (ViewGroup) null);
            this.f15319i2 = (ImageView) inflate.findViewById(R.id.volume_image_tip);
            this.f15318h2 = (TextView) inflate.findViewById(R.id.tv_volume);
            this.f15317g2 = (ProgressBar) inflate.findViewById(R.id.volume_progressbar);
            this.f15316f2 = m0(inflate);
        }
        if (!this.f15316f2.isShowing()) {
            this.f15316f2.show();
        }
        if (i4 <= 0) {
            this.f15319i2.setBackgroundResource(R.drawable.jc_close_volume);
        } else {
            this.f15319i2.setBackgroundResource(R.drawable.jc_add_volume);
        }
        if (i4 > 100) {
            i4 = 100;
        } else if (i4 < 0) {
            i4 = 0;
        }
        TextView textView = this.f15318h2;
        textView.setText(i4 + "%");
        this.f15317g2.setProgress(i4);
        o0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void O(int i4) {
        String string;
        String str;
        o oVar;
        if (this.f69012c == 3) {
            s(3);
            fm.jiecao.jcvideoplayer_lib.b.b().f69076b.pause();
            y();
        }
        if (this.f15334z2 == null) {
            o oVar2 = new o(getContext(), R.style.MyDialog);
            this.f15334z2 = oVar2;
            oVar2.setContentView(R.layout.bind_dialog);
        }
        Button button = (Button) this.f15334z2.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) this.f15334z2.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.f15334z2.findViewById(R.id.tip_title);
        View findViewById = this.f15334z2.findViewById(R.id.divider);
        TextView textView2 = (TextView) this.f15334z2.findViewById(R.id.dialog_content);
        TextView textView3 = (TextView) this.f15334z2.findViewById(R.id.dialog_desci);
        getResources().getString(R.string.tips_not_wifi_confirm);
        getResources().getString(R.string.tips_not_wifi_cancel);
        getResources().getString(R.string.tips_not_wifi);
        int b5 = g1.b(getContext());
        if (b5 == 0) {
            findViewById.setVisibility(0);
            button.setVisibility(0);
        } else if (b5 != 1) {
            findViewById.setVisibility(8);
            button.setVisibility(8);
            string = getResources().getString(R.string.network_conn_failed);
            str = "关闭";
            textView.setText("网络提示");
            textView2.setText(string);
            textView3.setVisibility(8);
            button2.setText(str);
            button.setText("取消");
            button2.setOnClickListener(new d(b5));
            button.setOnClickListener(new e(b5));
            oVar = this.f15334z2;
            if (oVar != null || oVar.isShowing()) {
            }
            this.f15334z2.show();
            return;
        }
        str = "继续观看";
        string = "您已切换到数据网络，是否继续观看视频？";
        textView.setText("网络提示");
        textView2.setText(string);
        textView3.setVisibility(8);
        button2.setText(str);
        button.setText("取消");
        button2.setOnClickListener(new d(b5));
        button.setOnClickListener(new e(b5));
        oVar = this.f15334z2;
        if (oVar != null) {
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void T() {
        super.T();
        if (this.f69025p.getVisibility() == 0) {
            i0();
        }
    }

    public boolean X() {
        int e5 = com.join.mgps.pref.h.n(getContext()).e();
        return e5 != 1 ? e5 != 2 : l.i(getContext());
    }

    public void Y() {
        Timer timer = C2;
        if (timer != null) {
            timer.cancel();
        }
        f fVar = this.Z1;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public void Z(int i4) {
        ViewGroup.LayoutParams layoutParams = this.f69018i.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i4;
        ViewGroup.LayoutParams layoutParams2 = this.P1.getLayoutParams();
        layoutParams2.height = i4;
        layoutParams2.width = i4;
    }

    public void a0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 0, 4, 0, 4, 4);
            s0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 4, 0, 4, 0, 4, 4);
            s0();
        }
    }

    public void b0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 0, 4, 0, 4, 4);
            s0();
        } else if (i4 == 2) {
            setAllControlsVisible(0, 0, 0, 4, 0, 4, 4);
            s0();
        }
        this.f15326p2.setVisibility(4);
    }

    public void c0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 0, 4, 4, 0, 4);
            s0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 0, 4, 4, 0, 4);
            s0();
        }
    }

    public void d0() {
        r0();
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 0, 4, 0, 0, 4);
            s0();
        } else if (i4 == 2) {
            setAllControlsVisible(0, 4, 0, 4, 0, 0, 4);
            s0();
        }
        this.f15327q2.setVisibility(4);
        this.f15326p2.setVisibility(4);
    }

    public void e0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 4);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 4);
        }
    }

    public void f0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            s0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            s0();
        }
    }

    public void g0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 4, 0, 4, 4, 0);
            s0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 4, 0, 4, 4, 0);
            s0();
        }
    }

    public String getCurrentUrl() {
        try {
            return this.B2;
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public int getLayoutId() {
        return R.layout.standard_video_view;
    }

    public void h0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 4, 0, 4, 4, 4);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 0, 4, 0, 4, 4, 4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void i() {
        super.i();
        Dialog dialog = this.f15320j2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void i0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 0);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 0);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void j() {
        super.j();
        Dialog dialog = this.f15311a2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void j0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            s0();
            this.f15326p2.setVisibility(0);
            this.R1.setVisibility(8);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 4, 4, 4, 4, 4, 4);
            s0();
            this.f15326p2.setVisibility(4);
            this.f69018i.setVisibility(4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void k() {
        super.k();
        Dialog dialog = this.f15316f2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void k0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 4, 0, 0, 0, 4);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 4, 4, 0, 0, 0, 4);
        }
    }

    public void l0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 4, 0, 0, 0, 4);
        } else if (i4 == 2) {
            setAllControlsVisible(0, 4, 4, 0, 0, 0, 4);
        }
        this.f15327q2.setVisibility(4);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void m(Context context) {
        super.m(context);
        JCVideoPlayer.M = 6;
        this.T1 = (LinearLayout) findViewById(R.id.battery_time_layout);
        this.O1 = (ProgressBar) findViewById(R.id.bottom_progress);
        this.Q1 = (TextView) findViewById(R.id.title);
        this.N1 = (ImageView) findViewById(R.id.back);
        this.R1 = (SimpleDraweeView) findViewById(R.id.thumb);
        this.P1 = (ProgressBar) findViewById(R.id.loading);
        this.S1 = (ImageView) findViewById(R.id.back_tiny);
        this.U1 = (ImageView) findViewById(R.id.battery_level);
        this.V1 = (TextView) findViewById(R.id.video_current_time);
        this.W1 = (TextView) findViewById(R.id.retry_text);
        this.X1 = (TextView) findViewById(R.id.clarity);
        this.f15325o2 = (SimpleDraweeView) findViewById(R.id.loadingM);
        this.f15328r2 = (TextView) findViewById(R.id.progressTextShow);
        JCVideoPlayer.P = true;
        ((EqualizerView) findViewById(R.id.equalizer_view)).a();
        this.f15326p2 = findViewById(R.id.layout_bottom2);
        View findViewById = findViewById(R.id.playFinishCover);
        this.f15327q2 = findViewById;
        findViewById.setOnClickListener(new b());
        MyImageLoader.m(this.f15325o2, Uri.parse("res:///2131234668"));
        SimpleDraweeView simpleDraweeView = this.R1;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(this);
        }
        ImageView imageView = this.N1;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.S1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        TextView textView = this.X1;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        n0();
    }

    public Dialog m0(View view) {
        Dialog dialog = new Dialog(getContext(), R.style.jc_style_dialog_progress);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        window.addFlags(8);
        window.addFlags(32);
        window.addFlags(16);
        window.setLayout(-2, -2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        window.setAttributes(attributes);
        return dialog;
    }

    void n0() {
        this.f15331u2 = (ImageView) findViewById(R.id.mute);
        this.v2 = (ImageView) findViewById(R.id.autoPlay);
        this.f15331u2.setOnClickListener(this);
        this.v2.setOnClickListener(this);
        setMuteView(D2);
        this.v2.setSelected(com.join.mgps.pref.h.n(getContext()).a());
    }

    public void o0() {
        int i4 = this.f69012c;
        if (i4 == 1) {
            if (this.f69025p.getVisibility() == 0) {
                k0();
            }
        } else if (i4 == 3) {
            if (this.f69025p.getVisibility() == 0) {
                i0();
            }
        } else if (i4 == 5) {
            if (this.f69025p.getVisibility() == 0) {
                e0();
            }
        } else if (i4 == 6) {
            if (this.f69025p.getVisibility() == 0) {
                a0();
            }
        } else if (i4 == 4 && this.f69025p.getVisibility() == 0) {
            g0();
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.fullscreen) {
            if (Build.VERSION.SDK_INT <= 19) {
                return;
            }
            int i4 = this.f69013d;
            int i5 = i4 == 2 ? 8 : 10;
            fm.jiecao.jcvideoplayer_lib.c cVar = JCVideoPlayer.I1;
            if (cVar != null) {
                cVar.a(i5, this.B2, i4, this.f69016g);
            }
        } else if (id == R.id.autoPlay) {
            boolean z4 = !this.v2.isSelected();
            this.v2.setSelected(z4);
            com.join.mgps.pref.h.n(getContext()).P(z4);
            l2.a(getContext()).b(z4 ? "已开启WiFi下自动播放" : "已关闭WiFi下自动播放");
        }
        super.onClick(view);
        if (id == R.id.thumb) {
            if (TextUtils.isEmpty(getCurrentUrl())) {
                Toast.makeText(getContext(), getResources().getString(R.string.no_url), 0).show();
                return;
            }
            int i6 = this.f69012c;
            if (i6 == 0) {
                s(101);
                S();
            } else if (i6 == 6) {
                p0();
            } else if (i6 == 1) {
                this.R1.setVisibility(4);
                this.f69020k.performClick();
            }
        } else if (id == R.id.surface_container) {
            r0();
        } else if (id == R.id.back) {
            int i7 = this.f69013d;
            int i8 = i7 != 2 ? 10 : 8;
            fm.jiecao.jcvideoplayer_lib.c cVar2 = JCVideoPlayer.I1;
            if (cVar2 != null) {
                cVar2.a(i8, this.B2, i7, this.f69016g);
            }
            JCVideoPlayer.d();
        } else if (id == R.id.back_tiny) {
            fm.jiecao.jcvideoplayer_lib.c cVar3 = JCVideoPlayer.I1;
            if (cVar3 != null) {
                cVar3.a(10, this.B2, this.f69013d, this.f69016g);
            }
            JCVideoPlayer.d();
        } else if (id != R.id.clarity && id == R.id.mute) {
            w0.e("JieCaoVideoPlayer,onClick-mute--> mute=" + D2);
            setMute(D2 ^ true);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        super.onStartTrackingTouch(seekBar);
        Y();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        r0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int id = view.getId();
        if (id == R.id.surface_container) {
            if (motionEvent.getAction() == 1) {
                r0();
                if (this.f69035z) {
                    int duration = getDuration();
                    this.O1.setProgress((this.E * 100) / (duration != 0 ? duration : 1));
                }
                if (!this.f69035z && !this.f69034y) {
                    s(102);
                    p0();
                }
            }
        } else if (id == R.id.bottom_seek_progress) {
            int action = motionEvent.getAction();
            if (action == 0) {
                Y();
            } else if (action == 1) {
                r0();
            }
        }
        return super.onTouch(view, motionEvent);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void p() {
        super.p();
        Y();
    }

    public void p0() {
        this.f69025p.getVisibility();
        int i4 = this.f69012c;
        if (i4 == 1) {
            if (this.f69025p.getVisibility() == 0) {
                k0();
                return;
            }
            l0();
            setSystemTimeAndBattery();
        } else if (i4 != 3) {
            if (i4 == 5) {
                if (this.f69025p.getVisibility() == 0) {
                    e0();
                } else {
                    f0();
                }
            } else if (i4 == 4) {
                if (this.f69025p.getVisibility() == 0) {
                    g0();
                } else {
                    h0();
                }
            }
        } else if (this.f69025p.getVisibility() == 0) {
            i0();
        } else {
            int i5 = this.f69013d;
            if (i5 == 0 || i5 == 1) {
                this.f69020k.performClick();
            } else if (i5 != 2) {
            } else {
                setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
                s0();
                this.f15326p2.setVisibility(4);
            }
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void q() {
        super.q();
        Y();
        PopupWindow popupWindow = this.Y1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public void q0(int i4) {
        if (JCVideoPlayer.I1 == null || !o()) {
            return;
        }
        JCVideoPlayer.I1.a(13, this.B2, this.f69013d, Integer.valueOf(i4));
    }

    public void r0() {
        Y();
        C2 = new Timer();
        f fVar = new f();
        this.Z1 = fVar;
        C2.schedule(fVar, 2500L);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void s(int i4) {
        super.s(i4);
        if (i4 != 4) {
            if (i4 != 10) {
                if (i4 == 7) {
                    w0.e("JieCaoVideoPlayer,onEvent-ON_ENTER_FULLSCREEN--> mute=" + D2);
                    E2 = D2;
                    setMute(false);
                    return;
                } else if (i4 != 8) {
                    return;
                }
            }
            w0.e("JieCaoVideoPlayer,onEvent-ON_QUIT_FULLSCREEN--> mute=" + D2);
            setMute(E2);
            if (this.f69012c == 3) {
                this.R1.setVisibility(8);
            }
        } else if (this.f15333x2) {
            w0.e("JieCaoVideoPlayer,onEvent-ON_CLICK_RESUME--> mute=" + D2);
            setMute(true);
            this.f15333x2 = false;
        }
    }

    public void s0() {
        int i4 = this.f69012c;
        if (i4 != 3 && i4 != 7 && i4 == 6) {
            this.f69018i.setVisibility(4);
            this.f15327q2.setVisibility(0);
        }
        ImageView imageView = this.f69018i;
        int i5 = this.f69012c;
        if (i5 == 3) {
            imageView.setImageResource(R.drawable.video_pause_normal_video);
        } else if (i5 == 7) {
            imageView.setImageResource(R.drawable.video_click_error_selector);
        } else {
            imageView.setImageResource(R.drawable.video_play_normal_video);
        }
        int i6 = this.f69013d;
        if (i6 == 0 || i6 == 1) {
            this.f69018i.setVisibility(4);
        } else if (i6 != 2) {
        } else {
            this.f69018i.setVisibility(0);
        }
    }

    public void setAllControlsVisible(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if (!this.f69011b && (i11 = this.f69013d) != 2 && i11 != 3) {
            i8 = 0;
        }
        this.f69024o.setVisibility(i4);
        this.f69025p.setVisibility(i5);
        this.f69018i.setVisibility(i6);
        this.P1.setVisibility(4);
        this.f15325o2.setVisibility(i7);
        this.R1.setVisibility(i8);
        if (this.f69013d == 2) {
            this.f69025p.setVisibility(i5);
        } else {
            this.f69025p.setVisibility(4);
        }
        q0(i5);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setBufferProgress(int i4) {
        super.setBufferProgress(i4);
        if (i4 != 0) {
            this.O1.setSecondaryProgress(i4);
        }
    }

    public void setMute(boolean z4) {
        w0.e("JieCaoVideoPlayer,setMute--> mute=" + z4);
        setMuteOnly(z4);
        StandardVideoView.E = z4;
        D2 = z4;
    }

    public void setMuteOnly(boolean z4) {
        w0.e("JieCaoVideoPlayer,setMuteOnly--> mute=" + z4);
        try {
            fm.jiecao.jcvideoplayer_lib.b.b().f69076b.setAudioStreamType(3);
            if (z4) {
                fm.jiecao.jcvideoplayer_lib.b.b().f69076b.setVolume(0.0f, 0.0f);
            } else {
                fm.jiecao.jcvideoplayer_lib.b.b().f69076b.setVolume(1.0f, 1.0f);
            }
            setMuteView(z4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setMuteView(boolean z4) {
        if (z4) {
            this.f15331u2.setImageResource(R.drawable.mute_off);
        } else {
            this.f15331u2.setImageResource(R.drawable.mute_on);
        }
    }

    public void setMuteWhenPlay(boolean z4) {
        this.f15333x2 = z4;
    }

    public void setNoneNetFinishActivity(boolean z4) {
        this.f15332w2 = z4;
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setProgressAndText(int i4, int i5, int i6) {
        super.setProgressAndText(i4, i5, i6);
        if (i4 != 0) {
            this.O1.setProgress(i4);
        }
        this.f15329s2 = i5;
        if (i5 > 0) {
            this.f15330t2 = i6 - i5;
            this.f15328r2.setText(com.papa.gsyvideoplayer.utils.b.r(i6 - i5));
        }
    }

    public void setSystemTimeAndBattery() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        TextView textView = this.V1;
        if (textView != null) {
            textView.setText(simpleDateFormat.format(date));
        }
        if (this.f15323m2) {
            return;
        }
        getContext().registerReceiver(this.f15324n2, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setUp(String str, int i4, Object... objArr) {
        this.B2 = str;
        super.setUp(str, i4, objArr);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void v() {
        super.v();
        a0();
        Y();
        this.O1.setProgress(100);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void w() {
        super.w();
        c0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void x() {
        super.x();
        d0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void y() {
        super.y();
        f0();
        Y();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void z() {
        super.z();
        h0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setUp(LinkedHashMap linkedHashMap, int i4, int i5, Object... objArr) {
        super.setUp(linkedHashMap, i4, i5, objArr);
        if (objArr.length == 0) {
            return;
        }
        this.Q1.setText(objArr[0].toString());
        int i6 = this.f69013d;
        if (i6 == 2) {
            this.f69020k.setImageResource(R.drawable.mediacontroller_fullscreen_out);
            this.N1.setVisibility(0);
            this.S1.setVisibility(4);
            LinearLayout linearLayout = this.T1;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (this.X1 != null) {
                if (linkedHashMap.size() == 1) {
                    this.X1.setVisibility(8);
                } else {
                    this.X1.setText(getCurrentUrl());
                    this.X1.setVisibility(0);
                }
            }
            Z((int) getResources().getDimension(R.dimen.jc_start_button_w_h_fullscreen));
        } else if (i6 == 0 || i6 == 1) {
            this.f69020k.setImageResource(R.drawable.mediacontroller_fullscreen_in);
            this.N1.setVisibility(8);
            this.S1.setVisibility(4);
            Z((int) getResources().getDimension(R.dimen.jc_start_button_w_h_normal));
            LinearLayout linearLayout2 = this.T1;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            TextView textView = this.X1;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (i6 == 3) {
            this.S1.setVisibility(0);
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 4);
            LinearLayout linearLayout3 = this.T1;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            TextView textView2 = this.X1;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setSystemTimeAndBattery();
    }

    public StandardVideoViewJC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15323m2 = false;
        this.f15324n2 = new a();
        this.f15332w2 = false;
        this.f15333x2 = false;
        this.y2 = new c();
        this.A2 = 13;
        this.B2 = "";
    }
}
