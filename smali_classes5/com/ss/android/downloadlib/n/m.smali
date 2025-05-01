.class public Lcom/ss/android/downloadlib/n/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/n/m$m;,
        Lcom/ss/android/downloadlib/n/m$vv;
    }
.end annotation


# static fields
.field static final vv:Lcom/ss/android/downloadlib/n/m$vv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/n/m$m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/downloadlib/n/m$m;-><init>(Lcom/ss/android/downloadlib/n/m$1;)V

    sput-object v0, Lcom/ss/android/downloadlib/n/m;->vv:Lcom/ss/android/downloadlib/n/m$vv;

    return-void
.end method

.method public static varargs vv(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/os/AsyncTask<",
            "TT;**>;[TT;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/n/m;->vv:Lcom/ss/android/downloadlib/n/m$vv;

    invoke-virtual {v0, p0, p1}, Lcom/ss/android/downloadlib/n/m$vv;->vv(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    return-void
.end method
