.class Lcom/ss/android/downloadlib/addownload/i$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/i;->vv(ILjava/lang/String;JLcom/ss/android/downloadad/api/vv/m;JLcom/ss/android/downloadlib/addownload/o$vv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/i;

.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/o$vv;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/i;Lcom/ss/android/downloadlib/addownload/o$vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/i$5;->m:Lcom/ss/android/downloadlib/addownload/i;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/i$5;->vv:Lcom/ss/android/downloadlib/addownload/o$vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i$5;->vv:Lcom/ss/android/downloadlib/addownload/o$vv;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/o$vv;->vv()V

    return-void
.end method
