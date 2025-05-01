.class public final Lcom/kwad/components/core/webview/jshandler/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/w$b;,
        Lcom/kwad/components/core/webview/jshandler/w$a;
    }
.end annotation


# instance fields
.field private Xb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;"
        }
    .end annotation
.end field

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private oE:Lcom/kwad/components/core/webview/jshandler/w$b;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/w;->cO:Lcom/kwad/sdk/core/webview/b;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/w;->Xb:Ljava/util/List;

    return-void
.end method

.method private sR()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/w;->Xb:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/w;->cO:Lcom/kwad/sdk/core/webview/b;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/b;->Hw()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/w$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/w;->oE:Lcom/kwad/components/core/webview/jshandler/w$b;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 2
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    :try_start_0
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/w$a;

    invoke-direct {p2}, Lcom/kwad/components/core/webview/jshandler/w$a;-><init>()V

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 4
    iget-wide v0, p2, Lcom/kwad/components/core/webview/jshandler/w$a;->creativeId:J

    .line 5
    iget p1, p2, Lcom/kwad/components/core/webview/jshandler/w$a;->adStyle:I

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/core/webview/jshandler/w;->sR()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v0, v1, p1}, Lcom/kwad/sdk/core/response/b/e;->a(Ljava/util/List;JI)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/kwad/components/core/webview/jshandler/w;->oE:Lcom/kwad/components/core/webview/jshandler/w$b;

    if-eqz p2, :cond_0

    .line 8
    invoke-interface {p2, p1}, Lcom/kwad/components/core/webview/jshandler/w$b;->N(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "adImpression"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
