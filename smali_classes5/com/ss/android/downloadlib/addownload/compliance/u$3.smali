.class Lcom/ss/android/downloadlib/addownload/compliance/u$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/compliance/u;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/u;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$3;->m:Lcom/ss/android/downloadlib/addownload/compliance/u;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$3;->vv:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->p()Lcom/ss/android/download/api/config/jh;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$3;->vv:Ljava/lang/String;

    const/4 v1, 0x6

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/ss/android/download/api/config/jh;->vv(ILandroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method
