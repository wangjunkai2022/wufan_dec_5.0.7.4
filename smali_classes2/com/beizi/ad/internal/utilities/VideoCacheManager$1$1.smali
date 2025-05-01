.class Lcom/beizi/ad/internal/utilities/VideoCacheManager$1$1;
.super Ljava/lang/Object;
.source "VideoCacheManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;

.field final synthetic val$cacheVideoUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1$1;->this$1:Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;

    iput-object p2, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1$1;->val$cacheVideoUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1$1;->this$1:Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;

    iget-object v0, v0, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;->val$listener:Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1$1;->val$cacheVideoUrl:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;->onVideoLoaded(Ljava/lang/String;)V

    return-void
.end method
