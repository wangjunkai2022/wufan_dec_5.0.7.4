package com.join.mgps.customview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CellClassifyItem extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f46466b;

    /* renamed from: c  reason: collision with root package name */
    private int f46467c;

    /* renamed from: d  reason: collision with root package name */
    private String f46468d;

    /* renamed from: e  reason: collision with root package name */
    private String f46469e;

    /* renamed from: f  reason: collision with root package name */
    private String f46470f;

    /* renamed from: g  reason: collision with root package name */
    private int f46471g;

    /* renamed from: h  reason: collision with root package name */
    private SimpleDraweeView f46472h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f46473i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f46474j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f46475k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f46476l;

    /* renamed from: m  reason: collision with root package name */
    private LinearLayout f46477m;

    public CellClassifyItem(Context context) {
        super(context);
        this.f46467c = R.drawable.main_normal_icon;
        a();
    }

    private void a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_classify_item, (ViewGroup) null);
        this.f46472h = (SimpleDraweeView) inflate.findViewById(R.id.onlin_icon);
        this.f46473i = (TextView) inflate.findViewById(R.id.name);
        this.f46477m = (LinearLayout) inflate.findViewById(R.id.nameParent);
        this.f46474j = (TextView) inflate.findViewById(R.id.desc);
        this.f46475k = (TextView) inflate.findViewById(R.id.onlin_number_tip);
        this.f46476l = (TextView) inflate.findViewById(R.id.onlin_number);
        addView(inflate, -1, -1);
        setmIconRes(this.f46467c);
        setmName(this.f46469e);
        setmDesc(this.f46470f);
        setCountTip(this.f46471g);
    }

    public int getmCount() {
        return this.f46471g;
    }

    public String getmDesc() {
        return this.f46470f;
    }

    public int getmIconRes() {
        return this.f46467c;
    }

    public String getmIconSrc() {
        return this.f46468d;
    }

    public int getmId() {
        return this.f46466b;
    }

    public String getmName() {
        return this.f46469e;
    }

    public void setCountFlag(int i4) {
        setmCount(i4);
        TextView textView = this.f46476l;
        textView.setText(i4 + "");
    }

    public void setCountTip(int i4) {
        setmCount(i4);
        try {
            Resources resources = getContext().getResources();
            String string = resources.getString(R.string.game_count_tip, i4 + "");
            int indexOf = string.indexOf(i4 + "");
            int length = (i4 + "").length() + indexOf;
            SpannableString spannableString = new SpannableString(string);
            if (length <= string.length()) {
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FC9234")), indexOf, length, 33);
            }
            TextView textView = this.f46475k;
            if (textView != null) {
                textView.setText(spannableString);
            }
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
    }

    public void setDescVisibility(int i4) {
        TextView textView = this.f46474j;
        if (textView != null) {
            textView.setVisibility(i4);
            if (i4 != 8 && i4 != 4) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f46477m.getLayoutParams();
                layoutParams.addRule(6, R.id.onlin_icon);
                layoutParams.addRule(15, 0);
                this.f46477m.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f46477m.getLayoutParams();
            layoutParams2.addRule(6, 0);
            layoutParams2.addRule(15, -1);
            this.f46477m.setLayoutParams(layoutParams2);
        }
    }

    public void setmCount(int i4) {
        this.f46471g = i4;
    }

    public void setmDesc(String str) {
        this.f46470f = str;
        TextView textView = this.f46474j;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setmIconRes(int i4) {
        this.f46467c = i4;
        MyImageLoader.d(this.f46472h, i4, MyImageLoader.F(getContext(), i4).toString());
    }

    public void setmIconSrc(String str) {
        this.f46468d = str;
        MyImageLoader.d(this.f46472h, this.f46467c, str);
    }

    public void setmId(int i4) {
        this.f46466b = i4;
    }

    public void setmName(String str) {
        this.f46469e = str;
        TextView textView = this.f46473i;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public CellClassifyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46467c = R.drawable.main_normal_icon;
        a();
    }

    public CellClassifyItem(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46467c = R.drawable.main_normal_icon;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellClassifyItem, i4, 0);
        this.f46467c = obtainStyledAttributes.getInt(0, R.drawable.main_normal_icon);
        this.f46469e = obtainStyledAttributes.getString(3);
        this.f46470f = obtainStyledAttributes.getString(2);
        this.f46471g = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        a();
    }
}
