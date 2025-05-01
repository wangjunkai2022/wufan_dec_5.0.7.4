.class public Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;
.super Landroidx/fragment/app/Fragment;
.source "StandardEliteRoomFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;,
        Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c02a4
.end annotation


# static fields
.field private static final M:I = 0x3e8

.field private static N:Ljava/lang/reflect/Field; = null

.field private static O:Ljava/lang/reflect/Method; = null

.field private static final P:I = 0x3f4

.field private static final Q:I = 0x3f5

.field public static final R:I = 0x3f6

.field public static final S:I = 0x3f7

.field private static final T:Ljava/lang/String; = "StandardEliteRoomFragment"


# instance fields
.field private A:I

.field public B:I

.field private C:Ljava/lang/String;

.field private D:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

.field private E:Landroid/app/Dialog;

.field private final F:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field private final H:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field private final I:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field private J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

.field K:Z

.field L:Z

.field b:Lcom/join/mgps/Util/b;
    .annotation build Lorg/androidannotations/annotations/Bean;
    .end annotation
.end field

.field private c:Z

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

.field private k:Lcom/join/mgps/adapter/GameListAdapter;

.field private l:Landroidx/recyclerview/widget/GridLayoutManager;

.field m:F

.field n:Z

.field o:J

.field p:Landroid/os/Handler;

.field q:Ljava/lang/Runnable;

.field private r:Lcom/join/mgps/dialog/j;

.field s:J

.field t:J

.field u:Lcom/join/mgps/dialog/f;

.field private v:Lcom/papa91/battle/protocol/SimpleRoom;

.field w:Lcom/join/mgps/customview/y$e;

.field x:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lapp/mgsim/arena/AreaInfo;",
            ">;"
        }
    .end annotation
.end field

.field y:Lapp/mgsim/arena/AreaInfo;

.field z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    :try_start_0
    const-class v0, Landroid/widget/AbsListView;

    const-string v1, "mFlingRunnable"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->N:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 3
    sget-object v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->N:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "endFling"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->O:Ljava/lang/reflect/Method;

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 5
    sput-object v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->O:Ljava/lang/reflect/Method;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->f:Ljava/util/List;

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m:F

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->n:Z

    const-wide/16 v1, 0x3e8

    .line 8
    iput-wide v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->o:J

    .line 9
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p:Landroid/os/Handler;

    .line 10
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$d;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->q:Ljava/lang/Runnable;

    const-wide/16 v1, 0x0

    .line 11
    iput-wide v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s:J

    .line 12
    iput-wide v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->t:J

    const/4 v1, 0x3

    .line 13
    iput v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    const/4 v1, 0x1

    .line 14
    iput v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    const-string v1, ""

    .line 15
    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    .line 16
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$k;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->D:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    .line 17
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$l;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$l;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->F:Ljava/util/Comparator;

    .line 18
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$a;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G:Ljava/util/Comparator;

    .line 19
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$b;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->H:Ljava/util/Comparator;

    .line 20
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$c;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->I:Ljava/util/Comparator;

    .line 21
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->K:Z

    .line 22
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    return-void
.end method

.method private C0(Ljava/lang/String;)Z
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/p;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, p1, v0, v1, v3}, Lcom/join/mgps/Util/UtilsMy;->V1(Landroid/content/Context;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/db/tables/EMUApkTable;Z)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method private J0(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 4
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lapp/mgsim/arena/SimpleWrapperRoom;

    iget-object v4, v4, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    const/4 v5, 0x0

    .line 5
    :goto_1
    iget-object v6, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    .line 6
    iget-object v6, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 7
    invoke-virtual {v4}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v7

    iget-object v8, v6, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v8}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v8

    if-ne v7, v8, :cond_1

    .line 8
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 10
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private L0()V
    .locals 1

    const/4 v0, 0x3

    .line 1
    iput v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    return-void
.end method

.method private S0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->x0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->E:Landroid/app/Dialog;

    const-string/jumbo v1, "\u6b63\u5728\u5237\u65b0\u6570\u636e\uff0c\u8bf7\u7a0d\u7b49..."

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->E:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->E:Landroid/app/Dialog;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->E:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    return-object p0
.end method

