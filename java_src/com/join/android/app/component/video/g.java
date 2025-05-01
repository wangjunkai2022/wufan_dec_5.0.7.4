package com.join.android.app.component.video;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.MApplication;
import com.join.android.app.component.xrecyclerview.XRecyclerView2;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import com.papa.gsyvideoplayer.utils.l;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: RvListVideoHelper.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: i  reason: collision with root package name */
    private static ConcurrentHashMap<String, b> f15400i = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    String f15401a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView.LayoutManager f15402b;

    /* renamed from: c  reason: collision with root package name */
    int f15403c;

    /* renamed from: d  reason: collision with root package name */
    int f15404d;

    /* renamed from: e  reason: collision with root package name */
    int f15405e;

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f15406f;

    /* renamed from: g  reason: collision with root package name */
    int f15407g;

    /* renamed from: h  reason: collision with root package name */
    Handler f15408h = new Handler();

    public g(RecyclerView recyclerView, String str) {
        this.f15401a = "";
        this.f15401a = str;
        this.f15406f = recyclerView;
    }

    public static void B(String str) {
        f15400i.remove(str);
    }

    public static void h(String str) {
        try {
            if (f15400i.size() > 0) {
                ArrayList<String> arrayList = new ArrayList();
                for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                    if (entry.getValue().o().equals(str)) {
                        entry.getValue().i0();
                        arrayList.add(entry.getKey());
                    }
                }
                if (arrayList.size() > 0) {
                    for (String str2 : arrayList) {
                        B(str2);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static int i(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    private static int j(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 < i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    public static int k(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
            return j(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
    }

    public static int l(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            return j(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    public static int m(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
            return i(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
    }

    public static int n(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            return i(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
    }

    public static b o(String str, String str2, int i4, boolean z4) {
        b bVar = f15400i.get(str);
        if (bVar == null && z4) {
            b bVar2 = new b();
            bVar2.v(i4);
            bVar2.j(str2);
            com.papa.gsyvideoplayer.model.c cVar = new com.papa.gsyvideoplayer.model.c(4, "enable-accurate-seek", 1);
            com.papa.gsyvideoplayer.model.c cVar2 = new com.papa.gsyvideoplayer.model.c(1, "analyzeduration", 1);
            com.papa.gsyvideoplayer.model.c cVar3 = new com.papa.gsyvideoplayer.model.c(1, "analyzemaxduration", 30);
            new com.papa.gsyvideoplayer.model.c(2, "skip_loop_filter", 48);
            com.papa.gsyvideoplayer.model.c cVar4 = new com.papa.gsyvideoplayer.model.c(4, "packet-buffering", 0);
            com.papa.gsyvideoplayer.model.c cVar5 = new com.papa.gsyvideoplayer.model.c(4, "framedrop", 1);
            com.papa.gsyvideoplayer.model.c cVar6 = new com.papa.gsyvideoplayer.model.c(1, "dns_cache_clear", 1);
            com.papa.gsyvideoplayer.model.c cVar7 = new com.papa.gsyvideoplayer.model.c(1, "protocol_whitelist", "crypto,file,http,https,tcp,tls,udp");
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            arrayList.add(cVar2);
            arrayList.add(cVar3);
            arrayList.add(cVar4);
            arrayList.add(cVar5);
            arrayList.add(cVar6);
            arrayList.add(cVar7);
            bVar2.X(arrayList);
            f15400i.put(str, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static void v(String str) {
        try {
            for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                if (entry.getValue().o().equals(str)) {
                    entry.getValue().f0();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void x(String str) {
        try {
            for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                if (entry.getValue().o().equals(str)) {
                    entry.getValue().g0();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void y(String str, boolean z4) {
        try {
            for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                if (entry.getValue().o().equals(str)) {
                    entry.getValue().h0(z4);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void A() {
        g(this.f15407g);
    }

    public boolean d(boolean z4) {
        if (!z4) {
            int e5 = com.join.mgps.pref.h.n(MApplication.j()).e();
            return e5 != 1 ? e5 != 2 : l.i(MApplication.j());
        }
        int z5 = com.join.mgps.pref.h.n(MApplication.j()).z();
        if (z5 != 0) {
            return z5 == 1 && l.i(MApplication.j());
        }
        return true;
    }

    public synchronized void e() {
        View findViewById;
        boolean z4;
        int itemViewType;
        View findViewById2;
        boolean z5;
        int itemViewType2;
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (new PrefDef_(MApplication.j()).isHomepagePlayVideo().d().booleanValue()) {
            this.f15407g = 2;
            if (this.f15402b == null) {
                this.f15402b = this.f15406f.getLayoutManager();
            }
            this.f15403c = k(this.f15406f);
            this.f15404d = m(this.f15406f);
            ArrayList<MultiStandVideo> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            RecyclerView recyclerView = this.f15406f;
            if (recyclerView instanceof XRecyclerView2) {
                if (((XRecyclerView2) recyclerView).o() && this.f15404d >= this.f15402b.getItemCount() - 1) {
                    int i4 = 0;
                    for (int i5 = this.f15404d; i5 >= this.f15403c && i4 < this.f15407g; i5--) {
                        RecyclerView.LayoutManager layoutManager = this.f15402b;
                        if (layoutManager != null && layoutManager.findViewByPosition(i5) != null && (findViewById2 = this.f15402b.findViewByPosition(i5).findViewById(R.id.wf_video)) != null) {
                            if (this.f15406f.getAdapter() == null || !((itemViewType2 = this.f15406f.getAdapter().getItemViewType(i5)) == 29 || itemViewType2 == 36)) {
                                z5 = false;
                            } else if (i4 >= 1) {
                                break;
                            } else {
                                z5 = true;
                            }
                            if (findViewById2 instanceof MultiStandVideo) {
                                MultiStandVideo multiStandVideo = (MultiStandVideo) findViewById2;
                                if (multiStandVideo.getCurrentState() != 2) {
                                    if (multiStandVideo.getCurrentState() == 5) {
                                        multiStandVideo.onVideoResume(false);
                                    } else {
                                        arrayList.add(multiStandVideo);
                                    }
                                }
                                i4++;
                                arrayList2.add(multiStandVideo.getKey());
                            }
                            if (z5) {
                                break;
                            }
                        }
                    }
                } else {
                    int i6 = 0;
                    for (int i7 = this.f15403c; i7 <= this.f15404d && i6 < this.f15407g; i7++) {
                        RecyclerView.LayoutManager layoutManager2 = this.f15402b;
                        if (layoutManager2 != null && layoutManager2.findViewByPosition(i7) != null && (findViewById = this.f15402b.findViewByPosition(i7).findViewById(R.id.wf_video)) != null) {
                            if (this.f15406f.getAdapter() == null || !((itemViewType = this.f15406f.getAdapter().getItemViewType(i7)) == 29 || itemViewType == 36)) {
                                z4 = false;
                            } else if (i6 >= 1) {
                                break;
                            } else {
                                z4 = true;
                            }
                            if (findViewById instanceof MultiStandVideo) {
                                MultiStandVideo multiStandVideo2 = (MultiStandVideo) findViewById;
                                if (multiStandVideo2.getCurrentState() != 2) {
                                    if (multiStandVideo2.getCurrentState() == 5) {
                                        multiStandVideo2.onVideoResume(false);
                                    } else {
                                        arrayList.add(multiStandVideo2);
                                    }
                                }
                                i6++;
                                arrayList2.add(multiStandVideo2.getKey());
                            }
                            if (z4) {
                                break;
                            }
                        }
                    }
                }
            }
            if (f15400i.size() > 0) {
                ArrayList<String> arrayList3 = new ArrayList();
                for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                    b value = entry.getValue();
                    if (value.o().equals(this.f15401a) && !arrayList2.contains(entry.getKey())) {
                        value.i0();
                        arrayList3.add(entry.getKey());
                    }
                }
                if (arrayList3.size() > 0) {
                    for (String str : arrayList3) {
                        B(str);
                    }
                }
            }
            if (arrayList.size() > 0 && d(true)) {
                for (final MultiStandVideo multiStandVideo3 : arrayList) {
                    this.f15408h.postDelayed(new Runnable() { // from class: com.join.android.app.component.video.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            MultiStandVideo.this.startPlayLogic();
                        }
                    }, 300L);
                }
            }
        }
    }

    public synchronized void f(int i4) {
        View findViewById;
        try {
            synchronized (this) {
                this.f15407g = i4;
                if (this.f15402b == null) {
                    this.f15402b = this.f15406f.getLayoutManager();
                }
                this.f15403c = k(this.f15406f);
                int m4 = m(this.f15406f);
                this.f15404d = m4;
                this.f15405e = this.f15403c + i4;
                if (m4 >= this.f15402b.getItemCount() - 1) {
                    RecyclerView.LayoutManager layoutManager = this.f15402b;
                    if (layoutManager instanceof GridLayoutManager) {
                        int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
                        int itemCount = this.f15402b.getItemCount() / spanCount;
                        if (this.f15402b.getItemCount() % spanCount == 0) {
                            int itemCount2 = this.f15402b.getItemCount();
                            this.f15405e = itemCount2;
                            this.f15403c = itemCount2 - i4;
                        } else {
                            int i5 = itemCount * spanCount;
                            this.f15403c = i5;
                            this.f15405e = i5 + i4;
                        }
                    } else {
                        int itemCount3 = layoutManager.getItemCount();
                        this.f15405e = itemCount3;
                        this.f15403c = itemCount3 - i4;
                    }
                }
                ArrayList<MultiStandVideo> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i6 = this.f15403c; i6 < this.f15405e; i6++) {
                    RecyclerView.LayoutManager layoutManager2 = this.f15402b;
                    if (layoutManager2 != null && layoutManager2.findViewByPosition(i6) != null && (findViewById = this.f15402b.findViewByPosition(i6).findViewById(R.id.wf_video)) != null && (findViewById instanceof MultiStandVideo)) {
                        MultiStandVideo multiStandVideo = (MultiStandVideo) findViewById;
                        if (multiStandVideo.getCurrentState() != 2 && multiStandVideo.getCurrentState() != 1 && multiStandVideo.getCurrentState() != 3) {
                            if (multiStandVideo.getCurrentState() == 5) {
                                multiStandVideo.onVideoResume(false);
                            } else {
                                arrayList.add(multiStandVideo);
                            }
                        }
                        arrayList2.add(multiStandVideo.getKey());
                    }
                }
                if (f15400i.size() > 0) {
                    ArrayList<String> arrayList3 = new ArrayList();
                    for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                        b value = entry.getValue();
                        if (value.o().equals(this.f15401a) && !arrayList2.contains(entry.getKey())) {
                            value.i0();
                            arrayList3.add(entry.getKey());
                        }
                    }
                    if (arrayList3.size() > 0) {
                        for (String str : arrayList3) {
                            B(str);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    for (final MultiStandVideo multiStandVideo2 : arrayList) {
                        this.f15408h.postDelayed(new Runnable() { // from class: com.join.android.app.component.video.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                MultiStandVideo.this.startPlayLogic();
                            }
                        }, 100L);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public synchronized void g(int i4) {
        View findViewById;
        View findViewById2;
        try {
            this.f15407g = i4;
            if (this.f15402b == null) {
                this.f15402b = this.f15406f.getLayoutManager();
            }
            this.f15403c = k(this.f15406f);
            this.f15404d = m(this.f15406f);
            ArrayList<MultiStandVideo> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f15404d >= this.f15402b.getItemCount() - 1) {
                int i5 = 0;
                for (int i6 = this.f15404d; i6 >= this.f15403c && i5 < i4; i6--) {
                    RecyclerView.LayoutManager layoutManager = this.f15402b;
                    if (layoutManager != null && layoutManager.findViewByPosition(i6) != null && (findViewById2 = this.f15402b.findViewByPosition(i6).findViewById(R.id.wf_video)) != null && (findViewById2 instanceof MultiStandVideo)) {
                        MultiStandVideo multiStandVideo = (MultiStandVideo) findViewById2;
                        if (multiStandVideo.getCurrentState() != 2) {
                            if (multiStandVideo.getCurrentState() == 5) {
                                multiStandVideo.onVideoResume(false);
                            } else {
                                arrayList.add(multiStandVideo);
                            }
                        }
                        i5++;
                        arrayList2.add(multiStandVideo.getKey());
                    }
                }
            } else {
                int i7 = 0;
                for (int i8 = this.f15403c; i8 <= this.f15404d && i7 < i4; i8++) {
                    RecyclerView.LayoutManager layoutManager2 = this.f15402b;
                    if (layoutManager2 != null && layoutManager2.findViewByPosition(i8) != null && (findViewById = this.f15402b.findViewByPosition(i8).findViewById(R.id.wf_video)) != null && (findViewById instanceof MultiStandVideo)) {
                        MultiStandVideo multiStandVideo2 = (MultiStandVideo) findViewById;
                        if (multiStandVideo2.getCurrentState() != 2) {
                            if (multiStandVideo2.getCurrentState() == 5) {
                                multiStandVideo2.onVideoResume(false);
                            } else {
                                arrayList.add(multiStandVideo2);
                            }
                        }
                        i7++;
                        arrayList2.add(multiStandVideo2.getKey());
                    }
                }
            }
            if (f15400i.size() > 0) {
                ArrayList<String> arrayList3 = new ArrayList();
                for (Map.Entry<String, b> entry : f15400i.entrySet()) {
                    b value = entry.getValue();
                    if (value.o().equals(this.f15401a) && !arrayList2.contains(entry.getKey())) {
                        value.i0();
                        arrayList3.add(entry.getKey());
                    }
                }
                if (arrayList3.size() > 0) {
                    for (String str : arrayList3) {
                        B(str);
                    }
                }
            }
            if (arrayList.size() > 0) {
                for (final MultiStandVideo multiStandVideo3 : arrayList) {
                    this.f15408h.postDelayed(new Runnable() { // from class: com.join.android.app.component.video.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            MultiStandVideo.this.startPlayLogic();
                        }
                    }, 300L);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public String p() {
        return this.f15401a;
    }

    public void t() {
        h(this.f15401a);
    }

    public void u() {
        v(this.f15401a);
    }

    public void w() {
        f(this.f15407g);
    }

    public void z() {
        e();
    }
}
