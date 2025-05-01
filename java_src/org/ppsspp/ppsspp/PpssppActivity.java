package org.ppsspp.ppsspp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.join.mgps.service.CommonService_;
/* loaded from: classes7.dex */
public class PpssppActivity extends NativeActivity {
    public static final String SHORTCUT_EXTRA_KEY = "org.ppsspp.ppsspp.Shortcuts";
    private static final String TAG = "PpssppActivity";
    public static boolean libraryLoaded;
    private static boolean m_hasNoNativeBinary;
    private static boolean m_hasUnsupportedABI;

    /* loaded from: classes7.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            AlertDialog.Builder builder = new AlertDialog.Builder(PpssppActivity.this);
            if (PpssppActivity.m_hasUnsupportedABI) {
                builder.setMessage(Build.CPU_ABI + " target is not supported.").setTitle("Error starting PPSSPP").create().show();
            } else {
                builder.setMessage("The native part of PPSSPP for ABI " + Build.CPU_ABI + " is missing. Try downloading an official build?").setTitle("Error starting PPSSPP").create().show();
            }
            Looper.loop();
        }
    }

    /* loaded from: classes7.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72921c;

        b(String str, String str2) {
            this.f72920b = str;
            this.f72921c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            PpssppActivity.this.processCommand(this.f72920b, this.f72921c);
        }
    }

    public static void CheckABIAndLoadLibrary() {
        StringBuilder sb = new StringBuilder();
        sb.append("exit CheckABIAndLoadLibrary ");
        sb.append(NativeActivity.soPath);
        if (Build.CPU_ABI.equals(com.join.mgps.mod.utils.d.f53621d)) {
            m_hasUnsupportedABI = true;
            return;
        }
        try {
            System.load(NativeActivity.soPath + "/libppsspp_jni.so");
            libraryLoaded = true;
        } catch (UnsatisfiedLinkError e5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LoadLibrary failed, UnsatifiedLinkError: ");
            sb2.append(e5.toString());
            m_hasNoNativeBinary = true;
        }
    }

    public boolean IsHapticFeedbackEnable() {
        return false;
    }

    public boolean IsSoundEnable() {
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void exitEndGame(boolean z4) {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public String getEndGameDesc() {
        return null;
    }

    public int getEndGameLimitTime() {
        return 0;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public String getEndGameScore(int i4) {
        return null;
    }

    public int getGamePlayTime() {
        return 0;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public int getMiniRankTime() {
        return 0;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void getPassRewardPoint() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isEndGame() {
        return false;
    }

    public boolean isRankAutoUpload() {
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isShowAchievementIcon() {
        return NativeActivity.isBside;
    }

    public boolean isShowCheating() {
        return false;
    }

    public boolean isShowGate() {
        return false;
    }

    @Override // org.ppsspp.ppsspp.NativeActivity, com.papa91.arc.view.MenuViewListener
    public boolean isShowOnekey() {
        return false;
    }

    public boolean isShowQuickSlot() {
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean needShowBottomBar() {
        return true;
    }

    public boolean needShowTimer() {
        return false;
    }

    public void onAdImageClick() {
    }

    public void onChangeDisk() {
    }

    @Override // org.ppsspp.ppsspp.NativeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        CheckABIAndLoadLibrary();
        if (!m_hasUnsupportedABI && !m_hasNoNativeBinary) {
            Intent intent = getIntent();
            if (intent.getData() != null) {
                String path = intent.getData().getPath();
                StringBuilder sb = new StringBuilder();
                sb.append("Found Shortcut Parameter in data: ");
                sb.append(path);
                super.setShortcutParam(path);
            } else {
                String stringExtra = getIntent().getStringExtra(SHORTCUT_EXTRA_KEY);
                if (stringExtra != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Found Shortcut Parameter in extra-data: ");
                    sb2.append(stringExtra);
                    super.setShortcutParam(getIntent().getStringExtra(SHORTCUT_EXTRA_KEY));
                }
            }
            super.onCreate(bundle);
            return;
        }
        new a().start();
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
        System.exit(-1);
    }

    public void onHideMenu() {
    }

    public void onScreenShot() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void playVideoForReward() {
    }

    public void postCommand(String str, String str2) {
        runOnUiThread(new b(str, str2));
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void restartEndGame() {
    }

    public void saveGameConfig() {
    }

    public void senCommonEvent(String str, String str2) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra("gameId", NativeActivity.GameID);
        intent.putExtra("uid", NativeActivity.UserID);
        intent.putExtra("position", str2);
        intent.putExtra(CommonService_.b0.f54290b, str);
        sendBroadcast(intent);
    }

    public void showMenuGate() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void showMenuOnekey() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void showReceivePointDialog() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void startEndGame() {
    }
}
