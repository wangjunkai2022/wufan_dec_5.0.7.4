.class Lcom/join/android/app/component/video/EmptyControlVideoView$a;
.super Ljava/lang/Object;
.source "EmptyControlVideoView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/video/EmptyControlVideoView;->showWifiDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/component/video/EmptyControlVideoView;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/video/EmptyControlVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/video/EmptyControlVideoView$a;->b:Lcom/join/android/app/component/video/EmptyControlVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/android/app/component/video/EmptyControlVideoView$a;->b:Lcom/join/android/app/component/video/EmptyControlVideoView;

    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/video/StandardGSYVideoPlayer;->startPlayLogic()V

    .line 2
    iget-object p1, p0, Lcom/join/android/app/component/video/EmptyControlVideoView$a;->b:Lcom/join/android/app/component/video/EmptyControlVideoView;

    iget-object p1, p1, Lcom/join/android/app/component/video/EmptyControlVideoView;->d:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
