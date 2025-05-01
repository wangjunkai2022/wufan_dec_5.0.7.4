.class Lcom/beizi/fusion/work/nativead/d$4;
.super Ljava/lang/Object;
.source "BeiZiNativeTPBTWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/d;->a(Lcom/beizi/ad/NativeAdResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/NativeAdResponse;

.field final synthetic b:Lcom/beizi/fusion/work/nativead/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/d;Lcom/beizi/ad/NativeAdResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    iput-object p2, p0, Lcom/beizi/fusion/work/nativead/d$4;->a:Lcom/beizi/ad/NativeAdResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/nativead/b;->aK()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/nativead/b;->aL()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    iget-object v0, p1, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget-object p1, p1, Lcom/beizi/fusion/work/nativead/b;->J:Ljava/lang/String;

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 5
    invoke-static {v0, p1, v1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$4;->a:Lcom/beizi/ad/NativeAdResponse;

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    iget-object v3, p1, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    iget p1, p1, Lcom/beizi/fusion/work/nativead/b;->F:F

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    iget p1, p1, Lcom/beizi/fusion/work/nativead/b;->G:F

    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    iget p1, p1, Lcom/beizi/fusion/work/nativead/b;->H:F

    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    iget p1, p1, Lcom/beizi/fusion/work/nativead/b;->I:F

    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    .line 11
    invoke-static/range {v2 .. v8}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->handleClick(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/nativead/b;->aM()V

    goto :goto_0

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$4;->b:Lcom/beizi/fusion/work/nativead/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/nativead/b;->aM()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
