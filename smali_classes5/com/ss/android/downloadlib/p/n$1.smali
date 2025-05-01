.class Lcom/ss/android/downloadlib/p/n$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/jh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/p/n;->vv(Landroid/content/Context;)Lcom/ss/android/socialbase/appdownloader/p/jh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private i:Landroid/content/DialogInterface$OnClickListener;

.field final synthetic m:Lcom/ss/android/downloadlib/p/n;

.field private o:Landroid/content/DialogInterface$OnClickListener;

.field private p:Lcom/ss/android/download/api/model/m$vv;

.field private u:Landroid/content/DialogInterface$OnCancelListener;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/p/n;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/p/n$1;->m:Lcom/ss/android/downloadlib/p/n;

    iput-object p2, p0, Lcom/ss/android/downloadlib/p/n$1;->vv:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lcom/ss/android/download/api/model/m$vv;

    invoke-direct {p1, p2}, Lcom/ss/android/download/api/model/m$vv;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    return-void
.end method

.method static synthetic m(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/p/n$1;->o:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method static synthetic p(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnCancelListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/p/n$1;->u:Landroid/content/DialogInterface$OnCancelListener;

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/p/n$1;)Landroid/content/DialogInterface$OnClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/p/n$1;->i:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method


# virtual methods
.method public m(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/p/n$1;->vv:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ss/android/download/api/model/m$vv;->i(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;

    .line 3
    iput-object p2, p0, Lcom/ss/android/downloadlib/p/n$1;->o:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public vv()Lcom/ss/android/socialbase/appdownloader/p/b;
    .locals 3

    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    new-instance v1, Lcom/ss/android/downloadlib/p/n$1$1;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/p/n$1$1;-><init>(Lcom/ss/android/downloadlib/p/n$1;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/m$vv;->vv(Lcom/ss/android/download/api/model/m$m;)Lcom/ss/android/download/api/model/m$vv;

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/p/n;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getThemedAlertDlgBuilder"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/m$vv;->vv(I)Lcom/ss/android/download/api/model/m$vv;

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->p()Lcom/ss/android/download/api/config/jh;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    invoke-virtual {v1}, Lcom/ss/android/download/api/model/m$vv;->vv()Lcom/ss/android/download/api/model/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ss/android/download/api/config/jh;->m(Lcom/ss/android/download/api/model/m;)Landroid/app/Dialog;

    move-result-object v0

    .line 12
    new-instance v1, Lcom/ss/android/downloadlib/p/n$vv;

    invoke-direct {v1, v0}, Lcom/ss/android/downloadlib/p/n$vv;-><init>(Landroid/app/Dialog;)V

    return-object v1
.end method

.method public vv(I)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/p/n$1;->vv:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ss/android/download/api/model/m$vv;->vv(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;

    return-object p0
.end method

.method public vv(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/p/n$1;->vv:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ss/android/download/api/model/m$vv;->p(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;

    .line 5
    iput-object p2, p0, Lcom/ss/android/downloadlib/p/n$1;->i:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public vv(Landroid/content/DialogInterface$OnCancelListener;)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/ss/android/downloadlib/p/n$1;->u:Landroid/content/DialogInterface$OnCancelListener;

    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    invoke-virtual {v0, p1}, Lcom/ss/android/download/api/model/m$vv;->m(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;

    return-object p0
.end method

.method public vv(Z)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/p/n$1;->p:Lcom/ss/android/download/api/model/m$vv;

    invoke-virtual {v0, p1}, Lcom/ss/android/download/api/model/m$vv;->vv(Z)Lcom/ss/android/download/api/model/m$vv;

    return-object p0
.end method
