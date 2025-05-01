.class public Lcom/kwad/components/core/q/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile SZ:Lcom/kwad/components/core/q/a;


# instance fields
.field private PD:I

.field private Ta:I

.field private Tb:Z

.field private Tc:Z

.field private Td:I

.field private Te:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static rj()Lcom/kwad/components/core/q/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/q/a;->SZ:Lcom/kwad/components/core/q/a;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/core/q/a;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/core/q/a;->SZ:Lcom/kwad/components/core/q/a;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/core/q/a;

    invoke-direct {v1}, Lcom/kwad/components/core/q/a;-><init>()V

    sput-object v1, Lcom/kwad/components/core/q/a;->SZ:Lcom/kwad/components/core/q/a;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/kwad/components/core/q/a;->SZ:Lcom/kwad/components/core/q/a;

    return-object v0
.end method


# virtual methods
.method public final aH(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/q/a;->Ta:I

    return-void
.end method

.method public final aI(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/q/a;->Td:I

    return-void
.end method

.method public final aJ(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/q/a;->PD:I

    return-void
.end method

.method public final aK(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/q/a;->Tb:Z

    return-void
.end method

.method public final aL(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/q/a;->Tc:Z

    return-void
.end method

.method public final aM(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/q/a;->Te:Z

    return-void
.end method

.method public final clear()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/q/a;->Tc:Z

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/q/a;->Tb:Z

    .line 3
    iput v0, p0, Lcom/kwad/components/core/q/a;->Td:I

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/q/a;->Te:Z

    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lcom/kwad/components/core/q/a;->Ta:I

    .line 6
    iput v0, p0, Lcom/kwad/components/core/q/a;->PD:I

    return-void
.end method

.method public final rk()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/q/a;->Ta:I

    return v0
.end method

.method public final rl()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/q/a;->Tb:Z

    return v0
.end method

.method public final rm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/q/a;->Tc:Z

    return v0
.end method

.method public final rn()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/components/core/q/a;->Td:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final ro()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/q/a;->Td:I

    return v0
.end method

.method public final rp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/q/a;->Te:Z

    return v0
.end method

.method public final rq()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/q/a;->PD:I

    return v0
.end method
