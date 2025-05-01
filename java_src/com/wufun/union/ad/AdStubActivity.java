package com.wufun.union.ad;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.View;
import android.view.WindowInsets;
import com.wufun.union.ad.databinding.ActivityAdStubBinding;
/* loaded from: classes6.dex */
public class AdStubActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private ActivityAdStubBinding f65589b;

    /* renamed from: c  reason: collision with root package name */
    private View f65590c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f65591d;

    /* renamed from: e  reason: collision with root package name */
    private ServiceConnection f65592e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                AdStubActivity.this.finish();
                return;
            }
            Messenger messenger = new Messenger(iBinder);
            Message message = new Message();
            message.what = 3;
            AdStubActivity adStubActivity = AdStubActivity.this;
            message.obj = adStubActivity;
            message.setData(adStubActivity.f65591d);
            try {
                messenger.send(message);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    void b() {
        ServiceConnection serviceConnection = this.f65592e;
        if (serviceConnection == null) {
            return;
        }
        unbindService(serviceConnection);
    }

    void bindService() {
        this.f65592e = new a();
        Intent intent = new Intent("com.wufun.union.ad.action.AdService");
        intent.setPackage(getPackageName());
        bindService(intent, this.f65592e, 1);
    }

    void c() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f65590c.getWindowInsetsController().hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        } else {
            this.f65590c.setSystemUiVisibility(4871);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityAdStubBinding inflate = ActivityAdStubBinding.inflate(getLayoutInflater());
        this.f65589b = inflate;
        setContentView(inflate.getRoot());
        this.f65590c = this.f65589b.f65622c;
        c();
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.f65591d = getIntent().getExtras();
            bindService();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b();
    }
}
