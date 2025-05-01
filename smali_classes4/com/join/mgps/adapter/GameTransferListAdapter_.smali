.class public final Lcom/join/mgps/adapter/GameTransferListAdapter_;
.super Lcom/join/mgps/adapter/GameTransferListAdapter;
.source "GameTransferListAdapter_.java"


# instance fields
.field private g:Landroid/content/Context;

.field private h:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/adapter/GameTransferListAdapter;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_;->g:Landroid/content/Context;

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->z()V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/adapter/GameTransferListAdapter;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_;->g:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_;->h:Ljava/lang/Object;

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->z()V

    return-void
.end method

.method static synthetic m(Lcom/join/mgps/adapter/GameTransferListAdapter_;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->b(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic n(Lcom/join/mgps/adapter/GameTransferListAdapter_;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->b(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic o(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->g(I)V

    return-void
.end method

.method static synthetic p(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->g(I)V

    return-void
.end method

.method static synthetic q(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->f(I)V

    return-void
.end method

.method static synthetic r(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->f(I)V

    return-void
.end method

.method static synthetic s(Lcom/join/mgps/adapter/GameTransferListAdapter_;Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->a(Landroid/util/SparseArray;)V

    return-void
.end method

.method static synthetic t(Lcom/join/mgps/adapter/GameTransferListAdapter_;Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->a(Landroid/util/SparseArray;)V

    return-void
.end method

.method static synthetic u(Lcom/join/mgps/adapter/GameTransferListAdapter_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->clear()V

    return-void
.end method

.method static synthetic v(Lcom/join/mgps/adapter/GameTransferListAdapter_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/adapter/RecyclerViewBaseAdapter;->clear()V

    return-void
.end method

.method public static x(Landroid/content/Context;)Lcom/join/mgps/adapter/GameTransferListAdapter_;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/GameTransferListAdapter_;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static y(Landroid/content/Context;Ljava/lang/Object;)Lcom/join/mgps/adapter/GameTransferListAdapter_;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    return-object v0
.end method

.method private z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_;->g:Landroid/content/Context;

    iput-object v0, p0, Lcom/join/mgps/adapter/GameTransferListAdapter;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public A(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_;->g:Landroid/content/Context;

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->z()V

    return-void
.end method

.method public a(Landroid/util/SparseArray;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lcom/join/mgps/dto/GameTransferBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->s(Lcom/join/mgps/adapter/GameTransferListAdapter_;Landroid/util/SparseArray;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_$d;-><init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;Landroid/util/SparseArray;)V

    const-wide/16 v1, 0x0

    const-string p1, ""

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public bridge synthetic b(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/dto/GameTransferBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->w(ILcom/join/mgps/dto/GameTransferBean;)V

    return-void
.end method

.method public clear()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->u(Lcom/join/mgps/adapter/GameTransferListAdapter_;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/GameTransferListAdapter_$e;-><init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;)V

    const-wide/16 v1, 0x0

    const-string v3, ""

    invoke-static {v3, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public f(I)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->q(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_$c;-><init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V

    const-wide/16 v1, 0x0

    const-string p1, ""

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public g(I)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->o(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_$b;-><init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V

    const-wide/16 v1, 0x0

    const-string p1, ""

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public w(ILcom/join/mgps/dto/GameTransferBean;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {p0, p1, p2}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->m(Lcom/join/mgps/adapter/GameTransferListAdapter_;ILjava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;-><init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;ILcom/join/mgps/dto/GameTransferBean;)V

    const-wide/16 p1, 0x0

    const-string v1, ""

    invoke-static {v1, v0, p1, p2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
