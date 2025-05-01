.class public final Lcom/kwad/components/core/video/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/video/b$a;
    }
.end annotation


# static fields
.field private static Uw:Z

.field private static final Ux:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private UA:I

.field private UB:J

.field private UC:Ljava/lang/Runnable;

.field private UD:Lcom/kwad/sdk/contentalliance/a/a/b;

.field private UE:I

.field private UF:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/video/a/c$d;",
            ">;"
        }
    .end annotation
.end field

.field private final UG:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private UH:Z

.field private final UI:I

.field private volatile UJ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/video/k;",
            ">;"
        }
    .end annotation
.end field

.field private volatile UK:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/video/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private volatile UL:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/video/a/c$e;",
            ">;"
        }
    .end annotation
.end field

.field private final UM:Lcom/kwad/sdk/core/video/a/c$f;

.field private UN:Lcom/kwad/sdk/core/video/a/c$e;

.field private UO:Lcom/kwad/sdk/core/video/a/c$i;

.field private UP:Lcom/kwad/sdk/core/video/a/c$b;

.field private UQ:Lcom/kwad/sdk/core/video/a/c$c;

.field private UR:Lcom/kwad/sdk/core/video/a/c$d;

.field private US:Lcom/kwad/sdk/core/video/a/c$a;

.field private Ug:I

.field private Uh:I

.field private volatile Uy:I

.field private Uz:Lcom/kwad/sdk/core/video/a/c;

.field private fS:Landroid/os/Handler;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mContext:Landroid/content/Context;

.field private mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

.field private mStartTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/kwad/components/core/video/b;->Ux:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lcom/kwad/components/core/video/DetailVideoView;)V
    .locals 1
    .param p1    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/video/b;-><init>(Lcom/kwad/components/core/video/DetailVideoView;I)V

    return-void
.end method

