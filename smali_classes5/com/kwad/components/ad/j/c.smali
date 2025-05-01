.class public Lcom/kwad/components/ad/j/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/network/h$a;


# static fields
.field private static volatile HT:Lcom/kwad/components/ad/j/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static mD()Lcom/kwad/components/ad/j/c;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/ad/j/c;->HT:Lcom/kwad/components/ad/j/c;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/ad/j/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/ad/j/c;->HT:Lcom/kwad/components/ad/j/c;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/ad/j/c;

    invoke-direct {v1}, Lcom/kwad/components/ad/j/c;-><init>()V

    sput-object v1, Lcom/kwad/components/ad/j/c;->HT:Lcom/kwad/components/ad/j/c;

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
    sget-object v0, Lcom/kwad/components/ad/j/c;->HT:Lcom/kwad/components/ad/j/c;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/network/f;I)V
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/kwad/components/core/request/a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget v0, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    if-ne p2, v0, :cond_1

    return-void

    :cond_1
    const/16 v0, 0x520c

    .line 3
    invoke-interface {p1}, Lcom/kwad/sdk/core/network/f;->getScene()Lcom/kwad/sdk/internal/api/SceneImpl;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 4
    invoke-virtual {p1}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v1

    .line 5
    sget-object p1, Lcom/kwad/sdk/core/network/e;->awF:Lcom/kwad/sdk/core/network/e;

    iget p1, p1, Lcom/kwad/sdk/core/network/e;->errorCode:I

    if-ne p2, p1, :cond_2

    const/16 v0, 0x5209

    goto :goto_0

    .line 6
    :cond_2
    sget-object p1, Lcom/kwad/sdk/core/network/e;->awJ:Lcom/kwad/sdk/core/network/e;

    iget p1, p1, Lcom/kwad/sdk/core/network/e;->errorCode:I

    if-ne p2, p1, :cond_3

    const/16 v0, 0x520b

    goto :goto_0

    :cond_3
    if-lez p2, :cond_4

    const/16 p1, 0x3e8

    if-ge p2, p1, :cond_4

    const/16 v0, 0x520a

    .line 7
    :cond_4
    :goto_0
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object p1

    invoke-virtual {p1, v1, v2, v0}, Lcom/kwad/components/core/o/a;->a(JI)V

    :cond_5
    return-void
.end method

.method public final init()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/network/h;->Ex()Lcom/kwad/sdk/core/network/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/network/h;->a(Lcom/kwad/sdk/core/network/h$a;)V

    return-void
.end method
