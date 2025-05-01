.class Lcom/beizi/fusion/work/f/b$7;
.super Ljava/lang/Object;
.source "BeiZiNativeUnifiedWorker.java"

# interfaces
.implements Lcom/beizi/fusion/g/ag$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/f/b;->a(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/beizi/fusion/work/f/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/f/b;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    iput p2, p0, Lcom/beizi/fusion/work/f/b$7;->a:I

    iput p3, p0, Lcom/beizi/fusion/work/f/b$7;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    iget-object v0, v0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/beizi/fusion/g/ax;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 2
    iget-object v2, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    iget-object v2, v2, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->getLocationOnScreen([I)V

    .line 3
    iget v2, p0, Lcom/beizi/fusion/work/f/b$7;->a:I

    div-int/2addr v2, v0

    iget v3, p0, Lcom/beizi/fusion/work/f/b$7;->b:I

    div-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/al;->a(II)[I

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/f/b;->h(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/ad/NativeAdResponse;

    move-result-object v3

    iget-object v2, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    iget-object v4, v2, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    aget v5, v0, v2

    .line 5
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aget v7, v0, v6

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aget v8, v0, v2

    aget v9, v1, v2

    add-int/2addr v8, v9

    .line 6
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    aget v0, v0, v6

    aget v1, v1, v6

    add-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x2

    move-object v6, v7

    move-object v7, v8

    move-object v8, v0

    .line 8
    invoke-static/range {v3 .. v9}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->handleClick(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/b;->i(Lcom/beizi/fusion/work/f/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/b;->j(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/f/b;->a(Lcom/beizi/fusion/work/f/b;Z)Z

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/b;->k(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/fusion/g/ag;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/f/b;->j(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/b;->l(Lcom/beizi/fusion/work/f/b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    invoke-static {}, Lcom/beizi/fusion/g/aq;->a()Lcom/beizi/fusion/g/aq;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b$7;->c:Lcom/beizi/fusion/work/f/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/f/b;->l(Lcom/beizi/fusion/work/f/b;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 15
    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/fusion/g/aq;->a(Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
