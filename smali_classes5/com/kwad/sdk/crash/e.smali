.class public final Lcom/kwad/sdk/crash/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/crash/e$a;
    }
.end annotation


# instance fields
.field private aGY:Lcom/kwad/sdk/crash/b/b;

.field private aGZ:Lcom/kwad/sdk/crash/c;

.field private aHa:J


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/kwad/sdk/crash/b/b;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/b/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/crash/e;->aGY:Lcom/kwad/sdk/crash/b/b;

    .line 4
    new-instance v0, Lcom/kwad/sdk/crash/c$a;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/c$a;-><init>()V

    invoke-virtual {v0}, Lcom/kwad/sdk/crash/c$a;->Ie()Lcom/kwad/sdk/crash/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/crash/e;-><init>()V

    return-void
.end method

.method public static If()Lcom/kwad/sdk/crash/e;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/crash/e$a;->In()Lcom/kwad/sdk/crash/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final Ig()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGY:Lcom/kwad/sdk/crash/b/b;

    invoke-virtual {v0}, Lcom/kwad/sdk/crash/b/b;->It()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Ih()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGY:Lcom/kwad/sdk/crash/b/b;

    invoke-virtual {v0}, Lcom/kwad/sdk/crash/b/b;->Ih()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Ii()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/c;->aGx:Lcom/kwad/sdk/crash/model/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/model/c;->aHA:Ljava/lang/String;

    return-object v0
.end method

.method public final Ij()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/c;->aGx:Lcom/kwad/sdk/crash/model/c;

    iget v0, v0, Lcom/kwad/sdk/crash/model/c;->aHE:I

    return v0
.end method

.method public final Ik()Lcom/kwad/sdk/crash/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    return-object v0
.end method

.method public final Il()Lcom/kwad/sdk/crash/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/c;->aGz:Lcom/kwad/sdk/crash/h;

    return-object v0
.end method

.method public final Im()J
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/kwad/sdk/crash/e;->aHa:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final a(Lcom/kwad/sdk/crash/c;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/crash/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/crash/e;->aHa:J

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGY:Lcom/kwad/sdk/crash/b/b;

    iget-object v1, p1, Lcom/kwad/sdk/crash/c;->aGA:[Ljava/lang/String;

    iget-object p1, p1, Lcom/kwad/sdk/crash/c;->aGB:[Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/kwad/sdk/crash/b/b;->a([Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final b(ILcom/kwad/sdk/crash/model/message/ExceptionMessage;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/crash/c;->Ib()Lcom/kwad/sdk/crash/f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/crash/f;->a(ILcom/kwad/sdk/crash/model/message/ExceptionMessage;)V

    :cond_0
    return-void
.end method

.method public final getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/c;->aGy:Lcom/kwad/sdk/crash/model/a;

    iget-object v0, v0, Lcom/kwad/sdk/crash/model/a;->aHr:Ljava/lang/String;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/c;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/c;->aGx:Lcom/kwad/sdk/crash/model/c;

    iget-object v0, v0, Lcom/kwad/sdk/crash/model/c;->mSdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final isDebug()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/e;->aGZ:Lcom/kwad/sdk/crash/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/crash/c;->Ic()Z

    move-result v0

    return v0
.end method
