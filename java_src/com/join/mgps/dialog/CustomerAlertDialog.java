package com.join.mgps.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CustomerAlertDialog extends DialogFragment {

    /* renamed from: f  reason: collision with root package name */
    private static final String f49036f = CustomerAlertDialog.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    private static final String f49037g = "title";

    /* renamed from: h  reason: collision with root package name */
    private static final String f49038h = "hint";

    /* renamed from: i  reason: collision with root package name */
    private static final String f49039i = "cancel_str";

    /* renamed from: j  reason: collision with root package name */
    private static final String f49040j = "ok_str";

    /* renamed from: b  reason: collision with root package name */
    TextView f49041b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49042c;

    /* renamed from: d  reason: collision with root package name */
    Button f49043d;

    /* renamed from: e  reason: collision with root package name */
    Button f49044e;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CustomerAlertDialog.this.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            org.greenrobot.eventbus.c.f().o("ok");
            CustomerAlertDialog.this.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class c implements DialogInterface.OnKeyListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            return i4 == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    public static CustomerAlertDialog a(String str, String str2, String str3, String str4) {
        CustomerAlertDialog customerAlertDialog = new CustomerAlertDialog();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("hint", str2);
        bundle.putString(f49039i, str3);
        bundle.putString(f49040j, str4);
        customerAlertDialog.setArguments(bundle);
        return customerAlertDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity(), R.style.MyDialog);
        View inflate = ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.dialog_customer_alert, (ViewGroup) null, false);
        this.f49041b = (TextView) inflate.findViewById(R.id.tip_title);
        this.f49042c = (TextView) inflate.findViewById(R.id.dialog_content);
        this.f49043d = (Button) inflate.findViewById(R.id.dialog_button_cancle);
        this.f49044e = (Button) inflate.findViewById(R.id.dialog_button_ok);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f49041b.setText(arguments.getString("title"));
            this.f49042c.setText(arguments.getString("hint"));
            this.f49043d.setText(arguments.getString(f49039i));
            this.f49044e.setText(arguments.getString(f49040j));
        }
        this.f49043d.setOnClickListener(new a());
        this.f49044e.setOnClickListener(new b());
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnKeyListener(new c());
        return dialog;
    }
}
