.class public Lcom/kwad/sdk/commercial/f/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
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

.method public static Bx()Lcom/kwad/sdk/commercial/f/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/f/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/f/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final cK(Ljava/lang/String;)Lcom/kwad/sdk/commercial/f/b;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/f/b;->url:Ljava/lang/String;

    .line 2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/f/b;->apj:Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/f/b;->apq:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object p0
.end method

.method public final cj(I)Lcom/kwad/sdk/commercial/f/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/f/b;->status:I

    return-object p0
.end method
