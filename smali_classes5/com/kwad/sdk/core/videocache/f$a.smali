.class public final Lcom/kwad/sdk/core/videocache/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/videocache/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private aCT:Ljava/io/File;

.field private aCU:Lcom/kwad/sdk/core/videocache/a/c;

.field private aCV:Lcom/kwad/sdk/core/videocache/a/a;

.field private aCW:Lcom/kwad/sdk/core/videocache/d/c;

.field private aCX:Lcom/kwad/sdk/core/videocache/b/b;

.field private aCY:I

.field private aCZ:I

.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCZ:I

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->context:Landroid/content/Context;

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/videocache/o;->bx(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCT:Ljava/io/File;

    .line 5
    new-instance p1, Lcom/kwad/sdk/core/videocache/a/g;

    const-wide/32 v0, 0x20000000

    invoke-direct {p1, v0, v1}, Lcom/kwad/sdk/core/videocache/a/g;-><init>(J)V

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCV:Lcom/kwad/sdk/core/videocache/a/a;

    .line 6
    new-instance p1, Lcom/kwad/sdk/core/videocache/a/f;

    invoke-direct {p1}, Lcom/kwad/sdk/core/videocache/a/f;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCU:Lcom/kwad/sdk/core/videocache/a/c;

    .line 7
    new-instance p1, Lcom/kwad/sdk/core/videocache/b/a;

    invoke-direct {p1}, Lcom/kwad/sdk/core/videocache/b/a;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    return-void
.end method

.method private Hc()Lcom/kwad/sdk/core/videocache/c;
    .locals 9

    .line 1
    new-instance v8, Lcom/kwad/sdk/core/videocache/c;

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCT:Ljava/io/File;

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCU:Lcom/kwad/sdk/core/videocache/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCV:Lcom/kwad/sdk/core/videocache/a/a;

    iget-object v4, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    iget-object v5, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    iget v6, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCY:I

    iget v7, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCZ:I

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/kwad/sdk/core/videocache/c;-><init>(Ljava/io/File;Lcom/kwad/sdk/core/videocache/a/c;Lcom/kwad/sdk/core/videocache/a/a;Lcom/kwad/sdk/core/videocache/d/c;Lcom/kwad/sdk/core/videocache/b/b;II)V

    return-object v8
.end method


# virtual methods
.method public final Hb()Lcom/kwad/sdk/core/videocache/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/f$a;->context:Landroid/content/Context;

    iget v1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCZ:I

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/videocache/d/d;->k(Landroid/content/Context;I)Lcom/kwad/sdk/core/videocache/d/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/f$a;->Hc()Lcom/kwad/sdk/core/videocache/c;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/kwad/sdk/core/videocache/f;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/kwad/sdk/core/videocache/f;-><init>(Lcom/kwad/sdk/core/videocache/c;B)V

    return-object v1
.end method

.method public final az(J)Lcom/kwad/sdk/core/videocache/f$a;
    .locals 2

    .line 1
    new-instance p1, Lcom/kwad/sdk/core/videocache/a/g;

    const-wide/32 v0, 0x20000000

    invoke-direct {p1, v0, v1}, Lcom/kwad/sdk/core/videocache/a/g;-><init>(J)V

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCV:Lcom/kwad/sdk/core/videocache/a/a;

    return-object p0
.end method

.method public final ds(I)Lcom/kwad/sdk/core/videocache/f$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCY:I

    return-object p0
.end method

.method public final dt(I)Lcom/kwad/sdk/core/videocache/f$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/videocache/f$a;->aCZ:I

    return-object p0
.end method
