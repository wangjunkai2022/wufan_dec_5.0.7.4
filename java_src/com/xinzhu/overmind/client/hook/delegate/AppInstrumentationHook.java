package com.xinzhu.overmind.client.hook.delegate;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import com.xinzhu.haunted.android.app.g;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.e;
import com.xinzhu.overmind.client.hook.d;
import com.xinzhu.overmind.client.hook.fixer.ActivityFixer;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class AppInstrumentationHook implements d {

    /* renamed from: c  reason: collision with root package name */
    private static ActivityCallbackRecord f67588c = new ActivityCallbackRecord();

    /* renamed from: d  reason: collision with root package name */
    private static final String f67589d = AppInstrumentationHook.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static AppInstrumentationHook f67590e;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<b> f67591b = new ArrayList<>();

    /* loaded from: classes.dex */
    private static class ActivityCallbackRecord {

        /* renamed from: a  reason: collision with root package name */
        Activity f67592a;

        /* renamed from: b  reason: collision with root package name */
        ActionType f67593b;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public enum ActionType {
            Create,
            Start,
            Resume,
            Pause,
            Stop,
            Destroy,
            ActivitySaveInstanceState
        }

        private ActivityCallbackRecord() {
        }

        public void a(Activity activity, ActionType actionType) {
            this.f67592a = activity;
            this.f67593b = actionType;
        }
    }

    /* loaded from: classes.dex */
    public class b extends InstrumentationDelegate {
        public b() {
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnCreate(Activity activity, Bundle bundle) {
            AppInstrumentationHook.this.f();
            String unused = AppInstrumentationHook.f67589d;
            StringBuilder sb = new StringBuilder();
            sb.append("callActivityOnCreate: ");
            sb.append(activity.getClass().getName());
            ActivityInfo h4 = new com.xinzhu.haunted.android.app.a(activity).h();
            ContextFixer.fix(activity);
            ActivityFixer.fix(activity);
            int i4 = h4.theme;
            if (i4 != 0) {
                activity.setTheme(i4);
            }
            activity.setRequestedOrientation(h4.screenOrientation);
            super.callActivityOnCreate(activity, bundle);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Create) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Create);
            Overmind.get().getActivityLifecycleCallback().onActivityCreated(activity, bundle);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnDestroy(Activity activity) {
            super.callActivityOnDestroy(activity);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Destroy) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Destroy);
            Overmind.get().getActivityLifecycleCallback().onActivityDestroyed(activity);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnPause(Activity activity) {
            super.callActivityOnPause(activity);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Pause) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Pause);
            Overmind.get().getActivityLifecycleCallback().onActivityPaused(activity);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnResume(Activity activity) {
            super.callActivityOnResume(activity);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Resume) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Resume);
            Overmind.get().getActivityLifecycleCallback().onActivityResumed(activity);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnStart(Activity activity) {
            super.callActivityOnStart(activity);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Start) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Start);
            Overmind.get().getActivityLifecycleCallback().onActivityStarted(activity);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnStop(Activity activity) {
            super.callActivityOnStop(activity);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Stop) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Stop);
            Overmind.get().getActivityLifecycleCallback().onActivityStopped(activity);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callApplicationOnCreate(Application application) {
            AppInstrumentationHook.this.f();
            super.callApplicationOnCreate(application);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i4, Bundle bundle) throws Throwable {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i4, bundle);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            try {
                return super.newActivity(classLoader, str, intent);
            } catch (ClassNotFoundException unused) {
                return this.root.newActivity(classLoader, str, intent);
            }
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            ContextFixer.fix(context);
            e.getClient().loadXposed(context);
            return super.newApplication(classLoader, str, context);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i4, Bundle bundle) throws Throwable {
            return super.execStartActivity(context, iBinder, iBinder2, str, intent, i4, bundle);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i4) throws Throwable {
            return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i4);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i4) throws Throwable {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i4);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i4, Bundle bundle) throws Throwable {
            return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i4, bundle);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i4, Bundle bundle, UserHandle userHandle) throws Throwable {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i4, bundle, userHandle);
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.InstrumentationDelegate, android.app.Instrumentation
        public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
            AppInstrumentationHook.this.f();
            String unused = AppInstrumentationHook.f67589d;
            StringBuilder sb = new StringBuilder();
            sb.append("callActivityOnCreate: ");
            sb.append(activity.getClass().getName());
            ActivityInfo h4 = new com.xinzhu.haunted.android.app.a(activity).h();
            ContextFixer.fix(activity);
            ActivityFixer.fix(activity);
            int i4 = h4.theme;
            if (i4 != 0) {
                activity.setTheme(i4);
            }
            activity.setRequestedOrientation(h4.screenOrientation);
            super.callActivityOnCreate(activity, bundle);
            if (AppInstrumentationHook.this.f67591b.size() > 1 && AppInstrumentationHook.f67588c.f67592a == activity && AppInstrumentationHook.f67588c.f67593b == ActivityCallbackRecord.ActionType.Create) {
                return;
            }
            AppInstrumentationHook.f67588c.a(activity, ActivityCallbackRecord.ActionType.Create);
            Overmind.get().getActivityLifecycleCallback().onActivityCreated(activity, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.xinzhu.overmind.client.hook.c.c().b(com.xinzhu.overmind.client.hook.proxies.app.b.class);
        com.xinzhu.overmind.client.hook.c.c().b(AppInstrumentationHook.class);
    }

    private b g(Instrumentation instrumentation) {
        Iterator<b> it2 = this.f67591b.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.root == instrumentation) {
                return next;
            }
        }
        return null;
    }

    public static AppInstrumentationHook h() {
        if (f67590e == null) {
            synchronized (AppInstrumentationHook.class) {
                if (f67590e == null) {
                    f67590e = new AppInstrumentationHook();
                }
            }
        }
        return f67590e;
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return !(i() instanceof b);
    }

    public Instrumentation i() {
        return new g(Overmind.mainThread()).X();
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public void injectHook() {
        try {
            Instrumentation i4 = i();
            if (i4 instanceof b) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppInstrumentation.injectHook() ");
            sb.append(i4);
            b g4 = g(i4);
            if (g4 == null) {
                g4 = new b();
                g4.root = i4;
                this.f67591b.add(g4);
            }
            new g(Overmind.mainThread()).o0(g4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
