.class Lcom/beizi/fusion/work/nativead/a$5;
.super Ljava/lang/Object;
.source "BaiduNativeAdWorker.java"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressDislikeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/a;->aG()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDislikeItemClick(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->r(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->s(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->u(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/a;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/a;->t(Lcom/beizi/fusion/work/nativead/a;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$5;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->v(Lcom/beizi/fusion/work/nativead/a;)V

    return-void
.end method

.method public onDislikeWindowClose()V
    .locals 0

    return-void
.end method

.method public onDislikeWindowShow()V
    .locals 0

    return-void
.end method
