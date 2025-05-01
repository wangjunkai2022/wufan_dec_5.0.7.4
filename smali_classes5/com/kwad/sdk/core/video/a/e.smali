.class public final Lcom/kwad/sdk/core/video/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static Uw:Z = false

.field private static aCD:Ljava/util/concurrent/atomic/AtomicBoolean; = null

.field private static aCE:I = -0x1

.field private static final aCF:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final aCG:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static aCH:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/sdk/core/video/a/e;->aCF:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/sdk/core/video/a/e;->aCG:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private static Bf()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/video/a/e;->aCG:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/kwad/framework/a/a;->IX:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static GP()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/core/video/a/e;->aCH:I

    return v0
.end method

.method private static GQ()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/video/a/e;->aCD:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 4
    sput-object v0, Lcom/kwad/sdk/core/video/a/e;->aCD:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;ZZZI)Lcom/kwad/sdk/core/video/a/c;
    .locals 11
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-class p0, Lcom/kwad/sdk/service/a/f;

    const-string v0, "MediaPlayerImpl"

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/video/a/e;->Bf()Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/kwad/sdk/core/video/a/e;->GQ()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "constructPlayer KwaiMediaPlayer"

    .line 3
    invoke-static {v0, v3}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v3, Lcom/kwad/sdk/core/video/a/d;

    invoke-direct {v3, p4}, Lcom/kwad/sdk/core/video/a/d;-><init>(I)V

    const/4 p4, 0x2

    .line 5
    sput p4, Lcom/kwad/sdk/core/video/a/e;->aCH:I

    .line 6
    invoke-virtual {v3, p1}, Lcom/kwad/sdk/core/video/a/d;->bn(Z)V

    goto :goto_0

    :cond_0
    const-string p1, "constructPlayer AndroidMediaPlayer"

    .line 7
    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance v3, Lcom/kwad/sdk/core/video/a/b;

    invoke-direct {v3}, Lcom/kwad/sdk/core/video/a/b;-><init>()V

    .line 9
    sput v2, Lcom/kwad/sdk/core/video/a/e;->aCH:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    const/4 v8, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    const-string p4, "constructPlayer exception, using AndroidMediaPlayer"

    .line 10
    invoke-static {v0, p4, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    sget-boolean p4, Lcom/kwad/sdk/core/video/a/e;->Uw:Z

    if-nez p4, :cond_1

    .line 12
    sput-boolean v2, Lcom/kwad/sdk/core/video/a/e;->Uw:Z

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/service/c;->gatherException(Ljava/lang/Throwable;)V

    .line 14
    :cond_1
    new-instance v3, Lcom/kwad/sdk/core/video/a/b;

    invoke-direct {v3}, Lcom/kwad/sdk/core/video/a/b;-><init>()V

    .line 15
    sput v2, Lcom/kwad/sdk/core/video/a/e;->aCH:I

    const/4 v8, 0x1

    .line 16
    :goto_1
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 17
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {p0}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 18
    :goto_2
    invoke-static {}, Lcom/kwad/sdk/core/video/a/e;->Bf()Z

    move-result v4

    .line 19
    invoke-static {}, Lcom/kwad/sdk/core/video/a/e;->GQ()Z

    move-result v7

    .line 20
    invoke-interface {v3}, Lcom/kwad/sdk/core/video/a/c;->getMediaPlayerType()I

    move-result v10

    move v6, p2

    move v9, p3

    .line 21
    invoke-static/range {v4 .. v10}, Lcom/kwad/sdk/utils/ao;->a(ZZZZZZI)I

    move-result p0

    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "player v="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "KwaiPlayHelper"

    invoke-static {p2, p1}, Lcom/kwad/sdk/core/e/c;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    sget p1, Lcom/kwad/sdk/core/video/a/e;->aCE:I

    if-eq p1, p0, :cond_3

    .line 24
    sput p0, Lcom/kwad/sdk/core/video/a/e;->aCE:I

    .line 25
    invoke-static {p0}, Lcom/kwad/sdk/core/video/a/e;->dq(I)V

    :cond_3
    return-object v3
.end method

.method private static dq(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/n;

    const-wide/16 v1, 0x27e4

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/core/report/n;-><init>(J)V

    .line 2
    iput p0, v0, Lcom/kwad/sdk/core/report/n;->azC:I

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method
