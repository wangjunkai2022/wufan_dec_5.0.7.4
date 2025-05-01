package retrofit2.adapter.rxjava2;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;
/* compiled from: RxJava2CallAdapterFactory.java */
/* loaded from: classes.dex */
public final class g extends CallAdapter.Factory {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Scheduler f73228a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73229b;

    private g(@Nullable Scheduler scheduler, boolean z4) {
        this.f73228a = scheduler;
        this.f73229b = z4;
    }

    public static g a() {
        return new g(null, false);
    }

    public static g b() {
        return new g(null, true);
    }

    public static g c(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler == null");
        return new g(scheduler, false);
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2;
        boolean z4;
        boolean z5;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == Completable.class) {
            return new f(Void.class, this.f73228a, this.f73229b, false, true, false, false, false, true);
        }
        boolean z6 = rawType == Flowable.class;
        boolean z7 = rawType == Single.class;
        boolean z8 = rawType == Maybe.class;
        if (rawType == Observable.class || z6 || z7 || z8) {
            if (!(type instanceof ParameterizedType)) {
                String str = !z6 ? !z7 ? z8 ? "Maybe" : "Observable" : "Single" : "Flowable";
                throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
            }
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
            Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound);
            if (rawType2 == Response.class) {
                if (parameterUpperBound instanceof ParameterizedType) {
                    type2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                    z4 = false;
                } else {
                    throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
            } else if (rawType2 == d.class) {
                if (parameterUpperBound instanceof ParameterizedType) {
                    type2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                    z4 = true;
                } else {
                    throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                }
            } else {
                type2 = parameterUpperBound;
                z4 = false;
                z5 = true;
                return new f(type2, this.f73228a, this.f73229b, z4, z5, z6, z7, z8, false);
            }
            z5 = false;
            return new f(type2, this.f73228a, this.f73229b, z4, z5, z6, z7, z8, false);
        }
        return null;
    }
}
