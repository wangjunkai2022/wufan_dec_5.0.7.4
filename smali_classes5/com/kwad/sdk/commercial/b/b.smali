.class public Lcom/kwad/sdk/commercial/b/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apj:Ljava/lang/String;

.field public apq:Ljava/lang/String;

.field public apr:Ljava/lang/String;

.field public aps:I

.field public apt:I

.field public status:I

.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static Bt()Lcom/kwad/sdk/commercial/b/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/b/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/b/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final cB(Ljava/lang/String;)Lcom/kwad/sdk/commercial/b/b;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/b/b;->url:Ljava/lang/String;

    .line 2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/b/b;->apj:Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/b/b;->apq:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object p0
.end method

.method public final cC(Ljava/lang/String;)Lcom/kwad/sdk/commercial/b/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/b/b;->apr:Ljava/lang/String;

    return-object p0
.end method

.method public final cf(I)Lcom/kwad/sdk/commercial/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/b/b;->status:I

    return-object p0
.end method

.method public final cg(I)Lcom/kwad/sdk/commercial/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/b/b;->aps:I

    return-object p0
.end method

.method public final ch(I)Lcom/kwad/sdk/commercial/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/b/b;->apt:I

    return-object p0
.end method
