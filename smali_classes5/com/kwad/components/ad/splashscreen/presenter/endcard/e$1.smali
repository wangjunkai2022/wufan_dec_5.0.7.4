.class final Lcom/kwad/components/ad/splashscreen/presenter/endcard/e$1;
.super Lcom/kwad/components/core/webview/tachikoma/e/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ER:Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/e$1;->ER:Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/e/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/String;)V
    .locals 2

    const-string v0, "tk_splash_end_card"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/e$1;->ER:Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/d;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/d;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/e$1;->ER:Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/a;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/e$1;->ER:Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/b;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/e$1;->ER:Lcom/kwad/components/ad/splashscreen/presenter/endcard/e;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    :cond_0
    return-void
.end method
