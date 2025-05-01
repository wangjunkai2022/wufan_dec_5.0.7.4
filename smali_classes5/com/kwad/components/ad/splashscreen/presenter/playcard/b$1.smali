.class final Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;
.super Lcom/kwad/components/core/webview/tachikoma/e/e;
.source "SourceFile"


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
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/e/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;JJJ)V
    .locals 18

    move-object/from16 v0, p0

    .line 1
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    .line 2
    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->c(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->dt(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->d(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget-object v2, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    .line 4
    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->e(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget-object v3, v1, Lcom/kwad/components/ad/splashscreen/h;->Cs:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->f(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget v4, v1, Lcom/kwad/components/ad/splashscreen/h;->CC:I

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    .line 5
    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->g(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget-wide v5, v1, Lcom/kwad/components/ad/splashscreen/h;->CE:J

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->h(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget v7, v1, Lcom/kwad/components/ad/splashscreen/h;->CD:I

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    .line 6
    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->i(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    iget-wide v8, v1, Lcom/kwad/components/ad/splashscreen/h;->CF:J

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->j(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)J

    move-result-wide v12

    sub-long v16, v10, v12

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    .line 8
    invoke-static/range {v2 .. v17}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;IJIJJJJJ)V

    .line 9
    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->k(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    move-wide/from16 v2, p2

    iput-wide v2, v1, Lcom/kwad/components/ad/splashscreen/h;->CG:J

    .line 10
    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->l(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    move-wide/from16 v2, p4

    iput-wide v2, v1, Lcom/kwad/components/ad/splashscreen/h;->CH:J

    .line 11
    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->m(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v1

    move-wide/from16 v2, p6

    iput-wide v2, v1, Lcom/kwad/components/ad/splashscreen/h;->CI:J

    .line 12
    iget-object v1, v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->n(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->a(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/ad/splashscreen/h;->CA:Z

    const-string v0, "tk_splash"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b$1;->Fj:Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;->b(Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;)V

    :cond_0
    return-void
.end method
