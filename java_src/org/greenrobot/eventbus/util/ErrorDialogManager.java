package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
/* loaded from: classes7.dex */
public class ErrorDialogManager {

    /* renamed from: a  reason: collision with root package name */
    public static c<?> f72396a = null;

    /* renamed from: b  reason: collision with root package name */
    protected static final String f72397b = "de.greenrobot.eventbus.error_dialog";

    /* renamed from: c  reason: collision with root package name */
    protected static final String f72398c = "de.greenrobot.eventbus.error_dialog_manager";

    /* renamed from: d  reason: collision with root package name */
    public static final String f72399d = "de.greenrobot.eventbus.errordialog.title";

    /* renamed from: e  reason: collision with root package name */
    public static final String f72400e = "de.greenrobot.eventbus.errordialog.message";

    /* renamed from: f  reason: collision with root package name */
    public static final String f72401f = "de.greenrobot.eventbus.errordialog.finish_after_dialog";

    /* renamed from: g  reason: collision with root package name */
    public static final String f72402g = "de.greenrobot.eventbus.errordialog.icon_id";

    /* renamed from: h  reason: collision with root package name */
    public static final String f72403h = "de.greenrobot.eventbus.errordialog.event_type_on_close";

    @TargetApi(11)
    /* loaded from: classes7.dex */
    public static class HoneycombManagerFragment extends Fragment {

        /* renamed from: b  reason: collision with root package name */
        protected boolean f72404b;

        /* renamed from: c  reason: collision with root package name */
        protected Bundle f72405c;

        /* renamed from: d  reason: collision with root package name */
        private org.greenrobot.eventbus.c f72406d;

        /* renamed from: e  reason: collision with root package name */
        private Object f72407e;

        public static void a(Activity activity, Object obj, boolean z4, Bundle bundle) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            HoneycombManagerFragment honeycombManagerFragment = (HoneycombManagerFragment) fragmentManager.findFragmentByTag(ErrorDialogManager.f72398c);
            if (honeycombManagerFragment == null) {
                honeycombManagerFragment = new HoneycombManagerFragment();
                fragmentManager.beginTransaction().add(honeycombManagerFragment, ErrorDialogManager.f72398c).commit();
                fragmentManager.executePendingTransactions();
            }
            honeycombManagerFragment.f72404b = z4;
            honeycombManagerFragment.f72405c = bundle;
            honeycombManagerFragment.f72407e = obj;
        }

        public void b(f fVar) {
            if (ErrorDialogManager.g(this.f72407e, fVar)) {
                ErrorDialogManager.f(fVar);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(ErrorDialogManager.f72397b);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                DialogFragment dialogFragment2 = (DialogFragment) ErrorDialogManager.f72396a.d(fVar, this.f72404b, this.f72405c);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, ErrorDialogManager.f72397b);
                }
            }
        }

        @Override // android.app.Fragment
        public void onPause() {
            this.f72406d.y(this);
            super.onPause();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            org.greenrobot.eventbus.c c5 = ErrorDialogManager.f72396a.f72431a.c();
            this.f72406d = c5;
            c5.t(this);
        }
    }

    /* loaded from: classes7.dex */
    public static class SupportManagerFragment extends androidx.fragment.app.Fragment {

        /* renamed from: b  reason: collision with root package name */
        protected boolean f72408b;

        /* renamed from: c  reason: collision with root package name */
        protected Bundle f72409c;

        /* renamed from: d  reason: collision with root package name */
        private org.greenrobot.eventbus.c f72410d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f72411e;

        /* renamed from: f  reason: collision with root package name */
        private Object f72412f;

        public static void V(Activity activity, Object obj, boolean z4, Bundle bundle) {
            androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            SupportManagerFragment supportManagerFragment = (SupportManagerFragment) supportFragmentManager.findFragmentByTag(ErrorDialogManager.f72398c);
            if (supportManagerFragment == null) {
                supportManagerFragment = new SupportManagerFragment();
                supportFragmentManager.beginTransaction().add(supportManagerFragment, ErrorDialogManager.f72398c).commit();
                supportFragmentManager.executePendingTransactions();
            }
            supportManagerFragment.f72408b = z4;
            supportManagerFragment.f72409c = bundle;
            supportManagerFragment.f72412f = obj;
        }

        public void W(f fVar) {
            if (ErrorDialogManager.g(this.f72412f, fVar)) {
                ErrorDialogManager.f(fVar);
                androidx.fragment.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) fragmentManager.findFragmentByTag(ErrorDialogManager.f72397b);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                androidx.fragment.app.DialogFragment dialogFragment2 = (androidx.fragment.app.DialogFragment) ErrorDialogManager.f72396a.d(fVar, this.f72408b, this.f72409c);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, ErrorDialogManager.f72397b);
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            org.greenrobot.eventbus.c c5 = ErrorDialogManager.f72396a.f72431a.c();
            this.f72410d = c5;
            c5.t(this);
            this.f72411e = true;
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            this.f72410d.y(this);
            super.onPause();
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            if (this.f72411e) {
                this.f72411e = false;
                return;
            }
            org.greenrobot.eventbus.c c5 = ErrorDialogManager.f72396a.f72431a.c();
            this.f72410d = c5;
            c5.t(this);
        }
    }

    public static void b(Activity activity) {
        e(activity, false, null);
    }

    public static void c(Activity activity, Object obj, boolean z4, Bundle bundle) {
        if (f72396a != null) {
            if (h(activity)) {
                SupportManagerFragment.V(activity, obj, z4, bundle);
                return;
            } else {
                HoneycombManagerFragment.a(activity, obj, z4, bundle);
                return;
            }
        }
        throw new RuntimeException("You must set the static factory field to configure error dialogs for your app.");
    }

    public static void d(Activity activity, boolean z4) {
        e(activity, z4, null);
    }

    public static void e(Activity activity, boolean z4, Bundle bundle) {
        c(activity, activity.getClass(), z4, bundle);
    }

    protected static void f(f fVar) {
        b bVar = f72396a.f72431a;
        if (bVar.f72427f) {
            if (bVar.f72428g == null) {
                String str = org.greenrobot.eventbus.c.f72303q;
            }
            Throwable th = fVar.f72433a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Object obj, f fVar) {
        Object a5;
        return fVar == null || (a5 = fVar.a()) == null || a5.equals(obj);
    }

    private static boolean h(Activity activity) {
        String name;
        Class<?> cls = activity.getClass();
        do {
            cls = cls.getSuperclass();
            if (cls != null) {
                name = cls.getName();
                if (name.equals("androidx.fragment.app.FragmentActivity")) {
                    return true;
                }
                if (name.startsWith("com.actionbarsherlock.app") && (name.endsWith(".SherlockActivity") || name.endsWith(".SherlockListActivity") || name.endsWith(".SherlockPreferenceActivity"))) {
                    throw new RuntimeException("Please use SherlockFragmentActivity. Illegal activity: " + name);
                }
            } else {
                throw new RuntimeException("Illegal activity type: " + activity.getClass());
            }
        } while (!name.equals("android.app.Activity"));
        if (Build.VERSION.SDK_INT >= 11) {
            return false;
        }
        throw new RuntimeException("Illegal activity without fragment support. Either use Android 3.0+ or android.support.v4.app.FragmentActivity.");
    }
}
