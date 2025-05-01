package fm.jiecao.jcvideoplayer_lib;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes6.dex */
public class JCVideoPlayerStandard extends JCVideoPlayer {

    /* renamed from: o2  reason: collision with root package name */
    protected static Timer f69038o2;
    public ImageView N1;
    public ProgressBar O1;
    public ProgressBar P1;
    public TextView Q1;
    public ImageView R1;
    public ImageView S1;
    public LinearLayout T1;
    public ImageView U1;
    public TextView V1;
    public TextView W1;
    public TextView X1;
    public PopupWindow Y1;
    protected f Z1;

    /* renamed from: a2  reason: collision with root package name */
    private boolean f69039a2;

    /* renamed from: b2  reason: collision with root package name */
    private BroadcastReceiver f69040b2;

    /* renamed from: c2  reason: collision with root package name */
    protected Dialog f69041c2;

    /* renamed from: d2  reason: collision with root package name */
    protected ProgressBar f69042d2;

    /* renamed from: e2  reason: collision with root package name */
    protected TextView f69043e2;

    /* renamed from: f2  reason: collision with root package name */
    protected TextView f69044f2;

    /* renamed from: g2  reason: collision with root package name */
    protected ImageView f69045g2;

    /* renamed from: h2  reason: collision with root package name */
    protected Dialog f69046h2;

    /* renamed from: i2  reason: collision with root package name */
    protected ProgressBar f69047i2;

    /* renamed from: j2  reason: collision with root package name */
    protected TextView f69048j2;

    /* renamed from: k2  reason: collision with root package name */
    protected ImageView f69049k2;

    /* renamed from: l2  reason: collision with root package name */
    protected Dialog f69050l2;

    /* renamed from: m2  reason: collision with root package name */
    protected ProgressBar f69051m2;

    /* renamed from: n2  reason: collision with root package name */
    protected TextView f69052n2;

