.class Lcom/ss/android/downloadlib/addownload/compliance/vv$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/compliance/i$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/vv;->vv()V
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
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv$2;->vv:Lcom/ss/android/downloadlib/addownload/compliance/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv$2;->vv:Lcom/ss/android/downloadlib/addownload/compliance/vv;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/compliance/vv;->m(Lcom/ss/android/downloadlib/addownload/compliance/vv;)Lcom/ss/android/downloadlib/guide/install/ClipImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    :cond_0
    const/16 p1, 0x8

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv$2;->vv:Lcom/ss/android/downloadlib/addownload/compliance/vv;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/compliance/vv;->vv(Lcom/ss/android/downloadlib/addownload/compliance/vv;)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/n;->vv(IJ)V

    return-void
.end method
