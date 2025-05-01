.class Lcom/join/android/app/component/video/MultiStandVideo$c;
.super Ljava/lang/Object;
.source "MultiStandVideo.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/video/MultiStandVideo;->clearFullscreenLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/component/video/MultiStandVideo;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$c;->b:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/android/app/component/video/MultiStandVideo$c;->b:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-static {v0}, Lcom/join/android/app/component/video/MultiStandVideo;->e(Lcom/join/android/app/component/video/MultiStandVideo;)V

    return-void
.end method
