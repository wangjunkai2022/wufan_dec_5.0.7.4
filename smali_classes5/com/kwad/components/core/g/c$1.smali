.class final Lcom/kwad/components/core/g/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/g/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/g/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private Mn:Z

.field private Mo:Z

.field final synthetic Mp:Lcom/kwad/components/core/g/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/g/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/g/c$1;->Mn:Z

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/core/g/c$1;->Mo:Z

    return-void
.end method

.method private lc()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/g/c$1;->Mn:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    new-instance v1, Lcom/kwad/components/core/g/c$1$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/g/c$1$2;-><init>(Lcom/kwad/components/core/g/c$1;)V

    invoke-static {v0, v1}, Lcom/kwad/components/core/g/c;->a(Lcom/kwad/components/core/g/c;Lcom/kwad/sdk/f/a;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/g/c$1;->Mn:Z

    :cond_0
    return-void
.end method

.method private pc()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/g/c$1;->Mo:Z

    if-nez v0, :cond_0

    const-string v0, "KSImagePlayer"

    const-string v1, "onFirstFrame: "

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/g/c$1;->Mo:Z

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    new-instance v1, Lcom/kwad/components/core/g/c$1$3;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/g/c$1$3;-><init>(Lcom/kwad/components/core/g/c$1;)V

    invoke-static {v0, v1}, Lcom/kwad/components/core/g/c;->a(Lcom/kwad/components/core/g/c;Lcom/kwad/sdk/f/a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final y(J)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onTimerProgress: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "KSImagePlayer"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/g/c$1;->pc()V

    .line 3
    :cond_0
    iget-object v2, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    invoke-static {v2, p1, p2}, Lcom/kwad/components/core/g/c;->a(Lcom/kwad/components/core/g/c;J)J

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    new-instance v3, Lcom/kwad/components/core/g/c$1$1;

    invoke-direct {v3, p0, p1, p2}, Lcom/kwad/components/core/g/c$1$1;-><init>(Lcom/kwad/components/core/g/c$1;J)V

    invoke-static {v2, v3}, Lcom/kwad/components/core/g/c;->a(Lcom/kwad/components/core/g/c;Lcom/kwad/sdk/f/a;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    invoke-static {p1}, Lcom/kwad/components/core/g/c;->b(Lcom/kwad/components/core/g/c;)J

    move-result-wide p1

    iget-object v2, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    invoke-static {v2}, Lcom/kwad/components/core/g/c;->a(Lcom/kwad/components/core/g/c;)J

    move-result-wide v2

    cmp-long v4, p1, v2

    if-ltz v4, :cond_1

    iget-object p1, p0, Lcom/kwad/components/core/g/c$1;->Mp:Lcom/kwad/components/core/g/c;

    invoke-static {p1}, Lcom/kwad/components/core/g/c;->a(Lcom/kwad/components/core/g/c;)J

    move-result-wide p1

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/core/g/c$1;->lc()V

    :cond_1
    return-void
.end method
