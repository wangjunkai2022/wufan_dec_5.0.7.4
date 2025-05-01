package com.join.android.app.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.p1;
import com.join.mgps.Util.v;
import com.join.mgps.data.UserIconName;
import java.io.File;
/* loaded from: classes3.dex */
public class MyImageLoader {

    /* loaded from: classes3.dex */
    class a extends com.facebook.imagepipeline.datasource.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f14843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f14844b;

        /* renamed from: com.join.android.app.common.utils.MyImageLoader$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0314a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f14845b;

            RunnableC0314a(Bitmap bitmap) {
                this.f14845b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f14844b.setImageBitmap(this.f14845b);
            }
        }

        a(float f5, SimpleDraweeView simpleDraweeView) {
            this.f14843a = f5;
            this.f14844b = simpleDraweeView;
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar) {
        }

        @Override // com.facebook.imagepipeline.datasource.b
        public void g(@Nullable Bitmap bitmap) {
            if (bitmap == null) {
                return;
            }
            Bitmap a5 = MyImageLoader.a(MyImageLoader.J(bitmap, -90), this.f14843a);
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.f14844b.post(new RunnableC0314a(a5));
            } else {
                this.f14844b.setImageBitmap(a5);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends com.facebook.imagepipeline.datasource.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f14847a;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f14848b;

            a(Bitmap bitmap) {
                this.f14848b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f14847a.setImageBitmap(this.f14848b);
            }
        }

        b(ImageView imageView) {
            this.f14847a = imageView;
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar) {
        }

        @Override // com.facebook.imagepipeline.datasource.b
        public void g(@Nullable Bitmap bitmap) {
            if (bitmap == null) {
                return;
            }
            try {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    this.f14847a.post(new a(bitmap));
                } else {
                    this.f14847a.setImageBitmap(bitmap);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends com.facebook.imagepipeline.datasource.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f14851b;

        c(String str, Context context) {
            this.f14850a = str;
            this.f14851b = context;
        }

        private void i(Bitmap bitmap) {
            try {
                if (g2.i(this.f14850a)) {
                    return;
                }
                String str = h() + "";
                p1.q(bitmap, str);
                Fresco.getImagePipeline().e(MyImageLoader.G(new File(str)));
                AccountUtil_.getInstance_(this.f14851b).setLocalUserIcon(str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar) {
        }

        @Override // com.facebook.imagepipeline.datasource.b
        public void g(@Nullable Bitmap bitmap) {
            i(bitmap);
        }

        public File h() {
            File c5 = v.c();
            if (!c5.getParentFile().exists()) {
                c5.getParentFile().mkdirs();
            }
            return c5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f14852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f14853b;

        d(boolean z4, Context context) {
            this.f14852a = z4;
            this.f14853b = context;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            if (this.f14852a) {
                MyImageLoader.K(this.f14853b, Uri.parse(str));
            }
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: b */
        public void onIntermediateImageSet(String str, com.facebook.imagepipeline.image.f fVar) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
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

    /* loaded from: classes3.dex */
    class e implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f14854a;

        e(SimpleDraweeView simpleDraweeView) {
            this.f14854a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            if (fVar != null) {
                ViewGroup.LayoutParams layoutParams = this.f14854a.getLayoutParams();
                float height = (fVar.getHeight() * 1.0f) / fVar.getWidth();
                int i4 = layoutParams.width;
                int i5 = layoutParams.height;
                if (i4 > i5) {
                    layoutParams.height = (int) (i4 * height);
                } else {
                    layoutParams.width = (int) (i5 / height);
                }
                this.f14854a.setLayoutParams(layoutParams);
            }
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: b */
        public void onIntermediateImageSet(String str, com.facebook.imagepipeline.image.f fVar) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
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

    public static RoundingParams A(Context context) {
        return D(context);
    }

    public static RoundingParams B(Context context) {
        return D(context);
    }

    public static RoundingParams C(Context context, int i4, int i5, int i6) {
        Resources resources = context.getResources();
        float dimension = resources.getDimension(i5);
        float dimension2 = resources.getDimension(i6);
        return new RoundingParams().p(dimension2).s(dimension).o(resources.getColor(i4)).v(true);
    }

    public static RoundingParams D(Context context) {
        return new RoundingParams().s(context.getResources().getDimension(R.dimen.mg_forum_avatar_round_width));
    }

    public static RoundingParams E(Context context, float f5) {
        return new RoundingParams().s(f5);
    }

    public static Uri F(Context context, int i4) {
        return Uri.parse("res://" + context.getPackageName() + net.lingala.zip4j.util.e.F0 + i4);
    }

    public static Uri G(File file) {
        return Uri.parse("file://" + file);
    }

    public static Uri H(String str) {
        return Uri.parse(g2.g(str));
    }

    public static RoundingParams I(Context context) {
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.mg_forum_avatar_round_width);
        float dimension2 = resources.getDimension(R.dimen.mg_forum_avatar_round_stroke_width);
        return new RoundingParams().p(dimension2).s(dimension).o(resources.getColor(R.color.mg_forum_avatar_round_stroke_color)).v(true);
    }

