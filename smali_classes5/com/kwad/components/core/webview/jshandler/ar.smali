.class public final Lcom/kwad/components/core/webview/jshandler/ar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/ar$a;
    }
.end annotation


# instance fields
.field private WI:Lcom/kwad/sdk/core/webview/c/c;

.field private Yx:Lcom/kwad/components/core/webview/jshandler/ar$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ar$a;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/jshandler/ar$a;-><init>(Lcom/kwad/components/core/webview/jshandler/ar;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ar;->Yx:Lcom/kwad/components/core/webview/jshandler/ar$a;

    return-void
.end method

.method private r(II)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/kwad/components/core/webview/jshandler/ar;->WI:Lcom/kwad/sdk/core/webview/c/c;

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ar;->Yx:Lcom/kwad/components/core/webview/jshandler/ar$a;

    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/ar$a;->id:I

    const/4 p1, 0x2

    .line 3
    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/ar$a;->status:I

    .line 4
    invoke-interface {p2, v0}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/ar;->WI:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method

.method public final aP(I)V
    .locals 1

    const/4 p1, 0x1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/webview/jshandler/ar;->r(II)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerAnimationListener"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ar;->WI:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method
