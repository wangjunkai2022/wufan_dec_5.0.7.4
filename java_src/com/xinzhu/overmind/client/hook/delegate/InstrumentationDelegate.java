package com.xinzhu.overmind.client.hook.delegate;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/* loaded from: classes.dex */
public class InstrumentationDelegate extends Instrumentation {
    protected Instrumentation root;

    private static Method findDeclaredMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.root.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.root.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        this.root.callActivityOnDestroy(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.root.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        this.root.callActivityOnPause(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.root.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        this.root.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.root.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        this.root.callActivityOnResume(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.root.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        this.root.callActivityOnStart(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        this.root.callActivityOnStop(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        this.root.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        this.root.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i4) {
        return this.root.checkMonitorHit(activityMonitor, i4);
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        this.root.endPerformanceSnapshot();
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i4, Bundle bundle) throws Throwable {
        try {
            return (Instrumentation.ActivityResult) findDeclaredMethod(this.root, InstrumentationProxy.f64867b, Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.root, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i4), bundle);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() == null) {
                return null;
            }
            throw e5.getCause();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // android.app.Instrumentation
    public void finish(int i4, Bundle bundle) {
        this.root.finish(i4, bundle);
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        return this.root.getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        return this.root.getContext();
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        return this.root.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation() {
        return this.root.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i4, int i5) {
        return this.root.invokeContextMenuAction(activity, i4, i5);
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i4, int i5) {
        return this.root.invokeMenuActionSync(activity, i4, i5);
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        return this.root.isProfiling();
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        return this.root.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return this.root.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        this.root.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        this.root.onDestroy();
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        return this.root.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        this.root.onStart();
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.root.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        this.root.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i4) {
        this.root.sendCharacterSync(i4);
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i4) {
        this.root.sendKeyDownUpSync(i4);
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        this.root.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        this.root.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i4, Bundle bundle) {
        this.root.sendStatus(i4, bundle);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        this.root.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        this.root.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        this.root.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z4) {
        this.root.setInTouchMode(z4);
    }

    @Override // android.app.Instrumentation
    public void start() {
        this.root.start();
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        return this.root.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        this.root.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        this.root.startProfiling();
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        this.root.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        this.root.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        this.root.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.root.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j4) {
        return this.root.waitForMonitorWithTimeout(activityMonitor, j4);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z4) {
        return this.root.addMonitor(intentFilter, activityResult, z4);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.root.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.root.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.root.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.root.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return this.root.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z4) {
        return this.root.addMonitor(str, activityResult, z4);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i4, Bundle bundle) throws Throwable {
        try {
            return (Instrumentation.ActivityResult) findDeclaredMethod(this.root, InstrumentationProxy.f64867b, Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.root, context, iBinder, iBinder2, str, intent, Integer.valueOf(i4), bundle);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() == null) {
                return null;
            }
            throw e5.getCause();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i4) throws Throwable {
        try {
            return (Instrumentation.ActivityResult) findDeclaredMethod(this.root, InstrumentationProxy.f64867b, Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE).invoke(this.root, context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i4));
        } catch (InvocationTargetException e5) {
            if (e5.getCause() == null) {
                return null;
            }
            throw e5.getCause();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i4) throws Throwable {
        try {
            return (Instrumentation.ActivityResult) findDeclaredMethod(this.root, InstrumentationProxy.f64867b, Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE).invoke(this.root, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i4));
        } catch (InvocationTargetException e5) {
            if (e5.getCause() == null) {
                return null;
            }
            throw e5.getCause();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i4, Bundle bundle) throws Throwable {
        try {
            return (Instrumentation.ActivityResult) findDeclaredMethod(this.root, InstrumentationProxy.f64867b, Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.root, context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i4), bundle);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() == null) {
                return null;
            }
            throw e5.getCause();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i4, Bundle bundle, UserHandle userHandle) throws Throwable {
        try {
            return (Instrumentation.ActivityResult) findDeclaredMethod(this.root, InstrumentationProxy.f64867b, Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class, UserHandle.class).invoke(this.root, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i4), bundle, userHandle);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() == null) {
                return null;
            }
            throw e5.getCause();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
