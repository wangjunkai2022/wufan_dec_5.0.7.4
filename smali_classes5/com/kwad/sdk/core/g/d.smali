.class public final Lcom/kwad/sdk/core/g/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/g/d$a;
    }
.end annotation


# static fields
.field private static aBA:D = 0.01

.field private static aBz:F = 9.81f


# instance fields
.field private aBB:Lcom/kwad/sdk/core/g/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private aBC:Lcom/kwad/sdk/core/g/d$a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private volatile aBp:Z

.field private final aBw:Lcom/kwad/sdk/utils/bb$b;

.field private aBy:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/g/d;->aBp:Z

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/g/d$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/g/d$1;-><init>(Lcom/kwad/sdk/core/g/d;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/g/d;->aBw:Lcom/kwad/sdk/utils/bb$b;

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/high16 p1, 0x40a00000    # 5.0f

    .line 4
    iput p1, p0, Lcom/kwad/sdk/core/g/d;->aBy:F

    return-void

    .line 5
    :cond_0
    iput p1, p0, Lcom/kwad/sdk/core/g/d;->aBy:F

    return-void
.end method

.method static synthetic Gf()F
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/core/g/d;->aBz:F

    return v0
.end method

.method static synthetic Gg()D
    .locals 2

    .line 1
    sget-wide v0, Lcom/kwad/sdk/core/g/d;->aBA:D

    return-wide v0
.end method

.method static synthetic a(Lcom/kwad/sdk/core/g/d;)Lcom/kwad/sdk/core/g/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/g/d;->aBB:Lcom/kwad/sdk/core/g/b;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/sdk/core/g/d;Z)Z
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/g/d;->aBp:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/sdk/core/g/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/core/g/d;->aBp:Z

    return p0
.end method

.method static synthetic c(Lcom/kwad/sdk/core/g/d;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/core/g/d;->aBy:F

    return p0
.end method


# virtual methods
.method public final declared-synchronized Ge()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lcom/kwad/sdk/core/g/d;->aBp:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/kwad/sdk/core/g/b;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/g/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/core/g/d;->aBB:Lcom/kwad/sdk/core/g/b;

    return-void
.end method

.method public final bv(Landroid/content/Context;)V
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "ShakeDetector"

    const-string v0, "startDetect context is null"

    .line 1
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/g/d;->aBp:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d;->aBC:Lcom/kwad/sdk/core/g/d$a;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/g/d$a;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/g/d$a;-><init>(Lcom/kwad/sdk/core/g/d;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/g/d;->aBC:Lcom/kwad/sdk/core/g/d$a;

    .line 5
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/kwad/sdk/core/g/d;->aBC:Lcom/kwad/sdk/core/g/d$a;

    iget-object v3, p0, Lcom/kwad/sdk/core/g/d;->aBw:Lcom/kwad/sdk/utils/bb$b;

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/kwad/sdk/utils/bb;->a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V

    return-void
.end method

.method public final declared-synchronized bw(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    if-eqz p1, :cond_1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/core/g/d;->aBC:Lcom/kwad/sdk/core/g/d$a;

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/core/g/d;->aBC:Lcom/kwad/sdk/core/g/d$a;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/utils/bb;->a(Landroid/hardware/SensorEventListener;)V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/core/g/d;->aBC:Lcom/kwad/sdk/core/g/d$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    .line 5
    :cond_1
    :goto_0
    monitor-exit p0

    return-void
.end method

.method public final g(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/g/d;->aBy:F

    return-void
.end method
