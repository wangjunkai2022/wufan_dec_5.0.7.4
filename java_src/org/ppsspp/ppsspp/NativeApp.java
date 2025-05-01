package org.ppsspp.ppsspp;

import java.util.ArrayList;
/* loaded from: classes7.dex */
public class NativeApp {

    /* renamed from: a  reason: collision with root package name */
    public static final int f72858a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f72859b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f72860c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f72861d = 10;

    /* renamed from: e  reason: collision with root package name */
    public static final int f72862e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f72863f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f72864g = 2;

    public static native void ChangeDisk(String str);

    public static native boolean IsEmuExitFinish();

    public static native boolean IsHapticFeedbackEnable();

    public static native boolean IsSoundEnable();

    public static native boolean NeedChangeDisk();

    public static native void RecreateMsg();

    public static native boolean accelerometer(float f5, float f6, float f7);

    public static native void addEditCheat(EditCheatInfo editCheatInfo);

    public static native void applyGameSettingConfig(int i4);

    public static native void audioConfig(int i4, int i5);

    public static native void audioInit();

    public static native void audioShutdown();

    public static native void backbufferResize(int i4, int i5, int i6);

    public static native void beginJoystickEvent();

    public static native void cheatEnable(int i4, int i5);

    public static native boolean checkCheatCode(String str);

    public static native void computeDesiredBackbufferDimensions();

    public static native void deleteEditCheat(int i4);

    public static native void emuRestart();

    public static native void enableEidtCheat(int i4);

    public static native void enableHapticFeedback(boolean z4);

    public static native void enableSound(boolean z4);

    public static native void endJoystickEvent();

    public static native void enterGameSettings(int i4);

    public static native ArrayList<CheatInfo> getCheatList();

    public static native int getDesiredBackbufferHeight();

    public static native int getDesiredBackbufferWidth();

    public static native ArrayList<EditCheatInfo> getEditCheatList();

    public static native void httpPostMemberInfo();

    public static native void init(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i5, String str9);

    public static native boolean isAtTopLevel();

    public static native boolean isLandscape();

    public static native void joystickAxis(int i4, int i5, float f5);

    public static native boolean keyDown(int i4, int i5, boolean z4);

    public static native boolean keyUp(int i4, int i5);

    public static native void loadPspDBCheat();

    public static native void loadState(String str);

    public static native void modifyEditCheat(int i4, EditCheatInfo editCheatInfo);

    public static native boolean mouseWheelEvent(float f5, float f6);

    public static native void pause();

    public static native void pauseGame();

    public static native void pushCameraImage(byte[] bArr);

    public static native void pushNewGpsData(float f5, float f6, float f7, float f8, float f9, long j4);

    public static native String queryConfig(String str);

    public static native void resume();

    public static native void resumeGame();

    public static native void saveGameConfig();

    public static native void saveScreenShot(String str);

    public static native void saveState(String str);

    public static native void sendMessage(String str, String str2);

    public static native void setDisplayParameters(int i4, int i5, int i6, float f5);

    public static native void setJson(String str);

    public static native void shutdown();

    public static native boolean touch(float f5, float f6, int i4, int i5);
}
