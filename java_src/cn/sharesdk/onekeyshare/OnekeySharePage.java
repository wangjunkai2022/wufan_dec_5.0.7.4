package cn.sharesdk.onekeyshare;

import android.os.Build;
import android.view.View;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import com.mob.tools.FakeActivity;
import com.mob.tools.MobLog;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class OnekeySharePage extends FakeActivity {
    private OnekeyShareThemeImpl impl;

    public OnekeySharePage(OnekeyShareThemeImpl onekeyShareThemeImpl) {
        this.impl = onekeyShareThemeImpl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void setViewFitsSystemWindows(View view) {
        try {
            if (Build.VERSION.SDK_INT >= 35) {
                view.setFitsSystemWindows(true);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void formateShareData(final Platform platform, final ShareSDKCallback<Platform.ShareParams> shareSDKCallback) {
        this.impl.formateShareData(platform, new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeySharePage.1
            @Override // cn.sharesdk.framework.ShareSDKCallback
            public void onCallback(Boolean bool) {
                if (bool.booleanValue()) {
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(OnekeySharePage.this.impl.shareDataToShareParams(platform));
                        return;
                    }
                    return;
                }
                ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                if (shareSDKCallback3 != null) {
                    shareSDKCallback3.onCallback(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PlatformActionListener getCallback() {
        return this.impl.callback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayList<CustomerLogo> getCustomerLogos() {
        return this.impl.customerLogos;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ShareContentCustomizeCallback getCustomizeCallback() {
        return this.impl.customizeCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HashMap<String, String> getHiddenPlatforms() {
        return this.impl.hiddenPlatforms;
    }

    protected final HashMap<String, Object> getShareParamsMap() {
        return this.impl.shareParamsMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isDialogMode() {
        return this.impl.dialogMode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isDisableSSO() {
        return this.impl.disableSSO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isSilent() {
        return this.impl.silent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void isUseClientToShare(Platform platform, ShareSDKCallback<Boolean> shareSDKCallback) {
        this.impl.isUseClientToShare(platform, shareSDKCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void shareSilently(Platform platform) {
        this.impl.shareSilently(platform);
    }
}
