.class public final Lcom/kwad/sdk/core/g/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/g/c$a;
    }
.end annotation


# instance fields
.field private volatile aBp:Z

.field private aBq:J

.field private aBr:D

.field private aBs:[D

.field private aBt:[D

.field private aBu:Lcom/kwad/sdk/core/g/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private aBv:Lcom/kwad/sdk/core/g/c$a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final aBw:Lcom/kwad/sdk/utils/bb$b;

.field private rotateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/g/c;->aBp:Z

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/g/c;->aBq:J

    const-wide v0, 0x3e112e0be0000000L    # 9.999999717180685E-10

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/core/g/c;->aBr:D

    const/4 v0, 0x3

    new-array v1, v0, [D

    .line 5
    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    new-array v0, v0, [D

    .line 6
    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    .line 7
    new-instance v0, Lcom/kwad/sdk/core/g/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/g/c$1;-><init>(Lcom/kwad/sdk/core/g/c;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBw:Lcom/kwad/sdk/utils/bb$b;

    .line 8
    iput-object p1, p0, Lcom/kwad/sdk/core/g/c;->rotateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    return-void

    :array_0
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private Ga()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([DD)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([DD)V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/g/c;->aBq:J

    return-void
.end method

.method private Gb()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/g/c;->aBp:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    aget-wide v4, v0, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    iget-object v2, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    aget-wide v3, v2, v1

    aput-wide v3, v0, v1

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    const/4 v1, 0x1

    aget-wide v2, v0, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    aget-wide v4, v0, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    iget-object v2, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    aget-wide v3, v2, v1

    aput-wide v3, v0, v1

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    const/4 v1, 0x2

    aget-wide v2, v0, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    aget-wide v4, v0, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    iget-object v2, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    aget-wide v3, v2, v1

    aput-wide v3, v0, v1

    :cond_3
    return-void
.end method

.method private Gc()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/g/c;->aBp:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->rotateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->aBu:Lcom/kwad/sdk/core/g/a;

    if-eqz v1, :cond_3

    .line 4
    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;->x:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;

    iget v1, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;->rotateDegree:I

    int-to-double v1, v1

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;->direction:I

    const/4 v3, 0x0

    invoke-direct {p0, v3, v1, v2, v0}, Lcom/kwad/sdk/core/g/c;->a(IDI)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->rotateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;->y:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;

    iget v2, v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;->rotateDegree:I

    int-to-double v4, v2

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;->direction:I

    .line 5
    invoke-direct {p0, v0, v4, v5, v1}, Lcom/kwad/sdk/core/g/c;->a(IDI)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->rotateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;->z:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;

    iget v2, v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;->rotateDegree:I

    int-to-double v4, v2

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;->direction:I

    .line 6
    invoke-direct {p0, v0, v4, v5, v1}, Lcom/kwad/sdk/core/g/c;->a(IDI)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    :cond_2
    iput-boolean v3, p0, Lcom/kwad/sdk/core/g/c;->aBp:Z

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBu:Lcom/kwad/sdk/core/g/a;

    invoke-direct {p0}, Lcom/kwad/sdk/core/g/c;->Gd()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/g/a;->V(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private Gd()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{\"x\": "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    const/4 v2, 0x0

    aget-wide v2, v1, v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",\"y\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    const/4 v2, 0x1

    aget-wide v2, v1, v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",\"z\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->aBs:[D

    const/4 v2, 0x2

    aget-wide v2, v1, v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/kwad/sdk/core/g/c;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/core/g/c;->aBq:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/sdk/core/g/c;)Lcom/kwad/sdk/core/g/a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/sdk/core/g/c;->aBu:Lcom/kwad/sdk/core/g/a;

    return-object p0
.end method

.method private a(IDI)Z
    .locals 6

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmpl-double v3, p2, v1

    if-lez v3, :cond_3

    .line 5
    iget-object v3, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    aget-wide v4, v3, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    cmpl-double v5, v3, p2

    if-ltz v5, :cond_3

    .line 6
    iget-object p2, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    aget-wide v3, p2, p1

    const/4 p3, 0x1

    cmpl-double v5, v3, v1

    if-lez v5, :cond_0

    if-eq p4, p3, :cond_1

    :cond_0
    aget-wide p1, p2, p1

    cmpg-double v3, p1, v1

    if-gez v3, :cond_2

    const/4 p1, 0x2

    if-ne p4, p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return p3

    :cond_3
    return v0
.end method

.method static synthetic b(Lcom/kwad/sdk/core/g/c;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/g/c;->aBq:J

    return-wide v0
.end method

.method static synthetic c(Lcom/kwad/sdk/core/g/c;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/g/c;->aBr:D

    return-wide v0
.end method

.method static synthetic d(Lcom/kwad/sdk/core/g/c;)[D
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/g/c;->aBt:[D

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/sdk/core/g/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/g/c;->Gb()V

    return-void
.end method

.method static synthetic f(Lcom/kwad/sdk/core/g/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/g/c;->Gc()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/g/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/g/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/core/g/c;->aBu:Lcom/kwad/sdk/core/g/a;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/core/g/c;->rotateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    return-void
.end method

.method public final bv(Landroid/content/Context;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-direct {p0}, Lcom/kwad/sdk/core/g/c;->Ga()V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/g/c;->aBp:Z

    .line 3
    iget-object p1, p0, Lcom/kwad/sdk/core/g/c;->aBv:Lcom/kwad/sdk/core/g/c$a;

    if-nez p1, :cond_1

    .line 4
    new-instance p1, Lcom/kwad/sdk/core/g/c$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/kwad/sdk/core/g/c$a;-><init>(Lcom/kwad/sdk/core/g/c;B)V

    iput-object p1, p0, Lcom/kwad/sdk/core/g/c;->aBv:Lcom/kwad/sdk/core/g/c$a;

    .line 5
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBv:Lcom/kwad/sdk/core/g/c$a;

    iget-object v1, p0, Lcom/kwad/sdk/core/g/c;->aBw:Lcom/kwad/sdk/utils/bb$b;

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v2, v0, v1}, Lcom/kwad/sdk/utils/bb;->a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V

    return-void
.end method

.method public final declared-synchronized bw(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    if-eqz p1, :cond_1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/core/g/c;->aBv:Lcom/kwad/sdk/core/g/c$a;

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/core/g/c;->aBv:Lcom/kwad/sdk/core/g/c$a;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/utils/bb;->a(Landroid/hardware/SensorEventListener;)V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/core/g/c;->aBv:Lcom/kwad/sdk/core/g/c$a;
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
