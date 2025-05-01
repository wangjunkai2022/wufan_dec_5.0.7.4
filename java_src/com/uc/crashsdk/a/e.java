package com.uc.crashsdk.a;

import com.bytedance.sdk.openadsdk.TTAdConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f63075a = true;

    /* renamed from: b  reason: collision with root package name */
    private final int f63076b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f63077c;

    public e(int i4) {
        this.f63076b = i4;
        this.f63077c = null;
    }

    public final boolean a() {
        int i4 = this.f63076b;
        if (i4 != 451 && i4 != 452) {
            switch (i4) {
                case 351:
                case 352:
                case 353:
                case 354:
                    return h.b(i4, this.f63077c);
                default:
                    switch (i4) {
                        case 751:
                        case 752:
                        case 753:
                        case 754:
                        case 755:
                        case 756:
                            return com.uc.crashsdk.f.a(i4, this.f63077c);
                        default:
                            a.d("crashsdk", "Unknown sync runnable: " + toString());
                            if (f63075a) {
                                return false;
                            }
                            throw new AssertionError();
                    }
            }
        }
        return com.uc.crashsdk.e.b(i4, this.f63077c);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4 = this.f63076b;
        if (i4 == 10) {
            f.a(i4, this.f63077c);
        } else if (i4 == 500) {
            d.a(i4);
        } else if (i4 == 700) {
            com.uc.crashsdk.f.b(i4);
        } else if (i4 == 800) {
            g.a(i4);
        } else if (i4 != 201 && i4 != 202) {
            switch (i4) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                    com.uc.crashsdk.b.a(i4);
                    return;
                default:
                    switch (i4) {
                        case 301:
                        case 302:
                        case 303:
                            h.a(i4, this.f63077c);
                            return;
                        default:
                            switch (i4) {
                                case 401:
                                case 402:
                                case 403:
                                    break;
                                default:
                                    switch (i4) {
                                        case 405:
                                        case 406:
                                        case 407:
                                        case TTAdConstant.INTERACTION_TYPE_CODE /* 408 */:
                                        case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                        case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                        case TTAdConstant.IMAGE_CODE /* 411 */:
                                        case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                        case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                        case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                        case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                        case 416:
                                            break;
                                        default:
                                            a.d("crashsdk", "Unknown async runnable: " + toString());
                                            if (!f63075a) {
                                                throw new AssertionError();
                                            }
                                            return;
                                    }
                            }
                            com.uc.crashsdk.e.a(i4, this.f63077c);
                            return;
                    }
            }
        } else {
            com.uc.crashsdk.a.a(i4);
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.f63076b;
    }

    public e(int i4, Object[] objArr) {
        this.f63076b = i4;
        this.f63077c = objArr;
    }
}
