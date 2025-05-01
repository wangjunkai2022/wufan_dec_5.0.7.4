.class public final Lcom/kwad/components/core/webview/tachikoma/b/k;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# instance fields
.field public aaW:I

.field public aaX:I

.field public aaY:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/b/k;->aaX:I

    return-void
.end method


# virtual methods
.method public final toJson()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget v1, p0, Lcom/kwad/components/core/webview/tachikoma/b/k;->aaW:I

    const-string v2, "insertScreenAdShowStrategy"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 3
    iget v1, p0, Lcom/kwad/components/core/webview/tachikoma/b/k;->aaY:I

    const-string v2, "isAutoShow"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 4
    iget v1, p0, Lcom/kwad/components/core/webview/tachikoma/b/k;->aaX:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, "triggerType"

    .line 5
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method
