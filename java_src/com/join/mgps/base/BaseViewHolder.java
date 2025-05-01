package com.join.mgps.base;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes4.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private BaseQuickAdapter adapter;
    Object associatedObject;
    private final LinkedHashSet<Integer> childClickViewIds;
    @Deprecated
    public View convertView;
    private final LinkedHashSet<Integer> itemChildLongClickViewIds;
    private final HashSet<Integer> nestViews;
    private final SparseArray<View> views;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BaseViewHolder.this.adapter.getOnItemChildClickListener() != null) {
                BaseViewHolder.this.adapter.getOnItemChildClickListener().onItemChildClick(BaseViewHolder.this.adapter, view, BaseViewHolder.this.getClickPosition());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return BaseViewHolder.this.adapter.getOnItemChildLongClickListener() != null && BaseViewHolder.this.adapter.getOnItemChildLongClickListener().a(BaseViewHolder.this.adapter, view, BaseViewHolder.this.getClickPosition());
        }
    }

    public BaseViewHolder(View view) {
        super(view);
        this.views = new SparseArray<>();
        this.childClickViewIds = new LinkedHashSet<>();
        this.itemChildLongClickViewIds = new LinkedHashSet<>();
        this.nestViews = new HashSet<>();
        this.convertView = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getClickPosition() {
        return getLayoutPosition();
    }

    public BaseViewHolder addOnClickListener(@IdRes int... iArr) {
        for (int i4 : iArr) {
            this.childClickViewIds.add(Integer.valueOf(i4));
            View view = getView(i4);
            if (view != null) {
                if (!view.isClickable()) {
                    view.setClickable(true);
                }
                view.setOnClickListener(new a());
            }
        }
        return this;
    }

    public BaseViewHolder addOnLongClickListener(@IdRes int... iArr) {
        for (int i4 : iArr) {
            this.itemChildLongClickViewIds.add(Integer.valueOf(i4));
            View view = getView(i4);
            if (view != null) {
                if (!view.isLongClickable()) {
                    view.setLongClickable(true);
                }
                view.setOnLongClickListener(new b());
            }
        }
        return this;
    }

    public Object getAssociatedObject() {
        return this.associatedObject;
    }

    public HashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @Deprecated
    public View getConvertView() {
        return this.convertView;
    }

    public HashSet<Integer> getItemChildLongClickViewIds() {
        return this.itemChildLongClickViewIds;
    }

    public Set<Integer> getNestViews() {
        return this.nestViews;
    }

    public <T extends View> T getView(@IdRes int i4) {
        T t4 = (T) this.views.get(i4);
        if (t4 == null) {
            T t5 = (T) this.itemView.findViewById(i4);
            this.views.put(i4, t5);
            return t5;
        }
        return t4;
    }

    public BaseViewHolder linkify(@IdRes int i4) {
        Linkify.addLinks((TextView) getView(i4), 15);
        return this;
    }

    public BaseViewHolder setAdapter(@IdRes int i4, Adapter adapter) {
        ((AdapterView) getView(i4)).setAdapter(adapter);
        return this;
    }

    public BaseViewHolder setAlpha(@IdRes int i4, float f5) {
        if (Build.VERSION.SDK_INT >= 11) {
            getView(i4).setAlpha(f5);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f5, f5);
            alphaAnimation.setDuration(0L);
            alphaAnimation.setFillAfter(true);
            getView(i4).startAnimation(alphaAnimation);
        }
        return this;
    }

    public void setAssociatedObject(Object obj) {
        this.associatedObject = obj;
    }

    public BaseViewHolder setBackgroundColor(@IdRes int i4, @ColorInt int i5) {
        getView(i4).setBackgroundColor(i5);
        return this;
    }

    public BaseViewHolder setBackgroundRes(@IdRes int i4, @DrawableRes int i5) {
        getView(i4).setBackgroundResource(i5);
        return this;
    }

    public BaseViewHolder setChecked(@IdRes int i4, boolean z4) {
        View view = getView(i4);
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(z4);
        }
        return this;
    }

    public BaseViewHolder setEnabled(@IdRes int i4, boolean z4) {
        getView(i4).setEnabled(z4);
        return this;
    }

    public BaseViewHolder setGone(@IdRes int i4, boolean z4) {
        getView(i4).setVisibility(z4 ? 0 : 8);
        return this;
    }

    public BaseViewHolder setImageBitmap(@IdRes int i4, Bitmap bitmap) {
        ((ImageView) getView(i4)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(@IdRes int i4, Drawable drawable) {
        ((ImageView) getView(i4)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(@IdRes int i4, @DrawableRes int i5) {
        ((ImageView) getView(i4)).setImageResource(i5);
        return this;
    }

    public BaseViewHolder setMax(@IdRes int i4, int i5) {
        ((ProgressBar) getView(i4)).setMax(i5);
        return this;
    }

    public BaseViewHolder setNestView(@IdRes int... iArr) {
        for (int i4 : iArr) {
            this.nestViews.add(Integer.valueOf(i4));
        }
        addOnClickListener(iArr);
        addOnLongClickListener(iArr);
        return this;
    }

    public BaseViewHolder setOnCheckedChangeListener(@IdRes int i4, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        ((CompoundButton) getView(i4)).setOnCheckedChangeListener(onCheckedChangeListener);
        return this;
    }

    public BaseViewHolder setOnItemLongClickListener(@IdRes int i4, AdapterView.OnItemLongClickListener onItemLongClickListener) {
        ((AdapterView) getView(i4)).setOnItemLongClickListener(onItemLongClickListener);
        return this;
    }

    public BaseViewHolder setOnItemSelectedClickListener(@IdRes int i4, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ((AdapterView) getView(i4)).setOnItemSelectedListener(onItemSelectedListener);
        return this;
    }

    public BaseViewHolder setProgress(@IdRes int i4, int i5) {
        ((ProgressBar) getView(i4)).setProgress(i5);
        return this;
    }

    public BaseViewHolder setRating(@IdRes int i4, float f5) {
        ((RatingBar) getView(i4)).setRating(f5);
        return this;
    }

    public BaseViewHolder setTag(@IdRes int i4, Object obj) {
        getView(i4).setTag(obj);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i4, CharSequence charSequence) {
        ((TextView) getView(i4)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(@IdRes int i4, @ColorInt int i5) {
        ((TextView) getView(i4)).setTextColor(i5);
        return this;
    }

    public BaseViewHolder setTypeface(@IdRes int i4, Typeface typeface) {
        TextView textView = (TextView) getView(i4);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        return this;
    }

    public BaseViewHolder setVisible(@IdRes int i4, boolean z4) {
        getView(i4).setVisibility(z4 ? 0 : 4);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseViewHolder setAdapter(BaseQuickAdapter baseQuickAdapter) {
        this.adapter = baseQuickAdapter;
        return this;
    }

    public BaseViewHolder setProgress(@IdRes int i4, int i5, int i6) {
        ProgressBar progressBar = (ProgressBar) getView(i4);
        progressBar.setMax(i6);
        progressBar.setProgress(i5);
        return this;
    }

    public BaseViewHolder setRating(@IdRes int i4, float f5, int i5) {
        RatingBar ratingBar = (RatingBar) getView(i4);
        ratingBar.setMax(i5);
        ratingBar.setRating(f5);
        return this;
    }

    public BaseViewHolder setTag(@IdRes int i4, int i5, Object obj) {
        getView(i4).setTag(i5, obj);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i4, @StringRes int i5) {
        ((TextView) getView(i4)).setText(i5);
        return this;
    }

    public BaseViewHolder setTypeface(Typeface typeface, int... iArr) {
        for (int i4 : iArr) {
            TextView textView = (TextView) getView(i4);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        return this;
    }
}
