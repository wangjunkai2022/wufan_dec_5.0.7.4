.class Lcom/ss/android/downloadlib/p/n$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/model/m$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/p/n$1;->vv()Lcom/ss/android/socialbase/appdownloader/p/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/p/n$1;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/p/n$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-static {v0}, Lcom/ss/android/downloadlib/p/n$1;->m(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-static {v0}, Lcom/ss/android/downloadlib/p/n$1;->m(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {v0, p1, v1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    :cond_0
    return-void
.end method

.method public p(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-static {v0}, Lcom/ss/android/downloadlib/p/n$1;->p(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnCancelListener;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-static {v0}, Lcom/ss/android/downloadlib/p/n$1;->p(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnCancelListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method

.method public vv(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-static {v0}, Lcom/ss/android/downloadlib/p/n$1;->vv(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1$1;->vv:Lcom/ss/android/downloadlib/p/n$1;

    invoke-static {v0}, Lcom/ss/android/downloadlib/p/n$1;->vv(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {v0, p1, v1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    :cond_0
    return-void
.end method
