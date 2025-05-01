.class public final Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;
.super Lcom/join/mgps/fragment/GameOlGiftPackageFragment;
.source "GameOlGiftPackageFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$p;
    }
.end annotation


# instance fields
.field private final A:La4/c;

.field private B:Landroid/view/View;

.field private final C:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->A:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->C:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->r0()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->n0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->p0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->q0()V

    return-void
.end method

.method public static E0()Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$p;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$p;

    invoke-direct {v0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$p;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->l0()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Lcom/join/mgps/dto/GiftPackageDataInfoBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->i0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;I)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->j0()V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Lcom/join/mgps/dto/GiftPackageDataOperationBean;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->o0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->showLoding()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->showMain(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$e;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/GiftPackageDataInfoBean;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->B:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$f;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$j;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$b;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$l;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$l;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Lcom/join/mgps/dto/GiftPackageDataOperationBean;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->A:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->B:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c02c4

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->B:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->B:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->B:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->c:Lcom/join/mgps/customview/XListView2;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->f:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090db3

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f0910aa

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->c:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->f:Landroid/widget/ImageView;

    const v0, 0x7f090e20

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 7
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->f:Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    .line 9
    new-instance v2, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$g;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$g;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 10
    new-instance v1, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$h;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$i;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->d0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->A:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$c;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public putBean(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;->C:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$d;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$a;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$m;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$n;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv1/a<",
            "Lcom/join/mgps/dto/GiftPackageDataInfoBean;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$o;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$k;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment_$k;-><init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
