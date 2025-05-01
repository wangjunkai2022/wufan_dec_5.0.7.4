package com.androidquery;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.androidquery.AbstractAQuery;
import com.androidquery.auth.AccountHandle;
import com.androidquery.callback.AbstractAjaxCallback;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.BitmapAjaxCallback;
import com.androidquery.callback.ImageOptions;
import com.androidquery.callback.Transformer;
import com.androidquery.util.AQUtility;
import com.androidquery.util.Common;
import com.androidquery.util.Constants;
import com.androidquery.util.WebImage;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class AbstractAQuery<T extends AbstractAQuery<T>> implements Constants {
    private static Class<?>[] LAYER_TYPE_SIG;
    private static final Class<?>[] ON_CLICK_SIG = {View.class};
    private static Class<?>[] ON_ITEM_SIG;
    private static Class<?>[] ON_SCROLLED_STATE_SIG;
    private static final Class<?>[] OVER_SCROLL_SIG;
    private static Class<?>[] PENDING_TRANSITION_SIG;
    private static final Class<?>[] TEXT_CHANGE_SIG;
    private static WeakHashMap<Dialog, Void> dialogs;
    private Activity act;
    protected AccountHandle ah;
    private Constructor<T> constructor;
    private Context context;
    private int policy = 0;
    protected Object progress;
    private HttpHost proxy;
    private View root;
    private Transformer trans;
    protected View view;

    static {
        Class<?> cls = Integer.TYPE;
        ON_ITEM_SIG = new Class[]{AdapterView.class, View.class, cls, Long.TYPE};
        ON_SCROLLED_STATE_SIG = new Class[]{AbsListView.class, cls};
        TEXT_CHANGE_SIG = new Class[]{CharSequence.class, cls, cls, cls};
        PENDING_TRANSITION_SIG = new Class[]{cls, cls};
        OVER_SCROLL_SIG = new Class[]{cls};
        LAYER_TYPE_SIG = new Class[]{cls, Paint.class};
        dialogs = new WeakHashMap<>();
    }

    public AbstractAQuery(Activity activity) {
        this.act = activity;
    }

    private View findView(int i4) {
        View view = this.root;
        if (view != null) {
            return view.findViewById(i4);
        }
        Activity activity = this.act;
        if (activity != null) {
            return activity.findViewById(i4);
        }
        return null;
    }

    private Constructor<T> getConstructor() {
        if (this.constructor == null) {
            try {
                this.constructor = (Constructor<T>) getClass().getConstructor(View.class);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return this.constructor;
    }

    private Common setScrollListener() {
        AbsListView absListView = (AbsListView) this.view;
        Common common = (Common) absListView.getTag(Constants.TAG_SCROLL_LISTENER);
        if (common == null) {
            Common common2 = new Common();
            absListView.setOnScrollListener(common2);
            absListView.setTag(Constants.TAG_SCROLL_LISTENER, common2);
            AQUtility.debug("set scroll listenr");
            return common2;
        }
        return common;
    }

    private void size(boolean z4, int i4, boolean z5) {
        View view = this.view;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Context context = getContext();
            if (i4 > 0 && z5) {
                i4 = AQUtility.dip2pixel(context, i4);
            }
            if (z4) {
                layoutParams.width = i4;
            } else {
                layoutParams.height = i4;
            }
            this.view.setLayoutParams(layoutParams);
        }
    }

    public T adapter(Adapter adapter) {
        View view = this.view;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setAdapter(adapter);
        }
        return self();
    }

    public <K> T ajax(AjaxCallback<K> ajaxCallback) {
        return invoke(ajaxCallback);
    }

    public T ajaxCancel() {
        AbstractAjaxCallback.cancel();
        return self();
    }

    public T animate(int i4) {
        return animate(i4, null);
    }

    public T auth(AccountHandle accountHandle) {
        this.ah = accountHandle;
        return self();
    }

    public T background(int i4) {
        View view = this.view;
        if (view != null) {
            if (i4 != 0) {
                view.setBackgroundResource(i4);
            } else {
                view.setBackgroundDrawable(null);
            }
        }
        return self();
    }

    public T backgroundColor(int i4) {
        View view = this.view;
        if (view != null) {
            view.setBackgroundColor(i4);
        }
        return self();
    }

    public T backgroundColorId(int i4) {
        View view = this.view;
        if (view != null) {
            view.setBackgroundColor(getContext().getResources().getColor(i4));
        }
        return self();
    }

    public T cache(String str, long j4) {
        return ajax(str, byte[].class, j4, (Object) null, (String) null);
    }

    public T checked(boolean z4) {
        View view = this.view;
        if (view instanceof CompoundButton) {
            ((CompoundButton) view).setChecked(z4);
        }
        return self();
    }

    public T clear() {
        View view = this.view;
        if (view != null) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.setImageBitmap(null);
                imageView.setTag(Constants.TAG_URL, null);
            } else if (view instanceof WebView) {
                WebView webView = (WebView) view;
                webView.stopLoading();
                webView.clearView();
                webView.setTag(Constants.TAG_URL, null);
            } else if (view instanceof TextView) {
                ((TextView) view).setText("");
            }
        }
        return self();
    }

    public T click() {
        View view = this.view;
        if (view != null) {
            view.performClick();
        }
        return self();
    }

    public T clickable(boolean z4) {
        View view = this.view;
        if (view != null) {
            view.setClickable(z4);
        }
        return self();
    }

    public T clicked(Object obj, String str) {
        return clicked(new Common().forward(obj, str, true, ON_CLICK_SIG));
    }

    protected T create(View view) {
        Exception e5;
        T t4;
        try {
            t4 = getConstructor().newInstance(view);
        } catch (Exception e6) {
            e5 = e6;
            t4 = null;
        }
        try {
            t4.act = this.act;
        } catch (Exception e7) {
            e5 = e7;
            e5.printStackTrace();
            return t4;
        }
        return t4;
    }

    public T dataChanged() {
        View view = this.view;
        if (view instanceof AdapterView) {
            Adapter adapter = ((AdapterView) view).getAdapter();
            if (adapter instanceof BaseAdapter) {
                ((BaseAdapter) adapter).notifyDataSetChanged();
            }
        }
        return self();
    }

    public <K> T delete(String str, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        ajaxCallback.url(str).type(cls).method(2);
        return ajax(ajaxCallback);
    }

    public T dismiss(Dialog dialog) {
        if (dialog != null) {
            try {
                dialogs.remove(dialog);
                dialog.dismiss();
            } catch (Exception unused) {
            }
        }
        return self();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T download(String str, File file, AjaxCallback<File> ajaxCallback) {
        ((AjaxCallback) ajaxCallback.url(str)).type(File.class).targetFile(file);
        return ajax(ajaxCallback);
    }

    public T enabled(boolean z4) {
        View view = this.view;
        if (view != null) {
            view.setEnabled(z4);
        }
        return self();
    }

    public T expand(int i4, boolean z4) {
        View view = this.view;
        if (view instanceof ExpandableListView) {
            ExpandableListView expandableListView = (ExpandableListView) view;
            if (z4) {
                expandableListView.expandGroup(i4);
            } else {
                expandableListView.collapseGroup(i4);
            }
        }
        return self();
    }

    public T find(int i4) {
        return create(findView(i4));
    }

    public Button getButton() {
        return (Button) this.view;
    }

    public File getCachedFile(String str) {
        File existedCacheByUrl = AQUtility.getExistedCacheByUrl(AQUtility.getCacheDir(getContext(), 1), str);
        return existedCacheByUrl == null ? AQUtility.getExistedCacheByUrl(AQUtility.getCacheDir(getContext(), 0), str) : existedCacheByUrl;
    }

    public Bitmap getCachedImage(String str) {
        return getCachedImage(str, 0);
    }

    public CheckBox getCheckBox() {
        return (CheckBox) this.view;
    }

    public Context getContext() {
        Activity activity = this.act;
        if (activity != null) {
            return activity;
        }
        View view = this.root;
        if (view != null) {
            return view.getContext();
        }
        return this.context;
    }

    public EditText getEditText() {
        return (EditText) this.view;
    }

    public Editable getEditable() {
        View view = this.view;
        if (view instanceof EditText) {
            return ((EditText) view).getEditableText();
        }
        return null;
    }

    public ExpandableListView getExpandableListView() {
        return (ExpandableListView) this.view;
    }

    public Gallery getGallery() {
        return (Gallery) this.view;
    }

    public GridView getGridView() {
        return (GridView) this.view;
    }

    public ImageView getImageView() {
        return (ImageView) this.view;
    }

    public ListView getListView() {
        return (ListView) this.view;
    }

    public ProgressBar getProgressBar() {
        return (ProgressBar) this.view;
    }

    public RatingBar getRatingBar() {
        return (RatingBar) this.view;
    }

    public SeekBar getSeekBar() {
        return (SeekBar) this.view;
    }

    public Object getSelectedItem() {
        View view = this.view;
        if (view instanceof AdapterView) {
            return ((AdapterView) view).getSelectedItem();
        }
        return null;
    }

    public int getSelectedItemPosition() {
        View view = this.view;
        if (view instanceof AdapterView) {
            return ((AdapterView) view).getSelectedItemPosition();
        }
        return -1;
    }

    public Spinner getSpinner() {
        return (Spinner) this.view;
    }

    public Object getTag() {
        View view = this.view;
        if (view != null) {
            return view.getTag();
        }
        return null;
    }

    public CharSequence getText() {
        View view = this.view;
        if (view instanceof TextView) {
            return ((TextView) view).getText();
        }
        return null;
    }

    public TextView getTextView() {
        return (TextView) this.view;
    }

    public View getView() {
        return this.view;
    }

    public WebView getWebView() {
        return (WebView) this.view;
    }

    public T gone() {
        return visibility(8);
    }

    public T hardwareAccelerated11() {
        Activity activity = this.act;
        if (activity != null) {
            activity.getWindow().setFlags(16777216, 16777216);
        }
        return self();
    }

    public T height(int i4) {
        size(false, i4, true);
        return self();
    }

    public T id(int i4) {
        return id(findView(i4));
    }

    public T image(int i4) {
        View view = this.view;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setTag(Constants.TAG_URL, null);
            if (i4 == 0) {
                imageView.setImageBitmap(null);
            } else {
                imageView.setImageResource(i4);
            }
        }
        return self();
    }

    public View inflate(View view, int i4, ViewGroup viewGroup) {
        LayoutInflater layoutInflater;
        Integer num;
        if (view == null || (num = (Integer) view.getTag(Constants.TAG_LAYOUT)) == null || num.intValue() != i4) {
            Activity activity = this.act;
            if (activity != null) {
                layoutInflater = activity.getLayoutInflater();
            } else {
                layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            }
            View inflate = layoutInflater.inflate(i4, viewGroup, false);
            inflate.setTag(Constants.TAG_LAYOUT, Integer.valueOf(i4));
            return inflate;
        }
        return view;
    }

    public T invalidate(String str) {
        File cachedFile = getCachedFile(str);
        if (cachedFile != null) {
            cachedFile.delete();
        }
        return self();
    }

    public T invisible() {
        return visibility(4);
    }

    public Object invoke(String str, Class<?>[] clsArr, Object... objArr) {
        Object obj = this.view;
        if (obj == null) {
            obj = this.act;
        }
        return AQUtility.invokeHandler(obj, str, false, false, clsArr, objArr);
    }

    public boolean isChecked() {
        View view = this.view;
        if (view instanceof CompoundButton) {
            return ((CompoundButton) view).isChecked();
        }
        return false;
    }

    public boolean isExist() {
        return this.view != null;
    }

    public T itemClicked(Object obj, String str) {
        return itemClicked(new Common().forward(obj, str, true, ON_ITEM_SIG));
    }

    public T itemSelected(Object obj, String str) {
        return itemSelected(new Common().forward(obj, str, true, ON_ITEM_SIG));
    }

    public T longClick() {
        View view = this.view;
        if (view != null) {
            view.performLongClick();
        }
        return self();
    }

    public T longClicked(Object obj, String str) {
        return longClicked(new Common().forward(obj, str, true, ON_CLICK_SIG));
    }

    public File makeSharedFile(String str, String str2) {
        File tempDir;
        File file = null;
        try {
            File cachedFile = getCachedFile(str);
            if (cachedFile == null || (tempDir = AQUtility.getTempDir()) == null) {
                return null;
            }
            File file2 = new File(tempDir, str2);
            try {
                file2.createNewFile();
                FileInputStream fileInputStream = new FileInputStream(cachedFile);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                FileChannel channel = fileInputStream.getChannel();
                FileChannel channel2 = fileOutputStream.getChannel();
                channel.transferTo(0L, channel.size(), channel2);
                AQUtility.close(fileInputStream);
                AQUtility.close(fileOutputStream);
                AQUtility.close(channel);
                AQUtility.close(channel2);
                return file2;
            } catch (Exception e5) {
                e = e5;
                file = file2;
                AQUtility.debug((Throwable) e);
                return file;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public T margin(float f5, float f6, float f7, float f8) {
        View view = this.view;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Context context = getContext();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(AQUtility.dip2pixel(context, f5), AQUtility.dip2pixel(context, f6), AQUtility.dip2pixel(context, f7), AQUtility.dip2pixel(context, f8));
                this.view.setLayoutParams(layoutParams);
            }
        }
        return self();
    }

    public T overridePendingTransition5(int i4, int i5) {
        Activity activity = this.act;
        if (activity != null) {
            AQUtility.invokeHandler(activity, "overridePendingTransition", false, false, PENDING_TRANSITION_SIG, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return self();
    }

    public T parent(int i4) {
        View view = this.view;
        while (view != null) {
            if (view.getId() == i4) {
                break;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        view = null;
        return create(view);
    }

    public T policy(int i4) {
        this.policy = i4;
        return self();
    }

    public <K> T post(String str, String str2, HttpEntity httpEntity, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        ajaxCallback.url(str).type(cls).method(1).header("Content-Type", str2).param(Constants.POST_ENTITY, httpEntity);
        return ajax(ajaxCallback);
    }

    public T progress(int i4) {
        this.progress = findView(i4);
        return self();
    }

    public T proxy(String str, int i4) {
        this.proxy = new HttpHost(str, i4);
        return self();
    }

    public <K> T put(String str, String str2, HttpEntity httpEntity, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        ajaxCallback.url(str).type(cls).method(3).header("Content-Type", str2).param(Constants.POST_ENTITY, httpEntity);
        return ajax(ajaxCallback);
    }

    public T rating(float f5) {
        View view = this.view;
        if (view instanceof RatingBar) {
            ((RatingBar) view).setRating(f5);
        }
        return self();
    }

    public T recycle(View view) {
        this.root = view;
        this.view = view;
        reset();
        this.context = null;
        return self();
    }

    protected void reset() {
        this.ah = null;
        this.progress = null;
        this.trans = null;
        this.policy = 0;
        this.proxy = null;
    }

    public T scrolled(AbsListView.OnScrollListener onScrollListener) {
        if (this.view instanceof AbsListView) {
            setScrollListener().forward(onScrollListener);
        }
        return self();
    }

    public T scrolledBottom(Object obj, String str) {
        if (this.view instanceof AbsListView) {
            setScrollListener().forward(obj, str, true, ON_SCROLLED_STATE_SIG);
        }
        return self();
    }

    protected T self() {
        return this;
    }

    public T setLayerType11(int i4, Paint paint) {
        View view = this.view;
        if (view != null) {
            AQUtility.invokeHandler(view, "setLayerType", false, false, LAYER_TYPE_SIG, Integer.valueOf(i4), paint);
        }
        return self();
    }

    public T setOverScrollMode9(int i4) {
        View view = this.view;
        if (view instanceof AbsListView) {
            AQUtility.invokeHandler(view, "setOverScrollMode", false, false, OVER_SCROLL_SIG, Integer.valueOf(i4));
        }
        return self();
    }

    public T setSelection(int i4) {
        View view = this.view;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setSelection(i4);
        }
        return self();
    }

    @Deprecated
    public boolean shouldDelay(View view, ViewGroup viewGroup, String str, float f5) {
        return Common.shouldDelay(view, viewGroup, str, f5, true);
    }

    public T show(Dialog dialog) {
        if (dialog != null) {
            try {
                dialog.show();
                dialogs.put(dialog, null);
            } catch (Exception unused) {
            }
        }
        return self();
    }

    public <K> T sync(AjaxCallback<K> ajaxCallback) {
        ajax(ajaxCallback);
        ajaxCallback.block();
        return self();
    }

    public T tag(Object obj) {
        View view = this.view;
        if (view != null) {
            view.setTag(obj);
        }
        return self();
    }

    public T text(int i4) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).setText(i4);
        }
        return self();
    }

    public T textChanged(Object obj, String str) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).addTextChangedListener(new Common().forward(obj, str, true, TEXT_CHANGE_SIG));
        }
        return self();
    }

    public T textColor(int i4) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i4);
        }
        return self();
    }

    public T textColorId(int i4) {
        return textColor(getContext().getResources().getColor(i4));
    }

    public T textSize(float f5) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).setTextSize(f5);
        }
        return self();
    }

    public T transformer(Transformer transformer) {
        this.trans = transformer;
        return self();
    }

    public T transparent(boolean z4) {
        View view = this.view;
        if (view != null) {
            AQUtility.transparent(view, z4);
        }
        return self();
    }

    public T typeface(Typeface typeface) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
        }
        return self();
    }

    public T visibility(int i4) {
        View view = this.view;
        if (view != null && view.getVisibility() != i4) {
            this.view.setVisibility(i4);
        }
        return self();
    }

    public T visible() {
        return visibility(0);
    }

    public T webImage(String str) {
        return webImage(str, true, false, -16777216);
    }

    public T width(int i4) {
        size(true, i4, true);
        return self();
    }

    public <K> T ajax(String str, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        ajaxCallback.type(cls).url(str);
        return ajax(ajaxCallback);
    }

    public T animate(int i4, Animation.AnimationListener animationListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i4);
        loadAnimation.setAnimationListener(animationListener);
        return animate(loadAnimation);
    }

    public Bitmap getCachedImage(String str, int i4) {
        File cachedFile;
        Bitmap memoryCached = BitmapAjaxCallback.getMemoryCached(str, i4);
        return (memoryCached != null || (cachedFile = getCachedFile(str)) == null) ? memoryCached : BitmapAjaxCallback.getResizedImage(cachedFile.getAbsolutePath(), null, i4, true, 0);
    }

    public T id(View view) {
        this.view = view;
        reset();
        return self();
    }

    @Deprecated
    public boolean shouldDelay(View view, ViewGroup viewGroup, String str, float f5, boolean z4) {
        return Common.shouldDelay(view, viewGroup, str, f5, z4);
    }

    public T webImage(String str, boolean z4, boolean z5, int i4) {
        if (this.view instanceof WebView) {
            setLayerType11(1, null);
            new WebImage((WebView) this.view, str, this.progress, z4, z5, i4).load();
            this.progress = null;
        }
        return self();
    }

    public T clicked(View.OnClickListener onClickListener) {
        View view = this.view;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        return self();
    }

    public <K> T delete(String str, Class<K> cls, Object obj, String str2) {
        AjaxCallback<K> ajaxCallback = new AjaxCallback<>();
        ajaxCallback.weakHandler(obj, str2);
        return delete(str, cls, ajaxCallback);
    }

    public T download(String str, File file, Object obj, String str2) {
        AjaxCallback<File> ajaxCallback = new AjaxCallback<>();
        ajaxCallback.weakHandler(obj, str2);
        return download(str, file, ajaxCallback);
    }

    public Object getTag(int i4) {
        View view = this.view;
        if (view != null) {
            return view.getTag(i4);
        }
        return null;
    }

    public T height(int i4, boolean z4) {
        size(false, i4, z4);
        return self();
    }

    public T itemClicked(AdapterView.OnItemClickListener onItemClickListener) {
        View view = this.view;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setOnItemClickListener(onItemClickListener);
        }
        return self();
    }

    public T itemSelected(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        View view = this.view;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setOnItemSelectedListener(onItemSelectedListener);
        }
        return self();
    }

    public T longClicked(View.OnLongClickListener onLongClickListener) {
        View view = this.view;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
        return self();
    }

    public <K> T post(String str, JSONObject jSONObject, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        try {
            return post(str, HttpHeaders.Values.APPLICATION_JSON, new StringEntity(jSONObject.toString(), "UTF-8"), cls, ajaxCallback);
        } catch (UnsupportedEncodingException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public T progress(Object obj) {
        this.progress = obj;
        return self();
    }

    public <K> T put(String str, JSONObject jSONObject, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        try {
            return put(str, HttpHeaders.Values.APPLICATION_JSON, new StringEntity(jSONObject.toString(), "UTF-8"), cls, ajaxCallback);
        } catch (UnsupportedEncodingException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public boolean shouldDelay(int i4, boolean z4, View view, ViewGroup viewGroup, String str) {
        return Common.shouldDelay(i4, -1, view, viewGroup, str);
    }

    public T width(int i4, boolean z4) {
        size(true, i4, z4);
        return self();
    }

    public AbstractAQuery(View view) {
        this.root = view;
        this.view = view;
    }

    public <K> T ajax(String str, Class<K> cls, long j4, AjaxCallback<K> ajaxCallback) {
        ajaxCallback.type(cls).url(str).fileCache(true).expire(j4);
        return ajax(ajaxCallback);
    }

    public T dismiss() {
        Iterator<Dialog> it2 = dialogs.keySet().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().dismiss();
            } catch (Exception unused) {
            }
            it2.remove();
        }
        return self();
    }

    protected <K> T invoke(AbstractAjaxCallback<?, K> abstractAjaxCallback) {
        AccountHandle accountHandle = this.ah;
        if (accountHandle != null) {
            abstractAjaxCallback.auth(accountHandle);
        }
        Object obj = this.progress;
        if (obj != null) {
            abstractAjaxCallback.progress(obj);
        }
        Transformer transformer = this.trans;
        if (transformer != null) {
            abstractAjaxCallback.transformer(transformer);
        }
        abstractAjaxCallback.policy(this.policy);
        HttpHost httpHost = this.proxy;
        if (httpHost != null) {
            abstractAjaxCallback.proxy(httpHost.getHostName(), this.proxy.getPort());
        }
        Activity activity = this.act;
        if (activity != null) {
            abstractAjaxCallback.async(activity);
        } else {
            abstractAjaxCallback.async(getContext());
        }
        reset();
        return self();
    }

    public boolean shouldDelay(int i4, int i5, boolean z4, View view, ViewGroup viewGroup, String str) {
        return Common.shouldDelay(i4, i5, view, viewGroup, str);
    }

    public T tag(int i4, Object obj) {
        View view = this.view;
        if (view != null) {
            view.setTag(i4, obj);
        }
        return self();
    }

    private View findView(String str) {
        View childAt;
        View view = this.root;
        if (view != null) {
            return view.findViewWithTag(str);
        }
        Activity activity = this.act;
        if (activity == null || (childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0)) == null) {
            return null;
        }
        return childAt.findViewWithTag(str);
    }

    public T adapter(ExpandableListAdapter expandableListAdapter) {
        View view = this.view;
        if (view instanceof ExpandableListView) {
            ((ExpandableListView) view).setAdapter(expandableListAdapter);
        }
        return self();
    }

    public T animate(Animation animation) {
        View view = this.view;
        if (view != null && animation != null) {
            view.startAnimation(animation);
        }
        return self();
    }

    public Bitmap getCachedImage(int i4) {
        return BitmapAjaxCallback.getMemoryCached(getContext(), i4);
    }

    public T id(String str) {
        return id(findView(str));
    }

    public T progress(Dialog dialog) {
        this.progress = dialog;
        return self();
    }

    public boolean shouldDelay(int i4, View view, ViewGroup viewGroup, String str) {
        if (!(viewGroup instanceof ExpandableListView)) {
            return Common.shouldDelay(i4, view, viewGroup, str);
        }
        throw new IllegalArgumentException("Please use the other shouldDelay methods for expandable list.");
    }

    public T text(int i4, Object... objArr) {
        Context context = getContext();
        if (context != null) {
            text(context.getString(i4, objArr));
        }
        return self();
    }

    public <K> T ajax(String str, Class<K> cls, Object obj, String str2) {
        AjaxCallback<K> ajaxCallback = new AjaxCallback<>();
        ajaxCallback.type(cls).weakHandler(obj, str2);
        return ajax(str, cls, ajaxCallback);
    }

    public T expand(boolean z4) {
        ExpandableListView expandableListView;
        ExpandableListAdapter expandableListAdapter;
        View view = this.view;
        if ((view instanceof ExpandableListView) && (expandableListAdapter = (expandableListView = (ExpandableListView) view).getExpandableListAdapter()) != null) {
            int groupCount = expandableListAdapter.getGroupCount();
            for (int i4 = 0; i4 < groupCount; i4++) {
                if (z4) {
                    expandableListView.expandGroup(i4);
                } else {
                    expandableListView.collapseGroup(i4);
                }
            }
        }
        return self();
    }

    public T id(int... iArr) {
        return id(findView(iArr));
    }

    public T image(Drawable drawable) {
        View view = this.view;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setTag(Constants.TAG_URL, null);
            imageView.setImageDrawable(drawable);
        }
        return self();
    }

    public AbstractAQuery(Activity activity, View view) {
        this.root = view;
        this.view = view;
        this.act = activity;
    }

    public <K> T ajax(String str, Class<K> cls, long j4, Object obj, String str2) {
        AjaxCallback<K> ajaxCallback = new AjaxCallback<>();
        ajaxCallback.type(cls).weakHandler(obj, str2).fileCache(true).expire(j4);
        return ajax(str, cls, ajaxCallback);
    }

    public T text(CharSequence charSequence) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        return self();
    }

    private View findView(int... iArr) {
        View findView = findView(iArr[0]);
        for (int i4 = 1; i4 < iArr.length && findView != null; i4++) {
            findView = findView.findViewById(iArr[i4]);
        }
        return findView;
    }

    public <K> T ajax(String str, Map<String, ?> map, Class<K> cls, AjaxCallback<K> ajaxCallback) {
        ajaxCallback.type(cls).url(str).params(map);
        return ajax(ajaxCallback);
    }

    public T image(Bitmap bitmap) {
        View view = this.view;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setTag(Constants.TAG_URL, null);
            imageView.setImageBitmap(bitmap);
        }
        return self();
    }

    public AbstractAQuery(Context context) {
        this.context = context;
    }

    public T text(CharSequence charSequence, boolean z4) {
        if (z4 && (charSequence == null || charSequence.length() == 0)) {
            return gone();
        }
        return text(charSequence);
    }

    public <K> T ajax(String str, Map<String, ?> map, Class<K> cls, Object obj, String str2) {
        AjaxCallback<K> ajaxCallback = new AjaxCallback<>();
        ajaxCallback.type(cls).weakHandler(obj, str2);
        return ajax(str, map, cls, ajaxCallback);
    }

    public T text(Spanned spanned) {
        View view = this.view;
        if (view instanceof TextView) {
            ((TextView) view).setText(spanned);
        }
        return self();
    }

    public T image(String str) {
        return image(str, true, true, 0, 0);
    }

    public T image(String str, boolean z4, boolean z5) {
        return image(str, z4, z5, 0, 0);
    }

    public T image(String str, boolean z4, boolean z5, int i4, int i5) {
        return image(str, z4, z5, i4, i5, null, 0);
    }

    public T image(String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6) {
        return image(str, z4, z5, i4, i5, bitmap, i6, 0.0f);
    }

    public T image(String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6, float f5) {
        return image(str, z4, z5, i4, i5, bitmap, i6, f5, 0, null);
    }

    protected T image(String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6, float f5, int i7, String str2) {
        if (this.view instanceof ImageView) {
            BitmapAjaxCallback.async(this.act, getContext(), (ImageView) this.view, str, z4, z5, i4, i5, bitmap, i6, f5, Float.MAX_VALUE, this.progress, this.ah, this.policy, i7, this.proxy, str2);
            reset();
        }
        return self();
    }

    public T image(String str, ImageOptions imageOptions) {
        return image(str, imageOptions, (String) null);
    }

    protected T image(String str, ImageOptions imageOptions, String str2) {
        if (this.view instanceof ImageView) {
            BitmapAjaxCallback.async(this.act, getContext(), (ImageView) this.view, str, this.progress, this.ah, imageOptions, this.proxy, str2);
            reset();
        }
        return self();
    }

    public T image(BitmapAjaxCallback bitmapAjaxCallback) {
        View view = this.view;
        if (view instanceof ImageView) {
            bitmapAjaxCallback.imageView((ImageView) view);
            invoke(bitmapAjaxCallback);
        }
        return self();
    }

    public T image(String str, boolean z4, boolean z5, int i4, int i5, BitmapAjaxCallback bitmapAjaxCallback) {
        bitmapAjaxCallback.targetWidth(i4).fallback(i5).url(str).memCache(z4).fileCache(z5);
        return image(bitmapAjaxCallback);
    }

    public T image(File file, int i4) {
        return image(file, true, i4, null);
    }

    public T image(File file, boolean z4, int i4, BitmapAjaxCallback bitmapAjaxCallback) {
        if (bitmapAjaxCallback == null) {
            bitmapAjaxCallback = new BitmapAjaxCallback();
        }
        BitmapAjaxCallback bitmapAjaxCallback2 = bitmapAjaxCallback;
        bitmapAjaxCallback2.file(file);
        return image(file != null ? file.getAbsolutePath() : null, z4, true, i4, 0, bitmapAjaxCallback2);
    }

    public T image(Bitmap bitmap, float f5) {
        BitmapAjaxCallback bitmapAjaxCallback = new BitmapAjaxCallback();
        bitmapAjaxCallback.ratio(f5).bitmap(bitmap);
        return image(bitmapAjaxCallback);
    }
}
