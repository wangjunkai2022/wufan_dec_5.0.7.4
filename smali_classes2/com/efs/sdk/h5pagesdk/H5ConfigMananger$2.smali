.class final Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->sendData(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

.field final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    iput-object p2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    invoke-static {v0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)Lcom/efs/sdk/base/EfsReporter;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    const-string v1, "nativeh5perf"

    invoke-direct {v0, v1}, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->f:Ljava/lang/String;

    const-string v2, "wk_native_h5log"

    invoke-virtual {v0, v2, v1}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    invoke-static {v1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)Lcom/efs/sdk/base/EfsReporter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/efs/sdk/base/EfsReporter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    return-void
.end method
