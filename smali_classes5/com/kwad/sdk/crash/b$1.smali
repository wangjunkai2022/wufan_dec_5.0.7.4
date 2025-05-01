.class final Lcom/kwad/sdk/crash/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/crash/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/crash/b;->a(Lcom/kwad/sdk/crash/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final HY()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/crash/b;->HW()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/kwad/sdk/crash/b$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/crash/b$1$1;-><init>(Lcom/kwad/sdk/crash/b$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final HZ()V
    .locals 2

    const-string v0, "AdExceptionCollector"

    const-string v1, "ExceptionSoLoadHelper.init fail"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
