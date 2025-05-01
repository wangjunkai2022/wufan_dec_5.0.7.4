package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes7.dex */
public class ErrorDialogFragments {

    /* renamed from: a  reason: collision with root package name */
    public static int f72394a;

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f72395b;

    @TargetApi(11)
    /* loaded from: classes7.dex */
    public static class Honeycomb extends DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            ErrorDialogFragments.b(dialogInterface, i4, getActivity(), getArguments());
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.a(getActivity(), getArguments(), this);
        }
    }

    /* loaded from: classes7.dex */
    public static class Support extends androidx.fragment.app.DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            ErrorDialogFragments.b(dialogInterface, i4, getActivity(), getArguments());
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.a(getActivity(), getArguments(), this);
        }
    }

    public static Dialog a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(bundle.getString(ErrorDialogManager.f72399d));
        builder.setMessage(bundle.getString(ErrorDialogManager.f72400e));
        int i4 = f72394a;
        if (i4 != 0) {
            builder.setIcon(i4);
        }
        builder.setPositiveButton(17039370, onClickListener);
        return builder.create();
    }

    public static void b(DialogInterface dialogInterface, int i4, Activity activity, Bundle bundle) {
        Class<?> cls = f72395b;
        if (cls != null) {
            try {
                ErrorDialogManager.f72396a.f72431a.c().o(cls.newInstance());
            } catch (Exception e5) {
                throw new RuntimeException("Event cannot be constructed", e5);
            }
        }
        if (!bundle.getBoolean(ErrorDialogManager.f72401f, false) || activity == null) {
            return;
        }
        activity.finish();
    }
}
