package com.join.android.app.component.photoviewer;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.c;
import com.facebook.imagepipeline.image.f;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import me.relex.photodraweeview.PhotoDraweeView;
import me.relex.photodraweeview.h;
/* loaded from: classes3.dex */
public class ImageDetailFragment extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private String f15158b;

    /* renamed from: c  reason: collision with root package name */
    private PhotoDraweeView f15159c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f15160d;

    /* renamed from: e  reason: collision with root package name */
    View.OnLongClickListener f15161e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements h {
        a() {
        }

        @Override // me.relex.photodraweeview.h
        public void a(View view, float f5, float f6) {
            try {
                ImageDetailFragment.this.getActivity().finish();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements c<f> {
        b() {
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, f fVar, Animatable animatable) {
            ImageDetailFragment.this.f15160d.setVisibility(8);
            ImageDetailFragment.this.f15159c.update(fVar.getWidth(), fVar.getHeight());
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: b */
        public void onIntermediateImageSet(String str, f fVar) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
            try {
                Toast.makeText(ImageDetailFragment.this.getActivity(), "加载失败", 0).show();
            } catch (Exception unused) {
            }
            ImageDetailFragment.this.f15159c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageDetailFragment.this.f15159c.setImageResource(R.drawable.main_normal_icon);
            ImageDetailFragment.this.f15160d.setVisibility(8);
        }

        @Override // com.facebook.drawee.controller.c
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onRelease(String str) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onSubmit(String str, Object obj) {
        }
    }

    private void X() {
        try {
            this.f15160d.setVisibility(0);
            this.f15159c.setController(Fresco.newDraweeControllerBuilder().H(new b()).a(MyImageLoader.H(this.f15158b)).E(true).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void Z() {
    }

    private void a0() {
    }

    public static ImageDetailFragment b0(String str) {
        ImageDetailFragment imageDetailFragment = new ImageDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        imageDetailFragment.setArguments(bundle);
        return imageDetailFragment;
    }

    private void c0() {
        this.f15159c.setOnViewTapListener(new a());
        this.f15159c.setOnLongClickListener(this.f15161e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(View.OnLongClickListener onLongClickListener) {
        this.f15161e = onLongClickListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15158b = getArguments() != null ? getArguments().getString("url") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_detail_fragment, viewGroup, false);
        this.f15160d = (ProgressBar) inflate.findViewById(R.id.loading);
        this.f15159c = (PhotoDraweeView) inflate.findViewById(R.id.image);
        c0();
        return inflate;
    }
}
