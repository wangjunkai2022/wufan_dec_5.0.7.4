.class final Lcom/kwad/components/ad/reward/k/a/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/k/a/c;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic xw:Lcom/kwad/components/ad/reward/k/a/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/k/a/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/k/a/c$2;->xw:Lcom/kwad/components/ad/reward/k/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/h;Ljava/lang/String;)V
    .locals 1

    const-string v0, "getExtraReward"

    .line 1
    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/kwad/components/ad/reward/c/a;->gN()Lcom/kwad/components/ad/reward/c/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/jshandler/h;->a(Lcom/kwad/sdk/core/response/a/a;)V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/reward/c/a;->a(Lcom/kwad/components/core/webview/jshandler/h;)V

    :cond_0
    return-void
.end method
