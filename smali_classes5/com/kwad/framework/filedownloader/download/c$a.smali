.class public final Lcom/kwad/framework/filedownloader/download/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/framework/filedownloader/download/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private Wx:Ljava/lang/String;

.field private ahq:Ljava/lang/Boolean;

.field private aht:Lcom/kwad/framework/filedownloader/download/f;

.field private final ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

.field private ahx:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/download/f;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/c$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    return-object p0
.end method

.method public final b(Lcom/kwad/framework/filedownloader/download/a;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->a(Lcom/kwad/framework/filedownloader/download/a;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    return-object p0
.end method

.method public final bd(Z)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahq:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final bl(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->bi(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    return-object p0
.end method

.method public final bm(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->bj(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    return-object p0
.end method

.method public final bn(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/c$a;->Wx:Ljava/lang/String;

    return-object p0
.end method

.method public final bt(I)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->bs(I)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    return-object p0
.end method

.method public final c(Lcom/kwad/framework/filedownloader/d/b;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->a(Lcom/kwad/framework/filedownloader/d/b;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)Lcom/kwad/framework/filedownloader/download/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahx:Ljava/lang/Integer;

    return-object p0
.end method

.method public final wj()Lcom/kwad/framework/filedownloader/download/c;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->Wx:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahq:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahx:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahw:Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->vR()Lcom/kwad/framework/filedownloader/download/ConnectTask;

    move-result-object v4

    .line 3
    new-instance v0, Lcom/kwad/framework/filedownloader/download/c;

    iget v2, v4, Lcom/kwad/framework/filedownloader/download/ConnectTask;->agw:I

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahx:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v5, p0, Lcom/kwad/framework/filedownloader/download/c$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahq:Ljava/lang/Boolean;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v7, p0, Lcom/kwad/framework/filedownloader/download/c$a;->Wx:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/kwad/framework/filedownloader/download/c;-><init>(IILcom/kwad/framework/filedownloader/download/ConnectTask;Lcom/kwad/framework/filedownloader/download/f;ZLjava/lang/String;B)V

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/kwad/framework/filedownloader/download/c$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/kwad/framework/filedownloader/download/c$a;->Wx:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/kwad/framework/filedownloader/download/c$a;->ahq:Ljava/lang/Boolean;

    aput-object v3, v1, v2

    const-string v2, "%s %s %B"

    invoke-static {v2, v1}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
