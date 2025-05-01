.class final Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/observer/IConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;


# direct methods
.method constructor <init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChange(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-string v0, "apm_native_h5perf_sampling_rate"

    .line 1
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;I)I

    .line 3
    iget-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    invoke-static {p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)I

    move-result v0

    invoke-static {v0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(I)Z

    move-result v0

    invoke-static {p1, v0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
