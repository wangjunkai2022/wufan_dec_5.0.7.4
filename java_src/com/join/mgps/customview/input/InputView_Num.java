package com.join.mgps.customview.input;

import android.content.Context;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.c0;
import com.join.mgps.Util.g2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class InputView_Num extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f48528b;

    /* renamed from: c  reason: collision with root package name */
    private a f48529c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f48530d;

    /* renamed from: e  reason: collision with root package name */
    private List<EditText> f48531e;

    /* renamed from: f  reason: collision with root package name */
    private int f48532f;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    public InputView_Num(Context context) {
        super(context);
        this.f48528b = 5;
        this.f48530d = new ArrayList();
        this.f48531e = new ArrayList();
        this.f48532f = -1;
    }

    private void d(TextView textView, String str) {
        if (g2.h(str)) {
            textView.setBackgroundResource(R.drawable.bg_input_rect);
        } else {
            textView.setBackgroundResource(R.drawable.bg_input_rect_hasinput);
        }
        textView.setText(str);
    }

    private String getNums() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f48530d) {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, boolean z4) {
        int i4 = this.f48532f + 1;
        this.f48532f = i4;
        if (i4 >= this.f48528b) {
            this.f48532f = i4 - 1;
            return;
        }
        this.f48530d.add(str);
        d(this.f48531e.get(this.f48532f), str);
        if (this.f48532f == this.f48528b - 1 && z4) {
            this.f48532f = 0;
            this.f48529c.a(getNums());
        }
    }

    public void b() {
        List<EditText> list = this.f48531e;
        if (list != null) {
            list.clear();
            this.f48531e = null;
        }
        List<String> list2 = this.f48530d;
        if (list2 != null) {
            list2.clear();
            this.f48530d = null;
        }
        this.f48532f = 0;
    }

    public void c() {
        List<String> list;
        int i4 = this.f48532f;
        if (i4 < 0 || (list = this.f48530d) == null) {
            return;
        }
        if (i4 < list.size()) {
            this.f48530d.remove(this.f48532f);
            d(this.f48531e.get(this.f48532f), "");
            int i5 = this.f48532f - 1;
            this.f48532f = i5;
            if (i5 < 0) {
                this.f48529c.a("");
                this.f48532f = 0;
                return;
            }
            return;
        }
        int i6 = this.f48532f - 1;
        this.f48532f = i6;
        if (i6 < 0) {
            this.f48529c.a("");
            this.f48532f = 0;
        }
    }

    public void setNumLengthAndIsPwd(int i4, boolean z4) {
        int a5 = c0.a(getContext(), 9.0f);
        this.f48528b = i4;
        this.f48531e.clear();
        this.f48530d.clear();
        for (int i5 = 0; i5 < this.f48528b; i5++) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_rect_box, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(R.id.et_value);
            if (z4) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f48531e.add(editText);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i5 != this.f48528b - 1) {
                layoutParams.rightMargin = a5;
            }
            addView(inflate, layoutParams);
        }
    }

    public void setOnFinishListener(a aVar) {
        this.f48529c = aVar;
    }

    public InputView_Num(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48528b = 5;
        this.f48530d = new ArrayList();
        this.f48531e = new ArrayList();
        this.f48532f = -1;
    }
}
