package com.aggmoread.sdk.a.adcomm.amsdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.aggmoread.sdk.z.a.t.b;
import com.aggmoread.sdk.z.a.t.j;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public class AmCustomWebviewActivity extends Activity {
    private static b.a webViewStateListener = b.a.f2569a;
    private int DOWNLOAD_REQUEST_PERMISSION_CODE = 1001110;
    private boolean canSkip = true;
    private j webImpl;

    private void initView() {
        setContentView(this.webImpl.a(this));
    }

    private void loadUrl() {
        j jVar = this.webImpl;
        if (jVar != null) {
            jVar.e();
        }
    }

    public static void setWebViewStateListener(b.a aVar) {
        if (aVar == null) {
            aVar = b.a.f2569a;
        }
        webViewStateListener = aVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.canSkip) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.webImpl = new j(this, getIntent().getStringExtra("title"), getIntent().getStringExtra("mClickUrl"), new j.f() { // from class: com.aggmoread.sdk.a.adcomm.amsdk.AmCustomWebviewActivity.1
            @Override // com.aggmoread.sdk.z.a.t.j.f
            public boolean canSkip() {
                AmCustomWebviewActivity.this.canSkip = false;
                return false;
            }

            @Override // com.aggmoread.sdk.z.a.t.j.f
            public void onClose() {
                AmCustomWebviewActivity.this.finish();
            }

            @Override // com.aggmoread.sdk.z.a.t.j.f
            public void onShow() {
                AmCustomWebviewActivity.webViewStateListener.onShow();
            }
        });
        initView();
        if (ContextCompat.checkSelfPermission(this, g.f55590j) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{g.f55590j}, this.DOWNLOAD_REQUEST_PERMISSION_CODE);
        } else {
            loadUrl();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        j jVar = this.webImpl;
        if (jVar != null) {
            jVar.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            j jVar = this.webImpl;
            if (jVar != null && jVar.c()) {
                return true;
            }
            setResult(0, new Intent());
            finish();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        j jVar = this.webImpl;
        if (jVar == null || !jVar.c()) {
            setResult(0, new Intent());
            finish();
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || i4 != this.DOWNLOAD_REQUEST_PERMISSION_CODE) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        } else if (iArr[0] == 0) {
            loadUrl();
        } else {
            finish();
            webViewStateListener.onShow();
        }
    }
}
