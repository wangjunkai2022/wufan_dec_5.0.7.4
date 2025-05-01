.class Lcom/join/mgps/ad/v$a;
.super Ljava/lang/Object;
.source "TTInfoStreamVideo.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/ad/v;->onADLoaded(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/ad/v;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/v$a;->a:Lcom/join/mgps/ad/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/ad/v$a;->a:Lcom/join/mgps/ad/v;

    iget-object p1, p1, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/join/mgps/ad/c$a;->onAdClick()V

    :cond_0
    return-void
.end method

.method public onAdDismiss()V
    .locals 0

    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/ad/v$a;->a:Lcom/join/mgps/ad/v;

    iget-object p1, p1, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/join/mgps/ad/c$a;->onAdShow()V

    :cond_0
    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 0

    return-void
.end method
