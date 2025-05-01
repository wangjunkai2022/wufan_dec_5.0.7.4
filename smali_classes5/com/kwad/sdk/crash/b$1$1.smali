.class final Lcom/kwad/sdk/crash/b$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/crash/b$1;->HY()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aGv:Lcom/kwad/sdk/crash/b$1;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/crash/b$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/b$1$1;->aGv:Lcom/kwad/sdk/crash/b$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const-string v0, "AdExceptionCollector"

    const-string v1, "ExceptionSoLoadHelper.init onLoad"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/crash/b;->access$000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/crash/b;->Bp()V

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/crash/b;->HV()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const-string v1, "/sdcard/"

    .line 5
    invoke-static {v0, v1}, Lcom/kwad/sdk/crash/b;->d(ZLjava/lang/String;)V

    :cond_1
    return-void
.end method
