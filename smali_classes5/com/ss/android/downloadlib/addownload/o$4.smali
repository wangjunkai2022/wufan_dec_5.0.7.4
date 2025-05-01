.class Lcom/ss/android/downloadlib/addownload/o$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/o;->u(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/o;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$4;->vv:Lcom/ss/android/downloadlib/addownload/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->p()Lcom/ss/android/download/api/config/jh;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o$4;->vv:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/o;->qv(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v3

    const/16 v1, 0xd

    const-string v4, "\u5df2\u6062\u590d\u4e0b\u8f7d"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/ss/android/download/api/config/jh;->vv(ILandroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method
