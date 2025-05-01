package com.join.kotlin.ui.base;

import android.os.Bundle;
import com.BaseAppCompatActivity;
import com.join.mgps.Util.d0;
import com.join.mgps.event.n;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseHasDownloadActivity.kt */
/* loaded from: classes.dex */
public abstract class BaseHasDownloadActivity extends BaseAppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        d0.a().d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d0.a().e(this);
    }

    public abstract void onDownloadStatusEventReceved(@NotNull n nVar);

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        onDownloadStatusEventReceved(downloadTaskEvent);
    }
}
