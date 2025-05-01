.class final Lcom/kwad/sdk/core/videocache/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final aCT:Ljava/io/File;

.field public final aCU:Lcom/kwad/sdk/core/videocache/a/c;

.field public final aCV:Lcom/kwad/sdk/core/videocache/a/a;

.field public final aCW:Lcom/kwad/sdk/core/videocache/d/c;

.field public final aCX:Lcom/kwad/sdk/core/videocache/b/b;

.field public final aCY:I

.field public final aCZ:I


# direct methods
.method constructor <init>(Ljava/io/File;Lcom/kwad/sdk/core/videocache/a/c;Lcom/kwad/sdk/core/videocache/a/a;Lcom/kwad/sdk/core/videocache/d/c;Lcom/kwad/sdk/core/videocache/b/b;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/c;->aCT:Ljava/io/File;

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/core/videocache/c;->aCU:Lcom/kwad/sdk/core/videocache/a/c;

    .line 4
    iput-object p3, p0, Lcom/kwad/sdk/core/videocache/c;->aCV:Lcom/kwad/sdk/core/videocache/a/a;

    .line 5
    iput-object p4, p0, Lcom/kwad/sdk/core/videocache/c;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    .line 6
    iput-object p5, p0, Lcom/kwad/sdk/core/videocache/c;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    .line 7
    iput p6, p0, Lcom/kwad/sdk/core/videocache/c;->aCY:I

    .line 8
    iput p7, p0, Lcom/kwad/sdk/core/videocache/c;->aCZ:I

    return-void
.end method


# virtual methods
.method final eH(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/c;->aCU:Lcom/kwad/sdk/core/videocache/a/c;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/videocache/a/c;->generate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/c;->aCT:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method
