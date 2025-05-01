package com.join.mgps.dialog;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.Random;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.dialog_download_high_speed)
/* loaded from: classes4.dex */
public class DownloadHighSpeedDialog extends BaseFragmentActivity implements View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f49062b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f49063c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f49064d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f49065e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean h0(View view, MotionEvent motionEvent) {
        Rect rect = new Rect();
        View view2 = this.f49063c;
        if (view2 != null) {
            view2.getGlobalVisibleRect(rect);
        }
        rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        TextView textView = this.f49064d;
        textView.setText("本次下载预计可提速" + (new Random().nextInt(20) + 30) + "%");
        this.f49062b.setOnTouchListener(this);
        com.papa.sim.statistic.p.l(this).O1(Event.AccelerationPopup, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        com.join.mgps.Util.l2.a(this).b("已接入专属通道，加速成功！");
        p1.f.K().F(this.f49065e);
        UtilsMy.l4(this, this.f49065e);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.m(this.f49065e));
        com.papa.sim.statistic.p.l(this).O1(Event.DownloadAcceleration, new Ext());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: com.join.mgps.dialog.h0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean h02;
                h02 = DownloadHighSpeedDialog.this.h0(view, motionEvent);
                return h02;
            }
        });
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f49063c != null) {
            return motionEvent.getX() < ((float) this.f49063c.getLeft()) || motionEvent.getX() > this.f49063c.getX() + ((float) this.f49063c.getMeasuredWidth()) || motionEvent.getY() < ((float) this.f49063c.getTop()) || motionEvent.getY() > this.f49063c.getY() + ((float) this.f49063c.getMeasuredHeight());
        }
        return false;
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        com.join.mgps.Util.c2.o(this, 16777215, true);
    }
}
