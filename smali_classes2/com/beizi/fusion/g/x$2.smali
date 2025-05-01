.class Lcom/beizi/fusion/g/x$2;
.super Ljava/lang/Object;
.source "EulerAngleUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/x;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:D

.field final synthetic b:D

.field final synthetic c:D

.field final synthetic d:Lcom/beizi/fusion/g/x;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/x;DDD)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    iput-wide p2, p0, Lcom/beizi/fusion/g/x$2;->a:D

    iput-wide p4, p0, Lcom/beizi/fusion/g/x$2;->b:D

    iput-wide p6, p0, Lcom/beizi/fusion/g/x$2;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/x;->a(Lcom/beizi/fusion/g/x;Z)Z

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/x;->a(Lcom/beizi/fusion/g/x;F)F

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    invoke-static {v0}, Lcom/beizi/fusion/g/x;->a(Lcom/beizi/fusion/g/x;)[F

    move-result-object v0

    const/4 v3, 0x0

    aput v2, v0, v3

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    invoke-static {v0}, Lcom/beizi/fusion/g/x;->a(Lcom/beizi/fusion/g/x;)[F

    move-result-object v0

    aput v2, v0, v1

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    invoke-static {v0}, Lcom/beizi/fusion/g/x;->a(Lcom/beizi/fusion/g/x;)[F

    move-result-object v0

    const/4 v1, 0x2

    aput v2, v0, v1

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    iget-wide v1, p0, Lcom/beizi/fusion/g/x$2;->a:D

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/x;->a(Lcom/beizi/fusion/g/x;D)D

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    iget-wide v1, p0, Lcom/beizi/fusion/g/x$2;->b:D

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/x;->b(Lcom/beizi/fusion/g/x;D)D

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/g/x$2;->d:Lcom/beizi/fusion/g/x;

    iget-wide v1, p0, Lcom/beizi/fusion/g/x$2;->c:D

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/x;->c(Lcom/beizi/fusion/g/x;D)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
