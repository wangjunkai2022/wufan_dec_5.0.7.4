.class Lcom/MApplication$e;
.super Ljava/lang/Object;
.source "MApplication.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/MApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/MApplication;


# direct methods
.method constructor <init>(Lcom/MApplication;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/MApplication$e;->b:Lcom/MApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    move-result-object v0

    const-string v1, "mgdb"

    invoke-virtual {v0, v1}, Lp1/e;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 3
    :goto_0
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/join/mgps/Util/s1;->a(Landroid/content/Context;)Ljava/util/List;

    return-void
.end method
