package com.kwad.components.ad.reward.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.kwad.components.ad.reward.n.d;
import com.kwad.components.ad.reward.n.r;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.CouponInfo;
import com.kwad.sdk.n.l;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a extends d implements View.OnClickListener {
    private final ViewGroup gS;
    private TextView hz;
    private TextView lw;
    private int[] qM;
    private View qN;
    private ImageView qO;
    private TextView qP;
    private Button qQ;
    @Nullable
    private b qR;

    /* renamed from: com.kwad.components.ad.reward.b.a$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass1 extends az {
        final /* synthetic */ r qS;
        final /* synthetic */ long qT;

        AnonymousClass1(r rVar, long j4) {
            this.qS = rVar;
            this.qT = j4;
        }

        @Override // com.kwad.sdk.utils.az
        public final void doTask() {
            a aVar = a.this;
            final Animator a5 = a.a(aVar, aVar.qN);
            a5.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.b.a.1.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    a5.removeListener(this);
                    com.kwad.sdk.core.adlog.c.b(AnonymousClass1.this.qS.getAdTemplate(), 169, (JSONObject) null);
                    a aVar2 = a.this;
                    a.a(aVar2, aVar2.qO, AnonymousClass1.this.qT).start();
                    bo.a(new Runnable() { // from class: com.kwad.components.ad.reward.b.a.1.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.gH();
                        }
                    }, null, AnonymousClass1.this.qT);
                }
            });
            a5.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.reward.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0424a {
        private CharSequence qZ;
        private CharSequence ra;
        private CharSequence rb;
        private CharSequence title;

        private C0424a(@NonNull CouponInfo couponInfo) {
            this.title = couponInfo.displayTitle;
            this.qZ = couponInfo.displayValue;
            if (TextUtils.isEmpty(couponInfo.displayBase)) {
                this.ra = "";
            } else {
                this.ra = String.format("满%s可用", couponInfo.displayBase);
            }
            this.rb = couponInfo.displayActionWords;
        }

        @Nullable
        public static C0424a H(AdTemplate adTemplate) {
            List<CouponInfo> list;
            AdProductInfo cQ = com.kwad.sdk.core.response.b.a.cQ(e.dS(adTemplate));
            if (cQ == null || (list = cQ.couponList) == null || list.size() <= 0) {
                return null;
            }
            return a(cQ.couponList.get(0));
        }

        @Nullable
        private static C0424a a(CouponInfo couponInfo) {
            if (couponInfo == null) {
                return null;
            }
            return new C0424a(couponInfo);
        }

        public final CharSequence L(Context context) {
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.ksad_coupon_dialog_value_prefix_text_size));
            SpannableString spannableString = new SpannableString("¥" + ((Object) this.qZ));
            spannableString.setSpan(absoluteSizeSpan, 0, 1, 17);
            return spannableString;
        }

        public final CharSequence gI() {
            return this.ra;
        }

        public final CharSequence gJ() {
            return this.rb;
        }

        public final CharSequence getTitle() {
            return this.title;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void gK();

        void gL();
    }

    public a(Context context, @Nullable ViewGroup viewGroup, @Nullable int[] iArr) {
        this.qM = iArr;
        ViewGroup viewGroup2 = (ViewGroup) l.a(context, R.layout.ksad_reward_coupon_dialog, viewGroup, false);
        this.gS = viewGroup2;
        d(viewGroup2);
    }

    static /* synthetic */ Animator a(a aVar, View view) {
        return m(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gH() {
        final Animator n4 = n(this.qN);
        n4.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.b.a.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                n4.removeListener(this);
                if (a.this.qR != null) {
                    a.this.qR.gL();
                }
            }
        });
        n4.start();
    }

    private static Animator m(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    private Animator n(View view) {
        ObjectAnimator objectAnimator;
        int[] E;
        Interpolator create = PathInterpolatorCompat.create(0.89f, 0.02f, 0.72f, 1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        ofFloat.setInterpolator(create);
        ofFloat2.setInterpolator(create);
        int[] iArr = this.qM;
        ObjectAnimator objectAnimator2 = null;
        if (iArr == null || iArr.length < 2 || (E = com.kwad.sdk.c.a.a.E(view)) == null) {
            objectAnimator = null;
        } else {
            Interpolator create2 = PathInterpolatorCompat.create(0.33f, 0.0f, 0.83f, 1.0f);
            objectAnimator2 = ObjectAnimator.ofFloat(view, "translationX", this.qM[0] - E[0]);
            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", this.qM[1] - E[1]);
            objectAnimator2.setInterpolator(create2);
            objectAnimator.setInterpolator(create2);
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat3, ofFloat4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(500L);
        if (objectAnimator2 != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, animatorSet, objectAnimator2, objectAnimator);
        } else {
            animatorSet2.playTogether(ofFloat, ofFloat2, animatorSet);
        }
        return animatorSet2;
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final ViewGroup gG() {
        return this.gS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar;
        if (!view.equals(this.qQ) || (bVar = this.qR) == null) {
            return;
        }
        bVar.gK();
    }

    static /* synthetic */ Animator a(a aVar, ImageView imageView, long j4) {
        return a(imageView, j4);
    }

    private void d(ViewGroup viewGroup) {
        this.qN = viewGroup.findViewById(R.id.ksad_coupon_dialog_card);
        this.qO = (ImageView) viewGroup.findViewById(R.id.ksad_coupon_dialog_bg);
        this.hz = (TextView) viewGroup.findViewById(R.id.ksad_coupon_dialog_title);
        this.qP = (TextView) viewGroup.findViewById(R.id.ksad_coupon_dialog_content);
        this.lw = (TextView) viewGroup.findViewById(R.id.ksad_coupon_dialog_desc);
        Button button = (Button) viewGroup.findViewById(R.id.ksad_coupon_dialog_btn_action);
        this.qQ = button;
        button.setOnClickListener(this);
    }

    public final void a(@Nullable b bVar) {
        this.qR = bVar;
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final void a(r rVar) {
        super.a(rVar);
        a(C0424a.H(rVar.getAdTemplate()));
        this.gS.post(new AnonymousClass1(rVar, com.kwad.components.ad.reward.a.b.gz()));
    }

    private void a(C0424a c0424a) {
        if (c0424a == null) {
            return;
        }
        TextView textView = this.hz;
        if (textView != null) {
            textView.setText(c0424a.getTitle());
        }
        TextView textView2 = this.qP;
        if (textView2 != null) {
            textView2.setText(c0424a.L(this.gS.getContext()));
        }
        TextView textView3 = this.lw;
        if (textView3 != null) {
            textView3.setText(c0424a.gI());
        }
        Button button = this.qQ;
        if (button != null) {
            button.setText(c0424a.gJ());
        }
    }

    private static Animator a(ImageView imageView, long j4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", imageView.getAlpha(), 0.0f);
        ofFloat.setDuration(j4);
        return ofFloat;
    }
}
