package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes2.dex */
public class l implements n, j {

    /* renamed from: d  reason: collision with root package name */
    private final String f3696d;

    /* renamed from: f  reason: collision with root package name */
    private final MergePaths f3698f;

    /* renamed from: a  reason: collision with root package name */
    private final Path f3693a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f3694b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f3695c = new Path();

    /* renamed from: e  reason: collision with root package name */
    private final List<n> f3697e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3699a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f3699a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3699a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3699a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3699a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3699a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(MergePaths mergePaths) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3696d = mergePaths.c();
            this.f3698f = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a() {
        for (int i4 = 0; i4 < this.f3697e.size(); i4++) {
            this.f3695c.addPath(this.f3697e.get(i4).getPath());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.f3694b.reset();
        this.f3693a.reset();
        for (int size = this.f3697e.size() - 1; size >= 1; size--) {
            n nVar = this.f3697e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> j4 = dVar.j();
                for (int size2 = j4.size() - 1; size2 >= 0; size2--) {
                    Path path = j4.get(size2).getPath();
                    path.transform(dVar.k());
                    this.f3694b.addPath(path);
                }
            } else {
                this.f3694b.addPath(nVar.getPath());
            }
        }
        n nVar2 = this.f3697e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> j5 = dVar2.j();
            for (int i4 = 0; i4 < j5.size(); i4++) {
                Path path2 = j5.get(i4).getPath();
                path2.transform(dVar2.k());
                this.f3693a.addPath(path2);
            }
        } else {
            this.f3693a.set(nVar2.getPath());
        }
        this.f3695c.op(this.f3693a, this.f3694b, op);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < this.f3697e.size(); i4++) {
            this.f3697e.get(i4).b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof n) {
                this.f3697e.add((n) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3696d;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f3695c.reset();
        if (this.f3698f.d()) {
            return this.f3695c;
        }
        int i4 = a.f3699a[this.f3698f.b().ordinal()];
        if (i4 == 1) {
            a();
        } else if (i4 == 2) {
            d(Path.Op.UNION);
        } else if (i4 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i4 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i4 == 5) {
            d(Path.Op.XOR);
        }
        return this.f3695c;
    }
}