.method private constructor <init>(Lcom/kwad/components/core/video/DetailVideoView;I)V
    .locals 2
    .param p1    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->fS:Landroid/os/Handler;

    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/kwad/components/core/video/b;->mStartTime:J

    .line 6
    iput p2, p0, Lcom/kwad/components/core/video/b;->UE:I

    .line 7
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UF:Ljava/util/List;

    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UG:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    iput-boolean p2, p0, Lcom/kwad/components/core/video/b;->UH:Z

    .line 10
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UK:Ljava/util/List;

    .line 12
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UL:Ljava/util/List;

    .line 13
    new-instance v0, Lcom/kwad/components/core/video/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$1;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UM:Lcom/kwad/sdk/core/video/a/c$f;

    .line 14
    new-instance v0, Lcom/kwad/components/core/video/b$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$4;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    .line 15
    new-instance v0, Lcom/kwad/components/core/video/b$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$5;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    .line 16
    new-instance v0, Lcom/kwad/components/core/video/b$6;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$6;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    .line 17
    new-instance v0, Lcom/kwad/components/core/video/b$7;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$7;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    .line 18
    new-instance v0, Lcom/kwad/components/core/video/b$8;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$8;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    .line 19
    new-instance v0, Lcom/kwad/components/core/video/b$9;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$9;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->US:Lcom/kwad/sdk/core/video/a/c$a;

    .line 20
    iput-object p1, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    if-eqz p1, :cond_0

    .line 21
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/video/b;->mContext:Landroid/content/Context;

    .line 22
    :cond_0
    iput p2, p0, Lcom/kwad/components/core/video/b;->UI:I

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "DetailMediaPlayerImpl["

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string p2, "create DetailMediaPlayerImpl"

    .line 24
    invoke-static {p1, p2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/components/core/video/DetailVideoView;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0
    .param p1    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/b;-><init>(Lcom/kwad/components/core/video/DetailVideoView;)V

    .line 26
    iput-object p2, p0, Lcom/kwad/components/core/video/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/video/b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/video/b;->Uy:I

    return p1
.end method

.method private a(Lcom/kwad/components/core/video/a/c;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UK:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/video/b;Lcom/kwad/sdk/core/video/a/c;Lcom/kwad/components/core/video/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/core/video/a/c;Lcom/kwad/components/core/video/b$a;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/video/b;Z)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/b;->aQ(Z)V

    return-void
.end method

.method private a(Lcom/kwad/sdk/contentalliance/a/a/b;ZLcom/kwad/components/core/video/DetailVideoView;Lcom/kwad/sdk/core/video/a/c;)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/contentalliance/a/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/kwad/sdk/core/video/a/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initMediaPlayer "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    if-eqz p3, :cond_6

    if-nez p4, :cond_0

    goto/16 :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->mContext:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 14
    invoke-virtual {p3}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->mContext:Landroid/content/Context;

    .line 15
    :cond_1
    iput-boolean p2, p0, Lcom/kwad/components/core/video/b;->UH:Z

    .line 16
    iput-object p1, p0, Lcom/kwad/components/core/video/b;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    .line 17
    iget-object p2, p1, Lcom/kwad/sdk/contentalliance/a/a/b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, p0, Lcom/kwad/components/core/video/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object p1, p1, Lcom/kwad/sdk/contentalliance/a/a/b;->videoUrl:Ljava/lang/String;

    .line 18
    invoke-static {p2, v0, p1}, Lcom/kwad/components/core/video/a/d;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/components/core/video/a/a;

    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/video/b;->c(Lcom/kwad/components/core/video/k;)V

    .line 20
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/components/core/video/a/c;)V

    .line 21
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    if-eq p1, p3, :cond_3

    .line 22
    iget-object p2, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v0, "initMediaPlayer videoView changed"

    invoke-static {p2, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    const/4 p2, 0x0

    .line 23
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/video/DetailVideoView;->setMediaPlayer(Lcom/kwad/components/core/video/b;)V

    .line 24
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getKeepScreenOn()Z

    move-result p2

    invoke-virtual {p3, p2}, Landroid/widget/FrameLayout;->setKeepScreenOn(Z)V

    const/4 p2, 0x0

    .line 25
    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->setKeepScreenOn(Z)V

    .line 26
    :cond_2
    iput-object p3, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    .line 27
    :cond_3
    invoke-virtual {p3, p0}, Lcom/kwad/components/core/video/DetailVideoView;->setMediaPlayer(Lcom/kwad/components/core/video/b;)V

    .line 28
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eq p1, p4, :cond_5

    .line 29
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string p2, "initMediaPlayer mediaPlayer changed"

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz p1, :cond_4

    .line 31
    invoke-interface {p1}, Lcom/kwad/sdk/core/video/a/c;->isLooping()Z

    move-result p1

    invoke-interface {p4, p1}, Lcom/kwad/sdk/core/video/a/c;->setLooping(Z)V

    .line 32
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rY()V

    .line 33
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {p1}, Lcom/kwad/sdk/core/video/a/c;->release()V

    .line 34
    :cond_4
    iput-object p4, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    .line 35
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->reset()V

    .line 36
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rX()V

    const/4 p1, 0x3

    .line 37
    invoke-interface {p4, p1}, Lcom/kwad/sdk/core/video/a/c;->setAudioStreamType(I)V

    goto :goto_0

    .line 38
    :cond_5
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string p2, "initMediaPlayer mediaPlayer not changed"

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->reset()V

    .line 40
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rY()V

    .line 41
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rX()V

    .line 42
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object p2, p3, Lcom/kwad/components/core/video/DetailVideoView;->Vb:Landroid/view/Surface;

    invoke-interface {p1, p2}, Lcom/kwad/sdk/core/video/a/c;->setSurface(Landroid/view/Surface;)V

    :cond_6
    :goto_1
    return-void
.end method

.method private a(Lcom/kwad/sdk/core/video/a/c;Lcom/kwad/components/core/video/b$a;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "releaseMediaPlayer:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->STATE_IDLE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 69
    :try_start_0
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/b;->aM(I)V

    .line 70
    invoke-interface {p1}, Lcom/kwad/sdk/core/video/a/c;->release()V

    if-eqz p2, :cond_1

    .line 71
    invoke-interface {p2}, Lcom/kwad/components/core/video/b$a;->onReleaseSuccess()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 72
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method private aM(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UK:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/video/a/c;

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-interface {v1}, Lcom/kwad/components/core/video/a/c;->onRelease()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-interface {v1}, Lcom/kwad/components/core/video/a/c;->onReset()V

    goto :goto_0

    .line 4
    :cond_2
    invoke-interface {v1}, Lcom/kwad/components/core/video/a/c;->onStart()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private aP(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v1, "start prepareAsync"

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-boolean v0, p0, Lcom/kwad/components/core/video/b;->UH:Z

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UG:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    new-instance v0, Lcom/kwad/components/core/video/b$10;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/video/b$10;-><init>(Lcom/kwad/components/core/video/b;Z)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 6
    :cond_2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/b;->aQ(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->getMediaPlayerType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    .line 8
    iget v0, p0, Lcom/kwad/components/core/video/b;->UE:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/kwad/components/core/video/b;->UE:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_3

    .line 9
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->rZ()V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "prepareAsync Exception:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method private aQ(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/contentalliance/a/a/b;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->GJ()Z

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->prepareAsync()Z

    move-result v0

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "prepareAsync forcePrepare: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", result: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/video/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/core/video/b;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/core/video/b;->Ug:I

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/core/video/b;Z)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/b;->setKeepScreenOn(Z)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/video/b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/video/b;->Uh:I

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/core/video/b;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/video/b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/video/b;->UA:I

    return p1
.end method

.method static synthetic d(Lcom/kwad/components/core/video/b;)Ljava/util/List;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->UL:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/video/b;)Lcom/kwad/sdk/core/video/a/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/video/b;)Lcom/kwad/components/core/video/DetailVideoView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/core/video/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/video/b;->mStartTime:J

    return-wide v0
.end method

.method public static getStateString(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "STATE_UNKNOWN"

    return-object p0

    :pswitch_0
    const-string p0, "STATE_COMPLETED"

    return-object p0

    :pswitch_1
    const-string p0, "PLAYER_STATE_STOPPED"

    return-object p0

    :pswitch_2
    const-string p0, "STATE_BUFFERING_PAUSED"

    return-object p0

    :pswitch_3
    const-string p0, "STATE_BUFFERING_PLAYING"

    return-object p0

    :pswitch_4
    const-string p0, "STATE_PAUSED"

    return-object p0

    :pswitch_5
    const-string p0, "STATE_PLAYING"

    return-object p0

    :pswitch_6
    const-string p0, "STATE_STARTED"

    return-object p0

    :pswitch_7
    const-string p0, "STATE_PREPARED"

    return-object p0

    :pswitch_8
    const-string p0, "STATE_PREPARING"

    return-object p0

    :pswitch_9
    const-string p0, "STATE_IDLE"

    return-object p0

    :pswitch_a
    const-string p0, "STATE_ERROR"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic h(Lcom/kwad/components/core/video/b;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->UG:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/core/video/b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    return-object p0
.end method

.method static synthetic j(Lcom/kwad/components/core/video/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->sb()V

    return-void
.end method

.method static synthetic k(Lcom/kwad/components/core/video/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/video/b;->Ug:I

    return p0
.end method

.method static synthetic l(Lcom/kwad/components/core/video/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/video/b;->Uh:I

    return p0
.end method

.method static synthetic m(Lcom/kwad/components/core/video/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rU()V

    return-void
.end method

.method static synthetic n(Lcom/kwad/components/core/video/b;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->UC:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic o(Lcom/kwad/components/core/video/b;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/b;->fS:Landroid/os/Handler;

    return-object p0
.end method

.method private rU()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->getCurrentPosition()J

    move-result-wide v0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->getDuration()J

    move-result-wide v2

    .line 3
    iget-object v4, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    if-eqz v4, :cond_0

    .line 4
    iget-object v4, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/kwad/components/core/video/k;

    .line 5
    invoke-interface {v5, v2, v3, v0, v1}, Lcom/kwad/components/core/video/h;->onMediaPlayProgress(JJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private rX()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UM:Lcom/kwad/sdk/core/video/a/c$f;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$f;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->b(Lcom/kwad/sdk/core/video/a/c$e;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$i;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$b;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$c;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->c(Lcom/kwad/sdk/core/video/a/c$d;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->US:Lcom/kwad/sdk/core/video/a/c$a;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$a;)V

    return-void
.end method

.method private rY()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$b;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->b(Lcom/kwad/sdk/core/video/a/c$e;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$i;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->c(Lcom/kwad/sdk/core/video/a/c$d;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$g;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/core/video/a/c$a;)V

    return-void
.end method

.method private reset()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "reset:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->STATE_IDLE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/b;->aM(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->reset()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    return-void
.end method

.method private sa()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->sb()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UC:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/kwad/components/core/video/b$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/b$3;-><init>(Lcom/kwad/components/core/video/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UC:Ljava/lang/Runnable;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->fS:Landroid/os/Handler;

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->UC:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private sb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UC:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/video/b;->fS:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/core/video/b;->UC:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method private setKeepScreenOn(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setKeepScreenOn(Z)V

    :cond_0
    return-void
.end method

.method private setPlayType(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/kwad/sdk/contentalliance/a/a/b;->videoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    if-eqz v0, :cond_0

    .line 2
    iput p1, v0, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/video/b$a;)V
    .locals 1

    const/4 v0, 0x1

    .line 73
    invoke-virtual {p0, p1, v0}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/components/core/video/b$a;Z)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/video/b$a;Z)V
    .locals 3

    .line 55
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "release:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->STATE_IDLE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/b;->setKeepScreenOn(Z)V

    .line 58
    iget-object v1, p0, Lcom/kwad/components/core/video/b;->fS:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 59
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->sb()V

    .line 60
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rY()V

    .line 61
    iput-object v2, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    .line 62
    iget-object v1, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v1, :cond_2

    if-eqz p2, :cond_1

    .line 63
    new-instance p2, Lcom/kwad/components/core/video/b$11;

    invoke-direct {p2, p0, v1, p1}, Lcom/kwad/components/core/video/b$11;-><init>(Lcom/kwad/components/core/video/b;Lcom/kwad/sdk/core/video/a/c;Lcom/kwad/components/core/video/b$a;)V

    invoke-static {p2}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 64
    :cond_1
    invoke-direct {p0, v1, p1}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/core/video/a/c;Lcom/kwad/components/core/video/b$a;)V

    .line 65
    :goto_0
    iput-object v2, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    .line 66
    :cond_2
    iput v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 67
    iput v0, p0, Lcom/kwad/components/core/video/b;->UE:I

    return-void
.end method

.method public final a(Lcom/kwad/sdk/contentalliance/a/a/a;)V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    instance-of v1, v0, Lcom/kwad/sdk/core/video/a/d;

    if-eqz v1, :cond_0

    .line 76
    check-cast v0, Lcom/kwad/sdk/core/video/a/d;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/video/a/d;->a(Lcom/kwad/sdk/contentalliance/a/a/a;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/contentalliance/a/a/b;)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/contentalliance/a/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 50
    :try_start_0
    iget-object v0, p1, Lcom/kwad/sdk/contentalliance/a/a/b;->videoUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "videoUrl="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/kwad/sdk/contentalliance/a/a/b;->videoUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/video/a/c;->a(Lcom/kwad/sdk/contentalliance/a/a/b;)V

    goto :goto_0

    .line 53
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v0, "videoUrl is null"

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 54
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/contentalliance/a/a/b;Lcom/kwad/components/core/video/DetailVideoView;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/contentalliance/a/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/contentalliance/a/a/b;ZZLcom/kwad/components/core/video/DetailVideoView;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/contentalliance/a/a/b;ZZLcom/kwad/components/core/video/DetailVideoView;)V
    .locals 4
    .param p1    # Lcom/kwad/sdk/contentalliance/a/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initMediaPlayer enablePreLoad:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->mContext:Landroid/content/Context;

    .line 7
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->yT()Z

    move-result v1

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->yU()Z

    move-result v2

    iget v3, p0, Lcom/kwad/components/core/video/b;->UI:I

    .line 9
    invoke-static {v0, p2, v1, v2, v3}, Lcom/kwad/sdk/core/video/a/e;->a(Landroid/content/Context;ZZZI)Lcom/kwad/sdk/core/video/a/c;

    move-result-object p2

    const/4 v0, 0x0

    .line 10
    invoke-interface {p2, v0}, Lcom/kwad/sdk/core/video/a/c;->setLooping(Z)V

    .line 11
    invoke-direct {p0, p1, p3, p4, p2}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/contentalliance/a/a/b;ZLcom/kwad/components/core/video/DetailVideoView;Lcom/kwad/sdk/core/video/a/c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UF:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$e;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UL:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c;II)V
    .locals 1

    .line 45
    iget-object p1, p0, Lcom/kwad/components/core/video/b;->UF:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 46
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/video/a/c$d;

    if-nez v0, :cond_0

    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {v0, p2, p3}, Lcom/kwad/sdk/core/video/a/c$d;->m(II)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/video/a/c$d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UF:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lcom/kwad/components/core/video/k;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UK:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final d(Lcom/kwad/components/core/video/k;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getBufferPercentage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/video/b;->UA:I

    return v0
.end method

.method public final getCurrentPlayingUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getCurrentPlayingUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCurrentPosition()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getCurrentPosition()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getDuration()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getMediaPlayerType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getMediaPlayerType()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getPlayDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getCurrentPosition()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getVideoHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getVideoHeight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getVideoWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->getVideoWidth()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isPlaying()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->isPlaying()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isPrepared()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isPreparing()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onPlayStateChanged(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UJ:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/components/core/video/b$2;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/video/b$2;-><init>(Lcom/kwad/components/core/video/b;I)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final pause()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "pause mCurrentState: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const-string v1, "videoPausePlay"

    const/4 v2, 0x5

    const/4 v3, 0x1

    const/4 v4, 0x4

    if-ne v0, v4, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->pause()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v4, "pause STATE_PLAYING->STATE_PAUSED"

    invoke-static {v0, v4}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iput v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 6
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    .line 7
    invoke-static {v1}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget v4, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v5, 0x6

    if-ne v4, v5, :cond_1

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->pause()V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v4, "pause STATE_BUFFERING_PLAYING->STATE_PAUSED"

    invoke-static {v0, v4}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x7

    .line 11
    iput v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 12
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    const/4 v0, 0x1

    .line 13
    :cond_1
    iget v4, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_2

    .line 14
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->pause()V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v4, "pause STATE_STARTED->STATE_PAUSED"

    invoke-static {v0, v4}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iput v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 17
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    .line 18
    invoke-static {v1}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 19
    :cond_2
    iget v1, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/16 v4, 0x9

    if-ne v1, v4, :cond_3

    iget-object v1, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v1}, Lcom/kwad/sdk/core/video/a/c;->isLooping()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 20
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->pause()V

    .line 21
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "pause "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v4}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "->STATE_PAUSED"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iput v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 23
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    goto :goto_1

    :cond_3
    move v3, v0

    :goto_1
    return v3
.end method

.method public final prepareAsync()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/b;->aP(Z)V

    return-void
.end method

.method public final rW()Lcom/kwad/sdk/core/video/a/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    return-object v0
.end method

.method public final rZ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    const-string v1, "resetAndPlay"

    if-nez v0, :cond_0

    const-string v0, "mMediaPlayer is null"

    .line 2
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->reset()V

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rY()V

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->rX()V

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->prepareAsync()V

    return-void

    :cond_2
    :goto_0
    const-string v0, "can not resetAndPlay in state:"

    .line 8
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final release()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/components/core/video/b$a;)V

    return-void
.end method

.method public final releaseAsync()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, v0, v1}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/components/core/video/b$a;Z)V

    return-void
.end method

.method public final restart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->start()V

    :cond_0
    const/4 v0, 0x3

    .line 3
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/b;->setPlayType(I)V

    return-void
.end method

.method public final resume()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v1, "resume but mMediaPlayer is null"

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "resume state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x2

    const-string v2, "resume:"

    if-eq v0, v1, :cond_5

    :try_start_1
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 5
    :cond_1
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v3, 0x5

    if-ne v0, v3, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->start()V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->STATE_PLAYING"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 8
    iput v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 9
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    .line 10
    invoke-direct {p0, v1}, Lcom/kwad/components/core/video/b;->setPlayType(I)V

    const-string v0, "videoResumePlay"

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 12
    :cond_2
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_3

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->start()V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->STATE_BUFFERING_PLAYING"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x6

    .line 15
    iput v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 16
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    goto :goto_1

    .line 17
    :cond_3
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    .line 18
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "resume: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \u6b64\u65f6\u4e0d\u80fd\u8c03\u7528resume()\u65b9\u6cd5."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-void

    .line 19
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->start()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 21
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final seekTo(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/core/video/a/c;->seekTo(J)V

    :cond_0
    return-void
.end method

.method public final setAudioEnabled(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 1
    invoke-virtual {p0, p1, p1}, Lcom/kwad/components/core/video/b;->setVolume(FF)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Lcom/kwad/components/core/video/b;->setVolume(FF)V

    return-void
.end method

.method public final setRadius(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kwad/sdk/widget/KSFrameLayout;->setRadius(FFFF)V

    return-void
.end method

.method public final setSpeed(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/video/a/c;->setSpeed(F)V

    return-void
.end method

.method public final setSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/video/a/c;->setSurface(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public final setVolume(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/core/video/a/c;->setVolume(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final start()V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "start state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/b;->aM(I)V

    .line 4
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    const-string v2, "start still not prepared well forcePrepare"

    invoke-static {v0, v2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, v1}, Lcom/kwad/components/core/video/b;->aP(Z)V

    return-void

    .line 7
    :cond_1
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/16 v2, 0x9

    const/4 v3, 0x2

    const/4 v4, 0x3

    if-eq v0, v3, :cond_4

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    if-ne v0, v2, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    if-ne v0, v4, :cond_3

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->start()V

    :cond_3
    return-void

    .line 10
    :cond_4
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/kwad/components/core/video/b;->mStartTime:J

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->start()V

    const-string v0, "videoStartPlay"

    .line 12
    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    .line 13
    iget-wide v5, p0, Lcom/kwad/components/core/video/b;->UB:J

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-eqz v0, :cond_5

    .line 14
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    long-to-int v6, v5

    int-to-long v5, v6

    invoke-interface {v0, v5, v6}, Lcom/kwad/sdk/core/video/a/c;->seekTo(J)V

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "start:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v6, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v6}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "->STATE_STARTED"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lcom/kwad/sdk/contentalliance/a/a/b;->videoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    if-eqz v0, :cond_8

    .line 17
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    if-ne v0, v3, :cond_7

    .line 18
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->UD:Lcom/kwad/sdk/contentalliance/a/a/b;

    iget-object v0, v0, Lcom/kwad/sdk/contentalliance/a/a/b;->videoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    if-nez v0, :cond_6

    .line 19
    invoke-direct {p0, v1}, Lcom/kwad/components/core/video/b;->setPlayType(I)V

    goto :goto_1

    .line 20
    :cond_6
    invoke-direct {p0, v4}, Lcom/kwad/components/core/video/b;->setPlayType(I)V

    goto :goto_1

    .line 21
    :cond_7
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    if-ne v0, v2, :cond_8

    .line 22
    invoke-direct {p0, v4}, Lcom/kwad/components/core/video/b;->setPlayType(I)V

    .line 23
    :cond_8
    :goto_1
    iput v4, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 24
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    .line 25
    invoke-direct {p0}, Lcom/kwad/components/core/video/b;->sa()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 26
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public final start(J)V
    .locals 0

    .line 27
    iput-wide p1, p0, Lcom/kwad/components/core/video/b;->UB:J

    .line 28
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->start()V

    return-void
.end method

.method public final stopAndPrepareAsync()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopAndPrepareAsync state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->getStateString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x3

    const/16 v2, 0x8

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    if-eq v0, v2, :cond_1

    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    .line 4
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/video/b;->Uz:Lcom/kwad/sdk/core/video/a/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c;->stop()V

    .line 5
    iput v2, p0, Lcom/kwad/components/core/video/b;->Uy:I

    .line 6
    iget v0, p0, Lcom/kwad/components/core/video/b;->Uy:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 8
    :catch_0
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/components/core/video/b;->release()V

    :cond_3
    :goto_0
    return-void
.end method
