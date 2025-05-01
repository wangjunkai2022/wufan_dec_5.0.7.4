package com.kingja.loadsir.callback;

import android.content.Context;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class Callback implements Serializable {
    private Context context;
    private OnReloadListener onReloadListener;
    private View rootView;
    private boolean successViewVisible;

    /* loaded from: classes5.dex */
    public interface OnReloadListener extends Serializable {
        void X0(View view);
    }

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback callback = Callback.this;
            if (callback.onReloadEvent(callback.context, Callback.this.rootView) || Callback.this.onReloadListener == null) {
                return;
            }
            Callback.this.onReloadListener.X0(view);
        }
    }

    public Callback() {
    }

    public Callback copy() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object obj = null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            obj = objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return (Callback) obj;
    }

    public View getRootView() {
        View view;
        if (onCreateView() != 0 || (view = this.rootView) == null) {
            if (onBuildView(this.context) != null) {
                this.rootView = onBuildView(this.context);
            }
            if (this.rootView == null) {
                this.rootView = View.inflate(this.context, onCreateView(), null);
            }
            this.rootView.setOnClickListener(new a());
            onViewCreate(this.context, this.rootView);
            return this.rootView;
        }
        return view;
    }

    public boolean getSuccessVisible() {
        return this.successViewVisible;
    }

    public View obtainRootView() {
        if (this.rootView == null) {
            this.rootView = View.inflate(this.context, onCreateView(), null);
        }
        return this.rootView;
    }

    public void onAttach(Context context, View view) {
    }

    protected View onBuildView(Context context) {
        return null;
    }

    protected abstract int onCreateView();

    public void onDetach() {
    }

    protected boolean onReloadEvent(Context context, View view) {
        return false;
    }

    protected boolean onRetry(Context context, View view) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onViewCreate(Context context, View view) {
    }

    public Callback setCallback(Context context, OnReloadListener onReloadListener) {
        this.context = context;
        this.onReloadListener = onReloadListener;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuccessVisible(boolean z4) {
        this.successViewVisible = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Callback(View view, Context context, OnReloadListener onReloadListener) {
        this.rootView = view;
        this.context = context;
        this.onReloadListener = onReloadListener;
    }
}
