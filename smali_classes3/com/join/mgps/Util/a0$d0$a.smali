.class Lcom/join/mgps/Util/a0$d0$a;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0$d0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/Util/a0$d0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0$d0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$d0$a;->b:Lcom/join/mgps/Util/a0$d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/Util/a0$d0$a;->b:Lcom/join/mgps/Util/a0$d0;

    iget-object v1, v0, Lcom/join/mgps/Util/a0$d0;->b:Landroid/content/Context;

    iget-object v2, v0, Lcom/join/mgps/Util/a0$d0;->c:Ljava/lang/String;

    iget-object v3, v0, Lcom/join/mgps/Util/a0$d0;->d:Ljava/lang/String;

    iget-object v0, v0, Lcom/join/mgps/Util/a0$d0;->e:Lcom/join/mgps/Util/a0;

    invoke-static {v0}, Lcom/join/mgps/Util/a0;->c(Lcom/join/mgps/Util/a0;)Lcom/join/android/app/common/dialog/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/dialog/c;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v1, v2, v3, v0}, Lcom/join/mgps/Util/w1;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/c;

    iget-object v2, p0, Lcom/join/mgps/Util/a0$d0$a;->b:Lcom/join/mgps/Util/a0$d0;

    iget-object v2, v2, Lcom/join/mgps/Util/a0$d0;->d:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/join/mgps/event/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return-void
.end method
