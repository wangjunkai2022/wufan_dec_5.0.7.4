.class public abstract Lcom/kwad/library/solder/lib/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Lcom/kwad/library/solder/lib/a/a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected ajH:Ljava/lang/String;

.field protected ajX:Lcom/kwad/library/solder/lib/a/d;

.field protected akA:J

.field protected akB:Ljava/lang/String;

.field protected akC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/library/solder/lib/c/a;",
            ">;"
        }
    .end annotation
.end field

.field protected akD:Lcom/kwad/library/solder/lib/c/b;

.field private final akm:[B

.field protected akp:I

.field protected akq:I

.field protected akr:Ljava/lang/StringBuffer;

.field protected aks:Ljava/lang/String;

.field protected akt:Ljava/lang/String;

.field protected aku:Z

.field protected akv:Lcom/kwad/library/solder/lib/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field protected akw:Lcom/kwad/library/solder/lib/ext/b;

.field protected akx:Ljava/lang/Throwable;

.field protected aky:Ljava/lang/String;

.field protected akz:Z

.field protected mDownloadUrl:Ljava/lang/String;

.field protected mState:I

.field protected mVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/kwad/library/solder/lib/c/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/library/solder/lib/a/e;->mState:I

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lcom/kwad/library/solder/lib/a/e;->akp:I

    new-array v1, v1, [B

    .line 4
    iput-object v1, p0, Lcom/kwad/library/solder/lib/a/e;->akm:[B

    .line 5
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kwad/library/solder/lib/a/e;->akr:Ljava/lang/StringBuffer;

    .line 6
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->akD:Lcom/kwad/library/solder/lib/c/b;

    .line 7
    iget-object v0, p1, Lcom/kwad/library/solder/lib/c/b;->akV:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->ajH:Ljava/lang/String;

    .line 8
    iget-object v0, p1, Lcom/kwad/library/solder/lib/c/b;->version:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->mVersion:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/kwad/library/solder/lib/c/b;->akY:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akB:Ljava/lang/String;

    .line 10
    iget-boolean v0, p1, Lcom/kwad/library/solder/lib/c/b;->akz:Z

    iput-boolean v0, p0, Lcom/kwad/library/solder/lib/a/e;->akz:Z

    .line 11
    iget-object v0, p1, Lcom/kwad/library/solder/lib/c/b;->aky:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->aky:Ljava/lang/String;

    .line 12
    iget-wide v0, p1, Lcom/kwad/library/solder/lib/c/b;->akX:J

    iput-wide v0, p0, Lcom/kwad/library/solder/lib/a/e;->akA:J

    .line 13
    iget-object p1, p1, Lcom/kwad/library/solder/lib/c/b;->akW:Ljava/lang/String;

    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->mDownloadUrl:Ljava/lang/String;

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kwad/library/solder/lib/c/a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/kwad/library/solder/lib/a/e;->ajX:Lcom/kwad/library/solder/lib/a/d;

    invoke-interface {v1}, Lcom/kwad/library/solder/lib/a/d;->xF()Lcom/kwad/library/solder/lib/a/b;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/kwad/library/solder/lib/a/b;->bI(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 6
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 7
    array-length v2, v1

    if-nez v2, :cond_2

    goto :goto_2

    .line 8
    :cond_2
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_5

    aget-object v4, v1, v3

    .line 9
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 10
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 11
    iget-object v5, p0, Lcom/kwad/library/solder/lib/a/e;->ajX:Lcom/kwad/library/solder/lib/a/d;

    invoke-interface {v5}, Lcom/kwad/library/solder/lib/a/d;->xF()Lcom/kwad/library/solder/lib/a/b;

    move-result-object v5

    invoke-interface {v5, p1, v4, p3}, Lcom/kwad/library/solder/lib/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 12
    new-instance v5, Lcom/kwad/library/solder/lib/c/a;

    invoke-direct {v5}, Lcom/kwad/library/solder/lib/c/a;-><init>()V

    .line 13
    iput-object p1, v5, Lcom/kwad/library/solder/lib/c/a;->akV:Ljava/lang/String;

    .line 14
    iput-object v4, v5, Lcom/kwad/library/solder/lib/c/a;->version:Ljava/lang/String;

    const/4 v4, 0x1

    .line 15
    iput-boolean v4, v5, Lcom/kwad/library/solder/lib/c/a;->qt:Z

    .line 16
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 17
    :cond_3
    iget-object v5, p0, Lcom/kwad/library/solder/lib/a/e;->ajX:Lcom/kwad/library/solder/lib/a/d;

    invoke-interface {v5}, Lcom/kwad/library/solder/lib/a/d;->xF()Lcom/kwad/library/solder/lib/a/b;

    move-result-object v5

    invoke-interface {v5, p1, v4}, Lcom/kwad/library/solder/lib/a/b;->D(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 18
    :cond_4
    iget-object v5, p0, Lcom/kwad/library/solder/lib/a/e;->ajX:Lcom/kwad/library/solder/lib/a/d;

    invoke-interface {v5}, Lcom/kwad/library/solder/lib/a/d;->xF()Lcom/kwad/library/solder/lib/a/b;

    move-result-object v5

    invoke-interface {v5, p1, v4}, Lcom/kwad/library/solder/lib/a/b;->D(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 19
    :cond_5
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_6
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/library/solder/lib/a/d;)Lcom/kwad/library/solder/lib/a/e;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->ajX:Lcom/kwad/library/solder/lib/a/d;

    return-object p0
.end method

.method public final a(Lcom/kwad/library/solder/lib/ext/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->akw:Lcom/kwad/library/solder/lib/ext/b;

    return-void
.end method

.method public final bM(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->mVersion:Ljava/lang/String;

    return-void
.end method

.method public final bO(I)Lcom/kwad/library/solder/lib/a/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akm:[B

    monitor-enter v0

    .line 2
    :try_start_0
    iput p1, p0, Lcom/kwad/library/solder/lib/a/e;->mState:I

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/library/solder/lib/a/e;->bP(Ljava/lang/String;)Lcom/kwad/library/solder/lib/a/e;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final bP(Ljava/lang/String;)Lcom/kwad/library/solder/lib/a/e;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akr:Ljava/lang/StringBuffer;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    return-object p0
.end method

.method public final bP(I)V
    .locals 0

    if-lez p1, :cond_0

    .line 3
    iput p1, p0, Lcom/kwad/library/solder/lib/a/e;->akq:I

    :cond_0
    return-void
.end method

.method public final bQ(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->aks:Ljava/lang/String;

    return-void
.end method

.method public final bR(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->akt:Ljava/lang/String;

    return-void
.end method

.method public abstract bS(Ljava/lang/String;)Lcom/kwad/library/solder/lib/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TP;"
        }
    .end annotation
.end method

.method public final c(Lcom/kwad/library/solder/lib/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->akv:Lcom/kwad/library/solder/lib/a/a;

    return-void
.end method

.method public final cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akm:[B

    monitor-enter v0

    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/kwad/library/solder/lib/a/e;->bO(I)Lcom/kwad/library/solder/lib/a/e;

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getDownloadUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->mDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akm:[B

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Lcom/kwad/library/solder/lib/a/e;->mState:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->mVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final isCanceled()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/library/solder/lib/a/e;->mState:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j(Ljava/lang/Throwable;)Lcom/kwad/library/solder/lib/a/e;
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/e;->akx:Ljava/lang/Throwable;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/library/solder/lib/a/e;->bP(Ljava/lang/String;)Lcom/kwad/library/solder/lib/a/e;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PluginRequest{mId=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/library/solder/lib/a/e;->ajH:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final xP()Lcom/kwad/library/solder/lib/a/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->ajX:Lcom/kwad/library/solder/lib/a/d;

    return-object v0
.end method

.method public final xQ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akr:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final xR()Ljava/lang/Throwable;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akx:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final xS()Z
    .locals 3

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/kwad/library/solder/lib/a/e;->bO(I)Lcom/kwad/library/solder/lib/a/e;

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akC:Ljava/util/List;

    .line 3
    iget v0, p0, Lcom/kwad/library/solder/lib/a/e;->akp:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/kwad/library/solder/lib/a/e;->akp:I

    iget v2, p0, Lcom/kwad/library/solder/lib/a/e;->akq:I

    if-gt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final xT()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->ajH:Ljava/lang/String;

    return-object v0
.end method

.method public final xU()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/library/solder/lib/a/e;->aku:Z

    return v0
.end method

.method public final xV()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/library/solder/lib/a/e;->akp:I

    return v0
.end method

.method public final xW()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->aks:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->aks:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akt:Ljava/lang/String;

    return-object v0
.end method

.method public final xX()Lcom/kwad/library/solder/lib/ext/b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akw:Lcom/kwad/library/solder/lib/ext/b;

    return-object v0
.end method

.method public final xY()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/library/solder/lib/a/e;->akz:Z

    return v0
.end method

.method public final xZ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->aky:Ljava/lang/String;

    return-object v0
.end method

.method public final ya()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akB:Ljava/lang/String;

    return-object v0
.end method

.method public final yb()Lcom/kwad/library/solder/lib/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akD:Lcom/kwad/library/solder/lib/c/b;

    return-object v0
.end method

.method public final yc()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kwad/library/solder/lib/c/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/kwad/library/solder/lib/a/e;->xT()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/kwad/library/solder/lib/a/e;->akC:Ljava/util/List;

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/library/solder/lib/a/e;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kwad/library/solder/lib/a/e;->ya()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/kwad/library/solder/lib/a/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akC:Ljava/util/List;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/e;->akC:Ljava/util/List;

    return-object v0
.end method
