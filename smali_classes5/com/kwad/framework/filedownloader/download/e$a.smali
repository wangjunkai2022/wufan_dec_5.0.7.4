.class public final Lcom/kwad/framework/filedownloader/download/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/framework/filedownloader/download/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field Wx:Ljava/lang/String;

.field agC:Ljava/lang/Integer;

.field agD:Lcom/kwad/framework/filedownloader/download/a;

.field ahM:Lcom/kwad/framework/filedownloader/a/b;

.field ahQ:Lcom/kwad/framework/filedownloader/download/c;

.field ahq:Ljava/lang/Boolean;

.field aht:Lcom/kwad/framework/filedownloader/download/f;

.field ahx:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/download/c;)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahQ:Lcom/kwad/framework/filedownloader/download/c;

    return-object p0
.end method

.method public final b(Lcom/kwad/framework/filedownloader/download/f;)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    return-object p0
.end method

.method public final bf(Z)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahq:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final bo(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->Wx:Ljava/lang/String;

    return-object p0
.end method

.method public final bv(I)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahx:Ljava/lang/Integer;

    return-object p0
.end method

.method public final bw(I)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->agC:Ljava/lang/Integer;

    return-object p0
.end method

.method public final c(Lcom/kwad/framework/filedownloader/download/a;)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->agD:Lcom/kwad/framework/filedownloader/download/a;

    return-object p0
.end method

.method public final d(Lcom/kwad/framework/filedownloader/a/b;)Lcom/kwad/framework/filedownloader/download/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahM:Lcom/kwad/framework/filedownloader/a/b;

    return-object p0
.end method

.method public final ww()Lcom/kwad/framework/filedownloader/download/e;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahq:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahM:Lcom/kwad/framework/filedownloader/a/b;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/kwad/framework/filedownloader/download/e$a;->agD:Lcom/kwad/framework/filedownloader/download/a;

    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/e$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/e$a;->Wx:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/e$a;->agC:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahx:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 2
    new-instance v11, Lcom/kwad/framework/filedownloader/download/e;

    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahQ:Lcom/kwad/framework/filedownloader/download/c;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahx:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/e$a;->ahq:Ljava/lang/Boolean;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v8, p0, Lcom/kwad/framework/filedownloader/download/e$a;->aht:Lcom/kwad/framework/filedownloader/download/f;

    iget-object v9, p0, Lcom/kwad/framework/filedownloader/download/e$a;->Wx:Ljava/lang/String;

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/kwad/framework/filedownloader/download/e;-><init>(Lcom/kwad/framework/filedownloader/a/b;Lcom/kwad/framework/filedownloader/download/a;Lcom/kwad/framework/filedownloader/download/c;IIZLcom/kwad/framework/filedownloader/download/f;Ljava/lang/String;B)V

    return-object v11

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method
