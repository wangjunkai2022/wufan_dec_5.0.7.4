.class Lcom/ss/android/downloadlib/p/n$vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/p/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "vv"
.end annotation


# instance fields
.field private vv:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/p/n$vv;->vv:Landroid/app/Dialog;

    .line 3
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/p/n$vv;->vv()V

    :cond_0
    return-void
.end method


# virtual methods
.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$vv;->vv:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public vv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$vv;->vv:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method
