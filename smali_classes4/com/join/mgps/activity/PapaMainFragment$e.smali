.class Lcom/join/mgps/activity/PapaMainFragment$e;
.super Landroid/os/Handler;
.source "PapaMainFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/PapaMainFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment$e;->a:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment$e;->a:Lcom/join/mgps/activity/PapaMainFragment;

    iget-object v0, p1, Lcom/join/mgps/activity/PapaMainFragment;->W:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    .line 2
    iget-boolean p1, p1, Lcom/join/mgps/activity/PapaMainFragment;->p0:Z

    invoke-virtual {v0, p1}, Lcom/join/android/app/component/video/c;->J(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
