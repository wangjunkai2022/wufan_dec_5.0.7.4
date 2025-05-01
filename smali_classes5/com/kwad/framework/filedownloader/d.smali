.class public final Lcom/kwad/framework/filedownloader/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/framework/filedownloader/a$c;
.implements Lcom/kwad/framework/filedownloader/x;
.implements Lcom/kwad/framework/filedownloader/x$a;
.implements Lcom/kwad/framework/filedownloader/x$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/d$a;
    }
.end annotation


# instance fields
.field private final aeW:Ljava/lang/Object;

.field private afa:Lcom/kwad/framework/filedownloader/t;

.field private final afb:Lcom/kwad/framework/filedownloader/d$a;

.field private volatile afc:B

.field private volatile afd:J

.field private afe:Ljava/lang/Throwable;

.field private final aff:Lcom/kwad/framework/filedownloader/s$b;

.field private final afg:Lcom/kwad/framework/filedownloader/s$a;

.field private afh:J

.field private afi:J

.field private afj:I

.field private afk:Z

.field private afl:Z

.field private afm:Ljava/lang/String;

.field private afn:Z


# direct methods
.method constructor <init>(Lcom/kwad/framework/filedownloader/d$a;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afe:Ljava/lang/Throwable;

    .line 4
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/d;->afn:Z

    .line 5
    iput-object p2, p0, Lcom/kwad/framework/filedownloader/d;->aeW:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    .line 7
    new-instance p2, Lcom/kwad/framework/filedownloader/b;

    invoke-direct {p2}, Lcom/kwad/framework/filedownloader/b;-><init>()V

    .line 8
    iput-object p2, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    .line 9
    iput-object p2, p0, Lcom/kwad/framework/filedownloader/d;->afg:Lcom/kwad/framework/filedownloader/s$a;

    .line 10
    new-instance p2, Lcom/kwad/framework/filedownloader/k;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lcom/kwad/framework/filedownloader/k;-><init>(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/a$c;)V

    iput-object p2, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    return-void
.end method

.method private b(B)V
    .locals 2

    .line 13
    iput-byte p1, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afd:J

    return-void
.end method

.method private e(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/message/c;->uz()B

    move-result v1

    .line 3
    invoke-direct {p0, v1}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    .line 4
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->uF()Z

    move-result v2

    iput-boolean v2, p0, Lcom/kwad/framework/filedownloader/d;->afk:Z

    const/4 v2, -0x4

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v1, v2, :cond_9

    const/4 v2, -0x3

    if-eq v1, v2, :cond_8

    const/4 v2, -0x1

    if-eq v1, v2, :cond_7

    if-eq v1, v5, :cond_6

    if-eq v1, v4, :cond_3

    const/4 v0, 0x3

    if-eq v1, v0, :cond_2

    const/4 v0, 0x5

    if-eq v1, v0, :cond_1

    const/4 v0, 0x6

    if-eq v1, v0, :cond_0

    goto/16 :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/t;->g(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wG()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 7
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wH()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afe:Ljava/lang/Throwable;

    .line 8
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->uD()I

    move-result v0

    iput v0, p0, Lcom/kwad/framework/filedownloader/d;->afj:I

    .line 9
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/s$b;->reset()V

    .line 10
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/t;->k(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return-void

    .line 11
    :cond_2
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wG()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 12
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wG()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/kwad/framework/filedownloader/s$b;->N(J)V

    .line 13
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/t;->i(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return-void

    .line 14
    :cond_3
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wE()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/framework/filedownloader/d;->afi:J

    .line 15
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wu()Z

    move-result v1

    iput-boolean v1, p0, Lcom/kwad/framework/filedownloader/d;->afl:Z

    .line 16
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->getEtag()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afm:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->getFileName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 18
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getFilename()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    new-array v2, v4, [Ljava/lang/Object;

    .line 19
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getFilename()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    const-string v0, "already has mFilename[%s], but assign mFilename[%s] again"

    .line 20
    invoke-static {p0, v0, v2}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    :cond_4
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/d$a;->be(Ljava/lang/String;)V

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    iget-wide v1, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    invoke-interface {v0, v1, v2}, Lcom/kwad/framework/filedownloader/s$b;->start(J)V

    .line 23
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/t;->h(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return-void

    .line 24
    :cond_6
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wG()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 25
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wE()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afi:J

    .line 26
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/t;->f(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return-void

    .line 27
    :cond_7
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wH()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afe:Ljava/lang/Throwable;

    .line 28
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wG()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 29
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    return-void

    .line 30
    :cond_8
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wF()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/d;->afn:Z

    .line 31
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wE()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 32
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wE()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afi:J

    .line 33
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    return-void

    .line 34
    :cond_9
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/s$b;->reset()V

    .line 35
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v1

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/h;->aZ(I)I

    move-result v1

    if-gt v1, v5, :cond_a

    .line 36
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uv()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 37
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    .line 38
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getUrl()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getTargetFilePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/kwad/framework/filedownloader/f/f;->A(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/kwad/framework/filedownloader/h;->aZ(I)I

    move-result v2

    goto :goto_0

    :cond_a
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v1, v2

    if-gt v1, v5, :cond_b

    .line 39
    invoke-static {}, Lcom/kwad/framework/filedownloader/n;->vq()Lcom/kwad/framework/filedownloader/n;

    move-result-object v1

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/n;->be(I)B

    move-result v1

    new-array v2, v4, [Ljava/lang/Object;

    .line 40
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v5

    const-string v0, "warn, but no mListener to receive, switch to pending %d %d"

    .line 41
    invoke-static {p0, v0, v2}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-static {v1}, Lcom/kwad/framework/filedownloader/d/d;->bG(I)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 43
    invoke-direct {p0, v5}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    .line 44
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wE()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afi:J

    .line 45
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->wG()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 46
    iget-object v2, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    invoke-interface {v2, v0, v1}, Lcom/kwad/framework/filedownloader/s$b;->start(J)V

    .line 47
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    check-cast p1, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$a;

    .line 48
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$a;->wI()Lcom/kwad/framework/filedownloader/message/MessageSnapshot;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/t;->f(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return-void

    .line 49
    :cond_b
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    :goto_1
    return-void
.end method

.method private getId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v0

    return v0
.end method

.method private prepare()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/framework/filedownloader/f/f;->bu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->bc(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;

    .line 5
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_0

    new-array v1, v3, [Ljava/lang/Object;

    .line 6
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    const-string v4, "save Path is null to %s"

    invoke-static {p0, v4, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    :cond_0
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uv()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    new-instance v1, Ljava/io/File;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/framework/filedownloader/f/f;->bz(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 10
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    .line 11
    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 13
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-array v3, v3, [Ljava/lang/Object;

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const-string v1, "Create parent directory failed, please make sure you have permission to create file or directory on the path: %s"

    .line 15
    invoke-static {v1, v3}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    return-void

    .line 16
    :cond_4
    new-instance v1, Ljava/security/InvalidParameterException;

    new-array v3, v3, [Ljava/lang/Object;

    .line 17
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2

    const-string v0, "the provided mPath[%s] is invalid, can\'t find its directory"

    .line 18
    invoke-static {v0, v3}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v0

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/message/c;->uz()B

    move-result v1

    invoke-static {v0, v1}, Lcom/kwad/framework/filedownloader/d/d;->t(II)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    sget-boolean p1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    .line 3
    iget-byte v2, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    .line 4
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    aput-object v2, p1, v0

    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    aput-object v2, p1, v1

    const/4 v1, 0x2

    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, v1

    const-string v1, "can\'t update mStatus change by keep ahead, %d, but the current mStatus is %d, %d"

    .line 5
    invoke-static {p0, v1, p1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v0

    .line 6
    :cond_1
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/d;->e(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return v1
.end method

.method public final b(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v0

    .line 2
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/message/c;->uz()B

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x2

    if-ne v4, v0, :cond_1

    .line 3
    invoke-static {v1}, Lcom/kwad/framework/filedownloader/d/d;->bG(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 4
    sget-boolean p1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz p1, :cond_0

    new-array p1, v3, [Ljava/lang/Object;

    .line 5
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, v2

    const-string v0, "High concurrent cause, callback pending, but has already be paused %d"

    .line 6
    invoke-static {p0, v0, p1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v3

    .line 7
    :cond_1
    invoke-static {v0, v1}, Lcom/kwad/framework/filedownloader/d/d;->u(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 8
    sget-boolean p1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    .line 9
    iget-byte v0, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    .line 10
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    aput-object v0, p1, v2

    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    aput-object v0, p1, v3

    const/4 v0, 0x2

    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, v0

    const-string v0, "can\'t update mStatus change by keep flow, %d, but the current mStatus is %d, %d"

    .line 11
    invoke-static {p0, v0, p1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return v2

    .line 12
    :cond_3
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/d;->e(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    return v3
.end method

.method public final c(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/d/d;->f(Lcom/kwad/framework/filedownloader/a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/d;->e(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final d(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uv()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/message/c;->uz()B

    move-result v0

    const/4 v2, -0x4

    if-ne v0, v2, :cond_2

    .line 3
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/d;->e(Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final free()V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v2, 0x1

    iget-byte v3, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v0, v2

    const-string v2, "free the task %d, when the status is %d"

    invoke-static {p0, v2, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :cond_0
    invoke-direct {p0, v1}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    return-void
.end method

.method public final g(Ljava/lang/Throwable;)Lcom/kwad/framework/filedownloader/message/MessageSnapshot;
    .locals 3

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    .line 2
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/d;->afe:Ljava/lang/Throwable;

    .line 3
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uZ()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lcom/kwad/framework/filedownloader/message/f;->a(IJLjava/lang/Throwable;)Lcom/kwad/framework/filedownloader/message/MessageSnapshot;

    move-result-object p1

    return-object p1
.end method

.method public final getSpeed()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afg:Lcom/kwad/framework/filedownloader/s$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/s$a;->getSpeed()I

    move-result v0

    return v0
.end method

.method public final getStatusUpdateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afd:J

    return-wide v0
.end method

.method public final getTotalBytes()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afi:J

    return-wide v0
.end method

.method public final onBegin()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "filedownloader:lifecycle:start %s by %d "

    invoke-static {p0, v1, v0}, Lcom/kwad/framework/filedownloader/f/d;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final pause()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/d/d;->bF(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v0, v1

    iget-object v3, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v3}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v3

    invoke-interface {v3}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v3

    invoke-interface {v3}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    const-string v2, "High concurrent cause, Already is over, can\'t pause again, %d %d"

    .line 4
    invoke-static {p0, v2, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v1

    :cond_1
    const/4 v0, -0x2

    .line 5
    invoke-direct {p0, v0}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    .line 6
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v3

    .line 8
    invoke-static {}, Lcom/kwad/framework/filedownloader/q;->vw()Lcom/kwad/framework/filedownloader/q;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/kwad/framework/filedownloader/q;->b(Lcom/kwad/framework/filedownloader/x$b;)V

    .line 9
    sget-boolean v4, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v4, :cond_2

    new-array v4, v2, [Ljava/lang/Object;

    .line 10
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "the task[%d] has been expired from the launch pool."

    invoke-static {p0, v5, v4}, Lcom/kwad/framework/filedownloader/f/d;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    :cond_2
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vA()Z

    move-result v4

    if-nez v4, :cond_3

    .line 12
    sget-boolean v4, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v4, :cond_4

    new-array v4, v2, [Ljava/lang/Object;

    .line 13
    invoke-interface {v3}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v1, "request pause the task[%d] to the download service, but the download service isn\'t connected yet."

    .line 14
    invoke-static {p0, v1, v4}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 15
    :cond_3
    invoke-static {}, Lcom/kwad/framework/filedownloader/n;->vq()Lcom/kwad/framework/filedownloader/n;

    move-result-object v1

    invoke-interface {v3}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/kwad/framework/filedownloader/n;->bd(I)Z

    .line 16
    :cond_4
    :goto_0
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/framework/filedownloader/h;->b(Lcom/kwad/framework/filedownloader/a$a;)V

    .line 17
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v1

    invoke-static {v3}, Lcom/kwad/framework/filedownloader/message/f;->e(Lcom/kwad/framework/filedownloader/a;)Lcom/kwad/framework/filedownloader/message/MessageSnapshot;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    .line 18
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/r;->vC()Lcom/kwad/framework/filedownloader/v;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/v;->e(Lcom/kwad/framework/filedownloader/a$a;)V

    return v2
.end method

.method public final reset()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afe:Ljava/lang/Throwable;

    .line 2
    iput-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afm:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/d;->afl:Z

    .line 4
    iput v0, p0, Lcom/kwad/framework/filedownloader/d;->afj:I

    .line 5
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/d;->afn:Z

    .line 6
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/d;->afk:Z

    const-wide/16 v1, 0x0

    .line 7
    iput-wide v1, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    .line 8
    iput-wide v1, p0, Lcom/kwad/framework/filedownloader/d;->afi:J

    .line 9
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/s$b;->reset()V

    .line 10
    iget-byte v1, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    invoke-static {v1}, Lcom/kwad/framework/filedownloader/d/d;->bF(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/t;->vo()V

    .line 12
    new-instance v1, Lcom/kwad/framework/filedownloader/k;

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Lcom/kwad/framework/filedownloader/k;-><init>(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/a$c;)V

    iput-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v2

    invoke-interface {v1, v2, p0}, Lcom/kwad/framework/filedownloader/t;->b(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/a$c;)V

    .line 14
    :goto_0
    invoke-direct {p0, v0}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    return-void
.end method

.method public final start()V
    .locals 18

    move-object/from16 v1, p0

    .line 1
    iget-byte v0, v1, Lcom/kwad/framework/filedownloader/d;->afc:B

    const/4 v2, 0x2

    const/16 v3, 0xa

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v0, v3, :cond_0

    const-string v0, "High concurrent cause, this task %d will not start, because the of status isn\'t toLaunchPool: %d"

    new-array v2, v2, [Ljava/lang/Object;

    .line 2
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    iget-byte v3, v1, Lcom/kwad/framework/filedownloader/d;->afc:B

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v2, v5

    .line 3
    invoke-static {v1, v0, v2}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, v1, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v6

    .line 5
    invoke-interface {v6}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    move-result-object v7

    invoke-virtual {v7}, Lcom/kwad/framework/filedownloader/r;->vC()Lcom/kwad/framework/filedownloader/v;

    move-result-object v7

    .line 7
    :try_start_0
    invoke-interface {v7, v6}, Lcom/kwad/framework/filedownloader/v;->f(Lcom/kwad/framework/filedownloader/a$a;)Z

    move-result v8

    if-eqz v8, :cond_1

    return-void

    .line 8
    :cond_1
    iget-object v8, v1, Lcom/kwad/framework/filedownloader/d;->aeW:Ljava/lang/Object;

    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    :try_start_1
    iget-byte v9, v1, Lcom/kwad/framework/filedownloader/d;->afc:B

    if-eq v9, v3, :cond_2

    const-string v0, "High concurrent cause, this task %d will not start, the status can\'t assign to toFileDownloadService, because the status isn\'t toLaunchPool: %d"

    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    iget-byte v3, v1, Lcom/kwad/framework/filedownloader/d;->afc:B

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v2, v5

    .line 11
    invoke-static {v1, v0, v2}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    monitor-exit v8

    return-void

    :cond_2
    const/16 v2, 0xb

    .line 13
    invoke-direct {v1, v2}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    .line 14
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/kwad/framework/filedownloader/h;->b(Lcom/kwad/framework/filedownloader/a$a;)V

    .line 16
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v2

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getTargetFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uA()Z

    move-result v8

    .line 17
    invoke-static {v2, v3, v8, v5}, Lcom/kwad/framework/filedownloader/f/c;->a(ILjava/lang/String;ZZ)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 18
    :cond_3
    invoke-static {}, Lcom/kwad/framework/filedownloader/n;->vq()Lcom/kwad/framework/filedownloader/n;

    move-result-object v8

    .line 19
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getUrl()Ljava/lang/String;

    move-result-object v9

    .line 20
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v10

    .line 21
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uv()Z

    move-result v11

    .line 22
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->ut()I

    move-result v12

    .line 23
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uu()I

    move-result v13

    .line 24
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uC()I

    move-result v14

    .line 25
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uA()Z

    move-result v15

    iget-object v2, v1, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    .line 26
    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/d$a;->uU()Lcom/kwad/framework/filedownloader/d/b;

    move-result-object v16

    .line 27
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uG()Z

    move-result v17

    .line 28
    invoke-virtual/range {v8 .. v17}, Lcom/kwad/framework/filedownloader/n;->a(Ljava/lang/String;Ljava/lang/String;ZIIIZLcom/kwad/framework/filedownloader/d/b;Z)Z

    move-result v0

    .line 29
    iget-byte v2, v1, Lcom/kwad/framework/filedownloader/d;->afc:B

    const/4 v3, -0x2

    if-ne v2, v3, :cond_5

    const-string v2, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied"

    new-array v3, v5, [Ljava/lang/Object;

    .line 30
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    .line 31
    invoke-static {v1, v2, v3}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_4

    .line 32
    invoke-static {}, Lcom/kwad/framework/filedownloader/n;->vq()Lcom/kwad/framework/filedownloader/n;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/kwad/framework/filedownloader/n;->bd(I)Z

    :cond_4
    return-void

    :cond_5
    if-nez v0, :cond_7

    .line 33
    invoke-interface {v7, v6}, Lcom/kwad/framework/filedownloader/v;->f(Lcom/kwad/framework/filedownloader/a$a;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 34
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/kwad/framework/filedownloader/d;->g(Ljava/lang/Throwable;)Lcom/kwad/framework/filedownloader/message/MessageSnapshot;

    move-result-object v0

    .line 35
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 36
    invoke-interface {v7, v6}, Lcom/kwad/framework/filedownloader/v;->e(Lcom/kwad/framework/filedownloader/a$a;)V

    .line 37
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/kwad/framework/filedownloader/h;->b(Lcom/kwad/framework/filedownloader/a$a;)V

    .line 38
    :cond_6
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {v2, v6, v0}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    goto :goto_0

    .line 39
    :cond_7
    invoke-interface {v7, v6}, Lcom/kwad/framework/filedownloader/v;->e(Lcom/kwad/framework/filedownloader/a$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_8
    return-void

    :catchall_0
    move-exception v0

    .line 40
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {v1, v0}, Lcom/kwad/framework/filedownloader/d;->g(Ljava/lang/Throwable;)Lcom/kwad/framework/filedownloader/message/MessageSnapshot;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    :goto_0
    return-void
.end method

.method public final uB()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afe:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final uD()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/d;->afj:I

    return v0
.end method

.method public final uF()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/d;->afk:Z

    return v0
.end method

.method public final uQ()V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 3
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/d;->uz()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const-string v2, "filedownloader:lifecycle:over %s by %d "

    .line 4
    invoke-static {p0, v2, v0}, Lcom/kwad/framework/filedownloader/f/d;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->aff:Lcom/kwad/framework/filedownloader/s$b;

    iget-wide v2, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    invoke-interface {v0, v2, v3}, Lcom/kwad/framework/filedownloader/s$b;->end(J)V

    .line 6
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uW()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    .line 8
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uW()Ljava/util/ArrayList;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_1
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/r;->vC()Lcom/kwad/framework/filedownloader/v;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/v;->e(Lcom/kwad/framework/filedownloader/a$a;)V

    return-void
.end method

.method public final uX()Lcom/kwad/framework/filedownloader/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afa:Lcom/kwad/framework/filedownloader/t;

    return-object v0
.end method

.method public final uY()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->aeW:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-byte v1, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    const-string v1, "High concurrent cause, this task %d will not input to launch pool, because of the status isn\'t idle : %d"

    new-array v2, v2, [Ljava/lang/Object;

    .line 3
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    iget-byte v4, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v2, v3

    .line 4
    invoke-static {p0, v1, v2}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    monitor-exit v0

    return-void

    :cond_0
    const/16 v1, 0xa

    .line 6
    invoke-direct {p0, v1}, Lcom/kwad/framework/filedownloader/d;->b(B)V

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/d;->afb:Lcom/kwad/framework/filedownloader/d$a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/d$a;->uV()Lcom/kwad/framework/filedownloader/a$a;

    move-result-object v0

    .line 9
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a$a;->uH()Lcom/kwad/framework/filedownloader/a;

    move-result-object v1

    .line 10
    sget-boolean v5, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v5, :cond_1

    const-string v5, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    .line 11
    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->getUrl()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->uw()Lcom/kwad/framework/filedownloader/i;

    move-result-object v7

    aput-object v7, v6, v2

    const/4 v2, 0x3

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->getTag()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v6, v2

    .line 12
    invoke-static {p0, v5, v6}, Lcom/kwad/framework/filedownloader/f/d;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->prepare()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 14
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/kwad/framework/filedownloader/h;->b(Lcom/kwad/framework/filedownloader/a$a;)V

    .line 15
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v2

    invoke-virtual {p0, v1}, Lcom/kwad/framework/filedownloader/d;->g(Ljava/lang/Throwable;)Lcom/kwad/framework/filedownloader/message/MessageSnapshot;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)Z

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 16
    invoke-static {}, Lcom/kwad/framework/filedownloader/q;->vw()Lcom/kwad/framework/filedownloader/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/framework/filedownloader/q;->a(Lcom/kwad/framework/filedownloader/x$b;)V

    .line 17
    :cond_2
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_3

    const-string v0, "the task[%d] has been into the launch pool."

    new-array v1, v3, [Ljava/lang/Object;

    .line 18
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/d;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {p0, v0, v1}, Lcom/kwad/framework/filedownloader/f/d;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_1
    move-exception v1

    .line 19
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final uZ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/framework/filedownloader/d;->afh:J

    return-wide v0
.end method

.method public final uz()B
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/kwad/framework/filedownloader/d;->afc:B

    return v0
.end method
