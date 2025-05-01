package com.join.android.app.component.optimizetext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: StaticLayoutManager.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f15152d = 15;

    /* renamed from: e  reason: collision with root package name */
    public static final int f15153e = 100;

    /* renamed from: b  reason: collision with root package name */
    private Context f15155b;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, StaticLayout> f15154a = new LruCache<>(100);

    /* renamed from: c  reason: collision with root package name */
    private int f15156c = 15;

    public b(Context context) {
        this.f15155b = context;
    }

    private ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split("")) {
            arrayList.add(str2);
        }
        return arrayList;
    }

    private String b(String str, int i4, int i5, TextPaint textPaint) {
        ArrayList<String> a5 = a(str);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = a5.iterator();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (i6 == i5) {
                sb.setLength(sb.length() - 4);
                sb.append("...");
                break;
            } else if (next.equals("\n\r") || next.equals("\n")) {
                i6++;
                sb.append(next);
            } else if (i7 <= 20) {
                sb.append(next);
                i7++;
            } else if (((int) Layout.getDesiredWidth(sb.toString(), i8, sb.length(), textPaint)) < i4) {
                i7++;
                sb.append(next);
            } else {
                i6++;
                i8 = sb.length() - 2;
                sb.append(next);
                i7 = 0;
            }
        }
        return sb.toString();
    }

    private void c(SpannableStringBuilder spannableStringBuilder, int i4, int i5, TextPaint textPaint) {
        try {
            ArrayList<String> a5 = a(spannableStringBuilder.toString());
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = a5.iterator();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (it2.hasNext()) {
                String next = it2.next();
                if (i6 == i5) {
                    int length = sb.length();
                    if (length > 4) {
                        length = sb.length() - 4;
                    }
                    sb.setLength(length);
                    spannableStringBuilder.delete(sb.length(), spannableStringBuilder.length());
                    spannableStringBuilder.append("...");
                    sb.append("...");
                    return;
                }
                if (!next.equals("\n\r") && !next.equals("\n")) {
                    if (i7 <= 20) {
                        sb.append(next);
                        i7++;
                    } else if (((int) Layout.getDesiredWidth(sb.toString(), i8, sb.length(), textPaint)) < i4) {
                        i7++;
                        sb.append(next);
                    } else {
                        i6++;
                        i8 = sb.length() - 2;
                        sb.append(next);
                        i7 = 0;
                    }
                }
                i6++;
                sb.append(next);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public StaticLayout d(String str) {
        return this.f15154a.get(str);
    }

    public void e(c cVar) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.density = this.f15155b.getResources().getDisplayMetrics().density;
        textPaint.setTextSize(this.f15155b.getResources().getDimension(R.dimen.wdp28));
        textPaint.setColor(Color.parseColor("#909090"));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Canvas canvas = new Canvas();
        String b5 = cVar.b();
        SpannableStringBuilder a5 = cVar.a();
        int g4 = a.g() - (this.f15155b.getResources().getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
        if (TextUtils.isEmpty(a5) || this.f15154a.get(b5) != null) {
            return;
        }
        c(a5, g4, 2, textPaint);
        StaticLayout staticLayout = new StaticLayout(a5, textPaint, g4, alignment, 1.2f, 0.0f, true);
        staticLayout.draw(canvas);
        this.f15154a.put(b5, staticLayout);
    }

    public void f(c cVar, int i4) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.density = this.f15155b.getResources().getDisplayMetrics().density;
        textPaint.setTextSize(a.s(this.f15156c));
        textPaint.setColor(Color.parseColor("#4A4A4A"));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Canvas canvas = new Canvas();
        String b5 = cVar.b();
        SpannableStringBuilder a5 = cVar.a();
        int g4 = a.g() - (this.f15155b.getResources().getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
        if (TextUtils.isEmpty(a5) || this.f15154a.get(b5) != null) {
            return;
        }
        if (i4 != -1) {
            c(a5, g4, i4, textPaint);
        }
        StaticLayout staticLayout = new StaticLayout(a5, textPaint, g4, alignment, 1.2f, 0.0f, true);
        staticLayout.draw(canvas);
        this.f15154a.put(b5, staticLayout);
    }

    public void g(List<? extends c> list, int i4) {
        h(list, a.g() - a.a(13.0f), i4);
    }

    public void h(List<? extends c> list, int i4, int i5) {
        int i6 = i5;
        TextPaint textPaint = new TextPaint(1);
        textPaint.density = this.f15155b.getResources().getDisplayMetrics().density;
        textPaint.setTextSize(a.s(this.f15156c));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Canvas canvas = new Canvas();
        int size = list.size();
        if (size != 0) {
            synchronized (list) {
                int i7 = 0;
                while (i7 < size) {
                    String b5 = list.get(i7).b();
                    String spannableStringBuilder = list.get(i7).a().toString();
                    if (!TextUtils.isEmpty(spannableStringBuilder) && this.f15154a.get(b5) == null) {
                        if (i6 != -1) {
                            spannableStringBuilder = b(spannableStringBuilder, i4, i6, textPaint);
                        }
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i4, alignment, 1.0f, 0.0f, true);
                        staticLayout.draw(canvas);
                        this.f15154a.put(b5, staticLayout);
                    }
                    i7++;
                    i6 = i5;
                }
            }
        }
    }

    public void i(String str) {
        this.f15154a.remove(str);
    }

    public b j(int i4) {
        this.f15156c = i4;
        return this;
    }

    public void k(int i4) {
        this.f15154a.trimToSize(i4);
    }
}
