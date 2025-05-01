package com.papa91.arc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.view.KeyEvent;
import com.join.mgps.Util.h0;
import com.join.mgps.joystick.a;
import com.papa91.activity.EmuBaseActivity;
import com.papa91.activity.EmuMenuBaseActivity;
import com.papa91.arc.CContext;
import com.papa91.arc.util.SDCardUtil;
import com.papa91.arcapp.AppConfig_gba;
import com.papa91.common.BaseAppConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import org.cocos2dx.lib.Cocos2dxActivity;
/* loaded from: classes5.dex */
public class EmuActivity_gba extends EmuMenuBaseActivity implements a.d {
    public static String AD_APP_KEY = "1105599035";
    public static final boolean SINGLE_MODE = false;
    private static String appId = "900009441";
    private static String appKey = "IjQhR76mHASzP31j";
    private static EmuActivity_gba emuActivity;
    public static String romName;
    private static Vibrator vibrtor;
    private int firstKey = 0;
    String[] gbaLibRom = {"ftsc3", "lkrexe2"};
    private String jsonData;
    static Handler handler = new Handler() { // from class: com.papa91.arc.EmuActivity_gba.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            EmuBaseActivity.startAPPActivity();
            super.handleMessage(message);
        }
    };
    public static int[] keyVaule = {0, 0, 0, 0};
    public static String screenMOde = "1";
    public static String enableAudio = "1";
    public static String vibriorMode = "1";
    public static String version = "1.5.0";
    public static String cpuFreq = getCurCpuFreq();
    public static String cpuNum = "" + Runtime.getRuntime().availableProcessors();
    public static String netState = "";
    public static String coreName = "VBA";

    public static void copyFolder(String str, String str2) {
        File file;
        try {
            new File(str2).mkdirs();
            File file2 = new File(str);
            File file3 = new File(str2);
            if (file2.isDirectory() && !file3.exists()) {
                file3.mkdirs();
            }
            String[] list = file2.list();
            for (int i4 = 0; i4 < list.length; i4++) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    file = new File(str + list[i4]);
                } else {
                    file = new File(str + str3 + list[i4]);
                }
                if (file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(str2 + net.lingala.zip4j.util.e.F0 + file.getName().toString());
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                }
                if (file.isDirectory()) {
                    copyFolder(str + net.lingala.zip4j.util.e.F0 + list[i4], str2);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void exitActivty(int i4) {
        try {
            String externalStorageDirectory = SDCardUtil.getExternalStorageDirectory(Cocos2dxActivity.getContext());
            EmuBaseActivity.send(new Intent("android.intent.action.MEDIA_MOUNTED", Uri.parse("file://" + externalStorageDirectory + "papa91/img")));
        } catch (Exception unused) {
        }
        try {
            EmuBaseActivity.uploadEfficiencyData();
            int currentTimeMillis = (int) (System.currentTimeMillis() - EmuBaseActivity.startTIme);
            boolean gameOut = EmuBaseActivity.gameOut(EmuBaseActivity.GameID, currentTimeMillis, EmuBaseActivity.UserID);
            EmuBaseActivity.sendGameExit();
            String externalStorageDirectory2 = SDCardUtil.getExternalStorageDirectory(Cocos2dxActivity.getContext());
            if (!gameOut) {
                EmuBaseActivity.createDir(externalStorageDirectory2 + "/mgpapa/aidlservice/Game_out_" + EmuBaseActivity.GameID + "_" + currentTimeMillis + "_" + EmuBaseActivity.UserID);
            }
            EmuBaseActivity.startTIme = System.currentTimeMillis();
            if (EmuBaseActivity.startMode == 0 && !gameOut) {
                EmuBaseActivity.createDir(externalStorageDirectory2 + "/mgpapa/aidlservice/Game_start15_" + EmuBaseActivity.GameID + "_" + EmuBaseActivity.UserID);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        killGbaProProcess();
        EmuBaseActivity.exitActivity(i4);
    }

    public static String getCurCpuFreq() {
        String str;
        byte[] bArr;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            str = "";
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
            str = "N/A";
        }
        return str.trim();
    }

    public static String getRecordInfo(String str) {
        String str2 = coreName.equals("VBA") ? "vba" : "";
        return EmuBaseActivity.getRecordInfo(str + str2);
    }

    static void killGbaProProcess() {
        try {
            if (Cocos2dxActivity.getContext() == null) {
                return;
            }
            Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu_exit");
            intent.putExtra("exit", 1);
            intent.putExtra("pkgName", EmuBaseActivity.getHostPackageName());
            EmuBaseActivity.send(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static void openUrl() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://h5.papa91.com/sp_jiesuo.html"));
        emuActivity.startActivity(intent);
    }

    public static void playerVibrtor() {
        vibrtor.vibrate(50L);
    }

    public static void printLogCat(int i4, int i5, int i6, int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append("zcylog15 printLogCat a=");
        sb.append(i4);
        sb.append("b=");
        sb.append(i5);
        sb.append("c=");
        sb.append(i6);
        sb.append("d=");
        sb.append(i7);
        String str = "";
        String str2 = i4 != 2 ? i4 != 4 ? i4 != 8 ? i4 != 11 ? i4 != 15 ? i4 != 21 ? i4 != 22 ? "" : "SIGABRT" : "SIGBREAK" : "SIGTERM" : "SIGSEGV" : "SIGFPE" : "SIGILL" : "SIGINT";
        try {
            String packageName = Cocos2dxActivity.getContext().getPackageName();
            try {
                str = Cocos2dxActivity.getContext().getPackageManager().getPackageInfo(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
            }
            EmuBaseActivity.emuLogCat(EmuBaseActivity.GameID, EmuBaseActivity.UserID, packageName, str, str2);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static void saveConfig(String str, String str2) {
        SharedPreferences.Editor edit = Cocos2dxActivity.getContext().getSharedPreferences("core", 4).edit();
        edit.putString(str, String.valueOf(str2));
        edit.commit();
    }

    static void setBlueTooth() {
        com.join.mgps.joystick.a.g().v();
    }

    public static boolean setImageToMEDIA(String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        EmuBaseActivity.send(intent);
        return true;
    }

    public static void startForumsActivity() {
        handler.sendMessage(new Message());
    }

    public static int unLockSp() {
        try {
            return EmuBaseActivity.unLockSP(EmuBaseActivity.GameID) ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void createRom() {
        String str = "{\"romPath\":\"" + EmuBaseActivity.assetsPath + "/rom/kdygqhdmy\",\"startMode\":0,\"userID\":\"2000\",\"gameID\":\"509474702\",\"version\":\"2\",\"roomID\":\"10000\",\"sopath\":\"" + (getDir("jniLibs", 0).getAbsolutePath() + net.lingala.zip4j.util.e.F0) + "\",\"assetspath\":\"" + EmuBaseActivity.assetsPath + "\",\"classname\":\"com/papa91/arc/EmuActivity_gba\",\"serverIP\":\"121.201.0.114 \",\"serverPort\":\"5369\",\"porder\":0}";
        if (str != null) {
            EmuBaseActivity.setJson(dealSDPath(str, BaseAppConfig.APP_PATH));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent;
        boolean p4;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 24 && keyCode != 25) {
            if (this.firstKey == keyCode && keyEvent.getAction() == 1) {
                if (keyCode == 4) {
                    EmuBaseActivity.showDailog(0);
                }
                dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
                p4 = !com.join.mgps.joystick.a.g().p(keyEvent);
            } else {
                this.firstKey = keyCode;
                dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
                p4 = com.join.mgps.joystick.a.g().p(keyEvent);
            }
            return p4 | dispatchKeyEvent;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    protected boolean extractAsset(File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            return true;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStream = getAssets().open(file.getName());
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        fileOutputStream.close();
                        inputStream.close();
                        return true;
                    } catch (IOException unused3) {
                        return true;
                    }
                }
            }
        } catch (Exception unused4) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused5) {
                    return false;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused6) {
                    throw th;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    String getCore(String str) {
        String str2 = netState;
        if (str2 != "") {
            return str2.contains("vba.") ? "VBA" : CContext.SCENE_GBA;
        }
        for (String str3 : this.gbaLibRom) {
            if (str.endsWith(File.separator + str3)) {
                return CContext.SCENE_GBA;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return "VBA";
        }
        StringBuilder sb = new StringBuilder();
        String str4 = File.separator;
        sb.append(str4);
        sb.append("kdygmyhbs3");
        if (str.endsWith(sb.toString())) {
            return "VBA";
        }
        if (str.substring(str.lastIndexOf(str4) + 1).startsWith("kdyg")) {
            return CContext.SCENE_GBA;
        }
        Date date = null;
        Date date2 = null;
        for (int i4 = 0; i4 <= 100; i4++) {
            File file = new File(str + h0.f27805a + i4);
            if (file.exists()) {
                Date date3 = new Date(file.lastModified());
                if (date2 == null || date3.after(date2)) {
                    date2 = date3;
                }
            }
        }
        for (int i5 = 0; i5 <= 100; i5++) {
            File file2 = new File(str + "vba." + i5);
            if (file2.exists()) {
                Date date4 = new Date(file2.lastModified());
                if (date == null || date4.after(date)) {
                    date = date4;
                }
            }
        }
        return (date2 == null || date == null) ? date2 == null ? "VBA" : CContext.SCENE_GBA : date2.after(date) ? CContext.SCENE_GBA : "VBA";
    }

    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.arc.view.IEmulator
    public String getCustomCheatTip(boolean z4) {
        return z4 ? "仅支持gameshark_v3的金手指码\n第一部分:8位数字、字母\n第二部分:8位数字、字母\n两部分中间请用【空格】分割，例:22002758 0098967F" : "第一部分:8位数字、字母\n第二部分:2或4或8位数字、字母\n两部分中间请用【空格】分割，例:22002758 0098967F";
    }

    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.arc.view.IEmulator
    public String getModSubfix() {
        return coreName.equals("VBA") ? "vba" : "";
    }

    @Override // com.papa91.activity.EmuMenuBaseActivity
    public String getSimulatorType() {
        return "gba";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.activity.EmuBaseActivity
    public void handleAdResult(Context context, Intent intent) {
        super.handleAdResult(context, intent);
        int intExtra = intent.getIntExtra("adAction", 1003);
        if (intExtra == 1003) {
            pauseGame();
        } else if (intExtra == 1004) {
            resumeGame();
        }
    }

    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.arc.view.IEmulator
    public void loadAdVideo() {
        CContext.IVideoAdListener iVideoAdListener;
        if (getVip() > 0 || (iVideoAdListener = CContext.mVideoAdListener) == null) {
            return;
        }
        iVideoAdListener.loadAd(this, CContext.SCENE_GBA);
    }

    public void loadRom() {
        EmuBaseActivity.initLaunchConfig(new String[]{BaseAppConfig.PREF_SCREEN_MODE, "appPath", "libPath", BaseAppConfig.PREF_ENABLE_AUDIO, "vibriorMode", "version", "cpuNum", "cpuFreq", "gameMode"}, new String[]{screenMOde, BaseAppConfig.APP_PATH, AppConfig_gba.getLibpath(this), enableAudio, vibriorMode, version, cpuNum, cpuFreq, "VBA"});
        createRom();
        BaseAppConfig.ROM_PATH = EmuBaseActivity.assetsPath + "/rom/kdygqhdmy";
        String name = new File(BaseAppConfig.ROM_PATH).getName();
        BaseAppConfig.APK_PATH = getFilesDir().toString() + "/emus/" + BaseAppConfig.EMU_NAME + net.lingala.zip4j.util.e.F0 + name + net.lingala.zip4j.util.e.F0 + name;
        EmuBaseActivity.initEmu();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.activity.EmuBaseActivity, org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa91.arc.EmuActivity_gba.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.activity.EmuBaseActivity, org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.joystick.a.g().F();
        EmuBaseActivity.exitEmu();
        super.onDestroy();
        System.exit(0);
    }

    @Override // com.join.mgps.joystick.a.d
    public void onGenericMotionEvent(int i4, float f5, float f6) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuBaseActivity
    public void onHandleGameExit(Intent intent) {
        super.onHandleGameExit(intent);
        gameDestroy(this);
    }

    @Override // com.papa91.activity.EmuBaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            AppConfig_gba.IsXperiaPlay();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.join.mgps.joystick.a.d
    public void onKeyMap(int[] iArr, com.join.mgps.joystick.map.c cVar, KeyEvent keyEvent) {
        EmuBaseActivity.setJoyStickKey(iArr);
    }

    @Override // com.papa91.activity.EmuBaseActivity, org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gamePause(this);
    }

    @Override // com.papa91.activity.EmuBaseActivity, org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gameResume(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("jsonData", this.jsonData);
        bundle.putString(BaseAppConfig.KEY_ROM_PATH, EmuBaseActivity.romPath);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.join.mgps.joystick.a.d
    public void onVirtualKeyboard(boolean z4) {
        if (z4) {
            EmuBaseActivity.setPadVisible(0);
        } else {
            EmuBaseActivity.setPadVisible(1);
        }
    }

    public void saveLog(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.arc.view.IEmulator
    public void showAdVideo() {
        CContext.IVideoAdListener iVideoAdListener;
        if (getVip() > 0 || (iVideoAdListener = CContext.mVideoAdListener) == null) {
            return;
        }
        iVideoAdListener.showAd(this, EmuBaseActivity.GameID, CContext.SCENE_GBA);
    }

    @Override // com.papa91.activity.EmuMenuBaseActivity, com.papa91.arc.view.IEmulator
    public boolean showGGCodeButton() {
        return true;
    }

    @Override // com.papa91.activity.EmuBaseActivity
    protected void showInvitePlayUi(String str, String str2, String str3, long j4) {
    }

    public void updateConfig() {
        SharedPreferences sharedPreferences = getSharedPreferences("core", 4);
        enableAudio = sharedPreferences.getString(BaseAppConfig.PREF_ENABLE_AUDIO, "1");
        screenMOde = sharedPreferences.getString(BaseAppConfig.PREF_SCREEN_MODE, "1");
        vibriorMode = sharedPreferences.getString("vibriorMode", "1");
        version = sharedPreferences.getString("version", "1.4.0");
    }
}
