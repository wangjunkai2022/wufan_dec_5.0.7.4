.class public Lcom/kwad/sdk/commercial/g/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public OP:I

.field public apj:Ljava/lang/String;

.field public apq:Ljava/lang/String;

.field public status:I

.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static By()Lcom/kwad/sdk/commercial/g/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/g/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/g/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final cL(Ljava/lang/String;)Lcom/kwad/sdk/commercial/g/b;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/g/b;->url:Ljava/lang/String;

    .line 2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/g/b;->apj:Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/g/b;->apq:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object p0
.end method

.method public final ck(I)Lcom/kwad/sdk/commercial/g/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/g/b;->status:I

    return-object p0
.end method

.method public final cl(I)Lcom/kwad/sdk/commercial/g/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/g/b;->OP:I

    return-object p0
.end method