    public static Bitmap J(Bitmap bitmap, int i4) {
        if (i4 == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i4, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(Context context, Uri uri) {
        Fresco.getImagePipeline().i(ImageRequestBuilder.u(uri).C(true).a(), context).e(new c(AccountUtil_.getInstance_(context).getLocalUserIcon(), context), com.facebook.common.executors.a.a());
    }

    public static void L(SimpleDraweeView simpleDraweeView, String str, int i4, int i5) {
        try {
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().c(simpleDraweeView.getController()).M(ImageRequestBuilder.u(Uri.parse(str)).B(new com.facebook.imagepipeline.postprocessors.b(i4, i5)).a()).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static Bitmap a(Bitmap bitmap, float f5) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, f5, f5, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
            return createBitmap;
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static boolean c(String str) {
        if (g2.i(str)) {
            String trim = str.trim();
            if (trim.length() <= 0 || !trim.contains(h0.f27805a)) {
                return false;
            }
            return trim.substring(trim.lastIndexOf(h0.f27805a)).toLowerCase().equals(".gif");
        }
        return false;
    }

    public static void d(SimpleDraweeView simpleDraweeView, int i4, String str) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        g(simpleDraweeView, i4, str, null, r.c.f11294a);
    }

    public static void e(SimpleDraweeView simpleDraweeView, int i4, String str, r.c cVar) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        g(simpleDraweeView, i4, str, null, cVar);
    }

    public static void f(SimpleDraweeView simpleDraweeView, int i4, String str, RoundingParams roundingParams) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        g(simpleDraweeView, i4, str, roundingParams, null);
    }

    public static void g(SimpleDraweeView simpleDraweeView, int i4, String str, RoundingParams roundingParams, r.c cVar) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        if (simpleDraweeView == null) {
            return;
        }
        simpleDraweeView.getContext();
        if (cVar == null) {
            simpleDraweeView.getHierarchy().x(r.c.f11294a);
        } else {
            simpleDraweeView.getHierarchy().x(cVar);
        }
        if (i4 != 0) {
            simpleDraweeView.getHierarchy().H(i4);
        }
        if (roundingParams != null) {
            simpleDraweeView.getHierarchy().V(roundingParams);
        }
        try {
            simpleDraweeView.setImageURI(H(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void h(SimpleDraweeView simpleDraweeView, String str) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        d(simpleDraweeView, R.drawable.main_normal_icon, str);
    }

    public static void i(SimpleDraweeView simpleDraweeView, String str, r.c cVar) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        g(simpleDraweeView, R.drawable.main_normal_icon, str, null, cVar);
    }

    public static void j(SimpleDraweeView simpleDraweeView, String str, RoundingParams roundingParams) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        g(simpleDraweeView, R.drawable.main_normal_icon, str, roundingParams, null);
    }

    public static void k(String str) {
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        try {
            Fresco.getImagePipeline().L(ImageRequest.c(str), null);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void l(SimpleDraweeView simpleDraweeView, String str) {
        simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().M(ImageRequestBuilder.u(Uri.parse(str)).y(new com.facebook.imagepipeline.common.c().p(true).a()).a()).build());
    }

    public static void loadBitmapForImageView(ImageView imageView, String str, float f5) {
        Fresco.getImagePipeline().i(ImageRequestBuilder.u(H(str)).C(true).v(true).a(), imageView.getContext()).e(new b(imageView), com.facebook.common.executors.a.a());
    }

    public static void m(SimpleDraweeView simpleDraweeView, Uri uri) {
        simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().a(uri).E(true).build());
    }

    public static void n(SimpleDraweeView simpleDraweeView, String str) {
        o(simpleDraweeView, str, R.drawable.main_normal_icon);
    }

    public static void o(SimpleDraweeView simpleDraweeView, String str, int i4) {
        q(simpleDraweeView, str, r.c.f11300g, i4);
    }

    public static void p(SimpleDraweeView simpleDraweeView, String str, r.c cVar) {
        q(simpleDraweeView, str, cVar, 0);
    }

    public static void q(SimpleDraweeView simpleDraweeView, String str, r.c cVar, int i4) {
        if (c(str)) {
            com.facebook.drawee.controller.a build = Fresco.newDraweeControllerBuilder().a(Uri.parse(str)).E(true).build();
            if (cVar == null) {
                simpleDraweeView.getHierarchy().x(r.c.f11294a);
            } else {
                simpleDraweeView.getHierarchy().x(cVar);
            }
            if (i4 != 0) {
                simpleDraweeView.getHierarchy().H(i4);
            }
            simpleDraweeView.setController(build);
            return;
        }
        e(simpleDraweeView, i4, str, cVar);
    }

    public static void r(SimpleDraweeView simpleDraweeView, String str) {
        simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new e(simpleDraweeView)).a(Uri.parse(str)).E(c(str)).build());
    }

    public static void s(SimpleDraweeView simpleDraweeView, String str, float f5) {
        Fresco.getImagePipeline().i(ImageRequestBuilder.u(H(str)).C(true).F(new com.facebook.imagepipeline.common.d(340, 200)).v(true).a(), simpleDraweeView.getContext()).e(new a(f5, simpleDraweeView), com.facebook.common.executors.a.a());
    }

    public static void t(SimpleDraweeView simpleDraweeView, String str) {
        if (simpleDraweeView == null) {
            return;
        }
        try {
            String localUserIcon = AccountUtil_.getInstance_(simpleDraweeView.getContext()).getLocalUserIcon();
            File file = new File(localUserIcon);
            if (g2.i(localUserIcon) && file.exists()) {
                str = G(file).toString();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (g2.i(str) && str.startsWith("system_")) {
            str = UtilsMy.z2(str);
        }
        w(simpleDraweeView, R.drawable.unloginstatus, str, I(simpleDraweeView.getContext()), true);
    }

    public static void u(SimpleDraweeView simpleDraweeView, int i4, String str) {
        w(simpleDraweeView, i4, str, I(simpleDraweeView.getContext()), false);
    }

    public static void v(SimpleDraweeView simpleDraweeView, int i4, String str, RoundingParams roundingParams) {
        w(simpleDraweeView, i4, str, roundingParams, false);
    }

    private static void w(SimpleDraweeView simpleDraweeView, int i4, String str, RoundingParams roundingParams, boolean z4) {
        if (simpleDraweeView == null) {
            return;
        }
        Context context = simpleDraweeView.getContext();
        try {
            Resources resources = context.getResources();
            if (i4 != 0) {
                Drawable drawable = resources.getDrawable(i4);
                if ((drawable instanceof NinePatchDrawable) || (drawable instanceof ShapeDrawable)) {
                    drawable = new BitmapDrawable(p1.e(resources.getDrawable(i4)));
                }
                simpleDraweeView.getHierarchy().J(drawable);
            }
            if (roundingParams != null) {
                simpleDraweeView.getHierarchy().V(roundingParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (y(simpleDraweeView, i4, str)) {
            return;
        }
        try {
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new d(z4, context)).a(H(str)).build());
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static void x(SimpleDraweeView simpleDraweeView, String str) {
        if (simpleDraweeView == null) {
            return;
        }
        w(simpleDraweeView, R.drawable.main_normal_icon, str, I(simpleDraweeView.getContext()), false);
    }

    public static boolean y(SimpleDraweeView simpleDraweeView, int i4, String str) {
        int i5;
        if (simpleDraweeView == null) {
            return false;
        }
        try {
            Resources resources = simpleDraweeView.getContext().getResources();
            if (i4 != 0) {
                Drawable drawable = resources.getDrawable(i4);
                if ((drawable instanceof NinePatchDrawable) || (drawable instanceof ShapeDrawable)) {
                    drawable = new BitmapDrawable(p1.e(resources.getDrawable(i4)));
                }
                simpleDraweeView.getHierarchy().J(drawable);
            }
            if (str.equals(UserIconName.system_1.name())) {
                i5 = R.drawable.icon11;
            } else if (str.equals(UserIconName.system_2.name())) {
                i5 = R.drawable.icon12;
            } else if (str.equals(UserIconName.system_3.name())) {
                i5 = R.drawable.icon13;
            } else if (str.equals(UserIconName.system_4.name())) {
                i5 = R.drawable.icon14;
            } else if (str.equals(UserIconName.system_5.name())) {
                i5 = R.drawable.icon21;
            } else if (str.equals(UserIconName.system_6.name())) {
                i5 = R.drawable.icon22;
            } else if (str.equals(UserIconName.system_7.name())) {
                i5 = R.drawable.icon23;
            } else {
                i5 = str.equals(UserIconName.system_8.name()) ? R.drawable.icon24 : 0;
            }
            if (i5 != 0) {
                try {
                    simpleDraweeView.setImageURI(F(simpleDraweeView.getContext(), i5));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return true;
            }
            return false;
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }

    public static RoundingParams z(Context context) {
        return D(context);
    }
}
