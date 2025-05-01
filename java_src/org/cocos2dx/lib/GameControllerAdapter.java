package org.cocos2dx.lib;

import java.util.ArrayList;
/* loaded from: classes7.dex */
public class GameControllerAdapter {
    private static ArrayList<Runnable> sRunnableFrameStartList;

    public static void addRunnableToFrameStartList(Runnable runnable) {
        if (sRunnableFrameStartList == null) {
            sRunnableFrameStartList = new ArrayList<>();
        }
        sRunnableFrameStartList.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerAxisEvent(String str, int i4, int i5, float f5, boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerButtonEvent(String str, int i4, int i5, boolean z4, float f5, boolean z5);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerConnected(String str, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerDisconnected(String str, int i4);

    public static void onAxisEvent(final String str, final int i4, final int i5, final float f5, final boolean z4) {
        Cocos2dxHelper.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                GameControllerAdapter.nativeControllerAxisEvent(str, i4, i5, f5, z4);
            }
        });
    }

    public static void onButtonEvent(final String str, final int i4, final int i5, final boolean z4, final float f5, final boolean z5) {
        Cocos2dxHelper.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                GameControllerAdapter.nativeControllerButtonEvent(str, i4, i5, z4, f5, z5);
            }
        });
    }

    public static void onConnected(final String str, final int i4) {
        Cocos2dxHelper.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                GameControllerAdapter.nativeControllerConnected(str, i4);
            }
        });
    }

    public static void onDisconnected(final String str, final int i4) {
        Cocos2dxHelper.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                GameControllerAdapter.nativeControllerDisconnected(str, i4);
            }
        });
    }

    public static void onDrawFrameStart() {
        ArrayList<Runnable> arrayList = sRunnableFrameStartList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                sRunnableFrameStartList.get(i4).run();
            }
        }
    }

    public static void removeRunnableFromFrameStartList(Runnable runnable) {
        ArrayList<Runnable> arrayList = sRunnableFrameStartList;
        if (arrayList != null) {
            arrayList.remove(runnable);
        }
    }
}
