.class Lcom/beizi/fusion/d/e$5;
.super Ljava/lang/Object;
.source "BaseManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/d/e;->a(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/fusion/model/EventItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/beizi/fusion/model/EventItem;

.field final synthetic c:Lcom/beizi/fusion/d/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/e;Ljava/lang/String;Lcom/beizi/fusion/model/EventItem;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/e$5;->c:Lcom/beizi/fusion/d/e;

    iput-object p2, p0, Lcom/beizi/fusion/d/e$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/beizi/fusion/d/e$5;->b:Lcom/beizi/fusion/model/EventItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/d/e$5;->c:Lcom/beizi/fusion/d/e;

    iget-object v0, v0, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/a/b;->a(Landroid/content/Context;)Lcom/beizi/fusion/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/d/e$5;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/fusion/d/e$5;->b:Lcom/beizi/fusion/model/EventItem;

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/a/b;->a(Ljava/lang/String;Lcom/beizi/fusion/model/EventItem;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
