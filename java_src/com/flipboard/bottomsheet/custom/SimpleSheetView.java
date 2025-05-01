package com.flipboard.bottomsheet.custom;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import com.flipboard.bottomsheet.custom.a;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class SimpleSheetView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    protected final ListView f12883b;

    /* renamed from: c  reason: collision with root package name */
    protected final TextView f12884c;

    /* renamed from: d  reason: collision with root package name */
    protected final View f12885d;

    /* renamed from: e  reason: collision with root package name */
    protected final d f12886e;

    /* renamed from: f  reason: collision with root package name */
    protected final List<c> f12887f;

    /* renamed from: g  reason: collision with root package name */
    protected b f12888g;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f12889b;

        a(d dVar) {
            this.f12889b = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f12889b.onClose();
        }
    }

    /* loaded from: classes3.dex */
    private class b extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private final Context f12891b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c> f12892c;

        /* renamed from: d  reason: collision with root package name */
        private LayoutInflater f12893d;

        /* loaded from: classes3.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f12895b;

            a(c cVar) {
                this.f12895b = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d dVar = SimpleSheetView.this.f12886e;
                if (dVar != null) {
                    dVar.a(this.f12895b);
                }
            }
        }

        /* renamed from: com.flipboard.bottomsheet.custom.SimpleSheetView$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0287b {

            /* renamed from: a  reason: collision with root package name */
            final ImageView f12897a;

            /* renamed from: b  reason: collision with root package name */
            final TextView f12898b;

            /* renamed from: c  reason: collision with root package name */
            final TextView f12899c;

            /* renamed from: d  reason: collision with root package name */
            final View f12900d;

            C0287b(View view) {
                this.f12897a = (ImageView) view.findViewById(R.id.icon);
                this.f12898b = (TextView) view.findViewById(R.id.title);
                this.f12899c = (TextView) view.findViewById(R.id.desc);
                this.f12900d = view.findViewById(R.id.download);
            }
        }

        public b(Context context, List<c> list) {
            this.f12891b = context;
            this.f12892c = list;
            this.f12893d = LayoutInflater.from(context);
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public c getItem(int i4) {
            return this.f12892c.get(i4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f12892c.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return this.f12892c.get(i4).f12902a.hashCode();
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            C0287b c0287b;
            if (view == null) {
                view = this.f12893d.inflate(R.layout.simple_sheet_item, viewGroup, false);
                c0287b = new C0287b(view);
                view.setTag(c0287b);
            } else {
                c0287b = (C0287b) view.getTag();
            }
            c cVar = this.f12892c.get(i4);
            c0287b.f12898b.setText(cVar.f12903b);
            c0287b.f12899c.setText(cVar.f12904c);
            c0287b.f12900d.setOnClickListener(new a(cVar));
            return view;
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f12902a;

        /* renamed from: b  reason: collision with root package name */
        public String f12903b;

        /* renamed from: c  reason: collision with root package name */
        public String f12904c;

        /* renamed from: d  reason: collision with root package name */
        public String f12905d;

        /* renamed from: e  reason: collision with root package name */
        public String f12906e;

        public c(String str, String str2, String str3) {
            this.f12902a = str;
            this.f12903b = str2;
            this.f12904c = str3;
        }

        public String a() {
            return this.f12906e;
        }

        public String b() {
            return this.f12905d;
        }

        public void c(String str) {
            this.f12906e = str;
        }

        public void d(String str) {
            this.f12905d = str;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(c cVar);

        void b(c cVar);

        void onClose();
    }

    public SimpleSheetView(Context context, @StringRes int i4, d dVar) {
        this(context, context.getString(i4), dVar);
    }

    public List<c> getMixins() {
        return this.f12887f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = new b(getContext(), this.f12887f);
        this.f12888g = bVar;
        this.f12883b.setAdapter((ListAdapter) bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        View.MeasureSpec.getSize(i4);
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a.C0288a(i4, i5));
        }
    }

    public void setMixins(@NonNull List<c> list) {
        this.f12887f.clear();
        this.f12887f.addAll(list);
    }

    public void setTitle(String str) {
        TextView textView = this.f12884c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public SimpleSheetView(Context context, String str, d dVar) {
        super(context);
        this.f12887f = new ArrayList();
        FrameLayout.inflate(context, R.layout.simple_sheet_view, this);
        this.f12883b = (ListView) findViewById(R.id.list);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f12884c = textView;
        View findViewById = findViewById(R.id.close);
        this.f12885d = findViewById;
        textView.setText(str);
        this.f12886e = dVar;
        findViewById.setOnClickListener(new a(dVar));
        ViewCompat.setElevation(this, com.flipboard.bottomsheet.custom.a.a(getContext(), 16.0f));
    }
}
