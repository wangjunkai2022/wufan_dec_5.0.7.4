package com.join.mgps.customview.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.input.InputView_Num;
/* loaded from: classes4.dex */
public class InputNumView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private Context f48517b;

    /* renamed from: c  reason: collision with root package name */
    private View f48518c;

    /* renamed from: d  reason: collision with root package name */
    private GridView f48519d;

    /* renamed from: e  reason: collision with root package name */
    private InputView_Num f48520e;

    /* renamed from: f  reason: collision with root package name */
    private d f48521f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f48522g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (InputNumView.this.f48521f != null) {
                InputNumView.this.f48521f.hide();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 == 11) {
                InputNumView.this.f48520e.c();
            } else if (i4 == 10) {
                InputNumView.this.f48520e.a("0", true);
            } else if (i4 == 9) {
            } else {
                InputNumView.this.f48520e.a(String.valueOf(i4 + 1), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements InputView_Num.a {
        c() {
        }

        @Override // com.join.mgps.customview.input.InputView_Num.a
        public void a(String str) {
            if (InputNumView.this.f48521f != null) {
                InputNumView.this.f48521f.a(str);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(String str);

        void hide();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends BaseAdapter {
        e() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return 12;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(InputNumView.this.f48517b).inflate(R.layout.item_inputviewlist, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.myInputPwdListItem_tv);
            if (i4 == 9) {
                textView.setVisibility(8);
                inflate.findViewById(R.id.myInputPwdListItem_delete).setVisibility(8);
            } else if (i4 == 10) {
                inflate.findViewById(R.id.myInputPwdListItem_delete).setVisibility(8);
                textView.setVisibility(0);
                textView.setText("0");
            } else if (i4 == 11) {
                inflate.findViewById(R.id.myInputPwdListItem_delete).setVisibility(0);
                textView.setVisibility(8);
            } else {
                textView.setText((i4 + 1) + "");
                inflate.findViewById(R.id.myInputPwdListItem_delete).setVisibility(8);
                textView.setVisibility(0);
            }
            return inflate;
        }
    }

    public InputNumView(Context context) {
        super(context);
        e();
    }

    private void f() {
        this.f48518c.setOnClickListener(new a());
        this.f48519d.setOnItemClickListener(new b());
        this.f48520e.setOnFinishListener(new c());
    }

    public void d() {
        this.f48520e.b();
    }

    public void e() {
        Context context = getContext();
        this.f48517b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_input, this);
        this.f48522g = (TextView) inflate.findViewById(R.id.tv_title);
        this.f48518c = inflate.findViewById(R.id.iv_close);
        this.f48519d = (GridView) inflate.findViewById(R.id.MyPwdInput_list);
        this.f48520e = (InputView_Num) findViewById(R.id.MyPwdInput_inputpwd);
        this.f48519d.setAdapter((ListAdapter) new e());
        f();
    }

    public void setCurrentPwd(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            this.f48520e.a(String.valueOf(str.charAt(i4)), false);
        }
    }

    public void setListener(d dVar) {
        this.f48521f = dVar;
    }

    public void setNumLengthAndIsPwd(int i4, boolean z4) {
        this.f48520e.setNumLengthAndIsPwd(i4, z4);
    }

    public void setTitle(String str) {
        this.f48522g.setText(str);
    }

    public InputNumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public InputNumView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        e();
    }
}
