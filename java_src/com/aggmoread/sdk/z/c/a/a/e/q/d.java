package com.aggmoread.sdk.z.c.a.a.e.q;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.app.VoiceInteractor;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes2.dex */
public class d extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private Activity f3536a;

    public d(Activity activity) {
        if (activity != null) {
            this.f3536a = activity;
            attachBaseContext(activity.getBaseContext());
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3536a.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        this.f3536a.finish();
    }

    @Override // android.app.Activity
    public void finishActivity(int i4) {
        this.f3536a.finishActivity(i4);
    }

    @Override // android.app.Activity
    public void finishActivityFromChild(@NonNull Activity activity, int i4) {
        this.f3536a.finishActivityFromChild(activity, i4);
    }

    @Override // android.app.Activity
    public void finishAffinity() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3536a.finishAffinity();
        } else {
            super.finishAffinity();
        }
    }

    @Override // android.app.Activity
    public void finishAfterTransition() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536a.finishAfterTransition();
        } else {
            super.finishAfterTransition();
        }
    }

    @Override // android.app.Activity
    public void finishAndRemoveTask() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536a.finishAndRemoveTask();
        } else {
            super.finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public void finishFromChild(Activity activity) {
        this.f3536a.finishFromChild(activity);
    }

    @Override // android.app.Activity
    @Nullable
    public ActionBar getActionBar() {
        return this.f3536a.getActionBar();
    }

    @Override // android.app.Activity
    @Nullable
    public ComponentName getCallingActivity() {
        return this.f3536a.getCallingActivity();
    }

    @Override // android.app.Activity
    @Nullable
    public String getCallingPackage() {
        return this.f3536a.getCallingPackage();
    }

    @Override // android.app.Activity
    public int getChangingConfigurations() {
        return this.f3536a.getChangingConfigurations();
    }

    @Override // android.app.Activity
    public ComponentName getComponentName() {
        return this.f3536a.getComponentName();
    }

    @Override // android.app.Activity
    public Scene getContentScene() {
        return Build.VERSION.SDK_INT >= 21 ? this.f3536a.getContentScene() : super.getContentScene();
    }

    @Override // android.app.Activity
    public TransitionManager getContentTransitionManager() {
        return Build.VERSION.SDK_INT >= 21 ? this.f3536a.getContentTransitionManager() : super.getContentTransitionManager();
    }

    @Override // android.app.Activity
    @Nullable
    public View getCurrentFocus() {
        return this.f3536a.getCurrentFocus();
    }

    @Override // android.app.Activity
    public FragmentManager getFragmentManager() {
        return this.f3536a.getFragmentManager();
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        return this.f3536a.getIntent();
    }

    @Override // android.app.Activity
    @Nullable
    public Object getLastNonConfigurationInstance() {
        return this.f3536a.getLastNonConfigurationInstance();
    }

    @Override // android.app.Activity
    @NonNull
    public LayoutInflater getLayoutInflater() {
        return this.f3536a.getLayoutInflater();
    }

    @Override // android.app.Activity
    public LoaderManager getLoaderManager() {
        return this.f3536a.getLoaderManager();
    }

    @Override // android.app.Activity
    @NonNull
    public String getLocalClassName() {
        return this.f3536a.getLocalClassName();
    }

    @Override // android.app.Activity
    public int getMaxNumPictureInPictureActions() {
        return Build.VERSION.SDK_INT >= 26 ? this.f3536a.getMaxNumPictureInPictureActions() : super.getMaxNumPictureInPictureActions();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return this.f3536a.getMenuInflater();
    }

    @Override // android.app.Activity
    @Nullable
    public Intent getParentActivityIntent() {
        return Build.VERSION.SDK_INT >= 16 ? this.f3536a.getParentActivityIntent() : super.getParentActivityIntent();
    }

    @Override // android.app.Activity
    public SharedPreferences getPreferences(int i4) {
        return this.f3536a.getPreferences(i4);
    }

    @Override // android.app.Activity
    @Nullable
    public Uri getReferrer() {
        return Build.VERSION.SDK_INT >= 22 ? this.f3536a.getReferrer() : super.getReferrer();
    }

    @Override // android.app.Activity
    public int getRequestedOrientation() {
        return this.f3536a.getRequestedOrientation();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(@NonNull String str) {
        return this.f3536a.getSystemService(str);
    }

    @Override // android.app.Activity
    public int getTaskId() {
        return this.f3536a.getTaskId();
    }

    @Override // android.app.Activity
    public VoiceInteractor getVoiceInteractor() {
        return Build.VERSION.SDK_INT >= 23 ? this.f3536a.getVoiceInteractor() : super.getVoiceInteractor();
    }

    @Override // android.app.Activity
    public Window getWindow() {
        return this.f3536a.getWindow();
    }

    @Override // android.app.Activity
    public WindowManager getWindowManager() {
        return this.f3536a.getWindowManager();
    }

    @Override // android.app.Activity
    public boolean isChangingConfigurations() {
        return this.f3536a.isChangingConfigurations();
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return Build.VERSION.SDK_INT >= 17 ? this.f3536a.isDestroyed() : super.isDestroyed();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return this.f3536a.isFinishing();
    }

    @Override // android.app.Activity
    public boolean isImmersive() {
        return Build.VERSION.SDK_INT >= 18 ? this.f3536a.isImmersive() : super.isImmersive();
    }

    @Override // android.app.Activity
    public boolean isTaskRoot() {
        return this.f3536a.isTaskRoot();
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z4) {
        return this.f3536a.moveTaskToBack(z4);
    }

    @Override // android.app.Activity
    public boolean navigateUpTo(Intent intent) {
        return Build.VERSION.SDK_INT >= 16 ? this.f3536a.navigateUpTo(intent) : super.navigateUpTo(intent);
    }

    @Override // android.app.Activity
    public boolean navigateUpToFromChild(Activity activity, Intent intent) {
        return Build.VERSION.SDK_INT >= 16 ? this.f3536a.navigateUpToFromChild(activity, intent) : super.navigateUpToFromChild(activity, intent);
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i4, Intent intent) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536a.onActivityReenter(i4, intent);
        } else {
            super.onActivityReenter(i4, intent);
        }
    }

    @Override // android.app.Activity
    public boolean releaseInstance() {
        return Build.VERSION.SDK_INT >= 21 ? this.f3536a.releaseInstance() : super.releaseInstance();
    }

    @Override // android.app.Activity
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent dragEvent) {
        return Build.VERSION.SDK_INT >= 24 ? this.f3536a.requestDragAndDropPermissions(dragEvent) : super.requestDragAndDropPermissions(dragEvent);
    }

    @Override // android.app.Activity
    public void setShowWhenLocked(boolean z4) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.f3536a.setShowWhenLocked(z4);
        } else {
            super.setShowWhenLocked(z4);
        }
    }

    @Override // android.app.Activity
    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536a.setTaskDescription(taskDescription);
        } else {
            super.setTaskDescription(taskDescription);
        }
    }

    @Override // android.app.Activity
    public void setTurnScreenOn(boolean z4) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.f3536a.setTurnScreenOn(z4);
        } else {
            super.setTurnScreenOn(z4);
        }
    }

    @Override // android.app.Activity
    public void setVisible(boolean z4) {
        this.f3536a.setVisible(z4);
    }

    @Override // android.app.Activity
    public boolean shouldUpRecreateTask(Intent intent) {
        return Build.VERSION.SDK_INT >= 16 ? this.f3536a.shouldUpRecreateTask(intent) : super.shouldUpRecreateTask(intent);
    }

    @Override // android.app.Activity
    public void showLockTaskEscapeMessage() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3536a.showLockTaskEscapeMessage();
        } else {
            super.showLockTaskEscapeMessage();
        }
    }

    @Override // android.app.Activity
    public void startLockTask() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536a.startLockTask();
        } else {
            super.startLockTask();
        }
    }

    @Override // android.app.Activity
    public void stopLockTask() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536a.stopLockTask();
        } else {
            super.stopLockTask();
        }
    }
}
