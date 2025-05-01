.class public Lcom/kwad/sdk/commercial/smallApp/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apO:Ljava/lang/String;

.field public apP:Ljava/lang/String;

.field public apQ:Ljava/lang/String;

.field public apj:Ljava/lang/String;

.field public apq:Ljava/lang/String;

.field public status:I

.field public url:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->getValue()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->apQ:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static a(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)Lcom/kwad/sdk/commercial/smallApp/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/smallApp/b;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/commercial/smallApp/b;-><init>(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)V

    return-object v0
.end method


# virtual methods
.method public final cR(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->url:Ljava/lang/String;

    .line 2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->apj:Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->apq:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object p0
.end method

.method public final cS(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->apO:Ljava/lang/String;

    return-object p0
.end method

.method public final cT(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->apP:Ljava/lang/String;

    return-object p0
.end method

.method public final cm(I)Lcom/kwad/sdk/commercial/smallApp/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/smallApp/b;->status:I

    return-object p0
.end method