    /* loaded from: classes6.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f69053b;

        a(LinearLayout linearLayout) {
            this.f69053b = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            JCVideoPlayerStandard jCVideoPlayerStandard = JCVideoPlayerStandard.this;
            jCVideoPlayerStandard.C(intValue, jCVideoPlayerStandard.getCurrentPositionWhenPlaying());
            JCVideoPlayerStandard jCVideoPlayerStandard2 = JCVideoPlayerStandard.this;
            jCVideoPlayerStandard2.X1.setText(fm.jiecao.jcvideoplayer_lib.e.e(jCVideoPlayerStandard2.F, jCVideoPlayerStandard2.G));
            for (int i4 = 0; i4 < this.f69053b.getChildCount(); i4++) {
                if (i4 == JCVideoPlayerStandard.this.G) {
                    ((TextView) this.f69053b.getChildAt(i4)).setTextColor(Color.parseColor("#fff85959"));
                } else {
                    ((TextView) this.f69053b.getChildAt(i4)).setTextColor(Color.parseColor("#ffffff"));
                }
            }
            PopupWindow popupWindow = JCVideoPlayerStandard.this.Y1;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            JCVideoPlayerStandard.this.s(101);
            JCVideoPlayerStandard.this.S();
            JCVideoPlayer.P = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            if (JCVideoPlayerStandard.this.f69013d == 2) {
                dialogInterface.dismiss();
                JCVideoPlayerStandard.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
            if (JCVideoPlayerStandard.this.f69013d == 2) {
                dialogInterface.dismiss();
                JCVideoPlayerStandard.this.g();
            }
        }
    }

    /* loaded from: classes6.dex */
    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = (intent.getIntExtra(SimulatorExitPlayActivity_.O, 0) * 100) / intent.getIntExtra("scale", 100);
                if (intExtra < 15) {
                    JCVideoPlayerStandard.this.U1.setBackgroundResource(R.drawable.jc_battery_level_10);
                } else if (intExtra >= 15 && intExtra < 40) {
                    JCVideoPlayerStandard.this.U1.setBackgroundResource(R.drawable.jc_battery_level_30);
                } else if (intExtra >= 40 && intExtra < 60) {
                    JCVideoPlayerStandard.this.U1.setBackgroundResource(R.drawable.jc_battery_level_50);
                } else if (intExtra >= 60 && intExtra < 80) {
                    JCVideoPlayerStandard.this.U1.setBackgroundResource(R.drawable.jc_battery_level_70);
                } else if (intExtra >= 80 && intExtra < 95) {
                    JCVideoPlayerStandard.this.U1.setBackgroundResource(R.drawable.jc_battery_level_90);
                } else if (intExtra >= 95 && intExtra <= 100) {
                    JCVideoPlayerStandard.this.U1.setBackgroundResource(R.drawable.jc_battery_level_100);
                }
                JCVideoPlayerStandard.this.getContext().unregisterReceiver(JCVideoPlayerStandard.this.f69040b2);
                JCVideoPlayerStandard.this.f69039a2 = false;
            }
        }
    }

    /* loaded from: classes6.dex */
    public class f extends TimerTask {

        /* loaded from: classes6.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                JCVideoPlayerStandard.this.f69025p.setVisibility(4);
                JCVideoPlayerStandard.this.f69024o.setVisibility(4);
                JCVideoPlayerStandard.this.f69018i.setVisibility(4);
                PopupWindow popupWindow = JCVideoPlayerStandard.this.Y1;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                JCVideoPlayerStandard jCVideoPlayerStandard = JCVideoPlayerStandard.this;
                if (jCVideoPlayerStandard.f69013d != 3) {
                    jCVideoPlayerStandard.O1.setVisibility(0);
                }
            }
        }

        public f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            JCVideoPlayerStandard jCVideoPlayerStandard = JCVideoPlayerStandard.this;
            int i4 = jCVideoPlayerStandard.f69012c;
            if (i4 == 0 || i4 == 7 || i4 == 6 || jCVideoPlayerStandard.getContext() == null || !(JCVideoPlayerStandard.this.getContext() instanceof Activity)) {
                return;
            }
            ((Activity) JCVideoPlayerStandard.this.getContext()).runOnUiThread(new a());
        }
    }

    public JCVideoPlayerStandard(Context context) {
        super(context);
        this.f69039a2 = false;
        this.f69040b2 = new e();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void A() {
        super.A();
        i0();
        o0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void B() {
        super.B();
        k0();
        o0();
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
        o0();
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
        if (this.f69050l2 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jc_dialog_brightness, (ViewGroup) null);
            this.f69052n2 = (TextView) inflate.findViewById(R.id.tv_brightness);
            this.f69051m2 = (ProgressBar) inflate.findViewById(R.id.brightness_progressbar);
            this.f69050l2 = l0(inflate);
        }
        if (!this.f69050l2.isShowing()) {
            this.f69050l2.show();
        }
        if (i4 > 100) {
            i4 = 100;
        } else if (i4 < 0) {
            i4 = 0;
        }
        TextView textView = this.f69052n2;
        textView.setText(i4 + "%");
        this.f69051m2.setProgress(i4);
        m0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void L(float f5, String str, int i4, String str2, int i5) {
        super.L(f5, str, i4, str2, i5);
        if (this.f69041c2 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jc_dialog_progress, (ViewGroup) null);
            this.f69042d2 = (ProgressBar) inflate.findViewById(R.id.duration_progressbar);
            this.f69043e2 = (TextView) inflate.findViewById(R.id.tv_current);
            this.f69044f2 = (TextView) inflate.findViewById(R.id.tv_duration);
            this.f69045g2 = (ImageView) inflate.findViewById(R.id.duration_image_tip);
            this.f69041c2 = l0(inflate);
        }
        if (!this.f69041c2.isShowing()) {
            this.f69041c2.show();
        }
        this.f69043e2.setText(str);
        TextView textView = this.f69044f2;
        textView.setText(" / " + str2);
        this.f69042d2.setProgress(i5 <= 0 ? 0 : (i4 * 100) / i5);
        if (f5 > 0.0f) {
            this.f69045g2.setBackgroundResource(R.drawable.jc_forward_icon);
        } else {
            this.f69045g2.setBackgroundResource(R.drawable.jc_backward_icon);
        }
        m0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void N(float f5, int i4) {
        super.N(f5, i4);
        if (this.f69046h2 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.jc_dialog_volume, (ViewGroup) null);
            this.f69049k2 = (ImageView) inflate.findViewById(R.id.volume_image_tip);
            this.f69048j2 = (TextView) inflate.findViewById(R.id.tv_volume);
            this.f69047i2 = (ProgressBar) inflate.findViewById(R.id.volume_progressbar);
            this.f69046h2 = l0(inflate);
        }
        if (!this.f69046h2.isShowing()) {
            this.f69046h2.show();
        }
        if (i4 <= 0) {
            this.f69049k2.setBackgroundResource(R.drawable.jc_close_volume);
        } else {
            this.f69049k2.setBackgroundResource(R.drawable.jc_add_volume);
        }
        if (i4 > 100) {
            i4 = 100;
        } else if (i4 < 0) {
            i4 = 0;
        }
        TextView textView = this.f69048j2;
        textView.setText(i4 + "%");
        this.f69047i2.setProgress(i4);
        m0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void O(int i4) {
        super.O(i4);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(getResources().getString(R.string.tips_not_wifi));
        builder.setPositiveButton(getResources().getString(R.string.tips_not_wifi_confirm), new b());
        builder.setNegativeButton(getResources().getString(R.string.tips_not_wifi_cancel), new c());
        builder.setOnCancelListener(new d());
        builder.create().show();
    }

    public void X() {
        Timer timer = f69038o2;
        if (timer != null) {
            timer.cancel();
        }
        f fVar = this.Z1;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public void Y(int i4) {
        ViewGroup.LayoutParams layoutParams = this.f69018i.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i4;
        ViewGroup.LayoutParams layoutParams2 = this.P1.getLayoutParams();
        layoutParams2.height = i4;
        layoutParams2.width = i4;
    }

    public void Z() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 0, 4, 0, 4, 4);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 4, 0, 4, 0, 4, 4);
            p0();
        }
    }

    public void a0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 0, 4, 0, 4, 4);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 0, 0, 4, 0, 4, 4);
            p0();
        }
    }

    public void b0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 0, 4, 4, 0, 4);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 0, 4, 4, 0, 4);
            p0();
        }
    }

    public void c0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 0, 4, 0, 0, 4);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 4, 0, 4, 0, 0, 4);
            p0();
        }
    }

    public void d0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 4);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 4);
        }
    }

    public void e0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            p0();
        }
    }

    public void f0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 4, 0, 4, 4, 0);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 4, 0, 4, 4, 0);
            p0();
        }
    }

    public void g0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 4, 0, 4, 4, 4);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 0, 4, 0, 4, 4, 4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public int getLayoutId() {
        return R.layout.jc_layout_standard;
    }

    public void h0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 0);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 0);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void i() {
        super.i();
        Dialog dialog = this.f69050l2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void i0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            p0();
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 0, 0, 4, 4, 4, 4);
            p0();
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void j() {
        super.j();
        Dialog dialog = this.f69041c2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void j0() {
        int i4 = this.f69013d;
        if (i4 == 0 || i4 == 1) {
            setAllControlsVisible(0, 4, 4, 0, 0, 0, 4);
        } else if (i4 != 2) {
        } else {
            setAllControlsVisible(0, 4, 4, 0, 0, 0, 4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void k() {
        super.k();
        Dialog dialog = this.f69046h2;
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

    public Dialog l0(View view) {
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

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void m(Context context) {
        super.m(context);
        this.T1 = (LinearLayout) findViewById(R.id.battery_time_layout);
        this.O1 = (ProgressBar) findViewById(R.id.bottom_progress);
        this.Q1 = (TextView) findViewById(R.id.title);
        this.N1 = (ImageView) findViewById(R.id.back);
        this.R1 = (ImageView) findViewById(R.id.thumb);
        this.P1 = (ProgressBar) findViewById(R.id.loading);
        this.S1 = (ImageView) findViewById(R.id.back_tiny);
        this.U1 = (ImageView) findViewById(R.id.battery_level);
        this.V1 = (TextView) findViewById(R.id.video_current_time);
        this.W1 = (TextView) findViewById(R.id.retry_text);
        this.X1 = (TextView) findViewById(R.id.clarity);
        this.R1.setOnClickListener(this);
        this.N1.setOnClickListener(this);
        this.S1.setOnClickListener(this);
        this.X1.setOnClickListener(this);
    }

    public void m0() {
        int i4 = this.f69012c;
        if (i4 == 1) {
            if (this.f69025p.getVisibility() == 0) {
                j0();
            }
        } else if (i4 == 3) {
            if (this.f69025p.getVisibility() == 0) {
                h0();
            }
        } else if (i4 == 5) {
            if (this.f69025p.getVisibility() == 0) {
                d0();
            }
        } else if (i4 == 6) {
            if (this.f69025p.getVisibility() == 0) {
                Z();
            }
        } else if (i4 == 4 && this.f69025p.getVisibility() == 0) {
            f0();
        }
    }

    public void n0() {
        if (this.f69025p.getVisibility() != 0) {
            setSystemTimeAndBattery();
            this.X1.setText(fm.jiecao.jcvideoplayer_lib.e.e(this.F, this.G));
        }
        int i4 = this.f69012c;
        if (i4 == 1) {
            if (this.f69025p.getVisibility() == 0) {
                j0();
                return;
            }
            k0();
            setSystemTimeAndBattery();
        } else if (i4 == 3) {
            if (this.f69025p.getVisibility() == 0) {
                h0();
            } else {
                i0();
            }
        } else if (i4 == 5) {
            if (this.f69025p.getVisibility() == 0) {
                d0();
            } else {
                e0();
            }
        } else if (i4 == 4) {
            if (this.f69025p.getVisibility() == 0) {
                f0();
            } else {
                g0();
            }
        }
    }

    public void o0() {
        X();
        f69038o2 = new Timer();
        f fVar = new f();
        this.Z1 = fVar;
        f69038o2.schedule(fVar, 2500L);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (id == R.id.thumb) {
            if (TextUtils.isEmpty(fm.jiecao.jcvideoplayer_lib.e.d(this.F, this.G))) {
                Toast.makeText(getContext(), getResources().getString(R.string.no_url), 0).show();
                return;
            }
            int i4 = this.f69012c;
            if (i4 != 0) {
                if (i4 == 6) {
                    n0();
                }
            } else if (!fm.jiecao.jcvideoplayer_lib.e.d(this.F, this.G).startsWith(com.facebook.common.util.f.f10925c) && !fm.jiecao.jcvideoplayer_lib.e.d(this.F, this.G).startsWith(net.lingala.zip4j.util.e.F0) && !fm.jiecao.jcvideoplayer_lib.e.h(getContext()) && !JCVideoPlayer.P) {
                O(101);
            } else {
                s(101);
                S();
            }
        } else if (id == R.id.surface_container) {
            o0();
        } else if (id == R.id.back) {
            JCVideoPlayer.d();
        } else if (id == R.id.back_tiny) {
            JCVideoPlayer.d();
        } else if (id == R.id.clarity) {
            LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.jc_layout_clarity, (ViewGroup) null);
            a aVar = new a(linearLayout);
            for (int i5 = 0; i5 < this.F.size(); i5++) {
                String e5 = fm.jiecao.jcvideoplayer_lib.e.e(this.F, i5);
                TextView textView = (TextView) View.inflate(getContext(), R.layout.jc_layout_clarity_item, null);
                textView.setText(e5);
                textView.setTag(Integer.valueOf(i5));
                linearLayout.addView(textView, i5);
                textView.setOnClickListener(aVar);
                if (i5 == this.G) {
                    textView.setTextColor(Color.parseColor("#fff85959"));
                }
            }
            PopupWindow popupWindow = new PopupWindow((View) linearLayout, -2, -2, true);
            this.Y1 = popupWindow;
            popupWindow.setContentView(linearLayout);
            this.Y1.showAsDropDown(this.X1);
            linearLayout.measure(0, 0);
            this.Y1.update(this.X1, -40, 46, Math.round(linearLayout.getMeasuredWidth() * 2), linearLayout.getMeasuredHeight());
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        super.onStartTrackingTouch(seekBar);
        X();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        o0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int id = view.getId();
        if (id == R.id.surface_container) {
            if (motionEvent.getAction() == 1) {
                o0();
                if (this.f69035z) {
                    int duration = getDuration();
                    this.O1.setProgress((this.E * 100) / (duration != 0 ? duration : 1));
                }
                if (!this.f69035z && !this.f69034y) {
                    s(102);
                    n0();
                }
            }
        } else if (id == R.id.bottom_seek_progress) {
            int action = motionEvent.getAction();
            if (action == 0) {
                X();
            } else if (action == 1) {
                o0();
            }
        }
        return super.onTouch(view, motionEvent);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void p() {
        super.p();
        X();
    }

    public void p0() {
        int i4 = this.f69012c;
        if (i4 == 3) {
            this.f69018i.setImageResource(R.drawable.jc_click_pause_selector);
            this.W1.setVisibility(4);
        } else if (i4 == 7) {
            this.f69018i.setImageResource(R.drawable.jc_click_error_selector);
            this.W1.setVisibility(4);
        } else if (i4 == 6) {
            this.f69018i.setImageResource(R.drawable.jc_click_replay_selector);
            this.W1.setVisibility(0);
        } else {
            this.f69018i.setImageResource(R.drawable.jc_click_play_selector);
            this.W1.setVisibility(4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void q() {
        super.q();
        X();
        PopupWindow popupWindow = this.Y1;
        if (popupWindow != null) {
            popupWindow.dismiss();
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
        this.P1.setVisibility(i7);
        this.R1.setVisibility(i8);
        this.O1.setVisibility(i10);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setBufferProgress(int i4) {
        super.setBufferProgress(i4);
        if (i4 != 0) {
            this.O1.setSecondaryProgress(i4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setProgressAndText(int i4, int i5, int i6) {
        super.setProgressAndText(i4, i5, i6);
        if (i4 != 0) {
            this.O1.setProgress(i4);
        }
    }

    public void setSystemTimeAndBattery() {
        this.V1.setText(new SimpleDateFormat("HH:mm").format(new Date()));
        if (this.f69039a2) {
            return;
        }
        getContext().registerReceiver(this.f69040b2, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
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
            this.f69020k.setImageResource(R.drawable.jc_shrink);
            this.N1.setVisibility(0);
            this.S1.setVisibility(4);
            this.T1.setVisibility(0);
            if (linkedHashMap.size() == 1) {
                this.X1.setVisibility(8);
            } else {
                this.X1.setText(fm.jiecao.jcvideoplayer_lib.e.e(linkedHashMap, this.G));
                this.X1.setVisibility(0);
            }
            Y((int) getResources().getDimension(R.dimen.jc_start_button_w_h_fullscreen));
        } else if (i6 == 0 || i6 == 1) {
            this.f69020k.setImageResource(R.drawable.jc_enlarge);
            this.N1.setVisibility(8);
            this.S1.setVisibility(4);
            Y((int) getResources().getDimension(R.dimen.jc_start_button_w_h_normal));
            this.T1.setVisibility(8);
            this.X1.setVisibility(8);
        } else if (i6 == 3) {
            this.S1.setVisibility(0);
            setAllControlsVisible(4, 4, 4, 4, 4, 4, 4);
            this.T1.setVisibility(8);
            this.X1.setVisibility(8);
        }
        setSystemTimeAndBattery();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void v() {
        super.v();
        Z();
        X();
        this.O1.setProgress(100);
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void w() {
        super.w();
        b0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void x() {
        super.x();
        c0();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void y() {
        super.y();
        e0();
        X();
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void z() {
        super.z();
        g0();
    }

    public JCVideoPlayerStandard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69039a2 = false;
        this.f69040b2 = new e();
    }
}