.method private V0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->I:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->H:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 6
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->F:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic W(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->f:Ljava/util/List;

    return-object p0
.end method

.method static synthetic X(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s0(ZLjava/lang/String;)V

    return-void
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    return-object p0
.end method

.method public static Z0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->O:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    sget-object v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->N:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Lcom/join/mgps/adapter/GameListAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->k:Lcom/join/mgps/adapter/GameListAdapter;

    return-object p0
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    return p0
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private d1()V
    .locals 0

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->S0()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->g1()Z

    move-result p0

    return p0
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    return p1
.end method

.method private g1()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 7
    iget v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 8
    iget-object v3, v2, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p0, v3}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->i1(Lcom/papa91/battle/protocol/SimpleRoom;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 9
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 10
    iget-object v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 11
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->V0()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    return-object p1
.end method

.method private k0(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method

.method private p0(Ljava/util/List;Z)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/papa91/battle/protocol/SimpleRoom;",
            ">;Z)",
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/papa91/battle/protocol/SimpleRoom;

    .line 3
    invoke-static {v1}, Lapp/mgsim/arena/SimpleWrapperRoom;->cloneSimpleRoom(Lcom/papa91/battle/protocol/SimpleRoom;)Lapp/mgsim/arena/SimpleWrapperRoom;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p2, :cond_2

    .line 4
    iget-object v4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 5
    iget-object v5, v5, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v5}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v5

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v6

    if-ne v5, v6, :cond_1

    const/4 v3, 0x1

    :cond_2
    if-nez v3, :cond_0

    .line 6
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private s0(ZLjava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_1
    :try_start_1
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 7
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 8
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 9
    iget-object v3, v2, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v3}, Lcom/papa91/battle/protocol/SimpleRoom;->getGameId()J

    move-result-wide v3

    cmp-long v5, v3, p1

    if-eqz v5, :cond_2

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 11
    iget-object v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 12
    :catch_0
    :cond_3
    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private z0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public A0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public B0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_type()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v2, 0xb

    if-eq p1, v2, :cond_3

    :cond_2
    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/join/android/app/common/utils/l;->i(Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public D0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->D:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method E0(I)V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->t:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->t:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const-string p1, "join room so fast ,waiting a moment!"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->t:J

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string/jumbo p1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_2

    .line 8
    monitor-exit v0

    return-void

    .line 9
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_3

    monitor-exit v0

    return-void

    .line 10
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lapp/mgsim/arena/SimpleWrapperRoom;

    iget-object p1, p1, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    .line 11
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getAllowPCJoin()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {p1}, Lcom/join/mgps/socket/fight/arena/c;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string/jumbo p1, "\u7981\u6b62PC\u7528\u6237\u52a0\u5165!"

    .line 12
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->showToast(Ljava/lang/String;)V

    .line 13
    monitor-exit v0

    return-void

    .line 14
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getAllowSpectatorJoin()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getSeatsNumber()I

    move-result p1

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getSitDownloadNumber()I

    move-result v1

    if-ne p1, v1, :cond_5

    const-string/jumbo p1, "\u623f\u95f4\u5df2\u6ee1\uff0c\u7981\u6b62\u89c2\u8d5b\uff01"

    .line 15
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->showToast(Ljava/lang/String;)V

    .line 16
    monitor-exit v0

    return-void

    .line 17
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h1()Z

    move-result p1

    if-nez p1, :cond_6

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->T0()V

    .line 19
    monitor-exit v0

    return-void

    .line 20
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getGameId()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 21
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v2}, Lcom/papa91/battle/protocol/SimpleRoom;->getGameId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 22
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/dialog/PlugInstallDialog_;->k0(Landroid/content/Context;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->c(Lcom/join/mgps/db/tables/EMUApkTable;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->b(I)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 24
    monitor-exit v0

    return-void

    .line 25
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getGameId()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->o0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getGameId()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x3f4

    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->X0(Ljava/lang/String;I)V

    goto :goto_0

    .line 27
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getGameId()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 28
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getHasJoinPassword()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 29
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->Q0(Lcom/papa91/battle/protocol/SimpleRoom;)V

    goto :goto_0

    .line 30
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v1

    const-string v2, ""

    iget-boolean v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-virtual {p1, v1, v2, v3}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->C2(ILjava/lang/String;Z)V

    .line 31
    :cond_a
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public F0(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->z:Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method G0(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "StandardEliteRoomFragment"

    .line 1
    invoke-static {v0, p1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public H0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->i:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/ptr/PtrFrameLayout;->g(Z)V

    return-void
.end method

.method public I0(Ljava/util/List;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/papa91/battle/protocol/SimpleRoom;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-nez v0, :cond_0

    const-string p1, "---refreshPushListData activity is null ---"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "---refreshPushListData---- start Time :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ltz v4, :cond_1

    .line 7
    invoke-direct {p0, p1, v3}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p0(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    .line 8
    iget-object v4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 9
    iget-object v4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 10
    iget-object v4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    iget-object v4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-eqz p2, :cond_2

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->g1()Z

    const/4 p1, 0x3

    .line 13
    iput p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    .line 14
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->V0()V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    invoke-direct {p0, v3, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s0(ZLjava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    iget-boolean p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-interface {p1, p2}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;->b(Z)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    .line 18
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->l0()V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    iget-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    iget-boolean v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-interface {p1, p2, v3}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;->a(IZ)V

    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "---refreshPushListData---- spend Time :"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 21
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public K0(I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 3
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 5
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 7
    iget-object v4, v3, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v4

    if-ne p1, v4, :cond_1

    .line 8
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    .line 10
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->w0(Ljava/util/ArrayList;)V

    .line 11
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method public M0(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    return-void
.end method

.method public N0(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    return-void
.end method

.method public O0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    return-void
.end method

.method P0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->u:Lcom/join/mgps/dialog/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dialog/f;->b()V

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/arena/GameRoomListActivity;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/GameConfig;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameConfig;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameConfig;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameConfig;->getGame_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 6
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/dialog/PlugInstallDialog_;->k0(Landroid/content/Context;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->c(Lcom/join/mgps/db/tables/EMUApkTable;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->b(I)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 8
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameConfig;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameConfig;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->o0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameConfig;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameConfig;->getGame_id()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->Y1(Ljava/lang/String;Z)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameConfig;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameConfig;->getGame_id()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3f5

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->X0(Ljava/lang/String;I)V

    :goto_0
    return-void

    .line 12
    :cond_4
    new-instance v1, Lcom/join/mgps/dialog/f;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->D:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    invoke-direct {v1, v2, v3}, Lcom/join/mgps/dialog/f;-><init>(Landroid/app/Activity;Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->u:Lcom/join/mgps/dialog/f;

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v0

    iget-boolean v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/dialog/f;->d(Ljava/util/List;Z)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->u:Lcom/join/mgps/dialog/f;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/f;->e()V

    return-void
.end method

.method Q0(Lcom/papa91/battle/protocol/SimpleRoom;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/customview/input/a;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    const-string/jumbo v2, "\u8bf7\u8f93\u5165\u623f\u95f4\u5bc6\u7801"

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/mgps/customview/input/a;-><init>(Landroid/content/Context;Ljava/lang/String;IZ)V

    .line 2
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;

    invoke-direct {v1, p0, v0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;Lcom/join/mgps/customview/input/a;Lcom/papa91/battle/protocol/SimpleRoom;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/input/a;->g(Lcom/join/mgps/customview/input/InputNumView$d;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->h()V

    return-void
.end method

.method public R0(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 5
    iget-object v3, v2, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v3}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v3

    if-ne v3, p1, :cond_1

    .line 6
    iget-object p1, v2, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->Q0(Lcom/papa91/battle/protocol/SimpleRoom;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public T0()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLoginBattle(Landroid/content/Context;)Z

    return-void
.end method

.method public U0(Lcom/join/mgps/customview/y$e;Ljava/util/concurrent/ConcurrentHashMap;Lapp/mgsim/arena/AreaInfo;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/customview/y$e;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lapp/mgsim/arena/AreaInfo;",
            ">;",
            "Lapp/mgsim/arena/AreaInfo;",
            "I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->w:Lcom/join/mgps/customview/y$e;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->x:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    iput-object p3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->y:Lapp/mgsim/arena/AreaInfo;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->r:Lcom/join/mgps/dialog/j;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/join/mgps/dialog/j;->a()V

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    if-nez v1, :cond_1

    monitor-exit v0

    return-void

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/activity/arena/GameRoomListActivity;

    .line 8
    new-instance v9, Lcom/join/mgps/dialog/j;

    iget-object v3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-object v4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->D:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    move-object v2, v9

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/join/mgps/dialog/j;-><init>(Landroid/app/Activity;Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;Lcom/join/mgps/customview/y$e;Ljava/util/concurrent/ConcurrentHashMap;Lapp/mgsim/arena/AreaInfo;I)V

    iput-object v9, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->r:Lcom/join/mgps/dialog/j;

    .line 9
    iget p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    invoke-virtual {v1}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    iget p4, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    invoke-virtual {v9, p1, p2, p3, p4}, Lcom/join/mgps/dialog/j;->d(ILjava/util/List;Ljava/lang/String;I)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->r:Lcom/join/mgps/dialog/j;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/j;->f()V

    .line 11
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method W0()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->n:Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public X0(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    const-class v2, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-boolean p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    const-string v1, "hasPlug"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4
    iget-boolean p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->K:Z

    const-string v1, "hasRom"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0, p2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public Y0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h1()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->T0()V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/arena/GameRoomListActivity;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->h2()Lcom/join/mgps/dto/ArenaGameRoomListConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArenaGameRoomListConfig;->getGame_list()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameConfig;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameConfig;->getGame_id()Ljava/lang/String;

    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 9
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/dialog/PlugInstallDialog_;->k0(Landroid/content/Context;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->c(Lcom/join/mgps/db/tables/EMUApkTable;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->b(I)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 11
    :cond_2
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->o0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->b2(J)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x3f6

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->X0(Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method a1()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->n:Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameListAdapter;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->f:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/GameListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->k:Lcom/join/mgps/adapter/GameListAdapter;

    .line 2
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->l:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 3
    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$e;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->l:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->k:Lcom/join/mgps/adapter/GameListAdapter;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->k:Lcom/join/mgps/adapter/GameListAdapter;

    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$f;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/GameListAdapter;->f(Lcom/join/mgps/adapter/GameListAdapter$b;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPreLoadCount(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0711b1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    div-int/2addr v0, v2

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    div-int/2addr v1, v2

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071279

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v3, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$i;

    invoke-direct {v3, p0, v0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$i;-><init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;II)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method public b1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    return-void
.end method

.method public c1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->Z0(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public e1(Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/papa91/battle/protocol/SimpleRoom;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-eqz v0, :cond_5

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "---updateItemForDissolve---- start Time :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 6
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    .line 7
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/papa91/battle/protocol/SimpleRoom;

    const/4 v7, 0x0

    .line 8
    :goto_1
    iget-object v8, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_2

    .line 9
    iget-object v8, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 10
    invoke-virtual {v6}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v9

    iget-object v10, v8, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v10}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v10

    if-ne v9, v10, :cond_1

    .line 11
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 13
    invoke-virtual {p0, v3}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->w0(Ljava/util/ArrayList;)V

    .line 14
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---updateItemForDissolve---- spend   Time :"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 15
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_5
    :goto_3
    return-void
.end method

.method public f1(Ljava/util/ArrayList;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/papa91/battle/protocol/SimpleRoom;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    iget-object v2, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-eqz v2, :cond_18

    if-eqz v0, :cond_18

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_0

    goto/16 :goto_e

    .line 2
    :cond_0
    iget-object v2, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v2

    .line 3
    :try_start_0
    iget-object v3, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->f:Ljava/util/List;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    iget-object v3, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 4
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "---updateListData---- start Time :"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 6
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_6

    .line 9
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/papa91/battle/protocol/SimpleRoom;

    const/4 v13, 0x0

    .line 10
    :goto_3
    iget-object v14, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    if-ge v13, v14, :cond_4

    .line 11
    invoke-virtual {v12}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v14

    iget-object v15, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lapp/mgsim/arena/SimpleWrapperRoom;

    iget-object v15, v15, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v15}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v15

    if-ne v14, v15, :cond_3

    .line 12
    invoke-static {v12}, Lapp/mgsim/arena/SimpleWrapperRoom;->cloneSimpleRoom(Lcom/papa91/battle/protocol/SimpleRoom;)Lapp/mgsim/arena/SimpleWrapperRoom;

    move-result-object v13

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_4
    const/4 v13, 0x0

    :goto_4
    if-nez v13, :cond_5

    .line 13
    invoke-static {v12}, Lapp/mgsim/arena/SimpleWrapperRoom;->cloneSimpleRoom(Lcom/papa91/battle/protocol/SimpleRoom;)Lapp/mgsim/arena/SimpleWrapperRoom;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 14
    :cond_6
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-lez v11, :cond_9

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v11, :cond_9

    .line 15
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 16
    iget-object v15, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/16 v16, -0x1

    .line 17
    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_8

    add-int/lit8 v12, v16, 0x1

    .line 18
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 19
    iget-object v5, v14, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v5}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v5

    iget-object v4, v4, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v4}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v4

    if-ne v5, v4, :cond_7

    .line 20
    iget-object v4, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v4, v12, v14}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move/from16 v16, v12

    const/4 v5, 0x1

    goto :goto_6

    :cond_8
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x1

    goto :goto_5

    .line 21
    :cond_9
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_a

    .line 22
    iget-object v4, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v4, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 23
    :cond_a
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 24
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v10, :cond_e

    .line 25
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/papa91/battle/protocol/SimpleRoom;

    const/4 v11, 0x0

    .line 26
    :goto_8
    iget-object v12, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_c

    .line 27
    invoke-virtual {v5}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v12

    iget-object v13, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lapp/mgsim/arena/SimpleWrapperRoom;

    iget-object v13, v13, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v13}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v13

    if-ne v12, v13, :cond_b

    .line 28
    invoke-static {v5}, Lapp/mgsim/arena/SimpleWrapperRoom;->cloneSimpleRoom(Lcom/papa91/battle/protocol/SimpleRoom;)Lapp/mgsim/arena/SimpleWrapperRoom;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x1

    goto :goto_9

    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_c
    const/4 v11, 0x0

    :goto_9
    if-nez v11, :cond_d

    .line 29
    invoke-static {v5}, Lapp/mgsim/arena/SimpleWrapperRoom;->cloneSimpleRoom(Lcom/papa91/battle/protocol/SimpleRoom;)Lapp/mgsim/arena/SimpleWrapperRoom;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    .line 30
    :cond_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x2

    if-lez v0, :cond_13

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v0, :cond_13

    .line 31
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 32
    iget-object v11, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, -0x1

    .line 33
    :cond_f
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    const/4 v13, 0x1

    add-int/2addr v12, v13

    .line 34
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 35
    iget-object v15, v10, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v15}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v15

    iget-object v13, v14, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v13}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v13

    if-ne v15, v13, :cond_f

    .line 36
    iget v13, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    if-ne v13, v4, :cond_11

    .line 37
    iget-object v13, v10, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1, v13}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->i1(Lcom/papa91/battle/protocol/SimpleRoom;)Z

    move-result v13

    if-eqz v13, :cond_10

    .line 38
    iget-object v13, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v13, v12, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    .line 39
    :cond_10
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    .line 40
    iget-object v13, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v13, v14}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_b

    .line 41
    :cond_11
    iget-object v13, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v13, v12, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_12
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    .line 42
    :cond_13
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_16

    const/4 v0, 0x0

    .line 43
    :goto_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_16

    .line 44
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lapp/mgsim/arena/SimpleWrapperRoom;

    .line 45
    iget v9, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    if-ne v9, v4, :cond_14

    .line 46
    iget-object v9, v5, Lapp/mgsim/arena/SimpleWrapperRoom;->simpleRoom:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1, v9}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->i1(Lcom/papa91/battle/protocol/SimpleRoom;)Z

    move-result v9

    if-eqz v9, :cond_15

    .line 47
    iget-object v9, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 48
    :cond_14
    iget-object v9, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    .line 49
    :cond_16
    iget-object v0, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s0(ZLjava/lang/String;)V

    .line 50
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->V0()V

    .line 51
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->l0()V

    if-eqz v3, :cond_17

    .line 52
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m0()V

    .line 53
    :cond_17
    iget-object v0, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    iget-object v3, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget-boolean v4, v1, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-interface {v0, v3, v4}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;->a(IZ)V

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---updateListData---- spend Time :"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v6

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 55
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_18
    :goto_e
    return-void
.end method

.method public h1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->k0(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method i1(Lcom/papa91/battle/protocol/SimpleRoom;)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1
    :goto_0
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getPlayerListCount()I

    move-result v5

    const/4 v6, 0x1

    if-ge v1, v5, :cond_2

    .line 2
    invoke-virtual {p1, v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getPlayerList(I)Lcom/papa91/battle/protocol/RoomPosition;

    move-result-object v5

    .line 3
    invoke-virtual {v5}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v7

    if-eqz v7, :cond_0

    .line 4
    invoke-virtual {v5}, Lcom/papa91/battle/protocol/RoomPosition;->getPlatform()Lcom/papa91/battle/protocol/Platform;

    move-result-object v7

    sget-object v8, Lcom/papa91/battle/protocol/Platform;->MOBILE:Lcom/papa91/battle/protocol/Platform;

    if-ne v7, v8, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 5
    invoke-virtual {v5}, Lcom/papa91/battle/protocol/RoomPosition;->getUid()I

    move-result v5

    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getLeaderId()I

    move-result v7

    if-ne v5, v7, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr v2, v3

    .line 6
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getPlayerListCount()I

    move-result v1

    if-ne v2, v1, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 7
    :goto_2
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getAllowPCJoin()Z

    move-result p1

    if-nez p1, :cond_4

    if-eqz v1, :cond_4

    if-eqz v4, :cond_4

    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method l0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->g:Landroid/widget/TextView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->f:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method m0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public n0(Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/papa91/battle/protocol/SimpleRoom;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-nez v0, :cond_0

    const-string p1, "---addPushListData activity is null ---"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->f:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 5
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 6
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "---addPushListData---- start Time :"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    if-eqz p1, :cond_3

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_3

    .line 8
    invoke-direct {p0, p1, v2}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->p0(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    .line 9
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 10
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    if-eqz p2, :cond_4

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->g1()Z

    const/4 p1, 0x3

    .line 12
    iput p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->A:I

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->V0()V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    invoke-direct {p0, v3, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s0(ZLjava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    iget-boolean p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-interface {p1, p2}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;->b(Z)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    .line 17
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->l0()V

    if-eqz v1, :cond_5

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->m0()V

    .line 19
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    iget-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    iget-boolean v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-interface {p1, p2, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;->a(IZ)V

    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "---addPushListData---- spend Time :"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v4

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 21
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public o0(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->K:Z

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/4 v3, 0x5

    if-ne v2, v3, :cond_3

    .line 5
    iput-boolean v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->K:Z

    .line 6
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    new-array v3, v0, [Ljava/lang/String;

    invoke-static {v2, p1, v0, v3}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v2, p1}, Lcom/join/mgps/Util/UtilsMy;->B0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iput-boolean v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    goto :goto_1

    .line 10
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    goto :goto_1

    .line 11
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    goto :goto_1

    .line 12
    :cond_3
    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->K:Z

    .line 13
    :goto_1
    iget-boolean p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->K:Z

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_4

    const/16 p2, 0x3f4

    if-ne p1, p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    if-eqz p1, :cond_4

    .line 3
    invoke-virtual {p1}, Lcom/papa91/battle/protocol/SimpleRoom;->getHasJoinPassword()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->Q0(Lcom/papa91/battle/protocol/SimpleRoom;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->v:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {p2}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result p2

    iget-boolean p3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    const-string v0, ""

    invoke-virtual {p1, p2, v0, p3}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->C2(ILjava/lang/String;Z)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x3f5

    const-string v0, "gameId"

    if-ne p1, p2, :cond_2

    .line 6
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-boolean p3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-virtual {p2, p1, p3}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->Y1(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_2
    const/16 p2, 0x3f6

    if-ne p1, p2, :cond_3

    .line 8
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    iget-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->b2(J)V

    goto :goto_0

    :cond_3
    const/16 p2, 0x3f7

    if-ne p1, p2, :cond_4

    .line 10
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-virtual {p1}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->c2()V

    :cond_4
    :goto_0
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    const-string v0, "---onAttach---"

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 3
    check-cast p1, Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->W0()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "---onCreate---"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "isElite"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    const-string v0, "filterGameId"

    const-string v1, ""

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->C:Ljava/lang/String;

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->a1()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d1()V

    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    return-void
.end method

.method public q0()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const-string v0, "fast join room so fast ,waiting a moment!"

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->G0(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->s:J

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string/jumbo v0, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h1()Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->T0()V

    return-void

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->P0()V

    return-void
.end method

.method r0(Z)V
    .locals 0

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->i:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {p1}, Lcom/join/mgps/ptr/PtrFrameLayout;->C()V

    :cond_0
    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "StandardEliteRoomFragment"

    .line 3
    invoke-static {v1, p1}, Lcom/papa91/arc/ext/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public t0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->d:Ljava/util/List;

    return-object v0
.end method

.method public u0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    return-object v0
.end method

.method public v0()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->B:I

    return v0
.end method

.method w0(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lapp/mgsim/arena/SimpleWrapperRoom;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J0(Ljava/util/ArrayList;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->L0()V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->J:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-boolean v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c:Z

    invoke-interface {p1, v1, v2}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$n;->a(IZ)V

    .line 8
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method x0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->E:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->E:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method y0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090db3

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->i:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->C()V

    return-void
.end method
