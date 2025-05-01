package com.join.mgps.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class LoadingFooter extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    protected State f54016b;

    /* renamed from: c  reason: collision with root package name */
    private View f54017c;

    /* renamed from: d  reason: collision with root package name */
    private View f54018d;

    /* renamed from: e  reason: collision with root package name */
    private View f54019e;

    /* renamed from: f  reason: collision with root package name */
    private ProgressBar f54020f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f54021g;

    /* loaded from: classes4.dex */
    public enum State {
        Normal,
        TheEnd,
        Loading,
        NetWorkError
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f54022a;

        static {
            int[] iArr = new int[State.values().length];
            f54022a = iArr;
            try {
                iArr[State.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54022a[State.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54022a[State.TheEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54022a[State.NetWorkError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LoadingFooter(Context context) {
        super(context);
        this.f54016b = State.Normal;
        a(context);
    }

    public void a(Context context) {
        RelativeLayout.inflate(context, R.layout.sample_common_list_footer, this);
        setOnClickListener(null);
        setState(State.Normal, true);
    }

    public State getState() {
        return this.f54016b;
    }

    public void setState(State state) {
        setState(state, true);
    }

    public void setState(State state, boolean z4) {
        if (this.f54016b == state) {
            return;
        }
        this.f54016b = state;
        int i4 = a.f54022a[state.ordinal()];
        if (i4 == 1) {
            setOnClickListener(null);
            View view = this.f54017c;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f54019e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f54018d;
            if (view3 == null) {
                this.f54018d = ((ViewStub) findViewById(R.id.normal_viewstub)).inflate();
            } else {
                view3.setVisibility(0);
            }
        } else if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            setOnClickListener(null);
            View view4 = this.f54017c;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View view5 = this.f54018d;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.f54019e;
            if (view6 == null) {
                this.f54019e = ((ViewStub) findViewById(R.id.end_viewstub)).inflate();
            } else {
                view6.setVisibility(0);
            }
            this.f54019e.setVisibility(z4 ? 0 : 8);
        } else {
            setOnClickListener(null);
            View view7 = this.f54019e;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            View view8 = this.f54018d;
            if (view8 != null) {
                view8.setVisibility(8);
            }
            View view9 = this.f54017c;
            if (view9 == null) {
                View inflate = ((ViewStub) findViewById(R.id.loading_viewstub)).inflate();
                this.f54017c = inflate;
                this.f54020f = (ProgressBar) inflate.findViewById(R.id.loading_progress);
            } else {
                view9.setVisibility(0);
            }
            this.f54017c.setVisibility(z4 ? 0 : 8);
            this.f54020f.setVisibility(0);
        }
    }

    public LoadingFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54016b = State.Normal;
        a(context);
    }

    public LoadingFooter(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f54016b = State.Normal;
        a(context);
    }
}
