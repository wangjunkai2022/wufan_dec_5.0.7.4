.class Lcom/ss/android/socialbase/downloader/m/o$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/o;->update(ILandroid/content/ContentValues;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/content/ContentValues;

.field final synthetic p:Lcom/ss/android/socialbase/downloader/m/o;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/o;ILandroid/content/ContentValues;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/o$3;->p:Lcom/ss/android/socialbase/downloader/m/o;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/m/o$3;->vv:I

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/m/o$3;->m:Landroid/content/ContentValues;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/o$3;->p:Lcom/ss/android/socialbase/downloader/m/o;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/m/o$3;->vv:I

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/m/o$3;->m:Landroid/content/ContentValues;

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;ILandroid/content/ContentValues;)V

    return-void
.end method
