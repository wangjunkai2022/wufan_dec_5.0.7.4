package com.aggmoread.sdk.a.adcomm.amsdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.a.t.d;
/* loaded from: classes2.dex */
public class AMAdVideoViewActivity extends Activity {
    private static d tmpActivityPresenter;
    private d apiActivityPresenter;

    public static void setActivityPresenter(d dVar) {
        tmpActivityPresenter = dVar;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        d dVar = this.apiActivityPresenter;
        if (dVar != null ? dVar.a() : false) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        d dVar = tmpActivityPresenter;
        if (dVar != null && this.apiActivityPresenter == null) {
            this.apiActivityPresenter = dVar;
            tmpActivityPresenter = null;
        }
        d dVar2 = this.apiActivityPresenter;
        if (dVar2 != null) {
            dVar2.a(this);
            this.apiActivityPresenter.a(bundle);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        d dVar = this.apiActivityPresenter;
        if (dVar != null) {
            dVar.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d dVar = tmpActivityPresenter;
        if (dVar != null && this.apiActivityPresenter == null) {
            this.apiActivityPresenter = dVar;
            tmpActivityPresenter = null;
        }
        d dVar2 = this.apiActivityPresenter;
        if (dVar2 != null) {
            dVar2.a(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        d dVar = this.apiActivityPresenter;
        if (dVar != null) {
            dVar.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        d dVar = this.apiActivityPresenter;
        if (dVar != null) {
            dVar.onResume();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d dVar = this.apiActivityPresenter;
        if (dVar != null ? dVar.a(motionEvent) : false) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
