package com.join.mgps.dialog;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dialog.f2;
/* compiled from: SimulatorNotifyDialog.java */
/* loaded from: classes4.dex */
public class f2 extends p implements View.OnClickListener {

    /* renamed from: k  reason: collision with root package name */
    private TextView f49395k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f49396l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f49397m;

    /* renamed from: n  reason: collision with root package name */
    private Button f49398n;

    /* renamed from: o  reason: collision with root package name */
    private CheckBox f49399o;

    /* renamed from: p  reason: collision with root package name */
    private b f49400p;

    /* renamed from: q  reason: collision with root package name */
    private CountDownTimer f49401q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f49402r;

    /* renamed from: s  reason: collision with root package name */
    private Handler f49403s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimulatorNotifyDialog.java */
    /* loaded from: classes4.dex */
    public class a extends CountDownTimer {
        a(long j4, long j5) {
            super(j4, j5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            f2.this.f49398n.setEnabled(true);
            f2.this.f49398n.setText("开始挑战");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (f2.this.f49402r) {
                return;
            }
            f2.this.f49403s.postDelayed(new Runnable() { // from class: com.join.mgps.dialog.e2
                @Override // java.lang.Runnable
                public final void run() {
                    f2.a.this.b();
                }
            }, 200L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            Button button = f2.this.f49398n;
            button.setText("开始挑战（" + (j4 / 1000) + "）");
        }
    }

    /* compiled from: SimulatorNotifyDialog.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(boolean z4);

        void onClose();

        void onConfirm();
    }

    public f2(@NonNull Context context) {
        this(context, R.style.Dialog);
    }

    private void q() {
        this.f49395k = (TextView) findViewById(R.id.tv_title);
        this.f49396l = (TextView) findViewById(R.id.tv_content);
        this.f49397m = (ImageView) findViewById(R.id.iv_close);
        this.f49398n = (Button) findViewById(R.id.btn_ok);
        this.f49399o = (CheckBox) findViewById(R.id.chk_notify);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(CompoundButton compoundButton, boolean z4) {
        b bVar = this.f49400p;
        if (bVar != null) {
            bVar.a(z4);
        }
    }

    private void t() {
        this.f49398n.setOnClickListener(this);
        this.f49397m.setOnClickListener(this);
        this.f49399o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.join.mgps.dialog.d2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                f2.this.r(compoundButton, z4);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_ok) {
            dismiss();
            b bVar = this.f49400p;
            if (bVar != null) {
                bVar.onConfirm();
            }
        } else if (view.getId() == R.id.iv_close) {
            this.f49402r = true;
            b bVar2 = this.f49400p;
            if (bVar2 != null) {
                bVar2.onClose();
            }
            CountDownTimer countDownTimer = this.f49401q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            dismiss();
        }
    }

    public f2 s(CharSequence charSequence) {
        this.f49398n.setText(charSequence);
        return this;
    }

    @Override // com.join.mgps.dialog.p, android.app.Dialog
    public void show() {
        super.show();
        this.f49398n.setEnabled(false);
        if (this.f49401q == null) {
            a aVar = new a(5000L, 1000L);
            this.f49401q = aVar;
            aVar.start();
        }
    }

    public void u(b bVar) {
        this.f49400p = bVar;
    }

    public f2 v(CharSequence charSequence) {
        this.f49396l.setText(charSequence);
        return this;
    }

    public f2 w(CharSequence charSequence) {
        this.f49395k.setText(charSequence);
        return this;
    }

    public f2(@NonNull Context context, int i4) {
        super(context, i4);
        this.f49402r = false;
        setContentView(R.layout.dialog_simulator_notify);
        g(false);
        this.f49403s = new Handler();
        q();
        t();
    }
}
