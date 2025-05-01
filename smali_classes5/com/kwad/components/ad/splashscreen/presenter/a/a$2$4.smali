.class final Lcom/kwad/components/ad/splashscreen/presenter/a/a$2$4;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/a/a$2;->a(Lcom/kwad/components/core/webview/tachikoma/a/u$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic FD:Lcom/kwad/components/ad/splashscreen/presenter/a/a$2;

.field final synthetic FE:Lcom/kwad/components/core/webview/tachikoma/a/u$b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/a/a$2;Lcom/kwad/components/core/webview/tachikoma/a/u$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/a/a$2$4;->FD:Lcom/kwad/components/ad/splashscreen/presenter/a/a$2;

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/a/a$2$4;->FE:Lcom/kwad/components/core/webview/tachikoma/a/u$b;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/a/a$2$4;->FD:Lcom/kwad/components/ad/splashscreen/presenter/a/a$2;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/presenter/a/a$2;->FB:Lcom/kwad/components/ad/splashscreen/presenter/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/a/a;->k(Lcom/kwad/components/ad/splashscreen/presenter/a/a;)Lcom/kwad/components/ad/splashscreen/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/a/a$2$4;->FE:Lcom/kwad/components/core/webview/tachikoma/a/u$b;

    iget v2, v1, Lcom/kwad/components/core/webview/tachikoma/a/u$b;->errorCode:I

    iget-object v1, v1, Lcom/kwad/components/core/webview/tachikoma/a/u$b;->errorMsg:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/kwad/components/ad/splashscreen/h;->i(ILjava/lang/String;)V

    return-void
.end method
