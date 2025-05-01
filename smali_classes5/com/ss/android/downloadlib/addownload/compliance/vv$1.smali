.class Lcom/ss/android/downloadlib/addownload/compliance/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/vv;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/compliance/vv;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv$1;->vv:Lcom/ss/android/downloadlib/addownload/compliance/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv$1;->vv:Lcom/ss/android/downloadlib/addownload/compliance/vv;

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/compliance/vv;->vv(Lcom/ss/android/downloadlib/addownload/compliance/vv;)J

    move-result-wide v0

    const-string p1, "lp_app_dialog_cancel"

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/n;->vv(Ljava/lang/String;J)V

    return-void
.end method
