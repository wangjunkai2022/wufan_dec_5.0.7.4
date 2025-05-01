.class final Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/n/a/d/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IIJJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->t(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v0

    iput p1, v0, Lcom/kwad/components/ad/splashscreen/h;->CC:I

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->u(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object p1

    iput p2, p1, Lcom/kwad/components/ad/splashscreen/h;->CD:I

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->v(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object p1

    iput-wide p3, p1, Lcom/kwad/components/ad/splashscreen/h;->CE:J

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->w(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object p1

    iput-wide p5, p1, Lcom/kwad/components/ad/splashscreen/h;->CF:J

    .line 5
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->x(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    iget-object p4, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p4}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->j(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)J

    move-result-wide p4

    sub-long/2addr p2, p4

    .line 7
    invoke-static {p1, p2, p3}, Lcom/kwad/components/ad/splashscreen/monitor/b;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$3;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->s(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)V

    return-void
.end method
