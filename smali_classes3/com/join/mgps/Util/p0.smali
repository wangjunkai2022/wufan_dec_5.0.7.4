.class public Lcom/join/mgps/Util/p0;
.super Ljava/lang/Object;
.source "ImageUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/Util/p0$a;

    invoke-direct {v0, p1, p0}, Lcom/join/mgps/Util/p0$a;-><init>(Landroid/graphics/Bitmap;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/papa91/arc/ext/ThreadManager;->runOnWriteThread(Ljava/lang/Runnable;)V

    return-void
.end method
