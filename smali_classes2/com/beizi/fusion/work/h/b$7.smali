.class Lcom/beizi/fusion/work/h/b$7;
.super Ljava/lang/Object;
.source "BeiZiUnifiedCustomWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/b;->aP()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/h/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/b$7;->a:Lcom/beizi/fusion/work/h/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/b$7;->a:Lcom/beizi/fusion/work/h/b;

    const-string v1, "optimize"

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/h/b;->a(Lcom/beizi/fusion/work/h/b;Ljava/lang/String;)V

    return-void
.end method
